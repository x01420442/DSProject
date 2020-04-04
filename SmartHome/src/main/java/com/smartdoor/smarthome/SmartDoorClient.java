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
		
		//openDoor();
		//closeDoor();
		//unlockDoor();
		lockDoor();
		
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
		String statusMsg = "";
        System.out.println("Opening the door...");
        //startHeating();
        try {
            DoorStatus request = DoorStatus.newBuilder().setOpenOnOff(false).build();
            DoorStatus status = blockingStub.openDoor(request);
            if(status.getOpenOnOff()){
                statusMsg = "closed";
            }
            else{
                statusMsg = "open";
            }
            System.out.println("The door is now: " + statusMsg);
            
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	public static void closeDoor() {
		String statusMsg = "";
        System.out.println("Closing the door...");
        try {
        	DoorStatus request = DoorStatus.newBuilder().setOpenOnOff(false).build();
            DoorStatus status = blockingStub.closeDoor(request);
            if(status.getOpenOnOff()){
                statusMsg = "closed";
            }
            else{
                statusMsg = "open";
            }
            System.out.println("The door is now: " + statusMsg);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	
	public static void unlockDoor(){
		String statusMsg = "";
        System.out.println("unlocking the door...");
        //startHeating();
        try {
            LockStatus request = LockStatus.newBuilder().setLockOnOff(false).build();
            LockStatus status = blockingStub.unlockDoor(request);
            if(status.getLockOnOff()){
                statusMsg = "unlocked";
            }
            else{
                statusMsg = "locked";
            }
            System.out.println("The door is now: " + statusMsg);
            
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	
	public static void lockDoor(){
		closeDoor();
		String statusMsg = "";
        System.out.println("locking the door...");
        //startHeating();
        try {
            LockStatus request = LockStatus.newBuilder().setLockOnOff(false).build();
            LockStatus status = blockingStub.unlockDoor(request);
            if(status.getLockOnOff()){
                statusMsg = "locked";
            }
            else{
                statusMsg = "unlocked";
            }
            System.out.println("The door is now: " + statusMsg);
            
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
	
}
