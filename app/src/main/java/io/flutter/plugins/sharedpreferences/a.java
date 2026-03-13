package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.sharedpreferences.Messages;
import io.flutter.plugins.sharedpreferences.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static MessageCodec a() {
        return Messages.PigeonCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, sharedPreferencesApi.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setBool((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setString((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setInt((String) arrayList2.get(0), (Long) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setDouble((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void g(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setEncodedStringList((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setDeprecatedStringList((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void i(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.clear((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void j(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.getAll((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void k(BinaryMessenger binaryMessenger, Messages.SharedPreferencesApi sharedPreferencesApi) {
        l(binaryMessenger, "", sharedPreferencesApi);
    }

    public static void l(BinaryMessenger binaryMessenger, String str, final Messages.SharedPreferencesApi sharedPreferencesApi) {
        String concat;
        if (str.isEmpty()) {
            concat = "";
        } else {
            concat = ".".concat(str);
        }
        BinaryMessenger.TaskQueue makeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel8.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", concat), a(), makeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: vM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(sharedPreferencesApi, obj, reply);
                            return;
                        case 1:
                            a.c(sharedPreferencesApi, obj, reply);
                            return;
                        case 2:
                            a.d(sharedPreferencesApi, obj, reply);
                            return;
                        case 3:
                            a.e(sharedPreferencesApi, obj, reply);
                            return;
                        case 4:
                            a.f(sharedPreferencesApi, obj, reply);
                            return;
                        case 5:
                            a.g(sharedPreferencesApi, obj, reply);
                            return;
                        case 6:
                            a.h(sharedPreferencesApi, obj, reply);
                            return;
                        case 7:
                            a.i(sharedPreferencesApi, obj, reply);
                            return;
                        default:
                            a.j(sharedPreferencesApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel9.setMessageHandler(null);
        }
    }
}
