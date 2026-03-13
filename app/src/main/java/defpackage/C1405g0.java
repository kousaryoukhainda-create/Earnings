package defpackage;

import java.util.concurrent.CancellationException;
/* renamed from: g0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1405g0 {
    public static final C1405g0 c;
    public static final C1405g0 d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (AbstractC2119m0.f) {
            d = null;
            c = null;
            return;
        }
        d = new C1405g0(false, null);
        c = new C1405g0(true, null);
    }

    public C1405g0(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
