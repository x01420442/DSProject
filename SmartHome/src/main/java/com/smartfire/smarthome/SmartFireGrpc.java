package com.smartfire.smarthome;

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
    comments = "Source: smartFire.proto")
public final class SmartFireGrpc {

  private SmartFireGrpc() {}

  public static final String SERVICE_NAME = "SmartFire";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartfire.smarthome.SwitchStatus,
      com.smartfire.smarthome.SwitchStatus> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.smartfire.smarthome.SwitchStatus.class,
      responseType = com.smartfire.smarthome.SwitchStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfire.smarthome.SwitchStatus,
      com.smartfire.smarthome.SwitchStatus> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.smartfire.smarthome.SwitchStatus, com.smartfire.smarthome.SwitchStatus> getSwitchOnMethod;
    if ((getSwitchOnMethod = SmartFireGrpc.getSwitchOnMethod) == null) {
      synchronized (SmartFireGrpc.class) {
        if ((getSwitchOnMethod = SmartFireGrpc.getSwitchOnMethod) == null) {
          SmartFireGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.smartfire.smarthome.SwitchStatus, com.smartfire.smarthome.SwitchStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFire", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.SwitchStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.SwitchStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFireMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfire.smarthome.SwitchStatus,
      com.smartfire.smarthome.SwitchStatus> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.smartfire.smarthome.SwitchStatus.class,
      responseType = com.smartfire.smarthome.SwitchStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfire.smarthome.SwitchStatus,
      com.smartfire.smarthome.SwitchStatus> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.smartfire.smarthome.SwitchStatus, com.smartfire.smarthome.SwitchStatus> getSwitchOffMethod;
    if ((getSwitchOffMethod = SmartFireGrpc.getSwitchOffMethod) == null) {
      synchronized (SmartFireGrpc.class) {
        if ((getSwitchOffMethod = SmartFireGrpc.getSwitchOffMethod) == null) {
          SmartFireGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.smartfire.smarthome.SwitchStatus, com.smartfire.smarthome.SwitchStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFire", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.SwitchStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.SwitchStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFireMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfire.smarthome.FireStatus,
      com.smartfire.smarthome.FireStatus> getFireOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fireOn",
      requestType = com.smartfire.smarthome.FireStatus.class,
      responseType = com.smartfire.smarthome.FireStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfire.smarthome.FireStatus,
      com.smartfire.smarthome.FireStatus> getFireOnMethod() {
    io.grpc.MethodDescriptor<com.smartfire.smarthome.FireStatus, com.smartfire.smarthome.FireStatus> getFireOnMethod;
    if ((getFireOnMethod = SmartFireGrpc.getFireOnMethod) == null) {
      synchronized (SmartFireGrpc.class) {
        if ((getFireOnMethod = SmartFireGrpc.getFireOnMethod) == null) {
          SmartFireGrpc.getFireOnMethod = getFireOnMethod = 
              io.grpc.MethodDescriptor.<com.smartfire.smarthome.FireStatus, com.smartfire.smarthome.FireStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFire", "fireOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.FireStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.FireStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFireMethodDescriptorSupplier("fireOn"))
                  .build();
          }
        }
     }
     return getFireOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfire.smarthome.FireStatus,
      com.smartfire.smarthome.FireStatus> getFireOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fireOff",
      requestType = com.smartfire.smarthome.FireStatus.class,
      responseType = com.smartfire.smarthome.FireStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfire.smarthome.FireStatus,
      com.smartfire.smarthome.FireStatus> getFireOffMethod() {
    io.grpc.MethodDescriptor<com.smartfire.smarthome.FireStatus, com.smartfire.smarthome.FireStatus> getFireOffMethod;
    if ((getFireOffMethod = SmartFireGrpc.getFireOffMethod) == null) {
      synchronized (SmartFireGrpc.class) {
        if ((getFireOffMethod = SmartFireGrpc.getFireOffMethod) == null) {
          SmartFireGrpc.getFireOffMethod = getFireOffMethod = 
              io.grpc.MethodDescriptor.<com.smartfire.smarthome.FireStatus, com.smartfire.smarthome.FireStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFire", "fireOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.FireStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.FireStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFireMethodDescriptorSupplier("fireOff"))
                  .build();
          }
        }
     }
     return getFireOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfire.smarthome.TempratureSetting,
      com.smartfire.smarthome.TempratureSetting> getMakeHotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makeHot",
      requestType = com.smartfire.smarthome.TempratureSetting.class,
      responseType = com.smartfire.smarthome.TempratureSetting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartfire.smarthome.TempratureSetting,
      com.smartfire.smarthome.TempratureSetting> getMakeHotMethod() {
    io.grpc.MethodDescriptor<com.smartfire.smarthome.TempratureSetting, com.smartfire.smarthome.TempratureSetting> getMakeHotMethod;
    if ((getMakeHotMethod = SmartFireGrpc.getMakeHotMethod) == null) {
      synchronized (SmartFireGrpc.class) {
        if ((getMakeHotMethod = SmartFireGrpc.getMakeHotMethod) == null) {
          SmartFireGrpc.getMakeHotMethod = getMakeHotMethod = 
              io.grpc.MethodDescriptor.<com.smartfire.smarthome.TempratureSetting, com.smartfire.smarthome.TempratureSetting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFire", "makeHot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.TempratureSetting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.TempratureSetting.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFireMethodDescriptorSupplier("makeHot"))
                  .build();
          }
        }
     }
     return getMakeHotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfire.smarthome.TempratureSetting,
      com.smartfire.smarthome.TempratureSetting> getMakeColdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makeCold",
      requestType = com.smartfire.smarthome.TempratureSetting.class,
      responseType = com.smartfire.smarthome.TempratureSetting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartfire.smarthome.TempratureSetting,
      com.smartfire.smarthome.TempratureSetting> getMakeColdMethod() {
    io.grpc.MethodDescriptor<com.smartfire.smarthome.TempratureSetting, com.smartfire.smarthome.TempratureSetting> getMakeColdMethod;
    if ((getMakeColdMethod = SmartFireGrpc.getMakeColdMethod) == null) {
      synchronized (SmartFireGrpc.class) {
        if ((getMakeColdMethod = SmartFireGrpc.getMakeColdMethod) == null) {
          SmartFireGrpc.getMakeColdMethod = getMakeColdMethod = 
              io.grpc.MethodDescriptor.<com.smartfire.smarthome.TempratureSetting, com.smartfire.smarthome.TempratureSetting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFire", "makeCold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.TempratureSetting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfire.smarthome.TempratureSetting.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFireMethodDescriptorSupplier("makeCold"))
                  .build();
          }
        }
     }
     return getMakeColdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartFireStub newStub(io.grpc.Channel channel) {
    return new SmartFireStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartFireBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartFireBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartFireFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartFireFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartFireImplBase implements io.grpc.BindableService {

    /**
     */
    public void switchOn(com.smartfire.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.SwitchStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.smartfire.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.SwitchStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void fireOn(com.smartfire.smarthome.FireStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.FireStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getFireOnMethod(), responseObserver);
    }

    /**
     */
    public void fireOff(com.smartfire.smarthome.FireStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.FireStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getFireOffMethod(), responseObserver);
    }

    /**
     */
    public void makeHot(com.smartfire.smarthome.TempratureSetting request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.TempratureSetting> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeHotMethod(), responseObserver);
    }

    /**
     */
    public void makeCold(com.smartfire.smarthome.TempratureSetting request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.TempratureSetting> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeColdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartfire.smarthome.SwitchStatus,
                com.smartfire.smarthome.SwitchStatus>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartfire.smarthome.SwitchStatus,
                com.smartfire.smarthome.SwitchStatus>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getFireOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartfire.smarthome.FireStatus,
                com.smartfire.smarthome.FireStatus>(
                  this, METHODID_FIRE_ON)))
          .addMethod(
            getFireOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartfire.smarthome.FireStatus,
                com.smartfire.smarthome.FireStatus>(
                  this, METHODID_FIRE_OFF)))
          .addMethod(
            getMakeHotMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.smartfire.smarthome.TempratureSetting,
                com.smartfire.smarthome.TempratureSetting>(
                  this, METHODID_MAKE_HOT)))
          .addMethod(
            getMakeColdMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.smartfire.smarthome.TempratureSetting,
                com.smartfire.smarthome.TempratureSetting>(
                  this, METHODID_MAKE_COLD)))
          .build();
    }
  }

