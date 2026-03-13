package defpackage;

import android.text.Layout;
/* renamed from: J80  reason: default package */
/* loaded from: classes.dex */
public final class J80 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public Z50 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(J80 j80) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (j80 != null) {
            if (!this.c && j80.c) {
                this.b = j80.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = j80.h;
            }
            if (this.i == -1) {
                this.i = j80.i;
            }
            if (this.a == null && (str = j80.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = j80.f;
            }
            if (this.g == -1) {
                this.g = j80.g;
            }
            if (this.n == -1) {
                this.n = j80.n;
            }
            if (this.o == null && (alignment2 = j80.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = j80.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = j80.q;
            }
            if (this.j == -1) {
                this.j = j80.j;
                this.k = j80.k;
            }
            if (this.r == null) {
                this.r = j80.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = j80.s;
            }
            if (!this.e && j80.e) {
                this.d = j80.d;
                this.e = true;
            }
            if (this.m == -1 && (i = j80.m) != -1) {
                this.m = i;
            }
        }
    }
}
