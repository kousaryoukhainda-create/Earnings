package com.fyber.fairbid.sdk.testsuite.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class EventBus {
    @NotNull
    public static final EventBus INSTANCE = new EventBus();
    @NotNull
    public static SparseArray<List<Handler.Callback>> a = new SparseArray<>();
    @NotNull
    public static final Handler eventBusMainThread = new Handler(Looper.getMainLooper(), new Object());

    public static final boolean a(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        synchronized (EventBus.class) {
            for (Handler.Callback callback : a.get(msg.what, new ArrayList())) {
                callback.handleMessage(msg);
            }
        }
        return true;
    }

    public static final boolean hasReceivers(int i) {
        return !a.get(i, new ArrayList()).isEmpty();
    }

    public static final void registerReceiver(int i, @NotNull Handler.Callback receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        synchronized (EventBus.class) {
            SparseArray<List<Handler.Callback>> it = a.clone();
            List<Handler.Callback> list = it.get(i, new LinkedList());
            Intrinsics.checkNotNullExpressionValue(list, "it[event, LinkedList()]");
            ArrayList C = C0553Qe.C(list);
            C.add(receiver);
            it.put(i, C);
            Intrinsics.checkNotNullExpressionValue(it, "it");
            a = it;
        }
    }

    public static final void unregisterReceiver(int i, @NotNull Handler.Callback receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        synchronized (EventBus.class) {
            SparseArray<List<Handler.Callback>> it = a.clone();
            List<Handler.Callback> list = it.get(i, new LinkedList());
            Intrinsics.checkNotNullExpressionValue(list, "it[event, LinkedList()]");
            ArrayList C = C0553Qe.C(list);
            C.remove(receiver);
            it.put(i, C);
            Intrinsics.checkNotNullExpressionValue(it, "it");
            a = it;
        }
    }
}
