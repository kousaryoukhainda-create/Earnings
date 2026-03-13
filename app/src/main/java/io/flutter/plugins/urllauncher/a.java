package io.flutter.plugins.urllauncher;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.urllauncher.a;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static MessageCodec a() {
        return Messages.PigeonCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.canLaunchUrl((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.launchUrl((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.openUrlInApp((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (Messages.WebViewOptions) arrayList2.get(2), (Messages.BrowserOptions) arrayList2.get(3)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.supportsCustomTabs());
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            urlLauncherApi.closeWebView();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void g(BinaryMessenger binaryMessenger, Messages.UrlLauncherApi urlLauncherApi) {
        h(binaryMessenger, "", urlLauncherApi);
    }

    public static void h(BinaryMessenger binaryMessenger, String str, final Messages.UrlLauncherApi urlLauncherApi) {
        String concat;
        if (str.isEmpty()) {
            concat = "";
        } else {
            concat = ".".concat(str);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", concat), a());
        if (urlLauncherApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: wM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(urlLauncherApi, obj, reply);
                            return;
                        case 1:
                            a.c(urlLauncherApi, obj, reply);
                            return;
                        case 2:
                            a.d(urlLauncherApi, obj, reply);
                            return;
                        case 3:
                            a.e(urlLauncherApi, obj, reply);
                            return;
                        default:
                            a.f(urlLauncherApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", concat), a());
        if (urlLauncherApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: wM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(urlLauncherApi, obj, reply);
                            return;
                        case 1:
                            a.c(urlLauncherApi, obj, reply);
                            return;
                        case 2:
                            a.d(urlLauncherApi, obj, reply);
                            return;
                        case 3:
                            a.e(urlLauncherApi, obj, reply);
                            return;
                        default:
                            a.f(urlLauncherApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", concat), a());
        if (urlLauncherApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: wM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(urlLauncherApi, obj, reply);
                            return;
                        case 1:
                            a.c(urlLauncherApi, obj, reply);
                            return;
                        case 2:
                            a.d(urlLauncherApi, obj, reply);
                            return;
                        case 3:
                            a.e(urlLauncherApi, obj, reply);
                            return;
                        default:
                            a.f(urlLauncherApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", concat), a());
        if (urlLauncherApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: wM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(urlLauncherApi, obj, reply);
                            return;
                        case 1:
                            a.c(urlLauncherApi, obj, reply);
                            return;
                        case 2:
                            a.d(urlLauncherApi, obj, reply);
                            return;
                        case 3:
                            a.e(urlLauncherApi, obj, reply);
                            return;
                        default:
                            a.f(urlLauncherApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", concat), a());
        if (urlLauncherApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: wM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(urlLauncherApi, obj, reply);
                            return;
                        case 1:
                            a.c(urlLauncherApi, obj, reply);
                            return;
                        case 2:
                            a.d(urlLauncherApi, obj, reply);
                            return;
                        case 3:
                            a.e(urlLauncherApi, obj, reply);
                            return;
                        default:
                            a.f(urlLauncherApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
    }
}
