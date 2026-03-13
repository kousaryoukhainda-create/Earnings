package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.videoplayer.Messages;
import io.flutter.plugins.videoplayer.a;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static MessageCodec a() {
        return Messages.PigeonCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.initialize();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, androidVideoPlayerApi.create((Messages.CreateMessage) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.setMixWithOthers((Boolean) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.dispose((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            androidVideoPlayerApi.setLooping((Long) arrayList2.get(0), (Boolean) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void g(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            androidVideoPlayerApi.setVolume((Long) arrayList2.get(0), (Double) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            androidVideoPlayerApi.setPlaybackSpeed((Long) arrayList2.get(0), (Double) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void i(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.play((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void j(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, androidVideoPlayerApi.position((Long) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void k(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            androidVideoPlayerApi.seekTo((Long) arrayList2.get(0), (Long) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static /* synthetic */ void l(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.pause((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = Messages.wrapError(th);
        }
        reply.reply(arrayList);
    }

    public static void m(BinaryMessenger binaryMessenger, Messages.AndroidVideoPlayerApi androidVideoPlayerApi) {
        n(binaryMessenger, "", androidVideoPlayerApi);
    }

    public static void n(BinaryMessenger binaryMessenger, String str, final Messages.AndroidVideoPlayerApi androidVideoPlayerApi) {
        String concat;
        if (str.isEmpty()) {
            concat = "";
        } else {
            concat = ".".concat(str);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.create", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setLooping", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setVolume", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setPlaybackSpeed", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.play", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.position", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel8.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.seekTo", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel9.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.pause", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel10.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", concat), a());
        if (androidVideoPlayerApi != null) {
            basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: qM
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (r2) {
                        case 0:
                            a.b(androidVideoPlayerApi, obj, reply);
                            return;
                        case 1:
                            a.l(androidVideoPlayerApi, obj, reply);
                            return;
                        case 2:
                            a.d(androidVideoPlayerApi, obj, reply);
                            return;
                        case 3:
                            a.c(androidVideoPlayerApi, obj, reply);
                            return;
                        case 4:
                            a.e(androidVideoPlayerApi, obj, reply);
                            return;
                        case 5:
                            a.f(androidVideoPlayerApi, obj, reply);
                            return;
                        case 6:
                            a.g(androidVideoPlayerApi, obj, reply);
                            return;
                        case 7:
                            a.h(androidVideoPlayerApi, obj, reply);
                            return;
                        case 8:
                            a.i(androidVideoPlayerApi, obj, reply);
                            return;
                        case 9:
                            a.j(androidVideoPlayerApi, obj, reply);
                            return;
                        default:
                            a.k(androidVideoPlayerApi, obj, reply);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel11.setMessageHandler(null);
        }
    }
}
