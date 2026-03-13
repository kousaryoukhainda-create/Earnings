package defpackage;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Dg0  reason: default package */
/* loaded from: classes2.dex */
public abstract class Dg0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final void a() {
        EnumC2264ng0 type = EnumC2264ng0.b;
        Intrinsics.checkNotNullParameter(type, "type");
        a.remove(type);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [mg0, java.lang.Object] */
    public static final void b() {
        EnumC2264ng0 type = EnumC2264ng0.b;
        Intrinsics.checkNotNullParameter(type, "type");
        ConcurrentHashMap concurrentHashMap = a;
        if (!concurrentHashMap.contains(type)) {
            if (Cg0.a[0] == 1) {
                ?? obj = new Object();
                obj.a = SystemClock.uptimeMillis();
                concurrentHashMap.put(type, obj);
                return;
            }
            throw new RuntimeException();
        }
    }
}
