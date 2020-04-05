
package com.smartdoor.smarthome;

import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import com.smartdoor.smarthome.SmartDoorGrpc.SmartDoorImplBase;
import io.grpc.stub.StreamObserver;


public class SmartDoorServer extends SmartDoorImplBase {
	
	private static final Logger logger = Logger.getLogger(SmartDoorServer.class.getName());
	
	public static void main(String[] args) throws IOException, InterruptedException {
		SmartDoorServer doorserver = new SmartDoorServer();
	
		int port = 50051;
	    Server server = ServerBuilder.forPort(port)
	        .addService(doorserver)
	        .build()
	        .start();
	
	    logger.info("Server started, listening on " + port);
	
		server.awaitTermination();
	}
	
	//private class DoorImplementation extends SmartDoorGrpc.SmartDoorImplBase {
	        
	        //private boolean door_status = false;
	        //private boolean lock_status = false;
	    boolean door = false;    
	    boolean lock = false;   
	    
		@Override
	    public void openDoor(DoorRequest request,
	        io.grpc.stub.StreamObserver<DoorResponse> response) {
						
			 //door = request.getOpenOnOff();
			door = !door;
			
			if (door) {
	        	System.out.println("Opening the door...");
	        }
	        else {
	        	System.out.println("Closing the door...");
	        }

			
			DoorResponse Door_Status = DoorResponse.newBuilder().setOpenOnOff(door).build();
	        response.onNext(Door_Status);
	        response.onCompleted();
	        
	    }
	
	    @Override
	    public void closeDoor(DoorRequest request,
		        io.grpc.stub.StreamObserver<DoorResponse> response) {
							
				//boolean door = request.getOpenOnOff();
	    		door = false;

		        System.out.println("Checking if door is closed for locking.");

 				
				DoorResponse Door_Status = DoorResponse.newBuilder().setOpenOnOff(door).build();
		        response.onNext(Door_Status);
		        response.onCompleted();
		        
		    }
	    @Override	    
	    public void unlockDoor(LockRequest request,
	        io.grpc.stub.StreamObserver<LockResponse> response) {
	    	
	    	   

	    	lock = false;
	
	    	//lock_status = true;
			String output = "Checking if door is locked before opening.";   
			
			LockResponse Status = LockResponse.newBuilder().setLockOnOff(lock).build();
	        response.onNext(Status);
	        response.onCompleted();
	        
	        //boolean door = request.getOpenOnOff();

	        System.out.println("Checking if door is closed for locking.");

				
	    }
	
	    @Override
	    public void lockDoor(LockRequest request,
	        io.grpc.stub.StreamObserver<LockResponse> response) {

			lock = !lock;
			
			if (lock) {
	        	System.out.println("Locking the door...");
	        }
	        else {
	        	System.out.println("Unlocking the door...");
	        }

			
			LockResponse Status = LockResponse.newBuilder().setLockOnOff(lock).build();
	        response.onNext(Status);
	        response.onCompleted();	        
	 
	        
	    }
	//}

}