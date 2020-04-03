package com.smartdoor.smarthome;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: smartDoor.proto")
public final class SmartDoorGrpc {

  private SmartDoorGrpc() {}

  public static final String SERVICE_NAME = "SmartDoor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.SwitchStatus,
      com.smartdoor.smarthome.SwitchStatus> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.smartdoor.smarthome.SwitchStatus.class,
      responseType = com.smartdoor.smarthome.SwitchStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.SwitchStatus,
      com.smartdoor.smarthome.SwitchStatus> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.SwitchStatus, com.smartdoor.smarthome.SwitchStatus> getSwitchOnMethod;
    if ((getSwitchOnMethod = SmartDoorGrpc.getSwitchOnMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getSwitchOnMethod = SmartDoorGrpc.getSwitchOnMethod) == null) {
          SmartDoorGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.SwitchStatus, com.smartdoor.smarthome.SwitchStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.SwitchStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.SwitchStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.SwitchStatus,
      com.smartdoor.smarthome.SwitchStatus> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.smartdoor.smarthome.SwitchStatus.class,
      responseType = com.smartdoor.smarthome.SwitchStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.SwitchStatus,
      com.smartdoor.smarthome.SwitchStatus> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.SwitchStatus, com.smartdoor.smarthome.SwitchStatus> getSwitchOffMethod;
    if ((getSwitchOffMethod = SmartDoorGrpc.getSwitchOffMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getSwitchOffMethod = SmartDoorGrpc.getSwitchOffMethod) == null) {
          SmartDoorGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.SwitchStatus, com.smartdoor.smarthome.SwitchStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.SwitchStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.SwitchStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorStatus,
      com.smartdoor.smarthome.DoorStatus> getOpenDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openDoor",
      requestType = com.smartdoor.smarthome.DoorStatus.class,
      responseType = com.smartdoor.smarthome.DoorStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorStatus,
      com.smartdoor.smarthome.DoorStatus> getOpenDoorMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorStatus, com.smartdoor.smarthome.DoorStatus> getOpenDoorMethod;
    if ((getOpenDoorMethod = SmartDoorGrpc.getOpenDoorMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getOpenDoorMethod = SmartDoorGrpc.getOpenDoorMethod) == null) {
          SmartDoorGrpc.getOpenDoorMethod = getOpenDoorMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.DoorStatus, com.smartdoor.smarthome.DoorStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "openDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.DoorStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.DoorStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("openDoor"))
                  .build();
          }
        }
     }
     return getOpenDoorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorStatus,
      com.smartdoor.smarthome.DoorStatus> getCloseDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "closeDoor",
      requestType = com.smartdoor.smarthome.DoorStatus.class,
      responseType = com.smartdoor.smarthome.DoorStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorStatus,
      com.smartdoor.smarthome.DoorStatus> getCloseDoorMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorStatus, com.smartdoor.smarthome.DoorStatus> getCloseDoorMethod;
    if ((getCloseDoorMethod = SmartDoorGrpc.getCloseDoorMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getCloseDoorMethod = SmartDoorGrpc.getCloseDoorMethod) == null) {
          SmartDoorGrpc.getCloseDoorMethod = getCloseDoorMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.DoorStatus, com.smartdoor.smarthome.DoorStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "closeDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.DoorStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.DoorStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("closeDoor"))
                  .build();
          }
        }
     }
     return getCloseDoorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockStatus,
      com.smartdoor.smarthome.LockStatus> getLockDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lockDoor",
      requestType = com.smartdoor.smarthome.LockStatus.class,
      responseType = com.smartdoor.smarthome.LockStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockStatus,
      com.smartdoor.smarthome.LockStatus> getLockDoorMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockStatus, com.smartdoor.smarthome.LockStatus> getLockDoorMethod;
    if ((getLockDoorMethod = SmartDoorGrpc.getLockDoorMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getLockDoorMethod = SmartDoorGrpc.getLockDoorMethod) == null) {
          SmartDoorGrpc.getLockDoorMethod = getLockDoorMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.LockStatus, com.smartdoor.smarthome.LockStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "lockDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.LockStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.LockStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("lockDoor"))
                  .build();
          }
        }
     }
     return getLockDoorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockStatus,
      com.smartdoor.smarthome.LockStatus> getUnlockDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unlockDoor",
      requestType = com.smartdoor.smarthome.LockStatus.class,
      responseType = com.smartdoor.smarthome.LockStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockStatus,
      com.smartdoor.smarthome.LockStatus> getUnlockDoorMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockStatus, com.smartdoor.smarthome.LockStatus> getUnlockDoorMethod;
    if ((getUnlockDoorMethod = SmartDoorGrpc.getUnlockDoorMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getUnlockDoorMethod = SmartDoorGrpc.getUnlockDoorMethod) == null) {
          SmartDoorGrpc.getUnlockDoorMethod = getUnlockDoorMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.LockStatus, com.smartdoor.smarthome.LockStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "unlockDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.LockStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.LockStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("unlockDoor"))
                  .build();
          }
        }
     }
     return getUnlockDoorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartDoorStub newStub(io.grpc.Channel channel) {
    return new SmartDoorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartDoorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartDoorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartDoorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartDoorFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartDoorImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.smartdoor.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.SwitchStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.smartdoor.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.SwitchStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void openDoor(com.smartdoor.smarthome.DoorStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenDoorMethod(), responseObserver);
    }

    /**
     */
    public void closeDoor(com.smartdoor.smarthome.DoorStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseDoorMethod(), responseObserver);
    }

    /**
     */
    public void lockDoor(com.smartdoor.smarthome.LockStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getLockDoorMethod(), responseObserver);
    }

    /**
     */
    public void unlockDoor(com.smartdoor.smarthome.LockStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockDoorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.SwitchStatus,
                com.smartdoor.smarthome.SwitchStatus>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.SwitchStatus,
                com.smartdoor.smarthome.SwitchStatus>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getOpenDoorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.DoorStatus,
                com.smartdoor.smarthome.DoorStatus>(
                  this, METHODID_OPEN_DOOR)))
          .addMethod(
            getCloseDoorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.DoorStatus,
                com.smartdoor.smarthome.DoorStatus>(
                  this, METHODID_CLOSE_DOOR)))
          .addMethod(
            getLockDoorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.LockStatus,
                com.smartdoor.smarthome.LockStatus>(
                  this, METHODID_LOCK_DOOR)))
          .addMethod(
            getUnlockDoorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.LockStatus,
                com.smartdoor.smarthome.LockStatus>(
                  this, METHODID_UNLOCK_DOOR)))
          .build();
    }
  }

  /**
   */
  public static final class SmartDoorStub extends io.grpc.stub.AbstractStub<SmartDoorStub> {
    private SmartDoorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartDoorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartDoorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartDoorStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.smartdoor.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.SwitchStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.smartdoor.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.SwitchStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openDoor(com.smartdoor.smarthome.DoorStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenDoorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeDoor(com.smartdoor.smarthome.DoorStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseDoorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lockDoor(com.smartdoor.smarthome.LockStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockDoorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unlockDoor(com.smartdoor.smarthome.LockStatus request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockDoorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartDoorBlockingStub extends io.grpc.stub.AbstractStub<SmartDoorBlockingStub> {
    private SmartDoorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartDoorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartDoorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartDoorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartdoor.smarthome.SwitchStatus switchOn(com.smartdoor.smarthome.SwitchStatus request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartdoor.smarthome.SwitchStatus switchOff(com.smartdoor.smarthome.SwitchStatus request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartdoor.smarthome.DoorStatus openDoor(com.smartdoor.smarthome.DoorStatus request) {
      return blockingUnaryCall(
          getChannel(), getOpenDoorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartdoor.smarthome.DoorStatus closeDoor(com.smartdoor.smarthome.DoorStatus request) {
      return blockingUnaryCall(
          getChannel(), getCloseDoorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartdoor.smarthome.LockStatus lockDoor(com.smartdoor.smarthome.LockStatus request) {
      return blockingUnaryCall(
          getChannel(), getLockDoorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartdoor.smarthome.LockStatus unlockDoor(com.smartdoor.smarthome.LockStatus request) {
      return blockingUnaryCall(
          getChannel(), getUnlockDoorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartDoorFutureStub extends io.grpc.stub.AbstractStub<SmartDoorFutureStub> {
    private SmartDoorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartDoorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartDoorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartDoorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.SwitchStatus> switchOn(
        com.smartdoor.smarthome.SwitchStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.SwitchStatus> switchOff(
        com.smartdoor.smarthome.SwitchStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.DoorStatus> openDoor(
        com.smartdoor.smarthome.DoorStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenDoorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.DoorStatus> closeDoor(
        com.smartdoor.smarthome.DoorStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseDoorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.LockStatus> lockDoor(
        com.smartdoor.smarthome.LockStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getLockDoorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.LockStatus> unlockDoor(
        com.smartdoor.smarthome.LockStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockDoorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_OPEN_DOOR = 2;
  private static final int METHODID_CLOSE_DOOR = 3;
  private static final int METHODID_LOCK_DOOR = 4;
  private static final int METHODID_UNLOCK_DOOR = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartDoorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartDoorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.smartdoor.smarthome.SwitchStatus) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.SwitchStatus>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.smartdoor.smarthome.SwitchStatus) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.SwitchStatus>) responseObserver);
          break;
        case METHODID_OPEN_DOOR:
          serviceImpl.openDoor((com.smartdoor.smarthome.DoorStatus) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorStatus>) responseObserver);
          break;
        case METHODID_CLOSE_DOOR:
          serviceImpl.closeDoor((com.smartdoor.smarthome.DoorStatus) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorStatus>) responseObserver);
          break;
        case METHODID_LOCK_DOOR:
          serviceImpl.lockDoor((com.smartdoor.smarthome.LockStatus) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockStatus>) responseObserver);
          break;
        case METHODID_UNLOCK_DOOR:
          serviceImpl.unlockDoor((com.smartdoor.smarthome.LockStatus) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartDoorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartDoorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartdoor.smarthome.SmartDoorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartDoor");
    }
  }

  private static final class SmartDoorFileDescriptorSupplier
      extends SmartDoorBaseDescriptorSupplier {
    SmartDoorFileDescriptorSupplier() {}
  }

  private static final class SmartDoorMethodDescriptorSupplier
      extends SmartDoorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartDoorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SmartDoorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartDoorFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getOpenDoorMethod())
              .addMethod(getCloseDoorMethod())
              .addMethod(getLockDoorMethod())
              .addMethod(getUnlockDoorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
