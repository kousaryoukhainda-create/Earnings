package defpackage;

import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* renamed from: l1  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2035l1 implements EventChannel.StreamHandler {
    public final ArrayList b = new ArrayList();
    public EventChannel.EventSink c;

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.c = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eventSink.success((Map) it.next());
        }
        arrayList.clear();
        this.c = eventSink;
    }
}
