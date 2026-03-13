package defpackage;
/* renamed from: Ec  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240Ec extends O40 implements Comparable {
    public long m;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0240Ec c0240Ec = (C0240Ec) obj;
        if (d(4) != c0240Ec.d(4)) {
            if (!d(4)) {
                return -1;
            }
        } else {
            long j = this.i - c0240Ec.i;
            if (j == 0) {
                j = this.m - c0240Ec.m;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        }
        return 1;
    }
}
