package com.smartprinter.smarthome;

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
    comments = "Source: smartPrinter.proto")
public final class SmartPrinterGrpc {

  private SmartPrinterGrpc() {}

  public static final String SERVICE_NAME = "SmartPrinter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartprinter.smarthome.PowerOn,
      com.smartprinter.smarthome.PowerOn> getTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOn",
      requestType = com.smartprinter.smarthome.PowerOn.class,
      responseType = com.smartprinter.smarthome.PowerOn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartprinter.smarthome.PowerOn,
      com.smartprinter.smarthome.PowerOn> getTurnOnMethod() {
    io.grpc.MethodDescriptor<com.smartprinter.smarthome.PowerOn, com.smartprinter.smarthome.PowerOn> getTurnOnMethod;
    if ((getTurnOnMethod = SmartPrinterGrpc.getTurnOnMethod) == null) {
      synchronized (SmartPrinterGrpc.class) {
        if ((getTurnOnMethod = SmartPrinterGrpc.getTurnOnMethod) == null) {
          SmartPrinterGrpc.getTurnOnMethod = getTurnOnMethod = 
              io.grpc.MethodDescriptor.<com.smartprinter.smarthome.PowerOn, com.smartprinter.smarthome.PowerOn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartPrinter", "turnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartprinter.smarthome.PowerOn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartprinter.smarthome.PowerOn.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPrinterMethodDescriptorSupplier("turnOn"))
                  .build();
          }
        }
     }
     return getTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartprinter.smarthome.PrintReport,
      com.smartprinter.smarthome.PrintReport> getPrintReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "printReport",
      requestType = com.smartprinter.smarthome.PrintReport.class,
      responseType = com.smartprinter.smarthome.PrintReport.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartprinter.smarthome.PrintReport,
      com.smartprinter.smarthome.PrintReport> getPrintReportMethod() {
    io.grpc.MethodDescriptor<com.smartprinter.smarthome.PrintReport, com.smartprinter.smarthome.PrintReport> getPrintReportMethod;
    if ((getPrintReportMethod = SmartPrinterGrpc.getPrintReportMethod) == null) {
      synchronized (SmartPrinterGrpc.class) {
        if ((getPrintReportMethod = SmartPrinterGrpc.getPrintReportMethod) == null) {
          SmartPrinterGrpc.getPrintReportMethod = getPrintReportMethod = 
              io.grpc.MethodDescriptor.<com.smartprinter.smarthome.PrintReport, com.smartprinter.smarthome.PrintReport>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartPrinter", "printReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartprinter.smarthome.PrintReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartprinter.smarthome.PrintReport.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPrinterMethodDescriptorSupplier("printReport"))
                  .build();
          }
        }
     }
     return getPrintReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartPrinterStub newStub(io.grpc.Channel channel) {
    return new SmartPrinterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartPrinterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartPrinterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartPrinterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartPrinterFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartPrinterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Two functions of the smart printer service. Turning printer on, making printer print a report
     * </pre>
     */
    public void turnOn(com.smartprinter.smarthome.PowerOn request,
        io.grpc.stub.StreamObserver<com.smartprinter.smarthome.PowerOn> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smartprinter.smarthome.PrintReport> printReport(
        io.grpc.stub.StreamObserver<com.smartprinter.smarthome.PrintReport> responseObserver) {
      return asyncUnimplementedStreamingCall(getPrintReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartprinter.smarthome.PowerOn,
                com.smartprinter.smarthome.PowerOn>(
                  this, METHODID_TURN_ON)))
          .addMethod(
            getPrintReportMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.smartprinter.smarthome.PrintReport,
                com.smartprinter.smarthome.PrintReport>(
                  this, METHODID_PRINT_REPORT)))
          .build();
    }
  }

  /**
   */
  public static final class SmartPrinterStub extends io.grpc.stub.AbstractStub<SmartPrinterStub> {
    private SmartPrinterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPrinterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPrinterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPrinterStub(channel, callOptions);
    }

    /**
     * <pre>
     *Two functions of the smart printer service. Turning printer on, making printer print a report
     * </pre>
     */
    public void turnOn(com.smartprinter.smarthome.PowerOn request,
        io.grpc.stub.StreamObserver<com.smartprinter.smarthome.PowerOn> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smartprinter.smarthome.PrintReport> printReport(
        io.grpc.stub.StreamObserver<com.smartprinter.smarthome.PrintReport> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPrintReportMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmartPrinterBlockingStub extends io.grpc.stub.AbstractStub<SmartPrinterBlockingStub> {
    private SmartPrinterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPrinterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPrinterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPrinterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Two functions of the smart printer service. Turning printer on, making printer print a report
     * </pre>
     */
    public com.smartprinter.smarthome.PowerOn turnOn(com.smartprinter.smarthome.PowerOn request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartPrinterFutureStub extends io.grpc.stub.AbstractStub<SmartPrinterFutureStub> {
    private SmartPrinterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPrinterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPrinterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPrinterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Two functions of the smart printer service. Turning printer on, making printer print a report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartprinter.smarthome.PowerOn> turnOn(
        com.smartprinter.smarthome.PowerOn request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON = 0;
  private static final int METHODID_PRINT_REPORT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartPrinterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartPrinterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON:
          serviceImpl.turnOn((com.smartprinter.smarthome.PowerOn) request,
              (io.grpc.stub.StreamObserver<com.smartprinter.smarthome.PowerOn>) responseObserver);
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
        case METHODID_PRINT_REPORT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.printReport(
              (io.grpc.stub.StreamObserver<com.smartprinter.smarthome.PrintReport>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartPrinterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartPrinterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartprinter.smarthome.SmartPrinterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartPrinter");
    }
  }

  private static final class SmartPrinterFileDescriptorSupplier
      extends SmartPrinterBaseDescriptorSupplier {
    SmartPrinterFileDescriptorSupplier() {}
  }

  private static final class SmartPrinterMethodDescriptorSupplier
      extends SmartPrinterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartPrinterMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartPrinterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartPrinterFileDescriptorSupplier())
              .addMethod(getTurnOnMethod())
              .addMethod(getPrintReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
