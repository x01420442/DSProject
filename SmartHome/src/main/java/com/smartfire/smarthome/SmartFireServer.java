package com.smartfire.smarthome;

import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;


import com.smartdoor.smarthome.SmartDoorGrpc;
import com.smartdoor.smarthome.SmartDoorServer;
import com.smartfire.smarthome.SmartFireGrpc.SmartFireImplBase;
import com.smartdoor.smarthome.SmartDoorGrpc.SmartDoorImplBase;
import io.grpc.stub.StreamObserver;



public class SmartFireServer extends SmartFireImplBase {
	
private static final Logger logger = Logger.getLogger(SmartFireServer.class.getName());
	
	public static void main(String[] args) throws IOException, InterruptedException {
		SmartFireServer fireserver = new SmartFireServer();
	
		int port = 50051;
	    Server server = ServerBuilder.forPort(port)
	        .addService(fireserver)
	        .build()
	        .start();
	
	    logger.info("Server started, listening on " + port);
	
		server.awaitTermination();
}
	private class FireImplementation extends SmartFireGrpc.SmartFireImplBase {
		private int fire_temperature = 0;
        private boolean fire_status = false;
        
        @Override
        public void fireOn(FireStatus request,
            io.grpc.stub.StreamObserver<FireStatus> response) {
        

    		fire_status = true;
    		String output = "The fire is now lit.";   
    		
    		FireStatus fire_status1 = FireStatus.newBuilder().setStatusMsg(output).setFireOnOff(fire_status).build();
    		
            response.onNext(fire_status1);
            response.onCompleted();
    				
        }

        @Override
        public void fireOff(FireStatus request,
            io.grpc.stub.StreamObserver<FireStatus> response) {
        	fire_status = false; 
        	String output = "The fire is now off.";   
    		
        	FireStatus fire_status1 = FireStatus.newBuilder().setStatusMsg(output).setFireOnOff(fire_status).build();
            response.onNext(fire_status1);
            response.onCompleted();
        }
        
        @Override
        public void makeHot(TempratureSetting request,
                io.grpc.stub.StreamObserver<TempratureSetting> responseObserver) 
        {
            Timer t = new Timer();
            t.schedule(new WarmUp(responseObserver), 0, 2000);
        }
        
        class WarmUp extends TimerTask {

            StreamObserver<TempratureSetting> streamObserver;

            public WarmUp(StreamObserver<TempratureSetting> status) {
                streamObserver = status;
            }
            
            @Override
            public void run() {
                if (fire_temperature < 80) {
                	fire_temperature += 15;
                	TempratureSetting fire_temperature1 = TempratureSetting.newBuilder().setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_temperature1);
                } else {
                	TempratureSetting fire_temperature1 = TempratureSetting.newBuilder().setStatusMsg("The Fire is now nice and toasty!").setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_temperature1);
                    streamObserver.onCompleted();
                    this.cancel();
                }
            }
        }
        
        @Override
        public void makeCold(TempratureSetting request,
                io.grpc.stub.StreamObserver<TempratureSetting> responseObserver) {
            Timer t = new Timer();
            t.schedule(new reduceHeat(responseObserver), 0, 2000);
        }
        
        class reduceHeat extends TimerTask {

            StreamObserver<TempratureSetting> streamObserver;

            public reduceHeat(StreamObserver<TempratureSetting> status) {
                streamObserver = status;
            }
            
            @Override
            public void run() {
                if (fire_temperature > 0) {
                	fire_temperature -= 15;
                    TempratureSetting fire_status1 = TempratureSetting.newBuilder().setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_status1);
                } else {
                	TempratureSetting fire_status2 = TempratureSetting.newBuilder().setStatusMsg("Cooldown completed! The cooker is at 0% temperature.").setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_status2);
                    streamObserver.onCompleted();
                    this.cancel();
                }
            }
        }

        
        
	}

	
}
