package com.smartlight.smarthome;

import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.smartfire.smarthome.FireStatus;
import com.smartfire.smarthome.SmartFireGrpc;
import com.smartfire.smarthome.SmartFireServer;
import com.smartfire.smarthome.TempratureSetting;
import com.smartlight.smarthome.SmartLightGrpc.SmartLightImplBase;
import com.smartfire.smarthome.SmartFireGrpc.SmartFireImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SmartLightClient {
	
private static final Logger logger = Logger.getLogger(SmartLightServer.class.getName());
private static SmartLightGrpc.SmartLightBlockingStub blockingStub;
private static SmartLightGrpc.SmartLightStub asyncStub;
private static SmartLightGrpc.SmartLightFutureStub futureStub;
	

private ManagedChannel channel;


public static void main(String[] args) throws Exception {
	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

	//stubs -- generate from proto
	blockingStub = SmartLightGrpc.newBlockingStub(channel);
	asyncStub = SmartLightGrpc.newStub(channel);
	futureStub =  SmartLightGrpc.newFutureStub(channel);


	 //lightsOn();
	 //LightUp();
	 lowerlight();
}
 
    public static void lightsOn(){
        
		try {
			
			LightsStatus request = LightsStatus.newBuilder().build();
			LightsStatus status = blockingStub.lightsOn(request);


		        	
					if(status.getLightsOnOff()){

		                System.out.println("The lights are on.");
		                
		            }
		            else{                

		                System.out.println("The lights are off.");
		                
		            }
			      

		        } catch (RuntimeException e) {
		            logger.log(Level.WARNING, "RPC failed", e);
		            return;
		        }
		    }
    public static void LightUp() {
        System.out.println("the lights are getting bright ...");
        try {
            new Thread() {
                public void run() {
                	IntensitySetting request = IntensitySetting.newBuilder().build();

                    Iterator<IntensitySetting> response = blockingStub.brightintensity(request);
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
    public static void lowerlight() {
        System.out.println("The lights are getting dim ...");
        try {
            new Thread() {
                public void run() {
                	IntensitySetting request = IntensitySetting.newBuilder().build();

                    Iterator<IntensitySetting> response = blockingStub.dimintensity(request);
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
}
