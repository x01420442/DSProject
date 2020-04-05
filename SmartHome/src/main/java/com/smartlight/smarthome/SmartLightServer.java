package com.smartlight.smarthome;

import java.io.IOException;
import java.util.logging.Logger;
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
import com.smartfire.smarthome.FireStatus;
import com.smartfire.smarthome.SmartFireGrpc;
import com.smartfire.smarthome.TempratureSetting;
import com.smartfire.smarthome.SmartFireGrpc.SmartFireImplBase;

import com.smartdoor.smarthome.SmartDoorGrpc.SmartDoorImplBase;
import io.grpc.stub.StreamObserver;

import com.smartfire.smarthome.SmartFireGrpc.SmartFireImplBase;
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

			private int light_intensity = 0;
	        boolean light = false;
	        
	        @Override
	        public void lightsOn(LightsStatus request,
	            io.grpc.stub.StreamObserver<LightsStatus> response) {

	        	light = !light;
	        	
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
	        
	        @Override
	        public void brightintensity(IntensitySetting request,
	                io.grpc.stub.StreamObserver<IntensitySetting> responseObserver) 
	        {
	            Timer t = new Timer();
	            t.schedule(new LightUp(responseObserver), 0, 1000);
	        }
	        
	        class LightUp extends TimerTask {
	        	
	            StreamObserver<IntensitySetting> streamObserver;

	            public LightUp(StreamObserver<IntensitySetting> status) {
	                streamObserver = status;
	            }
	            
	            @Override
	            public void run() {
	                if (light_intensity < 80) {
	                	light_intensity += 10;
	                	IntensitySetting light_status1 = IntensitySetting.newBuilder().setIntensity(light_intensity).build();
	                    streamObserver.onNext(light_status1);
	                } else {
	                	IntensitySetting light_status1 = IntensitySetting.newBuilder().setStatusMsg("The lights are now bright!").setIntensity(light_intensity).build();
	                    streamObserver.onNext(light_status1);
	                    streamObserver.onCompleted();
	                    this.cancel();
	                }
	            }
	        }
	        @Override
	        public void dimintensity(IntensitySetting request,
	                io.grpc.stub.StreamObserver<IntensitySetting> responseObserver) {
	            Timer t = new Timer();
	            t.schedule(new lowerLight(responseObserver), 0, 100);
	        }
	        
	        class lowerLight extends TimerTask {
	        	int startIntensity = light_intensity;

	            StreamObserver<IntensitySetting> streamObserver;

	            public lowerLight(StreamObserver<IntensitySetting> status) {
	                streamObserver = status;
	            }
	            
	            @Override
	            public void run() {
	            	
	            	if (startIntensity >= 0 && startIntensity < 39 ) {
	            		if (light_intensity < 40) {
	            			light_intensity += 1;
	            			IntensitySetting status = IntensitySetting.newBuilder().setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                    } else {
	                    	IntensitySetting status = IntensitySetting.newBuilder().setStatusMsg("The lights have gotten a little brighter").setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                        streamObserver.onCompleted();
	                        this.cancel();
	                    }
	            		
	            	}else if(startIntensity > 40) {
	            		if (light_intensity > 40) {
	            			light_intensity -= 1;
	            			IntensitySetting status = IntensitySetting.newBuilder().setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                    } else {
	                    	IntensitySetting status = IntensitySetting.newBuilder().setStatusMsg("The lights have gotten a little dimmer").setIntensity(light_intensity).build();
	                        streamObserver.onNext(status);
	                        streamObserver.onCompleted();
	                        this.cancel();
	                    }
	            	}
	            		            
	            }
	        }
	
}
