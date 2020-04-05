// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartDoor.proto

package com.smartdoor.smarthome;

public final class SmartDoorOuterClass {
  private SmartDoorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SwitchStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SwitchStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DoorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DoorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DoorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DoorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LockResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017smartDoor.proto\"#\n\014SwitchStatus\022\023\n\013swi" +
      "tchOnOff\030\001 \001(\010\"3\n\013DoorRequest\022\021\n\topenOnO" +
      "ff\030\001 \001(\010\022\021\n\tstatusMsg\030\002 \001(\t\"4\n\014DoorRespo" +
      "nse\022\021\n\topenOnOff\030\001 \001(\010\022\021\n\tstatusMsg\030\002 \001(" +
      "\t\"3\n\013LockRequest\022\021\n\tlockOnOff\030\001 \001(\010\022\021\n\ts" +
      "tatusMsg\030\002 \001(\t\"4\n\014LockResponse\022\021\n\tlockOn" +
      "Off\030\001 \001(\010\022\021\n\tstatusMsg\030\002 \001(\t2\223\002\n\tSmartDo" +
      "or\022*\n\010switchOn\022\r.SwitchStatus\032\r.SwitchSt" +
      "atus\"\000\022+\n\tswitchOff\022\r.SwitchStatus\032\r.Swi" +
      "tchStatus\"\000\022)\n\010openDoor\022\014.DoorRequest\032\r." +
      "DoorResponse\"\000\022*\n\tcloseDoor\022\014.DoorReques" +
      "t\032\r.DoorResponse\"\000\022)\n\010lockDoor\022\014.LockReq" +
      "uest\032\r.LockResponse\"\000\022+\n\nunlockDoor\022\014.Lo" +
      "ckRequest\032\r.LockResponse\"\000B\033\n\027com.smartd" +
      "oor.smarthomeP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SwitchStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SwitchStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SwitchStatus_descriptor,
        new java.lang.String[] { "SwitchOnOff", });
    internal_static_DoorRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DoorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DoorRequest_descriptor,
        new java.lang.String[] { "OpenOnOff", "StatusMsg", });
    internal_static_DoorResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_DoorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DoorResponse_descriptor,
        new java.lang.String[] { "OpenOnOff", "StatusMsg", });
    internal_static_LockRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_LockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LockRequest_descriptor,
        new java.lang.String[] { "LockOnOff", "StatusMsg", });
    internal_static_LockResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_LockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LockResponse_descriptor,
        new java.lang.String[] { "LockOnOff", "StatusMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
