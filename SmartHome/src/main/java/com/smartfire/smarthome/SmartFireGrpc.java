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
     * <pre>
     *Three functions of the smart Fire service. Turning fire on, making it hotter, making it colder.
     * </pre>
     */
    public void fireOn(com.smartfire.smarthome.FireStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.FireStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getFireOnMethod(), responseObserver);
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
            getFireOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartfire.smarthome.FireStatus,
                com.smartfire.smarthome.FireStatus>(
                  this, METHODID_FIRE_ON)))
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
     * <pre>
     *Three functions of the smart Fire service. Turning fire on, making it hotter, making it colder.
     * </pre>
     */
    public void fireOn(com.smartfire.smarthome.FireStatus request,
        io.grpc.stub.StreamObserver<com.smartfire.smarthome.FireStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFireOnMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     *Three functions of the smart Fire service. Turning fire on, making it hotter, making it colder.
     * </pre>
     */
    public com.smartfire.smarthome.FireStatus fireOn(com.smartfire.smarthome.FireStatus request) {
      return blockingUnaryCall(
          getChannel(), getFireOnMethod(), getCallOptions(), request);
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
     * <pre>
     *Three functions of the smart Fire service. Turning fire on, making it hotter, making it colder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfire.smarthome.FireStatus> fireOn(
        com.smartfire.smarthome.FireStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getFireOnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIRE_ON = 0;
  private static final int METHODID_MAKE_HOT = 1;
  private static final int METHODID_MAKE_COLD = 2;

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
        case METHODID_FIRE_ON:
          serviceImpl.fireOn((com.smartfire.smarthome.FireStatus) request,
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
              .addMethod(getFireOnMethod())
              .addMethod(getMakeHotMethod())
              .addMethod(getMakeColdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
