package com.smartfire.smarthome;

import java.util.logging.Logger;

import com.google.protobuf.Empty;

import com.smartdoor.smarthome.DoorRequest;
import com.smartdoor.smarthome.DoorResponse;
import com.smartdoor.smarthome.LockRequest;
import com.smartdoor.smarthome.LockResponse;
import com.smartdoor.smarthome.SmartDoorClient;
import com.smartdoor.smarthome.SmartDoorGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
		
		fireOn();
		
		

		
	}
	
	
	
	public static void fireOn(){
      
		try {
			
			FireStatus request = FireStatus.newBuilder().build();
			FireStatus status = blockingStub.fireOn(request);


		        	
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
	
	
	public static void makeHot() {
        System.out.println("Fire is warming up ...");
        try {
            new Thread() {
                public void run() {
                	TempratureSetting request = TempratureSetting.newBuilder().build();

                    Iterator<TempratureSetting> response = blockingStub.makeHot(request);
                    while (response.hasNext()) {
                        System.out.println(response.next().toString());
                    }
//                  System.out.println("Cooker is now at 100% temperature...");
                }
            }.start();


//            System.out.println("Cooker status: " + status);

        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
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
//                    System.out.println("Cooker is now at 0% temperature...");
                }
            }.start();
           
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	

}
