package com.smartdoor.smarthome;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SmartDoorClient {

	private static  Logger logger = Logger.getLogger(SmartDoorClient.class.getName());
	
	private static SmartDoorGrpc.SmartDoorBlockingStub blockingStub;
	private static SmartDoorGrpc.SmartDoorStub asyncStub;
	private static SmartDoorGrpc.SmartDoorFutureStub futureStub;	

    private ManagedChannel channel;

	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = SmartDoorGrpc.newBlockingStub(channel);
		asyncStub = SmartDoorGrpc.newStub(channel);
		futureStub =  SmartDoorGrpc.newFutureStub(channel);
		
		//the three functions this client can call to connect with the server
		//openDoor();
		//unlockDoor();
		//lockDoor():			
		
	}
	//function used to toggle the door opened or closed.
	public static void openDoor(){
		
        try {
        	// requires the functionality of both functions
        	DoorToggle request = DoorToggle.newBuilder().build();
        	DoorToggle status = blockingStub.openDoor(request);
        	LockToggle request1 = LockToggle.newBuilder().build();
        	LockToggle status1 = blockingStub.unlockDoor(request1);
            
            String statusMsg = "";
            //boolean checks if the locked before atempting to open it
        	boolean lockCheck = status1.getLockOnOff();
            if(lockCheck == true){
                System.out.println("The door is locked, unlocking it now. ");
                unlockDoor();
            }
            //if statment that updates the user wth the state of the door.
            if(status.getOpenOnOff()){
            	statusMsg = "open";
                System.out.println("The door is now: " + statusMsg);
            }
            else{                
                statusMsg = "closed";
                System.out.println("The door is now: " + statusMsg);
            }     

        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	//close door function which is used within the lock door function to make sure the door is closed before locking it
	public static void closeDoor() {

        try {        	
        	
        	DoorToggle request = DoorToggle.newBuilder().build();
        	DoorToggle status = blockingStub.closeDoor(request);
        	
        	boolean checkdoor = status.getOpenOnOff();
        	//boolean to check if the door is locked or unlocked
            if(checkdoor){
                System.out.println("The door is closed.");
            }
            else{                
                System.out.println("The door is already closed");
            }	      

        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	//unlock door function that is called when atpemting to open a locked door
	public static void unlockDoor(){
		String statusMsg = "";
		
        try {
        	LockToggle request = LockToggle.newBuilder().build();
        	LockToggle status = blockingStub.unlockDoor(request);
            //checks if the door is locked or unlocked
            if(status.getLockOnOff()){
                statusMsg = "unlocked";
                System.out.println("The door is still locked");
            }
            else{
                statusMsg = "locked";
                System.out.println("The door is now unlocked.");
            }
            System.out.println("The door is now: " + statusMsg);
            
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }    
        
    }
	//lockdoor function used to toggle for locking or unlocking the door
	public static void lockDoor(){
		
        try {
        	//pulls resources for both functions as both are needed
        	DoorToggle request1 = DoorToggle.newBuilder().build();
        	DoorToggle status1 = blockingStub.closeDoor(request1);
        	LockToggle request = LockToggle.newBuilder().build();
        	LockToggle status = blockingStub.lockDoor(request);
        	boolean doorCheck = status1.getOpenOnOff();
        	//checks that the door is open before closing it.
            if(doorCheck == true){
                System.out.println("The door is open, Closing it now. ");
                //calls the close door function as the door needs to be closed before it can be locked.
                closeDoor();
            }
            //boolean check to say if the door has now been locked or unlocked.       	
            if(status.getLockOnOff()){
            	
                System.out.println("The door is now locked.");
            }
            else{                
                
                System.out.println("The door is now: unlocked.");
            }
            
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }	
}
