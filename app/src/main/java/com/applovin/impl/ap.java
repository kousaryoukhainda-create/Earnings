package com.applovin.impl;

import com.applovin.impl.i2;
/* loaded from: classes.dex */
final class ap extends i2 {

    /* loaded from: classes.dex */
    public static final class a implements i2.f {
        private final ho a;
        private final ah b = new ah();
        private final int c;
        private final int d;

        public a(int i, ho hoVar, int i2) {
            this.c = i;
            this.a = hoVar;
            this.d = i2;
        }

        @Override // com.applovin.impl.i2.f
        public void a() {
            this.b.a(xp.f);
        }

        private i2.e a(ah ahVar, long j, long j2) {
            int a;
            int a2;
            int e = ahVar.e();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (ahVar.a() >= 188 && (a2 = (a = ep.a(ahVar.c(), ahVar.d(), e)) + 188) <= e) {
                long a3 = ep.a(ahVar, a, this.c);
                if (a3 != -9223372036854775807L) {
                    long b = this.a.b(a3);
                    if (b > j) {
                        if (j5 == -9223372036854775807L) {
                            return i2.e.a(b, j2);
                        }
                        return i2.e.a(j2 + j4);
                    } else if (100000 + b > j) {
                        return i2.e.a(j2 + a);
                    } else {
                        j4 = a;
                        j5 = b;
                    }
                }
                ahVar.f(a2);
                j3 = a2;
            }
            if (j5 != -9223372036854775807L) {
                return i2.e.b(j5, j2 + j3);
            }
            return i2.e.d;
        }

        @Override // com.applovin.impl.i2.f
        public i2.e a(k8 k8Var, long j) {
            long f = k8Var.f();
            int min = (int) Math.min(this.d, k8Var.a() - f);
            this.b.d(min);
            k8Var.c(this.b.c(), 0, min);
            return a(this.b, j, f);
        }
    }

    public ap(ho hoVar, long j, long j2, int i, int i2) {
        super(new i2.b(), new a(i, hoVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
