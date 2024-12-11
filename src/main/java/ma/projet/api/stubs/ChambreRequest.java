// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.projet.api.stubs;

/**
 * Protobuf type {@code ChambreRequest}
 */
public  final class ChambreRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ChambreRequest)
    ChambreRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChambreRequest.newBuilder() to construct.
  private ChambreRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChambreRequest() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChambreRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChambreRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 21: {

            prix_ = input.readFloat();
            break;
          }
          case 24: {

            disponible_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_ChambreRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_ChambreRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.api.stubs.ChambreRequest.class, ma.projet.api.stubs.ChambreRequest.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.TypeChambre type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.TypeChambre type = 1;</code>
   * @return The type.
   */
  public ma.projet.api.stubs.TypeChambre getType() {
    @SuppressWarnings("deprecation")
    ma.projet.api.stubs.TypeChambre result = ma.projet.api.stubs.TypeChambre.valueOf(type_);
    return result == null ? ma.projet.api.stubs.TypeChambre.UNRECOGNIZED : result;
  }

  public static final int PRIX_FIELD_NUMBER = 2;
  private float prix_;
  /**
   * <code>float prix = 2;</code>
   * @return The prix.
   */
  public float getPrix() {
    return prix_;
  }

  public static final int DISPONIBLE_FIELD_NUMBER = 3;
  private boolean disponible_;
  /**
   * <code>bool disponible = 3;</code>
   * @return The disponible.
   */
  public boolean getDisponible() {
    return disponible_;
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
    if (type_ != ma.projet.api.stubs.TypeChambre.SIMPLE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (prix_ != 0F) {
      output.writeFloat(2, prix_);
    }
    if (disponible_ != false) {
      output.writeBool(3, disponible_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != ma.projet.api.stubs.TypeChambre.SIMPLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (prix_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, prix_);
    }
    if (disponible_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, disponible_);
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
    if (!(obj instanceof ma.projet.api.stubs.ChambreRequest)) {
      return super.equals(obj);
    }
    ma.projet.api.stubs.ChambreRequest other = (ma.projet.api.stubs.ChambreRequest) obj;

    if (type_ != other.type_) return false;
    if (java.lang.Float.floatToIntBits(getPrix())
        != java.lang.Float.floatToIntBits(
            other.getPrix())) return false;
    if (getDisponible()
        != other.getDisponible()) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + PRIX_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPrix());
    hash = (37 * hash) + DISPONIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisponible());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.api.stubs.ChambreRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.ChambreRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.ChambreRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.ChambreRequest parseFrom(
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
  public static Builder newBuilder(ma.projet.api.stubs.ChambreRequest prototype) {
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
   * Protobuf type {@code ChambreRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ChambreRequest)
      ma.projet.api.stubs.ChambreRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_ChambreRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_ChambreRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.api.stubs.ChambreRequest.class, ma.projet.api.stubs.ChambreRequest.Builder.class);
    }

    // Construct using ma.projet.api.stubs.ChambreRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      prix_ = 0F;

      disponible_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_ChambreRequest_descriptor;
    }

    @java.lang.Override
    public ma.projet.api.stubs.ChambreRequest getDefaultInstanceForType() {
      return ma.projet.api.stubs.ChambreRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.api.stubs.ChambreRequest build() {
      ma.projet.api.stubs.ChambreRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.api.stubs.ChambreRequest buildPartial() {
      ma.projet.api.stubs.ChambreRequest result = new ma.projet.api.stubs.ChambreRequest(this);
      result.type_ = type_;
      result.prix_ = prix_;
      result.disponible_ = disponible_;
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
      if (other instanceof ma.projet.api.stubs.ChambreRequest) {
        return mergeFrom((ma.projet.api.stubs.ChambreRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.api.stubs.ChambreRequest other) {
      if (other == ma.projet.api.stubs.ChambreRequest.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getPrix() != 0F) {
        setPrix(other.getPrix());
      }
      if (other.getDisponible() != false) {
        setDisponible(other.getDisponible());
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
      ma.projet.api.stubs.ChambreRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.api.stubs.ChambreRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.TypeChambre type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.TypeChambre type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.TypeChambre type = 1;</code>
     * @return The type.
     */
    public ma.projet.api.stubs.TypeChambre getType() {
      @SuppressWarnings("deprecation")
      ma.projet.api.stubs.TypeChambre result = ma.projet.api.stubs.TypeChambre.valueOf(type_);
      return result == null ? ma.projet.api.stubs.TypeChambre.UNRECOGNIZED : result;
    }
    /**
     * <code>.TypeChambre type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(ma.projet.api.stubs.TypeChambre value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.TypeChambre type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private float prix_ ;
    /**
     * <code>float prix = 2;</code>
     * @return The prix.
     */
    public float getPrix() {
      return prix_;
    }
    /**
     * <code>float prix = 2;</code>
     * @param value The prix to set.
     * @return This builder for chaining.
     */
    public Builder setPrix(float value) {
      
      prix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float prix = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrix() {
      
      prix_ = 0F;
      onChanged();
      return this;
    }

    private boolean disponible_ ;
    /**
     * <code>bool disponible = 3;</code>
     * @return The disponible.
     */
    public boolean getDisponible() {
      return disponible_;
    }
    /**
     * <code>bool disponible = 3;</code>
     * @param value The disponible to set.
     * @return This builder for chaining.
     */
    public Builder setDisponible(boolean value) {
      
      disponible_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool disponible = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisponible() {
      
      disponible_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ChambreRequest)
  }

  // @@protoc_insertion_point(class_scope:ChambreRequest)
  private static final ma.projet.api.stubs.ChambreRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.api.stubs.ChambreRequest();
  }

  public static ma.projet.api.stubs.ChambreRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChambreRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChambreRequest>() {
    @java.lang.Override
    public ChambreRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChambreRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChambreRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChambreRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.api.stubs.ChambreRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
