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
	//private class FireImplementation extends SmartFireGrpc.SmartFireImplBase {
		private int fire_temperature = 0;
         boolean fire = false;
        
        @Override
        public void fireOn(FireStatus request,
            io.grpc.stub.StreamObserver<FireStatus> response) {
        

    		fire = !fire;
    		
    		if (fire) {
	        	System.out.println("Lighting the fire.");
	        }
	        else {
	        	System.out.println("Unighting the fire is unlit");
	        } 
    		
    		FireStatus fire_status1 = FireStatus.newBuilder().setFireOnOff(fire).build();
    		
            response.onNext(fire_status1);
            response.onCompleted();
    				
        }

 
        
        @Override
        public void makeHot(TempratureSetting request,
                io.grpc.stub.StreamObserver<TempratureSetting> responseObserver) 
        {
            Timer t = new Timer();
            t.schedule(new WarmUp(responseObserver), 0, 1000);
        }
        
        class WarmUp extends TimerTask {
        	private int fire_temperature = 0;
            StreamObserver<TempratureSetting> streamObserver;

            public WarmUp(StreamObserver<TempratureSetting> status) {
                streamObserver = status;
            }
            
            @Override
            
            public void run() {
                if (fire_temperature < 80) {
                	fire_temperature += 10;
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
            t.schedule(new coolDown(responseObserver), 0, 1000);
        }
        
        class coolDown extends TimerTask {
        	private int fire_temperature = 80;
            StreamObserver<TempratureSetting> streamObserver;

            public coolDown(StreamObserver<TempratureSetting> status) {
                streamObserver = status;
            }
            
            @Override
            public void run() {
                if (fire_temperature > 0) {
                	fire_temperature -= 15;
                    TempratureSetting fire_status1 = TempratureSetting.newBuilder().setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_status1);
                } else {
                	TempratureSetting fire_status2 = TempratureSetting.newBuilder().setStatusMsg("The fire has cooled down.").setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_status2);
                    streamObserver.onCompleted();
                    this.cancel();
                }
            }
        }

        
        
	//}

	
}
