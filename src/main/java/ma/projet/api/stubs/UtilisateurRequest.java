// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.projet.api.stubs;

/**
 * Protobuf type {@code UtilisateurRequest}
 */
public  final class UtilisateurRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UtilisateurRequest)
    UtilisateurRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UtilisateurRequest.newBuilder() to construct.
  private UtilisateurRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UtilisateurRequest() {
    nom_ = "";
    motDePasse_ = "";
    role_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UtilisateurRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UtilisateurRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            nom_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            motDePasse_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            role_ = rawValue;
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
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_UtilisateurRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_UtilisateurRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.api.stubs.UtilisateurRequest.class, ma.projet.api.stubs.UtilisateurRequest.Builder.class);
  }

  public static final int NOM_FIELD_NUMBER = 1;
  private volatile java.lang.Object nom_;
  /**
   * <code>string nom = 1;</code>
   * @return The nom.
   */
  public java.lang.String getNom() {
    java.lang.Object ref = nom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nom_ = s;
      return s;
    }
  }
  /**
   * <code>string nom = 1;</code>
   * @return The bytes for nom.
   */
  public com.google.protobuf.ByteString
      getNomBytes() {
    java.lang.Object ref = nom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MOTDEPASSE_FIELD_NUMBER = 2;
  private volatile java.lang.Object motDePasse_;
  /**
   * <code>string motDePasse = 2;</code>
   * @return The motDePasse.
   */
  public java.lang.String getMotDePasse() {
    java.lang.Object ref = motDePasse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      motDePasse_ = s;
      return s;
    }
  }
  /**
   * <code>string motDePasse = 2;</code>
   * @return The bytes for motDePasse.
   */
  public com.google.protobuf.ByteString
      getMotDePasseBytes() {
    java.lang.Object ref = motDePasse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      motDePasse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLE_FIELD_NUMBER = 3;
  private int role_;
  /**
   * <code>.Role role = 3;</code>
   * @return The enum numeric value on the wire for role.
   */
  public int getRoleValue() {
    return role_;
  }
  /**
   * <code>.Role role = 3;</code>
   * @return The role.
   */
  public ma.projet.api.stubs.Role getRole() {
    @SuppressWarnings("deprecation")
    ma.projet.api.stubs.Role result = ma.projet.api.stubs.Role.valueOf(role_);
    return result == null ? ma.projet.api.stubs.Role.UNRECOGNIZED : result;
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
    if (!getNomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nom_);
    }
    if (!getMotDePasseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, motDePasse_);
    }
    if (role_ != ma.projet.api.stubs.Role.UTILISATEUR.getNumber()) {
      output.writeEnum(3, role_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nom_);
    }
    if (!getMotDePasseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, motDePasse_);
    }
    if (role_ != ma.projet.api.stubs.Role.UTILISATEUR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, role_);
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
    if (!(obj instanceof ma.projet.api.stubs.UtilisateurRequest)) {
      return super.equals(obj);
    }
    ma.projet.api.stubs.UtilisateurRequest other = (ma.projet.api.stubs.UtilisateurRequest) obj;

    if (!getNom()
        .equals(other.getNom())) return false;
    if (!getMotDePasse()
        .equals(other.getMotDePasse())) return false;
    if (role_ != other.role_) return false;
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
    hash = (37 * hash) + NOM_FIELD_NUMBER;
    hash = (53 * hash) + getNom().hashCode();
    hash = (37 * hash) + MOTDEPASSE_FIELD_NUMBER;
    hash = (53 * hash) + getMotDePasse().hashCode();
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.UtilisateurRequest parseFrom(
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
  public static Builder newBuilder(ma.projet.api.stubs.UtilisateurRequest prototype) {
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
   * Protobuf type {@code UtilisateurRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UtilisateurRequest)
      ma.projet.api.stubs.UtilisateurRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_UtilisateurRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_UtilisateurRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.api.stubs.UtilisateurRequest.class, ma.projet.api.stubs.UtilisateurRequest.Builder.class);
    }

    // Construct using ma.projet.api.stubs.UtilisateurRequest.newBuilder()
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
      nom_ = "";

      motDePasse_ = "";

      role_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_UtilisateurRequest_descriptor;
    }

    @java.lang.Override
    public ma.projet.api.stubs.UtilisateurRequest getDefaultInstanceForType() {
      return ma.projet.api.stubs.UtilisateurRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.api.stubs.UtilisateurRequest build() {
      ma.projet.api.stubs.UtilisateurRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.api.stubs.UtilisateurRequest buildPartial() {
      ma.projet.api.stubs.UtilisateurRequest result = new ma.projet.api.stubs.UtilisateurRequest(this);
      result.nom_ = nom_;
      result.motDePasse_ = motDePasse_;
      result.role_ = role_;
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
      if (other instanceof ma.projet.api.stubs.UtilisateurRequest) {
        return mergeFrom((ma.projet.api.stubs.UtilisateurRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.api.stubs.UtilisateurRequest other) {
      if (other == ma.projet.api.stubs.UtilisateurRequest.getDefaultInstance()) return this;
      if (!other.getNom().isEmpty()) {
        nom_ = other.nom_;
        onChanged();
      }
      if (!other.getMotDePasse().isEmpty()) {
        motDePasse_ = other.motDePasse_;
        onChanged();
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
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
      ma.projet.api.stubs.UtilisateurRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.api.stubs.UtilisateurRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object nom_ = "";
    /**
     * <code>string nom = 1;</code>
     * @return The nom.
     */
    public java.lang.String getNom() {
      java.lang.Object ref = nom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nom = 1;</code>
     * @return The bytes for nom.
     */
    public com.google.protobuf.ByteString
        getNomBytes() {
      java.lang.Object ref = nom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nom = 1;</code>
     * @param value The nom to set.
     * @return This builder for chaining.
     */
    public Builder setNom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nom = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNom() {
      
      nom_ = getDefaultInstance().getNom();
      onChanged();
      return this;
    }
    /**
     * <code>string nom = 1;</code>
     * @param value The bytes for nom to set.
     * @return This builder for chaining.
     */
    public Builder setNomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nom_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object motDePasse_ = "";
    /**
     * <code>string motDePasse = 2;</code>
     * @return The motDePasse.
     */
    public java.lang.String getMotDePasse() {
      java.lang.Object ref = motDePasse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        motDePasse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string motDePasse = 2;</code>
     * @return The bytes for motDePasse.
     */
    public com.google.protobuf.ByteString
        getMotDePasseBytes() {
      java.lang.Object ref = motDePasse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        motDePasse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string motDePasse = 2;</code>
     * @param value The motDePasse to set.
     * @return This builder for chaining.
     */
    public Builder setMotDePasse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      motDePasse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string motDePasse = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMotDePasse() {
      
      motDePasse_ = getDefaultInstance().getMotDePasse();
      onChanged();
      return this;
    }
    /**
     * <code>string motDePasse = 2;</code>
     * @param value The bytes for motDePasse to set.
     * @return This builder for chaining.
     */
    public Builder setMotDePasseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      motDePasse_ = value;
      onChanged();
      return this;
    }

    private int role_ = 0;
    /**
     * <code>.Role role = 3;</code>
     * @return The enum numeric value on the wire for role.
     */
    public int getRoleValue() {
      return role_;
    }
    /**
     * <code>.Role role = 3;</code>
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Role role = 3;</code>
     * @return The role.
     */
    public ma.projet.api.stubs.Role getRole() {
      @SuppressWarnings("deprecation")
      ma.projet.api.stubs.Role result = ma.projet.api.stubs.Role.valueOf(role_);
      return result == null ? ma.projet.api.stubs.Role.UNRECOGNIZED : result;
    }
    /**
     * <code>.Role role = 3;</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(ma.projet.api.stubs.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Role role = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      
      role_ = 0;
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


    // @@protoc_insertion_point(builder_scope:UtilisateurRequest)
  }

  // @@protoc_insertion_point(class_scope:UtilisateurRequest)
  private static final ma.projet.api.stubs.UtilisateurRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.api.stubs.UtilisateurRequest();
  }

  public static ma.projet.api.stubs.UtilisateurRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UtilisateurRequest>
      PARSER = new com.google.protobuf.AbstractParser<UtilisateurRequest>() {
    @java.lang.Override
    public UtilisateurRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UtilisateurRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UtilisateurRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UtilisateurRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.api.stubs.UtilisateurRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

