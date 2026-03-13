package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static MessageCodec a() {
        return GeneratedAndroidFirebaseAuth.GenerateInterfacesCodec.INSTANCE;
    }

    public static /* synthetic */ void b(GeneratedAndroidFirebaseAuth.GenerateInterfaces generateInterfaces, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            generateInterfaces.pigeonInterface((GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = GeneratedAndroidFirebaseAuth.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void c(BinaryMessenger binaryMessenger, GeneratedAndroidFirebaseAuth.GenerateInterfaces generateInterfaces) {
        d(binaryMessenger, "", generateInterfaces);
    }

    public static void d(BinaryMessenger binaryMessenger, String str, GeneratedAndroidFirebaseAuth.GenerateInterfaces generateInterfaces) {
        String concat;
        if (str.isEmpty()) {
            concat = "";
        } else {
            concat = ".".concat(str);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.GenerateInterfaces.pigeonInterface", concat), a());
        if (generateInterfaces != null) {
            basicMessageChannel.setMessageHandler(new C3318zx(generateInterfaces, 2));
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
    }
}
