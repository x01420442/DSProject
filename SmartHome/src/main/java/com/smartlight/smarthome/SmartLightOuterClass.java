// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartLight.proto

package com.smartlight.smarthome;

public final class SmartLightOuterClass {
  private SmartLightOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LightsStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LightsStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IntensitySetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IntensitySetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020smartLight.proto\"6\n\014LightsStatus\022\023\n\013li" +
      "ghtsOnOff\030\002 \001(\010\022\021\n\tstatusMsg\030\003 \001(\t\"8\n\020In" +
      "tensitySetting\022\021\n\tintensity\030\004 \001(\005\022\021\n\tsta" +
      "tusMsg\030\005 \001(\t2\350\001\n\nSmartLight\022*\n\010lightsOn\022" +
      "\r.LightsStatus\032\r.LightsStatus\"\000\022;\n\017brigh" +
      "tintensity\022\021.IntensitySetting\032\021.Intensit" +
      "ySetting\"\0000\001\0228\n\014dimintensity\022\021.Intensity" +
      "Setting\032\021.IntensitySetting\"\0000\001\0227\n\013nointe" +
      "nsity\022\021.IntensitySetting\032\021.IntensitySett" +
      "ing\"\0000\001B\034\n\030com.smartlight.smarthomeP\001b\006p" +
      "roto3"
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
    internal_static_LightsStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LightsStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LightsStatus_descriptor,
        new java.lang.String[] { "LightsOnOff", "StatusMsg", });
    internal_static_IntensitySetting_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_IntensitySetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IntensitySetting_descriptor,
        new java.lang.String[] { "Intensity", "StatusMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
