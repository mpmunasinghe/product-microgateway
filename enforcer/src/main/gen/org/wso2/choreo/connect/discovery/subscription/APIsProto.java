// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/subscription/api.proto

package org.wso2.choreo.connect.discovery.subscription;

public final class APIsProto {
  private APIsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_APIs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_APIs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%wso2/discovery/subscription/api.proto\022" +
      "\033wso2.discovery.subscription\032-wso2/disco" +
      "very/subscription/url_mapping.proto\"\336\001\n\004" +
      "APIs\022\r\n\005apiId\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\020\n\010pro" +
      "vider\030\003 \001(\t\022\017\n\007version\030\004 \001(\t\022\017\n\007context\030" +
      "\005 \001(\t\022\016\n\006policy\030\006 \001(\t\022\017\n\007apiType\030\007 \001(\t\022\030" +
      "\n\020isDefaultVersion\030\010 \001(\010\022<\n\013urlMappings\030" +
      "\t \001(\0132\'.wso2.discovery.subscription.URLM" +
      "apping\022\014\n\004uuid\030\n \001(\tB\216\001\n.org.wso2.choreo" +
      ".connect.discovery.subscriptionB\tAPIsPro" +
      "toP\001ZOgithub.com/envoyproxy/go-control-p" +
      "lane/wso2/discovery/subscription;subscri" +
      "ptionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.wso2.choreo.connect.discovery.subscription.URLMappingProto.getDescriptor(),
        });
    internal_static_wso2_discovery_subscription_APIs_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_subscription_APIs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_APIs_descriptor,
        new java.lang.String[] { "ApiId", "Name", "Provider", "Version", "Context", "Policy", "ApiType", "IsDefaultVersion", "UrlMappings", "Uuid", });
    org.wso2.choreo.connect.discovery.subscription.URLMappingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
