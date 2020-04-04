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
public final class SmartLightGrpc {

  private SmartLightGrpc() {}

  public static final String SERVICE_NAME = "SmartLight";

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
    if ((getSwitchOnMethod = SmartLightGrpc.getSwitchOnMethod) == null) {
      synchronized (SmartLightGrpc.class) {
        if ((getSwitchOnMethod = SmartLightGrpc.getSwitchOnMethod) == null) {
          SmartLightGrpc.getSwitchOnMethod = getSwitchOnMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.SwitchStatus, com.smartlight.smarthome.SwitchStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartLight", "switchOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.SwitchStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.SwitchStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartLightMethodDescriptorSupplier("switchOn"))
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
    if ((getSwitchOffMethod = SmartLightGrpc.getSwitchOffMethod) == null) {
      synchronized (SmartLightGrpc.class) {
        if ((getSwitchOffMethod = SmartLightGrpc.getSwitchOffMethod) == null) {
          SmartLightGrpc.getSwitchOffMethod = getSwitchOffMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.SwitchStatus, com.smartlight.smarthome.SwitchStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartLight", "switchOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.SwitchStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.SwitchStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartLightMethodDescriptorSupplier("switchOff"))
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
    if ((getLightsOnMethod = SmartLightGrpc.getLightsOnMethod) == null) {
      synchronized (SmartLightGrpc.class) {
        if ((getLightsOnMethod = SmartLightGrpc.getLightsOnMethod) == null) {
          SmartLightGrpc.getLightsOnMethod = getLightsOnMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.LightsStatus, com.smartlight.smarthome.LightsStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartLight", "lightsOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.LightsStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.LightsStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartLightMethodDescriptorSupplier("lightsOn"))
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
    if ((getLightsOffMethod = SmartLightGrpc.getLightsOffMethod) == null) {
      synchronized (SmartLightGrpc.class) {
        if ((getLightsOffMethod = SmartLightGrpc.getLightsOffMethod) == null) {
          SmartLightGrpc.getLightsOffMethod = getLightsOffMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.LightsStatus, com.smartlight.smarthome.LightsStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartLight", "lightsOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.LightsStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.LightsStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartLightMethodDescriptorSupplier("lightsOff"))
                  .build();
          }
        }
     }
     return getLightsOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensitySetting,
      com.smartlight.smarthome.IntensitySetting> getBrightintensityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "brightintensity",
      requestType = com.smartlight.smarthome.IntensitySetting.class,
      responseType = com.smartlight.smarthome.IntensitySetting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensitySetting,
      com.smartlight.smarthome.IntensitySetting> getBrightintensityMethod() {
    io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensitySetting, com.smartlight.smarthome.IntensitySetting> getBrightintensityMethod;
    if ((getBrightintensityMethod = SmartLightGrpc.getBrightintensityMethod) == null) {
      synchronized (SmartLightGrpc.class) {
        if ((getBrightintensityMethod = SmartLightGrpc.getBrightintensityMethod) == null) {
          SmartLightGrpc.getBrightintensityMethod = getBrightintensityMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.IntensitySetting, com.smartlight.smarthome.IntensitySetting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartLight", "brightintensity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.IntensitySetting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.IntensitySetting.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartLightMethodDescriptorSupplier("brightintensity"))
                  .build();
          }
        }
     }
     return getBrightintensityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensitySetting,
      com.smartlight.smarthome.IntensitySetting> getDimintensityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dimintensity",
      requestType = com.smartlight.smarthome.IntensitySetting.class,
      responseType = com.smartlight.smarthome.IntensitySetting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensitySetting,
      com.smartlight.smarthome.IntensitySetting> getDimintensityMethod() {
    io.grpc.MethodDescriptor<com.smartlight.smarthome.IntensitySetting, com.smartlight.smarthome.IntensitySetting> getDimintensityMethod;
    if ((getDimintensityMethod = SmartLightGrpc.getDimintensityMethod) == null) {
      synchronized (SmartLightGrpc.class) {
        if ((getDimintensityMethod = SmartLightGrpc.getDimintensityMethod) == null) {
          SmartLightGrpc.getDimintensityMethod = getDimintensityMethod = 
              io.grpc.MethodDescriptor.<com.smartlight.smarthome.IntensitySetting, com.smartlight.smarthome.IntensitySetting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartLight", "dimintensity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.IntensitySetting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartlight.smarthome.IntensitySetting.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartLightMethodDescriptorSupplier("dimintensity"))
                  .build();
          }
        }
     }
     return getDimintensityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartLightStub newStub(io.grpc.Channel channel) {
    return new SmartLightStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartLightBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartLightBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartLightFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartLightFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartLightImplBase implements io.grpc.BindableService {

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
    public void brightintensity(com.smartlight.smarthome.IntensitySetting request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensitySetting> responseObserver) {
      asyncUnimplementedUnaryCall(getBrightintensityMethod(), responseObserver);
    }

    /**
     */
    public void dimintensity(com.smartlight.smarthome.IntensitySetting request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensitySetting> responseObserver) {
      asyncUnimplementedUnaryCall(getDimintensityMethod(), responseObserver);
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
            getBrightintensityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.smartlight.smarthome.IntensitySetting,
                com.smartlight.smarthome.IntensitySetting>(
                  this, METHODID_BRIGHTINTENSITY)))
          .addMethod(
            getDimintensityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.smartlight.smarthome.IntensitySetting,
                com.smartlight.smarthome.IntensitySetting>(
                  this, METHODID_DIMINTENSITY)))
          .build();
    }
  }

  /**
   */
  public static final class SmartLightStub extends io.grpc.stub.AbstractStub<SmartLightStub> {
    private SmartLightStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartLightStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartLightStub(channel, callOptions);
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
    public void brightintensity(com.smartlight.smarthome.IntensitySetting request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensitySetting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getBrightintensityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dimintensity(com.smartlight.smarthome.IntensitySetting request,
        io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensitySetting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDimintensityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartLightBlockingStub extends io.grpc.stub.AbstractStub<SmartLightBlockingStub> {
    private SmartLightBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartLightBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartLightBlockingStub(channel, callOptions);
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
    public java.util.Iterator<com.smartlight.smarthome.IntensitySetting> brightintensity(
        com.smartlight.smarthome.IntensitySetting request) {
      return blockingServerStreamingCall(
          getChannel(), getBrightintensityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.smartlight.smarthome.IntensitySetting> dimintensity(
        com.smartlight.smarthome.IntensitySetting request) {
      return blockingServerStreamingCall(
          getChannel(), getDimintensityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartLightFutureStub extends io.grpc.stub.AbstractStub<SmartLightFutureStub> {
    private SmartLightFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartLightFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartLightFutureStub(channel, callOptions);
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
  private static final int METHODID_BRIGHTINTENSITY = 4;
  private static final int METHODID_DIMINTENSITY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartLightImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartLightImplBase serviceImpl, int methodId) {
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
        case METHODID_BRIGHTINTENSITY:
          serviceImpl.brightintensity((com.smartlight.smarthome.IntensitySetting) request,
              (io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensitySetting>) responseObserver);
          break;
        case METHODID_DIMINTENSITY:
          serviceImpl.dimintensity((com.smartlight.smarthome.IntensitySetting) request,
              (io.grpc.stub.StreamObserver<com.smartlight.smarthome.IntensitySetting>) responseObserver);
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

  private static abstract class SmartLightBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartLightBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartlight.smarthome.SmartLightOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartLight");
    }
  }

  private static final class SmartLightFileDescriptorSupplier
      extends SmartLightBaseDescriptorSupplier {
    SmartLightFileDescriptorSupplier() {}
  }

  private static final class SmartLightMethodDescriptorSupplier
      extends SmartLightBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartLightMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartLightGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartLightFileDescriptorSupplier())
              .addMethod(getSwitchOnMethod())
              .addMethod(getSwitchOffMethod())
              .addMethod(getLightsOnMethod())
              .addMethod(getLightsOffMethod())
              .addMethod(getBrightintensityMethod())
              .addMethod(getDimintensityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
