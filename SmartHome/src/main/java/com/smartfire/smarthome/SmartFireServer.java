package com.smartfire.smarthome;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.smartfire.smarthome.SmartFireGrpc.SmartFireImplBase;
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
         boolean fire = false;
        //function that toggles the fire on and off
        @Override
        public void fireOn(FireStatus request,
            io.grpc.stub.StreamObserver<FireStatus> response) {        
//variable that flips a boolean to its oposite
    		fire = !fire;
    		//checks the status of a boolean
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
        //function used to make the temperature hotter
        @Override
        public void makeHot(TempratureSetting request,
                io.grpc.stub.StreamObserver<TempratureSetting> responseObserver) 
        {
        	//adds a timer between each tick of the temp increase
            Timer t = new Timer();
            t.schedule(new WarmUp(responseObserver), 0, 1000);
        }        
        class WarmUp extends TimerTask {
        	//sets the temp at 0
        	private int fire_temperature = 0;
            StreamObserver<TempratureSetting> streamObserver;
          //runs the temp increase until it hits a marker
            public WarmUp(StreamObserver<TempratureSetting> status) {
                streamObserver = status;
            }            
            @Override            
            public void run() {
            	//checks the temp is too low, build up the temp by 10 per tick
                if (fire_temperature < 80) {
                	fire_temperature += 10;
                	TempratureSetting fire_temperature1 = TempratureSetting.newBuilder().setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_temperature1);
                } else {
                	//if temp is above the marker print this text
                	TempratureSetting fire_temperature1 = TempratureSetting.newBuilder().setStatusMsg("The Fire is now nice and toasty!").setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_temperature1);
                    streamObserver.onCompleted();
                    this.cancel();
                }
            }
        }
        //function used to make the temperature cooler
        @Override
        public void makeCold(TempratureSetting request,
                io.grpc.stub.StreamObserver<TempratureSetting> responseObserver) {
        	//adds a timer between each tick of the temp decrease
            Timer t = new Timer();
            t.schedule(new coolDown(responseObserver), 0, 1000);
        }        
        class coolDown extends TimerTask {
        	//sets temp at max
        	private int fire_temperature = 80;
            StreamObserver<TempratureSetting> streamObserver;

            public coolDown(StreamObserver<TempratureSetting> status) {
                streamObserver = status;
            }            
            @Override
            public void run() {
            	//checks the temp if its too high, then ticks the temp down to 0
                if (fire_temperature > 0) {
                	fire_temperature -= 15;
                    TempratureSetting fire_status1 = TempratureSetting.newBuilder().setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_status1);
                } else {
                	//when at right temp prints this text
                	TempratureSetting fire_status2 = TempratureSetting.newBuilder().setStatusMsg("The fire has cooled down.").setTemprature(fire_temperature).build();
                    streamObserver.onNext(fire_status2);
                    streamObserver.onCompleted();
                    this.cancel();
                }
            }
        }	
}
