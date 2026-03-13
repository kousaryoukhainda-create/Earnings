package defpackage;

import java.util.concurrent.CancellationException;
/* renamed from: w  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2977w {
    public static final C2977w c;
    public static final C2977w d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (E.f) {
            d = null;
            c = null;
            return;
        }
        d = new C2977w(false, null);
        c = new C2977w(true, null);
    }

    public C2977w(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