  /**
   */
  public static final class SmartFireStub extends io.grpc.stub.AbstractStub<SmartFireStub> {
    private SmartFireStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFireStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFireStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFireStub(channel, callOptions);
    }

    /**
     */
    public void switchOn(com.smartfire.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.SwitchStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.smartfire.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.SwitchStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fireOn(com.smartfire.smarthome.FireStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.FireStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFireOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fireOff(com.smartfire.smarthome.FireStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.FireStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFireOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeHot(com.smartfire.smarthome.TempratureSetting request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.TempratureSetting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMakeHotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeCold(com.smartfire.smarthome.TempratureSetting request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.TempratureSetting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMakeColdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartFireBlockingStub extends io.grpc.stub.AbstractStub<SmartFireBlockingStub> {
    private SmartFireBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFireBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFireBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFireBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartfire.smarthome.SwitchStatus switchOn(com.smartfire.smarthome.SwitchStatus request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfire.smarthome.SwitchStatus switchOff(com.smartfire.smarthome.SwitchStatus request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfire.smarthome.FireStatus fireOn(com.smartfire.smarthome.FireStatus request) {
      return blockingUnaryCall(
          getChannel(), getFireOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfire.smarthome.FireStatus fireOff(com.smartfire.smarthome.FireStatus request) {
      return blockingUnaryCall(
          getChannel(), getFireOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.smartfire.smarthome.TempratureSetting> makeHot(
        com.smartfire.smarthome.TempratureSetting request) {
      return blockingServerStreamingCall(
          getChannel(), getMakeHotMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.smartfire.smarthome.TempratureSetting> makeCold(
        com.smartfire.smarthome.TempratureSetting request) {
      return blockingServerStreamingCall(
          getChannel(), getMakeColdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartFireFutureStub extends io.grpc.stub.AbstractStub<SmartFireFutureStub> {
    private SmartFireFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFireFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFireFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFireFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfire.smarthome.SwitchStatus> switchOn(
        com.smartfire.smarthome.SwitchStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfire.smarthome.SwitchStatus> switchOff(
        com.smartfire.smarthome.SwitchStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfire.smarthome.FireStatus> fireOn(
        com.smartfire.smarthome.FireStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getFireOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfire.smarthome.FireStatus> fireOff(
        com.smartfire.smarthome.FireStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getFireOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_FIRE_ON = 2;
  private static final int METHODID_FIRE_OFF = 3;
  private static final int METHODID_MAKE_HOT = 4;
  private static final int METHODID_MAKE_COLD = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartFireImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartFireImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_ON:
          serviceImpl.switchOn((com.smartfire.smarthome.SwitchStatus) request,
              (io.grpc.stub.StreamObserver<com.smartfire.smarthome.SwitchStatus>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.smartfire.smarthome.SwitchStatus) request,
              (io.grpc.stub.StreamObserver<com.smartfire.smarthome.SwitchStatus>) responseObserver);
          break;
        case METHODID_FIRE_ON:
          serviceImpl.fireOn((com.smartfire.smarthome.FireStatus) request,
              (io.grpc.stub.StreamObserver<com.smartfire.smarthome.FireStatus>) responseObserver);
          break;
        case METHODID_FIRE_OFF:
          serviceImpl.fireOff((com.smartfire.smarthome.FireStatus) request,
              (io.grpc.stub.StreamObserver<com.smartfire.smarthome.FireStatus>) responseObserver);
          break;
        case METHODID_MAKE_HOT:
          serviceImpl.makeHot((com.smartfire.smarthome.TempratureSetting) request,
              (io.grpc.stub.StreamObserver<com.smartfire.smarthome.TempratureSetting>) responseObserver);
          break;
        case METHODID_MAKE_COLD:
          serviceImpl.makeCold((com.smartfire.smarthome.TempratureSetting) request,
              (io.grpc.stub.StreamObserver<com.smartfire.smarthome.TempratureSetting>) responseObserver);
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

  private static abstract class SmartFireBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartFireBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartfire.smarthome.SmartFireOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartFire");
    }
  }

  private static final class SmartFireFileDescriptorSupplier
      extends SmartFireBaseDescriptorSupplier {
    SmartFireFileDescriptorSupplier() {}
  }

  private static final class SmartFireMethodDescriptorSupplier
      extends SmartFireBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartFireMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartFireGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartFireFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getFireOnMethod())
              .addMethod(getFireOffMethod())
              .addMethod(getMakeHotMethod())
              .addMethod(getMakeColdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
