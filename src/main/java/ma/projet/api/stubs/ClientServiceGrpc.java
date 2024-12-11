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
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final String SERVICE_NAME = "ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.projet.api.stubs.GetAllClientsRequest,
      ma.projet.api.stubs.GetAllClientsResponse> getAllClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllClients",
      requestType = ma.projet.api.stubs.GetAllClientsRequest.class,
      responseType = ma.projet.api.stubs.GetAllClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.api.stubs.GetAllClientsRequest,
      ma.projet.api.stubs.GetAllClientsResponse> getAllClientsMethod() {
    io.grpc.MethodDescriptor<ma.projet.api.stubs.GetAllClientsRequest, ma.projet.api.stubs.GetAllClientsResponse> getAllClientsMethod;
    if ((getAllClientsMethod = ClientServiceGrpc.getAllClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getAllClientsMethod = ClientServiceGrpc.getAllClientsMethod) == null) {
          ClientServiceGrpc.getAllClientsMethod = getAllClientsMethod = 
              io.grpc.MethodDescriptor.<ma.projet.api.stubs.GetAllClientsRequest, ma.projet.api.stubs.GetAllClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "AllClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.GetAllClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.GetAllClientsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("AllClients"))
                  .build();
          }
        }
     }
     return getAllClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.api.stubs.GetClientByIdRequest,
      ma.projet.api.stubs.GetClientByIdResponse> getClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientById",
      requestType = ma.projet.api.stubs.GetClientByIdRequest.class,
      responseType = ma.projet.api.stubs.GetClientByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.api.stubs.GetClientByIdRequest,
      ma.projet.api.stubs.GetClientByIdResponse> getClientByIdMethod() {
    io.grpc.MethodDescriptor<ma.projet.api.stubs.GetClientByIdRequest, ma.projet.api.stubs.GetClientByIdResponse> getClientByIdMethod;
    if ((getClientByIdMethod = ClientServiceGrpc.getClientByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getClientByIdMethod = ClientServiceGrpc.getClientByIdMethod) == null) {
          ClientServiceGrpc.getClientByIdMethod = getClientByIdMethod = 
              io.grpc.MethodDescriptor.<ma.projet.api.stubs.GetClientByIdRequest, ma.projet.api.stubs.GetClientByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "ClientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.GetClientByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.GetClientByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ClientById"))
                  .build();
          }
        }
     }
     return getClientByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.api.stubs.SaveClientRequest,
      ma.projet.api.stubs.SaveClientResponse> getSaveClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveClient",
      requestType = ma.projet.api.stubs.SaveClientRequest.class,
      responseType = ma.projet.api.stubs.SaveClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.api.stubs.SaveClientRequest,
      ma.projet.api.stubs.SaveClientResponse> getSaveClientMethod() {
    io.grpc.MethodDescriptor<ma.projet.api.stubs.SaveClientRequest, ma.projet.api.stubs.SaveClientResponse> getSaveClientMethod;
    if ((getSaveClientMethod = ClientServiceGrpc.getSaveClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getSaveClientMethod = ClientServiceGrpc.getSaveClientMethod) == null) {
          ClientServiceGrpc.getSaveClientMethod = getSaveClientMethod = 
              io.grpc.MethodDescriptor.<ma.projet.api.stubs.SaveClientRequest, ma.projet.api.stubs.SaveClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "SaveClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.SaveClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.SaveClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("SaveClient"))
                  .build();
          }
        }
     }
     return getSaveClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.api.stubs.DeleteClientRequest,
      ma.projet.api.stubs.DeleteClientResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteClient",
      requestType = ma.projet.api.stubs.DeleteClientRequest.class,
      responseType = ma.projet.api.stubs.DeleteClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.api.stubs.DeleteClientRequest,
      ma.projet.api.stubs.DeleteClientResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<ma.projet.api.stubs.DeleteClientRequest, ma.projet.api.stubs.DeleteClientResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
          ClientServiceGrpc.getDeleteClientMethod = getDeleteClientMethod = 
              io.grpc.MethodDescriptor.<ma.projet.api.stubs.DeleteClientRequest, ma.projet.api.stubs.DeleteClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "deleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.DeleteClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.api.stubs.DeleteClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("deleteClient"))
                  .build();
          }
        }
     }
     return getDeleteClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    return new ClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allClients(ma.projet.api.stubs.GetAllClientsRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetAllClientsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllClientsMethod(), responseObserver);
    }

    /**
     */
    public void clientById(ma.projet.api.stubs.GetClientByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetClientByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClientByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveClient(ma.projet.api.stubs.SaveClientRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.SaveClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveClientMethod(), responseObserver);
    }

    /**
     */
    public void deleteClient(ma.projet.api.stubs.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.DeleteClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.api.stubs.GetAllClientsRequest,
                ma.projet.api.stubs.GetAllClientsResponse>(
                  this, METHODID_ALL_CLIENTS)))
          .addMethod(
            getClientByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.api.stubs.GetClientByIdRequest,
                ma.projet.api.stubs.GetClientByIdResponse>(
                  this, METHODID_CLIENT_BY_ID)))
          .addMethod(
            getSaveClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.api.stubs.SaveClientRequest,
                ma.projet.api.stubs.SaveClientResponse>(
                  this, METHODID_SAVE_CLIENT)))
          .addMethod(
            getDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.api.stubs.DeleteClientRequest,
                ma.projet.api.stubs.DeleteClientResponse>(
                  this, METHODID_DELETE_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class ClientServiceStub extends io.grpc.stub.AbstractStub<ClientServiceStub> {
    private ClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void allClients(ma.projet.api.stubs.GetAllClientsRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetAllClientsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clientById(ma.projet.api.stubs.GetClientByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetClientByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveClient(ma.projet.api.stubs.SaveClientRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.SaveClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClient(ma.projet.api.stubs.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<ma.projet.api.stubs.DeleteClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientServiceBlockingStub extends io.grpc.stub.AbstractStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.projet.api.stubs.GetAllClientsResponse allClients(ma.projet.api.stubs.GetAllClientsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.api.stubs.GetClientByIdResponse clientById(ma.projet.api.stubs.GetClientByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.api.stubs.SaveClientResponse saveClient(ma.projet.api.stubs.SaveClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.api.stubs.DeleteClientResponse deleteClient(ma.projet.api.stubs.DeleteClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientServiceFutureStub extends io.grpc.stub.AbstractStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.api.stubs.GetAllClientsResponse> allClients(
        ma.projet.api.stubs.GetAllClientsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.api.stubs.GetClientByIdResponse> clientById(
        ma.projet.api.stubs.GetClientByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.api.stubs.SaveClientResponse> saveClient(
        ma.projet.api.stubs.SaveClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.api.stubs.DeleteClientResponse> deleteClient(
        ma.projet.api.stubs.DeleteClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_CLIENTS = 0;
  private static final int METHODID_CLIENT_BY_ID = 1;
  private static final int METHODID_SAVE_CLIENT = 2;
  private static final int METHODID_DELETE_CLIENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_CLIENTS:
          serviceImpl.allClients((ma.projet.api.stubs.GetAllClientsRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetAllClientsResponse>) responseObserver);
          break;
        case METHODID_CLIENT_BY_ID:
          serviceImpl.clientById((ma.projet.api.stubs.GetClientByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.api.stubs.GetClientByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_CLIENT:
          serviceImpl.saveClient((ma.projet.api.stubs.SaveClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.api.stubs.SaveClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((ma.projet.api.stubs.DeleteClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.api.stubs.DeleteClientResponse>) responseObserver);
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

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getAllClientsMethod())
              .addMethod(getClientByIdMethod())
              .addMethod(getSaveClientMethod())
              .addMethod(getDeleteClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
