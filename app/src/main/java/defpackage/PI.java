package defpackage;

import crypto.bitcoin.ethereum.litecoin.cloud.mining.eth.btc.ltc.hash.pool.cloud_mining.MainActivity;
import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: PI  reason: default package */
/* loaded from: classes2.dex */
public final class PI implements EventChannel.StreamHandler {
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ MainActivity c;

    public PI(MainActivity mainActivity) {
        this.c = mainActivity;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            EventChannel.EventSink eventSink = (EventChannel.EventSink) it.next();
            Iterator it2 = this.c.b.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                if (Intrinsics.a(eventSink, (EventChannel.EventSink) it2.next())) {
                    it2.remove();
                    z = true;
                }
            }
            if (z) {
                it.remove();
            }
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (eventSink != null) {
            this.b.add(eventSink);
            this.c.b.add(eventSink);
        }
    }
}
