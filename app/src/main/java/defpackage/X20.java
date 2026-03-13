package defpackage;

import java.util.Arrays;
/* renamed from: X20  reason: default package */
/* loaded from: classes.dex */
public final class X20 implements Comparable {
    public boolean b;
    public float g;
    public int n;
    public int c = -1;
    public int d = -1;
    public int f = 0;
    public boolean h = false;
    public final float[] i = new float[9];
    public final float[] j = new float[9];
    public C1329f5[] k = new C1329f5[16];
    public int l = 0;
    public int m = 0;

    public X20(int i) {
        this.n = i;
    }

    public final void a(C1329f5 c1329f5) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i < i2) {
                if (this.k[i] == c1329f5) {
                    return;
                }
                i++;
            } else {
                C1329f5[] c1329f5Arr = this.k;
                if (i2 >= c1329f5Arr.length) {
                    this.k = (C1329f5[]) Arrays.copyOf(c1329f5Arr, c1329f5Arr.length * 2);
                }
                C1329f5[] c1329f5Arr2 = this.k;
                int i3 = this.l;
                c1329f5Arr2[i3] = c1329f5;
                this.l = i3 + 1;
                return;
            }
        }
    }

    public final void b(C1329f5 c1329f5) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == c1329f5) {
                while (i2 < i - 1) {
                    C1329f5[] c1329f5Arr = this.k;
                    int i3 = i2 + 1;
                    c1329f5Arr[i2] = c1329f5Arr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c - ((X20) obj).c;
    }

    public final void e() {
        this.n = 5;
        this.f = 0;
        this.c = -1;
        this.d = -1;
        this.g = 0.0f;
        this.h = false;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.b = false;
        Arrays.fill(this.j, 0.0f);
    }

    public final void f(UG ug, float f) {
        this.g = f;
        this.h = true;
        int i = this.l;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].h(ug, this, false);
        }
        this.l = 0;
    }

    public final void g(UG ug, C1329f5 c1329f5) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].i(ug, c1329f5, false);
        }
        this.l = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
