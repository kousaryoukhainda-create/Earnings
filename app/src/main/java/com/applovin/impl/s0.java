package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.ae;
import com.applovin.impl.qh;
import java.io.IOException;
/* loaded from: classes.dex */
public interface s0 {

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final fo b;
        public final int c;
        public final ae.a d;
        public final long e;
        public final fo f;
        public final int g;
        public final ae.a h;
        public final long i;
        public final long j;

        public a(long j, fo foVar, int i, ae.a aVar, long j2, fo foVar2, int i2, ae.a aVar2, long j3, long j4) {
            this.a = j;
            this.b = foVar;
            this.c = i;
            this.d = aVar;
            this.e = j2;
            this.f = foVar2;
            this.g = i2;
            this.h = aVar2;
            this.i = j3;
            this.j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equal(this.b, aVar.b) && Objects.equal(this.d, aVar.d) && Objects.equal(this.f, aVar.f) && Objects.equal(this.h, aVar.h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final a9 a;
        private final SparseArray b;

        public b(a9 a9Var, SparseArray sparseArray) {
            this.a = a9Var;
            SparseArray sparseArray2 = new SparseArray(a9Var.a());
            for (int i = 0; i < a9Var.a(); i++) {
                int b = a9Var.b(i);
                sparseArray2.append(b, (a) b1.a((a) sparseArray.get(b)));
            }
            this.b = sparseArray2;
        }
    }

    void a(qh qhVar, b bVar);

    void a(a aVar);

    void a(a aVar, float f);

    void a(a aVar, int i);

    void a(a aVar, int i, int i2);

    void a(a aVar, int i, int i2, int i3, float f);

    void a(a aVar, int i, long j);

    void a(a aVar, int i, long j, long j2);

    void a(a aVar, int i, e9 e9Var);

    void a(a aVar, int i, m5 m5Var);

    void a(a aVar, int i, String str, long j);

    void a(a aVar, long j);

    void a(a aVar, long j, int i);

    void a(a aVar, af afVar);

    void a(a aVar, e9 e9Var);

    void a(a aVar, e9 e9Var, p5 p5Var);

    void a(a aVar, m5 m5Var);

    void a(a aVar, mc mcVar, td tdVar);

    void a(a aVar, mc mcVar, td tdVar, IOException iOException, boolean z);

    void a(a aVar, nh nhVar);

    void a(a aVar, ph phVar);

    void a(a aVar, po poVar, to toVar);

    void a(a aVar, qh.b bVar);

    void a(a aVar, qh.f fVar, qh.f fVar2, int i);

    void a(a aVar, sd sdVar, int i);

    void a(a aVar, td tdVar);

    void a(a aVar, ud udVar);

    void a(a aVar, xq xqVar);

    void a(a aVar, Exception exc);

    void a(a aVar, Object obj, long j);

    void a(a aVar, String str);

    void a(a aVar, String str, long j);

    void a(a aVar, String str, long j, long j2);

    void a(a aVar, boolean z);

    void a(a aVar, boolean z, int i);

    void b(a aVar);

    void b(a aVar, int i);

    void b(a aVar, int i, long j, long j2);

    void b(a aVar, int i, m5 m5Var);

    void b(a aVar, e9 e9Var);

    void b(a aVar, e9 e9Var, p5 p5Var);

    void b(a aVar, m5 m5Var);

    void b(a aVar, mc mcVar, td tdVar);

    void b(a aVar, Exception exc);

    void b(a aVar, String str);

    void b(a aVar, String str, long j);

    void b(a aVar, String str, long j, long j2);

    void b(a aVar, boolean z);

    void b(a aVar, boolean z, int i);

    void c(a aVar);

    void c(a aVar, int i);

    void c(a aVar, m5 m5Var);

    void c(a aVar, mc mcVar, td tdVar);

    void c(a aVar, Exception exc);

    void c(a aVar, boolean z);

    void d(a aVar);

    void d(a aVar, int i);

    void d(a aVar, m5 m5Var);

    void d(a aVar, Exception exc);

    void d(a aVar, boolean z);

    void e(a aVar);

    void e(a aVar, int i);

    void e(a aVar, boolean z);

    void f(a aVar);

    void f(a aVar, int i);

    void g(a aVar);

    void h(a aVar);
}
