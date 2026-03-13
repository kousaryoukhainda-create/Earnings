package com.applovin.impl;
/* loaded from: classes.dex */
public interface ij {

    /* loaded from: classes.dex */
    public static final class a {
        public final kj a;
        public final kj b;

        public a(kj kjVar) {
            this(kjVar, kjVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            return AbstractC0324Hi.h(sb, str, "]");
        }

        public a(kj kjVar, kj kjVar2) {
            this.a = (kj) b1.a(kjVar);
            this.b = (kj) b1.a(kjVar2);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ij {
        private final long a;
        private final a b;

        public b(long j) {
            this(j, 0L);
        }

        @Override // com.applovin.impl.ij
        public boolean b() {
            return false;
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return this.a;
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? kj.c : new kj(0L, j2));
        }

        @Override // com.applovin.impl.ij
        public a b(long j) {
            return this.b;
        }
    }

    a b(long j);

    boolean b();

    long d();
}
