package defpackage;
/* renamed from: tj0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2785tj0 extends Fi0 {
    public String b;
    public long c;
    public int d;
    public long f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2785tj0.class != obj.getClass()) {
            return false;
        }
        C2785tj0 c2785tj0 = (C2785tj0) obj;
        if (this.c != c2785tj0.c) {
            return false;
        }
        return this.b.equals(c2785tj0.b);
    }

    public final int hashCode() {
        long j = this.c;
        return (this.b.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }
}
