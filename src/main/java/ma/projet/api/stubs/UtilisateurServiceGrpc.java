package ma.projet.api.stubs;

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
    comments = "Source: ReservationService.proto")
public final class UtilisateurServiceGrpc {

  private UtilisateurServiceGrpc() {}

  public static final String SERVICE_NAME = "UtilisateurService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.projet.api.stubs.GetAllUtilisateursRequest,
      ma.projet.api.stubs.GetAllUtilisateursResponse> getAllUtilisateursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllUtilisateurs",
      requestType = ma.projet.api.stubs.GetAllUtilisateursRequest.class,
      responseType = ma.projet.api.stubs.GetAllUtilisateursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.api.stubs.GetAllUtilisateursRequest,
      ma.projet.api.stubs.GetAllUtilisateursResponse> getAllUtilisateursMethod() {
    io.grpc.MethodDescriptor<ma.projet.api.stubs.GetAllUtilisateursRequest, ma.projet.api.stubs.GetAllUtilisateursResponse> getAllUtilisateursMethod;
    if ((getAllUtilisateursMethod = UtilisateurServiceGrpc.getAllUtilisateursMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getAllUtilisateursMethod = UtilisateurServiceGrpc.getAllUtilisateursMethod) == null) {
          UtilisateurServiceGrpc.getAllUtilisateursMethod = getAllUtilisateursMethod = 
              io.grpc.MethodDescriptor.<ma.projet.api.stubs.GetAllUtilisateursRequest, ma.projet.api.stubs.GetAllUtilisateursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "AllUtilisateurs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.GetAllUtilisateursRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.GetAllUtilisateursResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("AllUtilisateurs"))
                  .build();
          }
        }
     }
     return getAllUtilisateursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.api.stubs.GetUtilisateurByIdRequest,
      ma.projet.api.stubs.GetUtilisateurByIdResponse> getUtilisateurByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UtilisateurById",
      requestType = ma.projet.api.stubs.GetUtilisateurByIdRequest.class,
      responseType = ma.projet.api.stubs.GetUtilisateurByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.api.stubs.GetUtilisateurByIdRequest,
      ma.projet.api.stubs.GetUtilisateurByIdResponse> getUtilisateurByIdMethod() {
    io.grpc.MethodDescriptor<ma.projet.api.stubs.GetUtilisateurByIdRequest, ma.projet.api.stubs.GetUtilisateurByIdResponse> getUtilisateurByIdMethod;
    if ((getUtilisateurByIdMethod = UtilisateurServiceGrpc.getUtilisateurByIdMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getUtilisateurByIdMethod = UtilisateurServiceGrpc.getUtilisateurByIdMethod) == null) {
          UtilisateurServiceGrpc.getUtilisateurByIdMethod = getUtilisateurByIdMethod = 
              io.grpc.MethodDescriptor.<ma.projet.api.stubs.GetUtilisateurByIdRequest, ma.projet.api.stubs.GetUtilisateurByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "UtilisateurById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.GetUtilisateurByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.GetUtilisateurByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("UtilisateurById"))
                  .build();
          }
        }
     }
     return getUtilisateurByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.api.stubs.SaveUtilisateurRequest,
      ma.projet.api.stubs.SaveUtilisateurResponse> getSaveUtilisateurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveUtilisateur",
      requestType = ma.projet.api.stubs.SaveUtilisateurRequest.class,
      responseType = ma.projet.api.stubs.SaveUtilisateurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.api.stubs.SaveUtilisateurRequest,
      ma.projet.api.stubs.SaveUtilisateurResponse> getSaveUtilisateurMethod() {
    io.grpc.MethodDescriptor<ma.projet.api.stubs.SaveUtilisateurRequest, ma.projet.api.stubs.SaveUtilisateurResponse> getSaveUtilisateurMethod;
    if ((getSaveUtilisateurMethod = UtilisateurServiceGrpc.getSaveUtilisateurMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getSaveUtilisateurMethod = UtilisateurServiceGrpc.getSaveUtilisateurMethod) == null) {
          UtilisateurServiceGrpc.getSaveUtilisateurMethod = getSaveUtilisateurMethod = 
              io.grpc.MethodDescriptor.<ma.projet.api.stubs.SaveUtilisateurRequest, ma.projet.api.stubs.SaveUtilisateurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "SaveUtilisateur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.SaveUtilisateurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.SaveUtilisateurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("SaveUtilisateur"))
                  .build();
          }
        }
     }
     return getSaveUtilisateurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.api.stubs.DeleteUtilisateurRequest,
      ma.projet.api.stubs.DeleteUtilisateurResponse> getDeleteUtilisateurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUtilisateur",
      requestType = ma.projet.api.stubs.DeleteUtilisateurRequest.class,
      responseType = ma.projet.api.stubs.DeleteUtilisateurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.api.stubs.DeleteUtilisateurRequest,
      ma.projet.api.stubs.DeleteUtilisateurResponse> getDeleteUtilisateurMethod() {
    io.grpc.MethodDescriptor<ma.projet.api.stubs.DeleteUtilisateurRequest, ma.projet.api.stubs.DeleteUtilisateurResponse> getDeleteUtilisateurMethod;
    if ((getDeleteUtilisateurMethod = UtilisateurServiceGrpc.getDeleteUtilisateurMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getDeleteUtilisateurMethod = UtilisateurServiceGrpc.getDeleteUtilisateurMethod) == null) {
          UtilisateurServiceGrpc.getDeleteUtilisateurMethod = getDeleteUtilisateurMethod = 
              io.grpc.MethodDescriptor.<ma.projet.api.stubs.DeleteUtilisateurRequest, ma.projet.api.stubs.DeleteUtilisateurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "deleteUtilisateur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.DeleteUtilisateurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.DeleteUtilisateurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("deleteUtilisateur"))
                  .build();
          }
        }
     }
     return getDeleteUtilisateurMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UtilisateurServiceStub newStub(io.grpc.Channel channel) {
    return new UtilisateurServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UtilisateurServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UtilisateurServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UtilisateurServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UtilisateurServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UtilisateurServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allUtilisateurs(ma.projet.api.stubs.GetAllUtilisateursRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetAllUtilisateursResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllUtilisateursMethod(), responseObserver);
    }

    /**
     */
    public void utilisateurById(ma.projet.api.stubs.GetUtilisateurByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetUtilisateurByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUtilisateurByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveUtilisateur(ma.projet.api.stubs.SaveUtilisateurRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.SaveUtilisateurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveUtilisateurMethod(), responseObserver);
    }

    /**
     */
    public void deleteUtilisateur(ma.projet.api.stubs.DeleteUtilisateurRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.DeleteUtilisateurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUtilisateurMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllUtilisateursMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.api.stubs.GetAllUtilisateursRequest,
                ma.projet.api.stubs.GetAllUtilisateursResponse>(
                  this, METHODID_ALL_UTILISATEURS)))
          .addMethod(
            getUtilisateurByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.api.stubs.GetUtilisateurByIdRequest,
                ma.projet.api.stubs.GetUtilisateurByIdResponse>(
                  this, METHODID_UTILISATEUR_BY_ID)))
          .addMethod(
            getSaveUtilisateurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.api.stubs.SaveUtilisateurRequest,
                ma.projet.api.stubs.SaveUtilisateurResponse>(
                  this, METHODID_SAVE_UTILISATEUR)))
          .addMethod(
            getDeleteUtilisateurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.api.stubs.DeleteUtilisateurRequest,
                ma.projet.api.stubs.DeleteUtilisateurResponse>(
                  this, METHODID_DELETE_UTILISATEUR)))
          .build();
    }
  }

  /**
   */
  public static final class UtilisateurServiceStub extends io.grpc.stub.AbstractStub<UtilisateurServiceStub> {
    private UtilisateurServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UtilisateurServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilisateurServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UtilisateurServiceStub(channel, callOptions);
    }

    /**
     */
    public void allUtilisateurs(ma.projet.api.stubs.GetAllUtilisateursRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetAllUtilisateursResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllUtilisateursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void utilisateurById(ma.projet.api.stubs.GetUtilisateurByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetUtilisateurByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUtilisateurByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveUtilisateur(ma.projet.api.stubs.SaveUtilisateurRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.SaveUtilisateurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveUtilisateurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUtilisateur(ma.projet.api.stubs.DeleteUtilisateurRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.DeleteUtilisateurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUtilisateurMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UtilisateurServiceBlockingStub extends io.grpc.stub.AbstractStub<UtilisateurServiceBlockingStub> {
    private UtilisateurServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UtilisateurServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilisateurServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UtilisateurServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.projet.api.stubs.GetAllUtilisateursResponse allUtilisateurs(ma.projet.api.stubs.GetAllUtilisateursRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllUtilisateursMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.api.stubs.GetUtilisateurByIdResponse utilisateurById(ma.projet.api.stubs.GetUtilisateurByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getUtilisateurByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.api.stubs.SaveUtilisateurResponse saveUtilisateur(ma.projet.api.stubs.SaveUtilisateurRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveUtilisateurMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.api.stubs.DeleteUtilisateurResponse deleteUtilisateur(ma.projet.api.stubs.DeleteUtilisateurRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUtilisateurMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UtilisateurServiceFutureStub extends io.grpc.stub.AbstractStub<UtilisateurServiceFutureStub> {
    private UtilisateurServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UtilisateurServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilisateurServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UtilisateurServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.api.stubs.GetAllUtilisateursResponse> allUtilisateurs(
        ma.projet.api.stubs.GetAllUtilisateursRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllUtilisateursMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.api.stubs.GetUtilisateurByIdResponse> utilisateurById(
        ma.projet.api.stubs.GetUtilisateurByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUtilisateurByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.api.stubs.SaveUtilisateurResponse> saveUtilisateur(
        ma.projet.api.stubs.SaveUtilisateurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveUtilisateurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.api.stubs.DeleteUtilisateurResponse> deleteUtilisateur(
        ma.projet.api.stubs.DeleteUtilisateurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUtilisateurMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_UTILISATEURS = 0;
  private static final int METHODID_UTILISATEUR_BY_ID = 1;
  private static final int METHODID_SAVE_UTILISATEUR = 2;
  private static final int METHODID_DELETE_UTILISATEUR = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UtilisateurServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UtilisateurServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_UTILISATEURS:
          serviceImpl.allUtilisateurs((ma.projet.api.stubs.GetAllUtilisateursRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetAllUtilisateursResponse>) responseObserver);
          break;
        case METHODID_UTILISATEUR_BY_ID:
          serviceImpl.utilisateurById((ma.projet.api.stubs.GetUtilisateurByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetUtilisateurByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_UTILISATEUR:
          serviceImpl.saveUtilisateur((ma.projet.api.stubs.SaveUtilisateurRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.api.stubs.SaveUtilisateurResponse>) responseObserver);
          break;
        case METHODID_DELETE_UTILISATEUR:
          serviceImpl.deleteUtilisateur((ma.projet.api.stubs.DeleteUtilisateurRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.api.stubs.DeleteUtilisateurResponse>) responseObserver);
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

  private static abstract class UtilisateurServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UtilisateurServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UtilisateurService");
    }
  }

  private static final class UtilisateurServiceFileDescriptorSupplier
      extends UtilisateurServiceBaseDescriptorSupplier {
    UtilisateurServiceFileDescriptorSupplier() {}
  }

  private static final class UtilisateurServiceMethodDescriptorSupplier
      extends UtilisateurServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UtilisateurServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UtilisateurServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UtilisateurServiceFileDescriptorSupplier())
              .addMethod(getAllUtilisateursMethod())
              .addMethod(getUtilisateurByIdMethod())
              .addMethod(getSaveUtilisateurMethod())
              .addMethod(getDeleteUtilisateurMethod())
              .build();
        }
      }
    }
    return result;
  }
}
