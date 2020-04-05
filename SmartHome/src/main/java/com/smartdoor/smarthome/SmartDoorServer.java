
package com.smartdoor.smarthome;

import java.io.IOException;
import java.util.logging.Logger;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.smartdoor.smarthome.SmartDoorGrpc.SmartDoorImplBase;

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
	//booleans saved to a setting
	    boolean door = false;    
	    boolean lock = false;   
	    
	    //function that is used to toggle the door opened or closed
		@Override
	    public void openDoor(DoorToggle request,
	        io.grpc.stub.StreamObserver<DoorToggle> response) {

			//variable which flips the state of a boolean
			door = !door;
			// if statment checks the state of the boolean
			if (door) {
	        	System.out.println("Opening the door...");
	        }
	        else {
	        	System.out.println("Closing the door...");
	        }
			
			DoorToggle Door_Status = DoorToggle.newBuilder().setOpenOnOff(door).build();
	        response.onNext(Door_Status);
	        response.onCompleted();	        
	    }
	
	    @Override
	    //function used to close the door before atempting to lock it
	    public void closeDoor(DoorToggle request,
		        io.grpc.stub.StreamObserver<DoorToggle> response) {

	    		door = false;

		        System.out.println("Checking if door is closed for locking.");
 				
		        DoorToggle Door_Status = DoorToggle.newBuilder().setOpenOnOff(door).build();
		        response.onNext(Door_Status);
		        response.onCompleted();		        
		    }
	    
	    //function used to unlock the door before it can be opened
	    @Override	    
	    public void unlockDoor(LockToggle request,
	        io.grpc.stub.StreamObserver<LockToggle> response) {   	
	    	   
	    	lock = false;
		
			LockToggle Status = LockToggle.newBuilder().setLockOnOff(lock).build();
	        response.onNext(Status);
	        response.onCompleted();

	        System.out.println("Checking if door is closed for locking.");				
	    }
	    //function used to toggle the door as locked or unlocked
	    @Override
	    public void lockDoor(LockToggle request,
	        io.grpc.stub.StreamObserver<LockToggle> response) {
	    	//variable that flips a booleon to its oposite state
			lock = !lock;
			//if statment that checks the state of the boolean
			if (lock) {
	        	System.out.println("Locking the door...");
	        }
	        else {
	        	System.out.println("Unlocking the door...");
	        }
			
			LockToggle Status = LockToggle.newBuilder().setLockOnOff(lock).build();
	        response.onNext(Status);
	        response.onCompleted();              
	    }
}