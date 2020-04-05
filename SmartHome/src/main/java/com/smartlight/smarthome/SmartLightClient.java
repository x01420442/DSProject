package com.smartlight.smarthome;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
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

//The functions that will call to the server to activate the code
	 //lightsOn();
	 //LightUp();
	 //lowerlight();
	 //nointensity();
}
 //function that toggles the lights on and off, it also uses the light up function to add intensity to the lights on, and the no intensity function to reset the instensity to zero when the lights are off
    public static void lightsOn(){        
		try {
			
			LightsStatus request = LightsStatus.newBuilder().build();
			LightsStatus status = blockingStub.lightsOn(request);
		        	//statement that checks the status of a boolean before activating the text and functions within
					if(status.getLightsOnOff()){
		                System.out.println("The lights are on.");
		                LightUp();		                
		            }
		            else{              
		                System.out.println("The lights are off.");
		                nointensity();		                
		            }		      
		        } catch (RuntimeException e) {
		            logger.log(Level.WARNING, "RPC failed", e);
		            return;
		        }
		    }
    
    //function is used to set the light intensity to max.
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
                }
                //is used to start the tick on the intensity increase
            }.start();
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
    
    //is used to set the intesntiy to a dim mode
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
                }
                //is used to start the tick to either increase or decrease the intensity to match the needed level
            }.start();
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
    
    //is used to lower the intensity to zero for use with the toggled lights off
    public static void nointensity() {
        System.out.println("the lights are dimming off ...");
        try {
            new Thread() {
                public void run() {
                	IntensitySetting request = IntensitySetting.newBuilder().build();
                    Iterator<IntensitySetting> response = blockingStub.nointensity(request);
                    while (response.hasNext()) {
                        System.out.println(response.next().toString());
                    }
                }
                //starts the tick that will lower the intensity all the way to zero
            }.start();
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
}
