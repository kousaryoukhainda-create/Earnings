package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
/* renamed from: Ym  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0769Ym {
    public final /* synthetic */ C0795Zm a;

    public final void a(int i) {
        int i2;
        C0795Zm c0795Zm = this.a;
        synchronized (c0795Zm) {
            int i3 = c0795Zm.m;
            if (i3 == 0 || c0795Zm.d) {
                if (i3 != i) {
                    c0795Zm.m = i;
                    if (i != 1 && i != 0 && i != 8) {
                        c0795Zm.k = c0795Zm.b(i);
                        c0795Zm.c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (c0795Zm.f > 0) {
                            i2 = (int) (elapsedRealtime - c0795Zm.g);
                        } else {
                            i2 = 0;
                        }
                        c0795Zm.c(i2, c0795Zm.h, c0795Zm.k);
                        c0795Zm.g = elapsedRealtime;
                        c0795Zm.h = 0L;
                        c0795Zm.j = 0L;
                        c0795Zm.i = 0L;
                        H20 h20 = c0795Zm.e;
                        ((ArrayList) h20.f).clear();
                        h20.b = -1;
                        h20.c = 0;
                        h20.d = 0;
                    }
                }
            }
        }
    }
}
