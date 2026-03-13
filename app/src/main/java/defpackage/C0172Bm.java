package defpackage;

import java.util.Arrays;
/* renamed from: Bm  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172Bm {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public F2[] f = new F2[100];

    public final synchronized void a(int i) {
        boolean z;
        if (i < this.c) {
            z = true;
        } else {
            z = false;
        }
        this.c = i;
        if (z) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, Ha0.g(this.c, this.b) - this.d);
        int i = this.e;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.f, max, i, (Object) null);
        this.e = max;
    }
}
