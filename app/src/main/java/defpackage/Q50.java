package defpackage;

import java.util.concurrent.TimeUnit;
/* renamed from: Q50  reason: default package */
/* loaded from: classes2.dex */
public abstract class Q50 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final C0539Pq f;
    public static final EI g;
    public static final EI h;

    static {
        String str;
        int i = D50.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = AbstractC2870uj.b0(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = D50.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = AbstractC2870uj.c0("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = AbstractC2870uj.c0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(AbstractC2870uj.b0(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = C0539Pq.k;
        g = new EI(0);
        h = new EI(1);
    }
}
