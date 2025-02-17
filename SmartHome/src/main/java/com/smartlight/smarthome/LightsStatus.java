// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartLight.proto

package com.smartlight.smarthome;

/**
 * <pre>
 *The request/response for the functions of the smart lights service
 * </pre>
 *
 * Protobuf type {@code LightsStatus}
 */
public  final class LightsStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LightsStatus)
    LightsStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightsStatus.newBuilder() to construct.
  private LightsStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightsStatus() {
    lightsOnOff_ = false;
    statusMsg_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LightsStatus(
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
          case 16: {

            lightsOnOff_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            statusMsg_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.smartlight.smarthome.SmartLightOuterClass.internal_static_LightsStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.smartlight.smarthome.SmartLightOuterClass.internal_static_LightsStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.smartlight.smarthome.LightsStatus.class, com.smartlight.smarthome.LightsStatus.Builder.class);
  }

  public static final int LIGHTSONOFF_FIELD_NUMBER = 2;
  private boolean lightsOnOff_;
  /**
   * <code>bool lightsOnOff = 2;</code>
   */
  public boolean getLightsOnOff() {
    return lightsOnOff_;
  }

  public static final int STATUSMSG_FIELD_NUMBER = 3;
  private volatile java.lang.Object statusMsg_;
  /**
   * <code>string statusMsg = 3;</code>
   */
  public java.lang.String getStatusMsg() {
    java.lang.Object ref = statusMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      statusMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string statusMsg = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStatusMsgBytes() {
    java.lang.Object ref = statusMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      statusMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (lightsOnOff_ != false) {
      output.writeBool(2, lightsOnOff_);
    }
    if (!getStatusMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, statusMsg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lightsOnOff_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, lightsOnOff_);
    }
    if (!getStatusMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, statusMsg_);
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
    if (!(obj instanceof com.smartlight.smarthome.LightsStatus)) {
      return super.equals(obj);
    }
    com.smartlight.smarthome.LightsStatus other = (com.smartlight.smarthome.LightsStatus) obj;

    boolean result = true;
    result = result && (getLightsOnOff()
        == other.getLightsOnOff());
    result = result && getStatusMsg()
        .equals(other.getStatusMsg());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LIGHTSONOFF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLightsOnOff());
    hash = (37 * hash) + STATUSMSG_FIELD_NUMBER;
    hash = (53 * hash) + getStatusMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.smartlight.smarthome.LightsStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smartlight.smarthome.LightsStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.smartlight.smarthome.LightsStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smartlight.smarthome.LightsStatus parseFrom(
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
  public static Builder newBuilder(com.smartlight.smarthome.LightsStatus prototype) {
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
   * <pre>
   *The request/response for the functions of the smart lights service
   * </pre>
   *
   * Protobuf type {@code LightsStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LightsStatus)
      com.smartlight.smarthome.LightsStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.smartlight.smarthome.SmartLightOuterClass.internal_static_LightsStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.smartlight.smarthome.SmartLightOuterClass.internal_static_LightsStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.smartlight.smarthome.LightsStatus.class, com.smartlight.smarthome.LightsStatus.Builder.class);
    }

    // Construct using com.smartlight.smarthome.LightsStatus.newBuilder()
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
      lightsOnOff_ = false;

      statusMsg_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.smartlight.smarthome.SmartLightOuterClass.internal_static_LightsStatus_descriptor;
    }

    @java.lang.Override
    public com.smartlight.smarthome.LightsStatus getDefaultInstanceForType() {
      return com.smartlight.smarthome.LightsStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.smartlight.smarthome.LightsStatus build() {
      com.smartlight.smarthome.LightsStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.smartlight.smarthome.LightsStatus buildPartial() {
      com.smartlight.smarthome.LightsStatus result = new com.smartlight.smarthome.LightsStatus(this);
      result.lightsOnOff_ = lightsOnOff_;
      result.statusMsg_ = statusMsg_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.smartlight.smarthome.LightsStatus) {
        return mergeFrom((com.smartlight.smarthome.LightsStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.smartlight.smarthome.LightsStatus other) {
      if (other == com.smartlight.smarthome.LightsStatus.getDefaultInstance()) return this;
      if (other.getLightsOnOff() != false) {
        setLightsOnOff(other.getLightsOnOff());
      }
      if (!other.getStatusMsg().isEmpty()) {
        statusMsg_ = other.statusMsg_;
        onChanged();
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
      com.smartlight.smarthome.LightsStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.smartlight.smarthome.LightsStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean lightsOnOff_ ;
    /**
     * <code>bool lightsOnOff = 2;</code>
     */
    public boolean getLightsOnOff() {
      return lightsOnOff_;
    }
    /**
     * <code>bool lightsOnOff = 2;</code>
     */
    public Builder setLightsOnOff(boolean value) {
      
      lightsOnOff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool lightsOnOff = 2;</code>
     */
    public Builder clearLightsOnOff() {
      
      lightsOnOff_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object statusMsg_ = "";
    /**
     * <code>string statusMsg = 3;</code>
     */
    public java.lang.String getStatusMsg() {
      java.lang.Object ref = statusMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        statusMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string statusMsg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStatusMsgBytes() {
      java.lang.Object ref = statusMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        statusMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string statusMsg = 3;</code>
     */
    public Builder setStatusMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      statusMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string statusMsg = 3;</code>
     */
    public Builder clearStatusMsg() {
      
      statusMsg_ = getDefaultInstance().getStatusMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string statusMsg = 3;</code>
     */
    public Builder setStatusMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      statusMsg_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LightsStatus)
  }

  // @@protoc_insertion_point(class_scope:LightsStatus)
  private static final com.smartlight.smarthome.LightsStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.smartlight.smarthome.LightsStatus();
  }

  public static com.smartlight.smarthome.LightsStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LightsStatus>
      PARSER = new com.google.protobuf.AbstractParser<LightsStatus>() {
    @java.lang.Override
    public LightsStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LightsStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LightsStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightsStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.smartlight.smarthome.LightsStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

