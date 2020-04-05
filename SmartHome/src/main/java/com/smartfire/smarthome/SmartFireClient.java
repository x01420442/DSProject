package com.smartfire.smarthome;

import java.util.logging.Logger;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Iterator;
import java.util.logging.Level;

public class SmartFireClient {
	
private static  Logger logger = Logger.getLogger(SmartFireGrpc.class.getName());
	
	private static SmartFireGrpc.SmartFireBlockingStub blockingStub;
	private static SmartFireGrpc.SmartFireStub asyncStub;
	private static SmartFireGrpc.SmartFireFutureStub futureStub;
	
    private ManagedChannel channel;
    
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = SmartFireGrpc.newBlockingStub(channel);
		asyncStub = SmartFireGrpc.newStub(channel);
		futureStub =  SmartFireGrpc.newFutureStub(channel);
		//function used to start the client and connect to the server		
		//fireOn();
				
	}
//function used to toggle the fire on and off. It also calls both the make hot and make cold functions
	public static void fireOn(){
      
		try {
			
			FireStatus request = FireStatus.newBuilder().build();
			FireStatus status = blockingStub.fireOn(request);
		        	//function used to check the state of the boolean and run the apropriate functions
					if(status.getFireOnOff()){
		                System.out.println("The fire is lit.");
		                makeHot();		                
		            }
		            else{               
		                System.out.println("The fire is unlit");
		                makeCold();
		            }			      

		        } catch (RuntimeException e) {
		            logger.log(Level.WARNING, "RPC failed", e);
		            return;
		        }
		    }	
	//function used to raise the temperature of the fire
	public static void makeHot() {
        System.out.println("Fire is warming up ...");
        try {
            new Thread() {
                public void run() {
                	//function that passes the responce as a string
                	TempratureSetting request = TempratureSetting.newBuilder().build();
                    Iterator<TempratureSetting> response = blockingStub.makeHot(request);
                    while (response.hasNext()) {
                        System.out.println(response.next().toString());
                    }
                }
                //starts the build up of temprature
            }.start();
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	//function that isused to make the temperature colder.
	public static void makeCold() {
        System.out.println("Fire is cooling down...");
        try {
            new Thread() {
                public void run() {
                	TempratureSetting request = TempratureSetting.newBuilder().build();
                    Iterator<TempratureSetting> response = blockingStub.makeCold(request);
                    while (response.hasNext()) {
                        System.out.println(response.next().toString());
                    }
                }//startsthe decrease of temperature
            }.start();           
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
}
