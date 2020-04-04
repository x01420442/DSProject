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
    internal_static_DoorStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DoorStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LockStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LockStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017smartDoor.proto\"#\n\014SwitchStatus\022\023\n\013swi" +
      "tchOnOff\030\001 \001(\010\"2\n\nDoorStatus\022\021\n\topenOnOf" +
      "f\030\002 \001(\010\022\021\n\tstatusMsg\030\003 \001(\t\"2\n\nLockStatus" +
      "\022\021\n\tlockOnOff\030\004 \001(\010\022\021\n\tstatusMsg\030\005 \001(\t2\207" +
      "\002\n\tSmartDoor\022*\n\010switchOn\022\r.SwitchStatus\032" +
      "\r.SwitchStatus\"\000\022+\n\tswitchOff\022\r.SwitchSt" +
      "atus\032\r.SwitchStatus\"\000\022&\n\010openDoor\022\013.Door" +
      "Status\032\013.DoorStatus\"\000\022\'\n\tcloseDoor\022\013.Doo" +
      "rStatus\032\013.DoorStatus\"\000\022&\n\010lockDoor\022\013.Loc" +
      "kStatus\032\013.LockStatus\"\000\022(\n\nunlockDoor\022\013.L" +
      "ockStatus\032\013.LockStatus\"\000B\033\n\027com.smartdoo" +
      "r.smarthomeP\001b\006proto3"
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
    internal_static_DoorStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DoorStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DoorStatus_descriptor,
        new java.lang.String[] { "OpenOnOff", "StatusMsg", });
    internal_static_LockStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LockStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LockStatus_descriptor,
        new java.lang.String[] { "LockOnOff", "StatusMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
