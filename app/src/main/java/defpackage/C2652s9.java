package defpackage;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: s9  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2652s9 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public C2652s9(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C3156y3 c3156y3 = C3156y3.a;
        float d = c3156y3.d(backEvent);
        float e = c3156y3.e(backEvent);
        float b = c3156y3.b(backEvent);
        int c = c3156y3.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
