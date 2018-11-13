// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.samsung.sds.brightics.common.network.proto;

/**
 * Protobuf enum {@code com.samsung.sds.brightics.common.network.proto.MessageStatus}
 */
public enum MessageStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUCCESS = 0;</code>
   */
  SUCCESS(0),
  /**
   * <code>FAIL = 1;</code>
   */
  FAIL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUCCESS = 0;</code>
   */
  public static final int SUCCESS_VALUE = 0;
  /**
   * <code>FAIL = 1;</code>
   */
  public static final int FAIL_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MessageStatus valueOf(int value) {
    return forNumber(value);
  }

  public static MessageStatus forNumber(int value) {
    switch (value) {
      case 0: return SUCCESS;
      case 1: return FAIL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageStatus>() {
          public MessageStatus findValueByNumber(int number) {
            return MessageStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.samsung.sds.brightics.common.network.proto.CommonProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final MessageStatus[] VALUES = values();

  public static MessageStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MessageStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.samsung.sds.brightics.common.network.proto.MessageStatus)
}

