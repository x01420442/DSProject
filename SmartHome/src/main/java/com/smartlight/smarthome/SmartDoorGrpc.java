package com.smartlight.smarthome;

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
    comments = "Source: smartLight.proto")
public final class SmartDoorGrpc {

  private SmartDoorGrpc() {}

  public static final String SERVICE_NAME = "SmartDoor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartlight.smarthome.SwitchStatus,
      com.smartlight.smarthome.SwitchStatus> getSwitchOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOn",
      requestType = com.smartlight.smarthome.SwitchStatus.class,
      responseType = com.smartlight.smarthome.SwitchStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartlight.smarthome.SwitchStatus,
      com.smartlight.smarthome.SwitchStatus> getSwitchOnMethod() {
    io.grpc.MethodDescriptor<com.smartlight.smarthome.SwitchStatus, com.smartlight.smarthome.SwitchStatus> getSwitchOnMethod;
    if ((getSwitchOnMethod = SmartDoorGrpc.getSwitchOnMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getSwitchOnMethod = SmartDoorGrpc.getSwitchOnMethod) == null) {
          SmartDoorGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.SwitchStatus, com.smartlight.smarthome.SwitchStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.SwitchStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.SwitchStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("switchOn"))
                  .build();
          }
        }
     }
     return getSwitchOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartlight.smarthome.SwitchStatus,
      com.smartlight.smarthome.SwitchStatus> getSwitchOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchOff",
      requestType = com.smartlight.smarthome.SwitchStatus.class,
      responseType = com.smartlight.smarthome.SwitchStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartlight.smarthome.SwitchStatus,
      com.smartlight.smarthome.SwitchStatus> getSwitchOffMethod() {
    io.grpc.MethodDescriptor<com.smartlight.smarthome.SwitchStatus, com.smartlight.smarthome.SwitchStatus> getSwitchOffMethod;
    if ((getSwitchOffMethod = SmartDoorGrpc.getSwitchOffMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getSwitchOffMethod = SmartDoorGrpc.getSwitchOffMethod) == null) {
          SmartDoorGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.SwitchStatus, com.smartlight.smarthome.SwitchStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.SwitchStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.SwitchStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("switchOff"))
                  .build();
          }
        }
     }
     return getSwitchOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartlight.smarthome.LightsStatus,
      com.smartlight.smarthome.LightsStatus> getLightsOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightsOn",
      requestType = com.smartlight.smarthome.LightsStatus.class,
      responseType = com.smartlight.smarthome.LightsStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartlight.smarthome.LightsStatus,
      com.smartlight.smarthome.LightsStatus> getLightsOnMethod() {
    io.grpc.MethodDescriptor<com.smartlight.smarthome.LightsStatus, com.smartlight.smarthome.LightsStatus> getLightsOnMethod;
    if ((getLightsOnMethod = SmartDoorGrpc.getLightsOnMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getLightsOnMethod = SmartDoorGrpc.getLightsOnMethod) == null) {
          SmartDoorGrpc.getLightsOnMethod = getLightsOnMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.LightsStatus, com.smartlight.smarthome.LightsStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "lightsOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.LightsStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.LightsStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("lightsOn"))
                  .build();
          }
        }
     }
     return getLightsOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartlight.smarthome.LightsStatus,
      com.smartlight.smarthome.LightsStatus> getLightsOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightsOff",
      requestType = com.smartlight.smarthome.LightsStatus.class,
      responseType = com.smartlight.smarthome.LightsStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartlight.smarthome.LightsStatus,
      com.smartlight.smarthome.LightsStatus> getLightsOffMethod() {
    io.grpc.MethodDescriptor<com.smartlight.smarthome.LightsStatus, com.smartlight.smarthome.LightsStatus> getLightsOffMethod;
    if ((getLightsOffMethod = SmartDoorGrpc.getLightsOffMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getLightsOffMethod = SmartDoorGrpc.getLightsOffMethod) == null) {
          SmartDoorGrpc.getLightsOffMethod = getLightsOffMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.LightsStatus, com.smartlight.smarthome.LightsStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "lightsOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.LightsStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.LightsStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("lightsOff"))
                  .build();
          }
        }
     }
     return getLightsOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensityRequest,
      com.smartlight.smarthome.IntensityResponse> getIntensityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "intensity",
      requestType = com.smartlight.smarthome.IntensityRequest.class,
      responseType = com.smartlight.smarthome.IntensityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensityRequest,
      com.smartlight.smarthome.IntensityResponse> getIntensityMethod() {
    io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensityRequest, com.smartlight.smarthome.IntensityResponse> getIntensityMethod;
    if ((getIntensityMethod = SmartDoorGrpc.getIntensityMethod) == null) {
      synchronized (SmartDoorGrpc.class) {
        if ((getIntensityMethod = SmartDoorGrpc.getIntensityMethod) == null) {
          SmartDoorGrpc.getIntensityMethod = getIntensityMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.IntensityRequest, com.smartlight.smarthome.IntensityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartDoor", "intensity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.IntensityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.IntensityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartDoorMethodDescriptorSupplier("intensity"))
                  .build();
          }
        }
     }
     return getIntensityMethod;
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
    public void switchOn(com.smartlight.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.SwitchStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOnMethod(), responseObserver);
    }

    /**
     */
    public void switchOff(com.smartlight.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.SwitchStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchOffMethod(), responseObserver);
    }

    /**
     */
    public void lightsOn(com.smartlight.smarthome.LightsStatus request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.LightsStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getLightsOnMethod(), responseObserver);
    }

    /**
     */
    public void lightsOff(com.smartlight.smarthome.LightsStatus request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.LightsStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getLightsOffMethod(), responseObserver);
    }

    /**
     */
    public void intensity(com.smartlight.smarthome.IntensityRequest request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIntensityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartlight.smarthome.SwitchStatus,
                com.smartlight.smarthome.SwitchStatus>(
                  this, METHODID_SWITCH_ON)))
          .addMethod(
            getSwitchOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartlight.smarthome.SwitchStatus,
                com.smartlight.smarthome.SwitchStatus>(
                  this, METHODID_SWITCH_OFF)))
          .addMethod(
            getLightsOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartlight.smarthome.LightsStatus,
                com.smartlight.smarthome.LightsStatus>(
                  this, METHODID_LIGHTS_ON)))
          .addMethod(
            getLightsOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartlight.smarthome.LightsStatus,
                com.smartlight.smarthome.LightsStatus>(
                  this, METHODID_LIGHTS_OFF)))
          .addMethod(
            getIntensityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.smartlight.smarthome.IntensityRequest,
                com.smartlight.smarthome.IntensityResponse>(
                  this, METHODID_INTENSITY)))
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
    public void switchOn(com.smartlight.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.SwitchStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchOff(com.smartlight.smarthome.SwitchStatus request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.SwitchStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lightsOn(com.smartlight.smarthome.LightsStatus request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.LightsStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightsOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lightsOff(com.smartlight.smarthome.LightsStatus request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.LightsStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightsOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void intensity(com.smartlight.smarthome.IntensityRequest request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensityResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getIntensityMethod(), getCallOptions()), request, responseObserver);
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
    public com.smartlight.smarthome.SwitchStatus switchOn(com.smartlight.smarthome.SwitchStatus request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartlight.smarthome.SwitchStatus switchOff(com.smartlight.smarthome.SwitchStatus request) {
      return blockingUnaryCall(
          getChannel(), getSwitchOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartlight.smarthome.LightsStatus lightsOn(com.smartlight.smarthome.LightsStatus request) {
      return blockingUnaryCall(
          getChannel(), getLightsOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartlight.smarthome.LightsStatus lightsOff(com.smartlight.smarthome.LightsStatus request) {
      return blockingUnaryCall(
          getChannel(), getLightsOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.smartlight.smarthome.IntensityResponse> intensity(
        com.smartlight.smarthome.IntensityRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getIntensityMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.smartlight.smarthome.SwitchStatus> switchOn(
        com.smartlight.smarthome.SwitchStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartlight.smarthome.SwitchStatus> switchOff(
        com.smartlight.smarthome.SwitchStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartlight.smarthome.LightsStatus> lightsOn(
        com.smartlight.smarthome.LightsStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getLightsOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartlight.smarthome.LightsStatus> lightsOff(
        com.smartlight.smarthome.LightsStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getLightsOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_ON = 0;
  private static final int METHODID_SWITCH_OFF = 1;
  private static final int METHODID_LIGHTS_ON = 2;
  private static final int METHODID_LIGHTS_OFF = 3;
  private static final int METHODID_INTENSITY = 4;

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
          serviceImpl.switchOn((com.smartlight.smarthome.SwitchStatus) request,
              (io.grpc.stub.StreamObserver<com.smartlight.smarthome.SwitchStatus>) responseObserver);
          break;
        case METHODID_SWITCH_OFF:
          serviceImpl.switchOff((com.smartlight.smarthome.SwitchStatus) request,
              (io.grpc.stub.StreamObserver<com.smartlight.smarthome.SwitchStatus>) responseObserver);
          break;
        case METHODID_LIGHTS_ON:
          serviceImpl.lightsOn((com.smartlight.smarthome.LightsStatus) request,
              (io.grpc.stub.StreamObserver<com.smartlight.smarthome.LightsStatus>) responseObserver);
          break;
        case METHODID_LIGHTS_OFF:
          serviceImpl.lightsOff((com.smartlight.smarthome.LightsStatus) request,
              (io.grpc.stub.StreamObserver<com.smartlight.smarthome.LightsStatus>) responseObserver);
          break;
        case METHODID_INTENSITY:
          serviceImpl.intensity((com.smartlight.smarthome.IntensityRequest) request,
              (io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensityResponse>) responseObserver);
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
      return com.smartlight.smarthome.SmartLight.getDescriptor();
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
              .addMethod(getLightsOnMethod())
              .addMethod(getLightsOffMethod())
              .addMethod(getIntensityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
