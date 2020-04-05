package com.smartdoor.smarthome;

import com.google.protobuf.Empty;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
		
		openDoor();
		//closeDoor();
		//unlockDoor();
		//lockDoor();
		
		  //reverse();
		//  replace();
		//  concat();
		// concat2();
		//empty(); 	//passing an empty message - no server reply, error message
		//splitBlocking();
		//length();
		//split();	
			
		
	}
	public static void openDoor(){
		
        //startHeating();
        try {
        	
        	DoorRequest request = DoorRequest.newBuilder().build();
        	DoorResponse status = blockingStub.openDoor(request);
        	LockRequest request1 = LockRequest.newBuilder().build();
            LockResponse status1 = blockingStub.unlockDoor(request1);
            
            String statusMsg = "";
            System.out.println("Accessing door controls");
            
        	boolean lockCheck = status1.getLockOnOff();
            if(lockCheck == true){
                System.out.println("The door is locked, unlocking it now. ");
                unlockDoor();
            }else {
            	System.out.println("test");
            }
        	
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
	public static void closeDoor() {
		String statusMsg = "";
        System.out.println("Accessing door controls");
        //startHeating();
        try {
        	
        	
        	DoorRequest request = DoorRequest.newBuilder().build();
        	DoorResponse status = blockingStub.closeDoor(request);
        	
        	boolean checkdoor = status.getOpenOnOff();
        	//checkLock = !checkLock;
        	
            if(checkdoor){
            	statusMsg = "open";
                System.out.println("The door is closed.");
            }
            else{                
                statusMsg = "closed";
                System.out.println("The door is already closed");
            }
	      

        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	
	public static void unlockDoor(){
		String statusMsg = "";
		System.out.println("Accessing door controls");
        //startHeating();
        try {
            LockRequest request = LockRequest.newBuilder().build();
            LockResponse status = blockingStub.unlockDoor(request);
            
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

        //startHeating();       
        
    }
	
	public static void lockDoor(){
		
	
        try {
        	DoorRequest request1 = DoorRequest.newBuilder().build();
        	DoorResponse status1 = blockingStub.closeDoor(request1);
        	LockRequest request = LockRequest.newBuilder().build();
            LockResponse status = blockingStub.lockDoor(request);
        	boolean doorCheck = status1.getOpenOnOff();
            if(doorCheck == true){
                System.out.println("The door is open, Closing it now. ");
                closeDoor();
            }else {
            	System.out.println("test");
            }

    		
    		//closeDoor();
    		String statusMsg = "";
    		System.out.println("Accessing door controls");
            //startHeating();
        	
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
