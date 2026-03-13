package defpackage;

import androidx.media3.common.c;
import java.util.Arrays;
/* renamed from: YK  reason: default package */
/* loaded from: classes.dex */
public final class YK {
    public static final YK y = new YK(new Object());
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final CharSequence w;
    public final Integer x;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.common.c, java.lang.Object] */
    static {
        AbstractC0324Hi.q(0, 1, 2, 3, 4);
        AbstractC0324Hi.q(5, 6, 8, 9, 10);
        AbstractC0324Hi.q(11, 12, 13, 14, 15);
        AbstractC0324Hi.q(16, 17, 18, 19, 20);
        AbstractC0324Hi.q(21, 22, 23, 24, 25);
        AbstractC0324Hi.q(26, 27, 28, 29, 30);
        Ha0.H(31);
        Ha0.H(32);
        Ha0.H(33);
        Ha0.H(1000);
    }

    public YK(c cVar) {
        Boolean bool = cVar.k;
        Integer num = cVar.j;
        Integer num2 = cVar.w;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        this.g = cVar.g;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = num;
        this.k = bool;
        Integer num3 = cVar.l;
        this.l = num3;
        this.m = num3;
        this.n = cVar.m;
        this.o = cVar.n;
        this.p = cVar.o;
        this.q = cVar.p;
        this.r = cVar.q;
        this.s = cVar.r;
        this.t = cVar.s;
        this.u = cVar.t;
        this.v = cVar.u;
        this.w = cVar.v;
        this.x = num2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.common.c, java.lang.Object] */
    public final c a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || YK.class != obj.getClass()) {
            return false;
        }
        YK yk = (YK) obj;
        if (Ha0.a(this.a, yk.a) && Ha0.a(this.b, yk.b) && Ha0.a(this.c, yk.c) && Ha0.a(this.d, yk.d) && Ha0.a(null, null) && Ha0.a(null, null) && Ha0.a(this.e, yk.e) && Ha0.a(null, null) && Ha0.a(null, null) && Ha0.a(null, null) && Arrays.equals(this.f, yk.f) && Ha0.a(this.g, yk.g) && Ha0.a(null, null) && Ha0.a(this.h, yk.h) && Ha0.a(this.i, yk.i) && Ha0.a(this.j, yk.j) && Ha0.a(this.k, yk.k) && Ha0.a(null, null) && Ha0.a(this.m, yk.m) && Ha0.a(this.n, yk.n) && Ha0.a(this.o, yk.o) && Ha0.a(this.p, yk.p) && Ha0.a(this.q, yk.q) && Ha0.a(this.r, yk.r) && Ha0.a(this.s, yk.s) && Ha0.a(this.t, yk.t) && Ha0.a(this.u, yk.u) && Ha0.a(null, null) && Ha0.a(null, null) && Ha0.a(this.v, yk.v) && Ha0.a(null, null) && Ha0.a(this.w, yk.w) && Ha0.a(this.x, yk.x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, null, null, this.v, null, this.w, this.x, true});
    }
}
