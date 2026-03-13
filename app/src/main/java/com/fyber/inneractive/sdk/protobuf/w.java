package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public class w implements n0 {
    public static final w a = new w();

    @Override // com.fyber.inneractive.sdk.protobuf.n0
    public boolean a(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.n0
    public m0 b(Class<?> cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (m0) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
