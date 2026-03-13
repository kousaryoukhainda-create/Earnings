package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManagerApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes2.dex */
public final class AndroidWebkitLibraryPigeonInstanceManagerApi {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final InterfaceC2059lG codec$delegate = C2231nG.a(new Object());
    @NotNull
    private final BinaryMessenger binaryMessenger;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                androidWebkitLibraryPigeonInstanceManager.remove(((Long) obj2).longValue());
                wrapError = C0320He.a(null);
            } catch (Throwable th) {
                wrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            try {
                androidWebkitLibraryPigeonInstanceManager.clear();
                wrapError = C0320He.a(null);
            } catch (Throwable th) {
                wrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        @NotNull
        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) ((C2474q50) AndroidWebkitLibraryPigeonInstanceManagerApi.codec$delegate).a();
        }

        public final void setUpMessageHandlers(@NotNull BinaryMessenger binaryMessenger, final AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", getCodec());
            if (androidWebkitLibraryPigeonInstanceManager != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: d3
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (r2) {
                            case 0:
                                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$1$lambda$0(androidWebkitLibraryPigeonInstanceManager, obj, reply);
                                return;
                            default:
                                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$3$lambda$2(androidWebkitLibraryPigeonInstanceManager, obj, reply);
                                return;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", getCodec());
            if (androidWebkitLibraryPigeonInstanceManager != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: d3
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (r2) {
                            case 0:
                                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$1$lambda$0(androidWebkitLibraryPigeonInstanceManager, obj, reply);
                                return;
                            default:
                                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$3$lambda$2(androidWebkitLibraryPigeonInstanceManager, obj, reply);
                                return;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        private Companion() {
        }
    }

    public AndroidWebkitLibraryPigeonInstanceManagerApi(@NotNull BinaryMessenger binaryMessenger) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        this.binaryMessenger = binaryMessenger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidWebkitLibraryPigeonCodec codec_delegate$lambda$1() {
        return new AndroidWebkitLibraryPigeonCodec();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeStrongReference$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Object obj2 = list.get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                AbstractC2437ph.p(AbstractC1522hL.k(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
                return;
            }
            AbstractC2437ph.q(B90.a, function1);
            return;
        }
        AbstractC2437ph.p(AbstractC1522hL.k(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
    }

    @NotNull
    public final BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public final void removeStrongReference(long j, @NotNull final Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", Companion.getCodec()).send(C0320He.a(Long.valueOf(j)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.a
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                AndroidWebkitLibraryPigeonInstanceManagerApi.removeStrongReference$lambda$0(Function1.this, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", obj);
            }
        });
    }
}
