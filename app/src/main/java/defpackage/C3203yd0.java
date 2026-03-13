package defpackage;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: yd0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3203yd0 {
    public static final /* synthetic */ C3203yd0 a = new Object();
    public static final C2474q50 b;
    public static final C0539Pq c;

    /* JADX WARN: Type inference failed for: r0v0, types: [yd0, java.lang.Object] */
    static {
        AbstractC3019wV.a(InterfaceC3289zd0.class).b();
        b = C2231nG.a(C3117xd0.i);
        c = C0539Pq.f;
    }

    public static C0942bV a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC2859ud0 interfaceC2859ud0 = (InterfaceC2859ud0) b.a();
        if (interfaceC2859ud0 == null) {
            P10 p10 = P10.c;
            Intrinsics.checkNotNullParameter(context, "context");
            if (P10.c == null) {
                ReentrantLock reentrantLock = P10.d;
                reentrantLock.lock();
                try {
                    if (P10.c == null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        N10 n10 = null;
                        try {
                            C1540hb0 c2 = L10.c();
                            if (c2 != null) {
                                C1540hb0 other = C1540hb0.h;
                                Intrinsics.checkNotNullParameter(other, "other");
                                Object a2 = c2.g.a();
                                Intrinsics.checkNotNullExpressionValue(a2, "<get-bigInteger>(...)");
                                Object a3 = other.g.a();
                                Intrinsics.checkNotNullExpressionValue(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    N10 n102 = new N10(context);
                                    if (n102.i()) {
                                        n10 = n102;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        P10.c = new P10(n10);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC2859ud0 = P10.c;
            Intrinsics.b(interfaceC2859ud0);
        }
        Yd0 yd0 = Yd0.b;
        C0942bV tracker = new C0942bV(interfaceC2859ud0);
        c.getClass();
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }
}
