// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/api.proto

package org.wso2.choreo.connect.discovery.api;

public final class ApiProto {
  private ApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_Api_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_Api_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034wso2/discovery/api/api.proto\022\022wso2.dis" +
      "covery.api\032!wso2/discovery/api/Endpoint." +
      "proto\032!wso2/discovery/api/Resource.proto" +
      "\032*wso2/discovery/api/endpoint_security.p" +
      "roto\"\272\003\n\003Api\022\n\n\002id\030\001 \001(\t\022\r\n\005title\030\002 \001(\t\022" +
      "\017\n\007version\030\003 \001(\t\022\017\n\007apiType\030\004 \001(\t\022\023\n\013des" +
      "cription\030\005 \001(\t\0224\n\016productionUrls\030\006 \003(\0132\034" +
      ".wso2.discovery.api.Endpoint\0221\n\013sandboxU" +
      "rls\030\007 \003(\0132\034.wso2.discovery.api.Endpoint\022" +
      "/\n\tresources\030\010 \003(\0132\034.wso2.discovery.api." +
      "Resource\022\020\n\010basePath\030\t \001(\t\022\014\n\004tier\030\n \001(\t" +
      "\022\031\n\021apiLifeCycleState\030\013 \001(\t\022\026\n\016securityS" +
      "cheme\030\014 \003(\t\022>\n\020endpointSecurity\030\r \001(\0132$." +
      "wso2.discovery.api.EndpointSecurity\022\033\n\023a" +
      "uthorizationHeader\030\016 \001(\t\022\027\n\017disableSecur" +
      "ity\030\017 \001(\010Br\n%org.wso2.choreo.connect.dis" +
      "covery.apiB\010ApiProtoP\001Z=github.com/envoy" +
      "proxy/go-control-plane/wso2/discovery/ap" +
      "i;apib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.wso2.choreo.connect.discovery.api.EndpointProto.getDescriptor(),
          org.wso2.choreo.connect.discovery.api.ResourceProto.getDescriptor(),
          org.wso2.choreo.connect.discovery.api.EndpointSecurityProto.getDescriptor(),
        });
    internal_static_wso2_discovery_api_Api_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_api_Api_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_Api_descriptor,
        new java.lang.String[] { "Id", "Title", "Version", "ApiType", "Description", "ProductionUrls", "SandboxUrls", "Resources", "BasePath", "Tier", "ApiLifeCycleState", "SecurityScheme", "EndpointSecurity", "AuthorizationHeader", "DisableSecurity", });
    org.wso2.choreo.connect.discovery.api.EndpointProto.getDescriptor();
    org.wso2.choreo.connect.discovery.api.ResourceProto.getDescriptor();
    org.wso2.choreo.connect.discovery.api.EndpointSecurityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
