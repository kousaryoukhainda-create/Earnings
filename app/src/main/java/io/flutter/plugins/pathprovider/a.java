package io.flutter.plugins.pathprovider;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.pathprovider.Messages;
import io.flutter.plugins.pathprovider.a;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static MessageCodec a() {
        return Messages.PigeonCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getTemporaryPath());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationSupportPath());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationDocumentsPath());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationCachePath());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getExternalStoragePath());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void g(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getExternalCachePaths());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getExternalStoragePaths((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void i(BinaryMessenger binaryMessenger, Messages.PathProviderApi pathProviderApi) {
        j(binaryMessenger, "", pathProviderApi);
    }

    public static void j(BinaryMessenger binaryMessenger, String str, final Messages.PathProviderApi pathProviderApi) {
        String concat;
        if (str.isEmpty()) {
            concat = "";
        } else {
            concat = ".".concat(str);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", concat), a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: uM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(pathProviderApi, obj, reply);
                            return;
                        case 1:
                            a.c(pathProviderApi, obj, reply);
                            return;
                        case 2:
                            a.d(pathProviderApi, obj, reply);
                            return;
                        case 3:
                            a.e(pathProviderApi, obj, reply);
                            return;
                        case 4:
                            a.f(pathProviderApi, obj, reply);
                            return;
                        case 5:
                            a.g(pathProviderApi, obj, reply);
                            return;
                        default:
                            a.h(pathProviderApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", concat), a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: uM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(pathProviderApi, obj, reply);
                            return;
                        case 1:
                            a.c(pathProviderApi, obj, reply);
                            return;
                        case 2:
                            a.d(pathProviderApi, obj, reply);
                            return;
                        case 3:
                            a.e(pathProviderApi, obj, reply);
                            return;
                        case 4:
                            a.f(pathProviderApi, obj, reply);
                            return;
                        case 5:
                            a.g(pathProviderApi, obj, reply);
                            return;
                        default:
                            a.h(pathProviderApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", concat), a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: uM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(pathProviderApi, obj, reply);
                            return;
                        case 1:
                            a.c(pathProviderApi, obj, reply);
                            return;
                        case 2:
                            a.d(pathProviderApi, obj, reply);
                            return;
                        case 3:
                            a.e(pathProviderApi, obj, reply);
                            return;
                        case 4:
                            a.f(pathProviderApi, obj, reply);
                            return;
                        case 5:
                            a.g(pathProviderApi, obj, reply);
                            return;
                        default:
                            a.h(pathProviderApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", concat), a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: uM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(pathProviderApi, obj, reply);
                            return;
                        case 1:
                            a.c(pathProviderApi, obj, reply);
                            return;
                        case 2:
                            a.d(pathProviderApi, obj, reply);
                            return;
                        case 3:
                            a.e(pathProviderApi, obj, reply);
                            return;
                        case 4:
                            a.f(pathProviderApi, obj, reply);
                            return;
                        case 5:
                            a.g(pathProviderApi, obj, reply);
                            return;
                        default:
                            a.h(pathProviderApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", concat), a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: uM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(pathProviderApi, obj, reply);
                            return;
                        case 1:
                            a.c(pathProviderApi, obj, reply);
                            return;
                        case 2:
                            a.d(pathProviderApi, obj, reply);
                            return;
                        case 3:
                            a.e(pathProviderApi, obj, reply);
                            return;
                        case 4:
                            a.f(pathProviderApi, obj, reply);
                            return;
                        case 5:
                            a.g(pathProviderApi, obj, reply);
                            return;
                        default:
                            a.h(pathProviderApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", concat), a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: uM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(pathProviderApi, obj, reply);
                            return;
                        case 1:
                            a.c(pathProviderApi, obj, reply);
                            return;
                        case 2:
                            a.d(pathProviderApi, obj, reply);
                            return;
                        case 3:
                            a.e(pathProviderApi, obj, reply);
                            return;
                        case 4:
                            a.f(pathProviderApi, obj, reply);
                            return;
                        case 5:
                            a.g(pathProviderApi, obj, reply);
                            return;
                        default:
                            a.h(pathProviderApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", concat), a(), binaryMessenger.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: uM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(pathProviderApi, obj, reply);
                            return;
                        case 1:
                            a.c(pathProviderApi, obj, reply);
                            return;
                        case 2:
                            a.d(pathProviderApi, obj, reply);
                            return;
                        case 3:
                            a.e(pathProviderApi, obj, reply);
                            return;
                        case 4:
                            a.f(pathProviderApi, obj, reply);
                            return;
                        case 5:
                            a.g(pathProviderApi, obj, reply);
                            return;
                        default:
                            a.h(pathProviderApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
    }
}
