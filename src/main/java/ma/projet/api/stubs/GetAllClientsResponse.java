// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.projet.api.stubs;

/**
 * Protobuf type {@code GetAllClientsResponse}
 */
public  final class GetAllClientsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetAllClientsResponse)
    GetAllClientsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAllClientsResponse.newBuilder() to construct.
  private GetAllClientsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllClientsResponse() {
    clients_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAllClientsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAllClientsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              clients_ = new java.util.ArrayList<ma.projet.api.stubs.Client>();
              mutable_bitField0_ |= 0x00000001;
            }
            clients_.add(
                input.readMessage(ma.projet.api.stubs.Client.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        clients_ = java.util.Collections.unmodifiableList(clients_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_GetAllClientsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_GetAllClientsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.api.stubs.GetAllClientsResponse.class, ma.projet.api.stubs.GetAllClientsResponse.Builder.class);
  }

  public static final int CLIENTS_FIELD_NUMBER = 1;
  private java.util.List<ma.projet.api.stubs.Client> clients_;
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public java.util.List<ma.projet.api.stubs.Client> getClientsList() {
    return clients_;
  }
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public java.util.List<? extends ma.projet.api.stubs.ClientOrBuilder> 
      getClientsOrBuilderList() {
    return clients_;
  }
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public int getClientsCount() {
    return clients_.size();
  }
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public ma.projet.api.stubs.Client getClients(int index) {
    return clients_.get(index);
  }
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public ma.projet.api.stubs.ClientOrBuilder getClientsOrBuilder(
      int index) {
    return clients_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < clients_.size(); i++) {
      output.writeMessage(1, clients_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < clients_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, clients_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ma.projet.api.stubs.GetAllClientsResponse)) {
      return super.equals(obj);
    }
    ma.projet.api.stubs.GetAllClientsResponse other = (ma.projet.api.stubs.GetAllClientsResponse) obj;

    if (!getClientsList()
        .equals(other.getClientsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getClientsCount() > 0) {
      hash = (37 * hash) + CLIENTS_FIELD_NUMBER;
      hash = (53 * hash) + getClientsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.GetAllClientsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ma.projet.api.stubs.GetAllClientsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GetAllClientsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetAllClientsResponse)
      ma.projet.api.stubs.GetAllClientsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_GetAllClientsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_GetAllClientsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.api.stubs.GetAllClientsResponse.class, ma.projet.api.stubs.GetAllClientsResponse.Builder.class);
    }

    // Construct using ma.projet.api.stubs.GetAllClientsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getClientsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (clientsBuilder_ == null) {
        clients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        clientsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_GetAllClientsResponse_descriptor;
    }

    @java.lang.Override
    public ma.projet.api.stubs.GetAllClientsResponse getDefaultInstanceForType() {
      return ma.projet.api.stubs.GetAllClientsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.api.stubs.GetAllClientsResponse build() {
      ma.projet.api.stubs.GetAllClientsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.api.stubs.GetAllClientsResponse buildPartial() {
      ma.projet.api.stubs.GetAllClientsResponse result = new ma.projet.api.stubs.GetAllClientsResponse(this);
      int from_bitField0_ = bitField0_;
      if (clientsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          clients_ = java.util.Collections.unmodifiableList(clients_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.clients_ = clients_;
      } else {
        result.clients_ = clientsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ma.projet.api.stubs.GetAllClientsResponse) {
        return mergeFrom((ma.projet.api.stubs.GetAllClientsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.api.stubs.GetAllClientsResponse other) {
      if (other == ma.projet.api.stubs.GetAllClientsResponse.getDefaultInstance()) return this;
      if (clientsBuilder_ == null) {
        if (!other.clients_.isEmpty()) {
          if (clients_.isEmpty()) {
            clients_ = other.clients_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClientsIsMutable();
            clients_.addAll(other.clients_);
          }
          onChanged();
        }
      } else {
        if (!other.clients_.isEmpty()) {
          if (clientsBuilder_.isEmpty()) {
            clientsBuilder_.dispose();
            clientsBuilder_ = null;
            clients_ = other.clients_;
            bitField0_ = (bitField0_ & ~0x00000001);
            clientsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClientsFieldBuilder() : null;
          } else {
            clientsBuilder_.addAllMessages(other.clients_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ma.projet.api.stubs.GetAllClientsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.api.stubs.GetAllClientsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ma.projet.api.stubs.Client> clients_ =
      java.util.Collections.emptyList();
    private void ensureClientsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        clients_ = new java.util.ArrayList<ma.projet.api.stubs.Client>(clients_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ma.projet.api.stubs.Client, ma.projet.api.stubs.Client.Builder, ma.projet.api.stubs.ClientOrBuilder> clientsBuilder_;

    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public java.util.List<ma.projet.api.stubs.Client> getClientsList() {
      if (clientsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clients_);
      } else {
        return clientsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public int getClientsCount() {
      if (clientsBuilder_ == null) {
        return clients_.size();
      } else {
        return clientsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public ma.projet.api.stubs.Client getClients(int index) {
      if (clientsBuilder_ == null) {
        return clients_.get(index);
      } else {
        return clientsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder setClients(
        int index, ma.projet.api.stubs.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.set(index, value);
        onChanged();
      } else {
        clientsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder setClients(
        int index, ma.projet.api.stubs.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.set(index, builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addClients(ma.projet.api.stubs.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.add(value);
        onChanged();
      } else {
        clientsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addClients(
        int index, ma.projet.api.stubs.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.add(index, value);
        onChanged();
      } else {
        clientsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addClients(
        ma.projet.api.stubs.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.add(builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addClients(
        int index, ma.projet.api.stubs.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.add(index, builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addAllClients(
        java.lang.Iterable<? extends ma.projet.api.stubs.Client> values) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clients_);
        onChanged();
      } else {
        clientsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder clearClients() {
      if (clientsBuilder_ == null) {
        clients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        clientsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder removeClients(int index) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.remove(index);
        onChanged();
      } else {
        clientsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public ma.projet.api.stubs.Client.Builder getClientsBuilder(
        int index) {
      return getClientsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public ma.projet.api.stubs.ClientOrBuilder getClientsOrBuilder(
        int index) {
      if (clientsBuilder_ == null) {
        return clients_.get(index);  } else {
        return clientsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public java.util.List<? extends ma.projet.api.stubs.ClientOrBuilder> 
         getClientsOrBuilderList() {
      if (clientsBuilder_ != null) {
        return clientsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clients_);
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public ma.projet.api.stubs.Client.Builder addClientsBuilder() {
      return getClientsFieldBuilder().addBuilder(
          ma.projet.api.stubs.Client.getDefaultInstance());
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public ma.projet.api.stubs.Client.Builder addClientsBuilder(
        int index) {
      return getClientsFieldBuilder().addBuilder(
          index, ma.projet.api.stubs.Client.getDefaultInstance());
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public java.util.List<ma.projet.api.stubs.Client.Builder> 
         getClientsBuilderList() {
      return getClientsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ma.projet.api.stubs.Client, ma.projet.api.stubs.Client.Builder, ma.projet.api.stubs.ClientOrBuilder> 
        getClientsFieldBuilder() {
      if (clientsBuilder_ == null) {
        clientsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ma.projet.api.stubs.Client, ma.projet.api.stubs.Client.Builder, ma.projet.api.stubs.ClientOrBuilder>(
                clients_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        clients_ = null;
      }
      return clientsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetAllClientsResponse)
  }

  // @@protoc_insertion_point(class_scope:GetAllClientsResponse)
  private static final ma.projet.api.stubs.GetAllClientsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.api.stubs.GetAllClientsResponse();
  }

  public static ma.projet.api.stubs.GetAllClientsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAllClientsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAllClientsResponse>() {
    @java.lang.Override
    public GetAllClientsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAllClientsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAllClientsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllClientsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.api.stubs.GetAllClientsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
