package com.applovin.impl;

import com.applovin.impl.ij;
/* loaded from: classes.dex */
public abstract class i2 {
    protected final a a;
    protected final f b;
    protected c c;
    private final int d;

    /* loaded from: classes.dex */
    public static class a implements ij {
        private final d a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        public a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        @Override // com.applovin.impl.ij
        public boolean b() {
            return true;
        }

        public long c(long j) {
            return this.a.a(j);
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return this.b;
        }

        @Override // com.applovin.impl.ij
        public ij.a b(long j) {
            return new ij.a(new kj(j, c.a(this.a.a(j), this.c, this.d, this.e, this.f, this.g)));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // com.applovin.impl.i2.d
        public long a(long j) {
            return j;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        public c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = a(j2, j3, j4, j5, j6, j7);
        }

        private void f() {
            this.h = a(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.b;
        }

        public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            return xp.b(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j, long j2) {
            this.d = j;
            this.f = j2;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.e = j;
            this.g = j2;
            f();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        long a(long j);
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);
        private final int a;
        private final long b;
        private final long c;

        private e(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static e a(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e b(long j, long j2) {
            return new e(-2, j, j2);
        }

        public static e a(long j) {
            return new e(0, -9223372036854775807L, j);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        e a(k8 k8Var, long j);

        void a();
    }

    public i2(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5, j6);
    }

    public final ij a() {
        return this.a;
    }

    public void b(boolean z, long j) {
    }

    public int a(k8 k8Var, th thVar) {
        while (true) {
            c cVar = (c) b1.b(this.c);
            long b2 = cVar.b();
            long a2 = cVar.a();
            long c2 = cVar.c();
            if (a2 - b2 <= this.d) {
                a(false, b2);
                return a(k8Var, b2, thVar);
            } else if (!a(k8Var, c2)) {
                return a(k8Var, c2, thVar);
            } else {
                k8Var.b();
                e a3 = this.b.a(k8Var, cVar.e());
                int i = a3.a;
                if (i == -3) {
                    a(false, c2);
                    return a(k8Var, c2, thVar);
                } else if (i == -2) {
                    cVar.b(a3.b, a3.c);
                } else if (i != -1) {
                    if (i == 0) {
                        a(k8Var, a3.c);
                        a(true, a3.c);
                        return a(k8Var, a3.c, thVar);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    cVar.a(a3.b, a3.c);
                }
            }
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    public final void b(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.d() != j) {
            this.c = a(j);
        }
    }

    public final void a(boolean z, long j) {
        this.c = null;
        this.b.a();
        b(z, j);
    }

    public final int a(k8 k8Var, long j, th thVar) {
        if (j == k8Var.f()) {
            return 0;
        }
        thVar.a = j;
        return 1;
    }

    public final boolean a(k8 k8Var, long j) {
        long f2 = j - k8Var.f();
        if (f2 < 0 || f2 > 262144) {
            return false;
        }
        k8Var.a((int) f2);
        return true;
    }

    public c a(long j) {
        return new c(j, this.a.c(j), this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
    }
}
