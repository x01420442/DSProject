
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
	
	private class DoorImplementation extends SmartDoorGrpc.SmartDoorImplBase {
	        
	        private boolean door_status = false;
	        private boolean lock_status = false;
	          
	    
		@Override
	    public void openDoor(DoorStatus request,
	        io.grpc.stub.StreamObserver<DoorStatus> response) {
	    
	
			door_status = true;
			String output = "The door is now opened.";   
			
			DoorStatus Door_Status = DoorStatus.newBuilder().setStatusMsg(output).setOpenOnOff(door_status).build();
	        response.onNext(Door_Status);
	        response.onCompleted();
					
	    }
	
	    @Override
	    public void closeDoor(DoorStatus request,
	        io.grpc.stub.StreamObserver<DoorStatus> response) {
	    	door_status = false; 
	    	String output = "The door is now closed.";   
			
			DoorStatus Door_Status = DoorStatus.newBuilder().setStatusMsg(output).setOpenOnOff(door_status).build();
	        response.onNext(Door_Status);
	        response.onCompleted();
	    }
	    @Override
	    
	    public void unlockDoor(LockStatus request,
	        io.grpc.stub.StreamObserver<LockStatus> response) {
	    
	
	    	lock_status = true;
			String output = "The door is now unlocked.";   
			
			LockStatus lock_Status = LockStatus.newBuilder().setStatusMsg(output).setLockOnOff(lock_status).build();
	        response.onNext(lock_Status);
	        response.onCompleted();
					
	    }
	
	    @Override
	    public void lockDoor(LockStatus request,
	        io.grpc.stub.StreamObserver<LockStatus> response) {
	    	lock_status = false; 
	    	String output = "The door is now locked.";   
			
	    	LockStatus lock_Status = LockStatus.newBuilder().setStatusMsg(output).setLockOnOff(lock_status).build();
	        response.onNext(lock_Status);
	        response.onCompleted();
	    }
	}

}