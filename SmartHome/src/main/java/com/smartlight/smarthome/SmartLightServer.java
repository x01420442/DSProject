package com.smartlight.smarthome;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.smartlight.smarthome.SmartLightGrpc.SmartLightImplBase;

public class SmartLightServer extends SmartLightImplBase {
	private static final Logger logger = Logger.getLogger(SmartLightServer.class.getName());
		
		public static void main(String[] args) throws IOException, InterruptedException {
			SmartLightServer lightserver = new SmartLightServer();
		
			int port = 50051;
		    Server server = ServerBuilder.forPort(port)
		        .addService(lightserver)
		        .build()
		        .start();
		
		    logger.info("Server started, listening on " + port);		
			server.awaitTermination();
	}
		//declared variables to be used in the class
			private int light_intensity = 0;
	        boolean light = false;
	        //function that toggles the lights to be on or off
	        @Override
	        public void lightsOn(LightsStatus request,
	            io.grpc.stub.StreamObserver<LightsStatus> response) {
//variable that flips a boolean to its oposite
	        	light = !light;
	        	//checks the status of the boolean
	        	if (light) {
		        	System.out.println("Turning lights on.");
		        }
		        else {
		        	System.out.println("Turning lights off.");
		        }  
	    		
	    		LightsStatus light_status1 = LightsStatus.newBuilder().setLightsOnOff(light).build();	    		
	            response.onNext(light_status1);
	            response.onCompleted();               				
	        }
	        //function used to set the brightness intensity to max
	        @Override
	        public void brightintensity(IntensitySetting request,
	                io.grpc.stub.StreamObserver<IntensitySetting> responseObserver) 
	        {
	        	//timer that counts the tick of the increase of the intensity variable
	            Timer t = new Timer();
	            t.schedule(new LightUp(responseObserver), 0, 1000);
	        }	        
	        class LightUp extends TimerTask {	        	
	            StreamObserver<IntensitySetting> streamObserver;
	            public LightUp(StreamObserver<IntensitySetting> status) {
	                streamObserver = status;
	            }
	            //runs intensity up until it hits the marker
	            @Override
	            public void run() {
	            	//checks if intensity needs to be increased and incrases it by the given ammount
	                if (light_intensity < 80) {
	                	light_intensity += 10;
	                	IntensitySetting light_status1 = IntensitySetting.newBuilder().setIntensity(light_intensity).build();
	                    streamObserver.onNext(light_status1);
	                    //when intensity reaches its target this will print the text
	                } else {
	                	IntensitySetting light_status1 = IntensitySetting.newBuilder().setStatusMsg("The lights are now bright!").setIntensity(light_intensity).build();
	                    streamObserver.onNext(light_status1);
	                    streamObserver.onCompleted();
	                    this.cancel();
	                }
	            }
	        }
	      //function used to set the brightness intensity to a dim level
	        @Override
	        public void dimintensity(IntensitySetting request,
	                io.grpc.stub.StreamObserver<IntensitySetting> responseObserver) {
	        	//timer that counts the tick of the increase of the intensity variable
	            Timer t = new Timer();
	            t.schedule(new lowerLight(responseObserver), 0, 100);
	        }	        
	        class lowerLight extends TimerTask {
	        	int startIntensity = light_intensity;
	            StreamObserver<IntensitySetting> streamObserver;
	            public lowerLight(StreamObserver<IntensitySetting> status) {
	                streamObserver = status;
	            }
	          //runs intensity up until it hits the marker
	            @Override
	            public void run() {
	            	//checks if intensity needs to be increased to hit target range, then alters intensity until it is
	            	if (startIntensity >= 0 && startIntensity < 39 ) {
	            		if (light_intensity < 40) {
	            			light_intensity += 1;
	            			IntensitySetting status = IntensitySetting.newBuilder().setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                        //once target is met it will print this message
	                    } else {
	                    	IntensitySetting status = IntensitySetting.newBuilder().setStatusMsg("The lights have gotten a little brighter").setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                        streamObserver.onCompleted();
	                        this.cancel();
	                    }
	            		//checks if intensity needs to be decreased to hit target range, then alters intensity until it is
	            	}else if(startIntensity > 40) {
	            		if (light_intensity > 40) {
	            			light_intensity -= 1;
	            			IntensitySetting status = IntensitySetting.newBuilder().setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                      //once target is met it will print this message
	                    } else {
	                    	IntensitySetting status = IntensitySetting.newBuilder().setStatusMsg("The lights have gotten a little dimmer").setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                        streamObserver.onCompleted();
	                        this.cancel();
	                    }
	            	}
	            		            
	            }
	        }
	        //function to set the intensity to none
	        @Override
	        public void nointensity(IntensitySetting request,
	                io.grpc.stub.StreamObserver<IntensitySetting> responseObserver) {
	        	//timer that counts the tick of the increase of the intensity variable
	            Timer t = new Timer();
	            t.schedule(new noLight(responseObserver), 0, 100);
	        }	        
	        class noLight extends TimerTask {
	        	int startIntensity = light_intensity;
	            StreamObserver<IntensitySetting> streamObserver;
	            public noLight(StreamObserver<IntensitySetting> status) {
	                streamObserver = status;
	            }
	          //runs intensity up until it hits the marker
	            @Override
	            public void run() {
	            	//checks if intensity needs to be decreased to hit target range, then alters intensity until it is
	            		if (light_intensity > 0) {
	            			light_intensity -= 1;
	            			IntensitySetting status = IntensitySetting.newBuilder().setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                    } else {
	                    	//once target is met it will print this message
	                    	IntensitySetting status = IntensitySetting.newBuilder().setStatusMsg("The lights have dimmed to darkness.").setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                        streamObserver.onCompleted();
	                        this.cancel();
	                    }
	            		        
	            }
	        }	
}