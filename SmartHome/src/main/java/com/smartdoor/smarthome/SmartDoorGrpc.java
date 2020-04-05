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
  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorToggle,
      com.smartdoor.smarthome.DoorToggle> getOpenDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openDoor",
      requestType = com.smartdoor.smarthome.DoorToggle.class,
      responseType = com.smartdoor.smarthome.DoorToggle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorToggle,
      com.smartdoor.smarthome.DoorToggle> getOpenDoorMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorToggle, com.smartdoor.smarthome.DoorToggle> getOpenDoorMethod;
    if ((getOpenDoorMethod = SmartDoorGrpc.getOpenDoorMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getOpenDoorMethod = SmartDoorGrpc.getOpenDoorMethod) == null) {
          SmartDoorGrpc.getOpenDoorMethod = getOpenDoorMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.DoorToggle, com.smartdoor.smarthome.DoorToggle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "openDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.DoorToggle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.DoorToggle.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("openDoor"))
                  .build();
          }
        }
     }
     return getOpenDoorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorToggle,
      com.smartdoor.smarthome.DoorToggle> getCloseDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "closeDoor",
      requestType = com.smartdoor.smarthome.DoorToggle.class,
      responseType = com.smartdoor.smarthome.DoorToggle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorToggle,
      com.smartdoor.smarthome.DoorToggle> getCloseDoorMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.DoorToggle, com.smartdoor.smarthome.DoorToggle> getCloseDoorMethod;
    if ((getCloseDoorMethod = SmartDoorGrpc.getCloseDoorMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getCloseDoorMethod = SmartDoorGrpc.getCloseDoorMethod) == null) {
          SmartDoorGrpc.getCloseDoorMethod = getCloseDoorMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.DoorToggle, com.smartdoor.smarthome.DoorToggle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "closeDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.DoorToggle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.DoorToggle.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("closeDoor"))
                  .build();
          }
        }
     }
     return getCloseDoorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockToggle,
      com.smartdoor.smarthome.LockToggle> getLockDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lockDoor",
      requestType = com.smartdoor.smarthome.LockToggle.class,
      responseType = com.smartdoor.smarthome.LockToggle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockToggle,
      com.smartdoor.smarthome.LockToggle> getLockDoorMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockToggle, com.smartdoor.smarthome.LockToggle> getLockDoorMethod;
    if ((getLockDoorMethod = SmartDoorGrpc.getLockDoorMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getLockDoorMethod = SmartDoorGrpc.getLockDoorMethod) == null) {
          SmartDoorGrpc.getLockDoorMethod = getLockDoorMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.LockToggle, com.smartdoor.smarthome.LockToggle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "lockDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.LockToggle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.LockToggle.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("lockDoor"))
                  .build();
          }
        }
     }
     return getLockDoorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockToggle,
      com.smartdoor.smarthome.LockToggle> getUnlockDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unlockDoor",
      requestType = com.smartdoor.smarthome.LockToggle.class,
      responseType = com.smartdoor.smarthome.LockToggle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockToggle,
      com.smartdoor.smarthome.LockToggle> getUnlockDoorMethod() {
    io.grpc.MethodDescriptor<com.smartdoor.smarthome.LockToggle, com.smartdoor.smarthome.LockToggle> getUnlockDoorMethod;
    if ((getUnlockDoorMethod = SmartDoorGrpc.getUnlockDoorMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getUnlockDoorMethod = SmartDoorGrpc.getUnlockDoorMethod) == null) {
          SmartDoorGrpc.getUnlockDoorMethod = getUnlockDoorMethod = 
              io.grpc.MethodDescriptor.<com.smartdoor.smarthome.LockToggle, com.smartdoor.smarthome.LockToggle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "unlockDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.LockToggle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartdoor.smarthome.LockToggle.getDefaultInstance()))
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
     * <pre>
     *Two functions of the smart door service. Opening the door and locking the door
     * </pre>
     */
    public void openDoor(com.smartdoor.smarthome.DoorToggle request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorToggle> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenDoorMethod(), responseObserver);
    }

    /**
     */
    public void closeDoor(com.smartdoor.smarthome.DoorToggle request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorToggle> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseDoorMethod(), responseObserver);
    }

    /**
     */
    public void lockDoor(com.smartdoor.smarthome.LockToggle request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockToggle> responseObserver) {
      asyncUnimplementedUnaryCall(getLockDoorMethod(), responseObserver);
    }

    /**
     */
    public void unlockDoor(com.smartdoor.smarthome.LockToggle request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockToggle> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockDoorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenDoorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.DoorToggle,
                com.smartdoor.smarthome.DoorToggle>(
                  this, METHODID_OPEN_DOOR)))
          .addMethod(
            getCloseDoorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.DoorToggle,
                com.smartdoor.smarthome.DoorToggle>(
                  this, METHODID_CLOSE_DOOR)))
          .addMethod(
            getLockDoorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.LockToggle,
                com.smartdoor.smarthome.LockToggle>(
                  this, METHODID_LOCK_DOOR)))
          .addMethod(
            getUnlockDoorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartdoor.smarthome.LockToggle,
                com.smartdoor.smarthome.LockToggle>(
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
     * <pre>
     *Two functions of the smart door service. Opening the door and locking the door
     * </pre>
     */
    public void openDoor(com.smartdoor.smarthome.DoorToggle request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorToggle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenDoorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeDoor(com.smartdoor.smarthome.DoorToggle request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorToggle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseDoorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lockDoor(com.smartdoor.smarthome.LockToggle request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockToggle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockDoorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unlockDoor(com.smartdoor.smarthome.LockToggle request,
        io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockToggle> responseObserver) {
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
     * <pre>
     *Two functions of the smart door service. Opening the door and locking the door
     * </pre>
     */
    public com.smartdoor.smarthome.DoorToggle openDoor(com.smartdoor.smarthome.DoorToggle request) {
      return blockingUnaryCall(
          getChannel(), getOpenDoorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartdoor.smarthome.DoorToggle closeDoor(com.smartdoor.smarthome.DoorToggle request) {
      return blockingUnaryCall(
          getChannel(), getCloseDoorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartdoor.smarthome.LockToggle lockDoor(com.smartdoor.smarthome.LockToggle request) {
      return blockingUnaryCall(
          getChannel(), getLockDoorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartdoor.smarthome.LockToggle unlockDoor(com.smartdoor.smarthome.LockToggle request) {
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
     * <pre>
     *Two functions of the smart door service. Opening the door and locking the door
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.DoorToggle> openDoor(
        com.smartdoor.smarthome.DoorToggle request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenDoorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.DoorToggle> closeDoor(
        com.smartdoor.smarthome.DoorToggle request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseDoorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.LockToggle> lockDoor(
        com.smartdoor.smarthome.LockToggle request) {
      return futureUnaryCall(
          getChannel().newCall(getLockDoorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartdoor.smarthome.LockToggle> unlockDoor(
        com.smartdoor.smarthome.LockToggle request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockDoorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_DOOR = 0;
  private static final int METHODID_CLOSE_DOOR = 1;
  private static final int METHODID_LOCK_DOOR = 2;
  private static final int METHODID_UNLOCK_DOOR = 3;

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
        case METHODID_OPEN_DOOR:
          serviceImpl.openDoor((com.smartdoor.smarthome.DoorToggle) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorToggle>) responseObserver);
          break;
        case METHODID_CLOSE_DOOR:
          serviceImpl.closeDoor((com.smartdoor.smarthome.DoorToggle) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.DoorToggle>) responseObserver);
          break;
        case METHODID_LOCK_DOOR:
          serviceImpl.lockDoor((com.smartdoor.smarthome.LockToggle) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockToggle>) responseObserver);
          break;
        case METHODID_UNLOCK_DOOR:
          serviceImpl.unlockDoor((com.smartdoor.smarthome.LockToggle) request,
              (io.grpc.stub.StreamObserver<com.smartdoor.smarthome.LockToggle>) responseObserver);
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
