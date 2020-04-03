// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartDoor.proto

package com.smartdoor.smarthome;

/**
 * Protobuf type {@code LockStatus}
 */
public  final class LockStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LockStatus)
    LockStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LockStatus.newBuilder() to construct.
  private LockStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LockStatus() {
    lockOnOff_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LockStatus(
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
          case 24: {

            lockOnOff_ = input.readBool();
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
    return com.smartdoor.smarthome.SmartDoorOuterClass.internal_static_LockStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.smartdoor.smarthome.SmartDoorOuterClass.internal_static_LockStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.smartdoor.smarthome.LockStatus.class, com.smartdoor.smarthome.LockStatus.Builder.class);
  }

  public static final int LOCKONOFF_FIELD_NUMBER = 3;
  private boolean lockOnOff_;
  /**
   * <code>bool lockOnOff = 3;</code>
   */
  public boolean getLockOnOff() {
    return lockOnOff_;
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
    if (lockOnOff_ != false) {
      output.writeBool(3, lockOnOff_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lockOnOff_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, lockOnOff_);
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
    if (!(obj instanceof com.smartdoor.smarthome.LockStatus)) {
      return super.equals(obj);
    }
    com.smartdoor.smarthome.LockStatus other = (com.smartdoor.smarthome.LockStatus) obj;

    boolean result = true;
    result = result && (getLockOnOff()
        == other.getLockOnOff());
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
    hash = (37 * hash) + LOCKONOFF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLockOnOff());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.smartdoor.smarthome.LockStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smartdoor.smarthome.LockStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.smartdoor.smarthome.LockStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smartdoor.smarthome.LockStatus parseFrom(
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
  public static Builder newBuilder(com.smartdoor.smarthome.LockStatus prototype) {
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
   * Protobuf type {@code LockStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LockStatus)
      com.smartdoor.smarthome.LockStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.smartdoor.smarthome.SmartDoorOuterClass.internal_static_LockStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.smartdoor.smarthome.SmartDoorOuterClass.internal_static_LockStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.smartdoor.smarthome.LockStatus.class, com.smartdoor.smarthome.LockStatus.Builder.class);
    }

    // Construct using com.smartdoor.smarthome.LockStatus.newBuilder()
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
      lockOnOff_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.smartdoor.smarthome.SmartDoorOuterClass.internal_static_LockStatus_descriptor;
    }

    @java.lang.Override
    public com.smartdoor.smarthome.LockStatus getDefaultInstanceForType() {
      return com.smartdoor.smarthome.LockStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.smartdoor.smarthome.LockStatus build() {
      com.smartdoor.smarthome.LockStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.smartdoor.smarthome.LockStatus buildPartial() {
      com.smartdoor.smarthome.LockStatus result = new com.smartdoor.smarthome.LockStatus(this);
      result.lockOnOff_ = lockOnOff_;
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
      if (other instanceof com.smartdoor.smarthome.LockStatus) {
        return mergeFrom((com.smartdoor.smarthome.LockStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.smartdoor.smarthome.LockStatus other) {
      if (other == com.smartdoor.smarthome.LockStatus.getDefaultInstance()) return this;
      if (other.getLockOnOff() != false) {
        setLockOnOff(other.getLockOnOff());
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
      com.smartdoor.smarthome.LockStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.smartdoor.smarthome.LockStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean lockOnOff_ ;
    /**
     * <code>bool lockOnOff = 3;</code>
     */
    public boolean getLockOnOff() {
      return lockOnOff_;
    }
    /**
     * <code>bool lockOnOff = 3;</code>
     */
    public Builder setLockOnOff(boolean value) {
      
      lockOnOff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool lockOnOff = 3;</code>
     */
    public Builder clearLockOnOff() {
      
      lockOnOff_ = false;
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


    // @@protoc_insertion_point(builder_scope:LockStatus)
  }

  // @@protoc_insertion_point(class_scope:LockStatus)
  private static final com.smartdoor.smarthome.LockStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.smartdoor.smarthome.LockStatus();
  }

  public static com.smartdoor.smarthome.LockStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LockStatus>
      PARSER = new com.google.protobuf.AbstractParser<LockStatus>() {
    @java.lang.Override
    public LockStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LockStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LockStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LockStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.smartdoor.smarthome.LockStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

