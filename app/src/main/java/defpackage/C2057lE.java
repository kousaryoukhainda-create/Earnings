package defpackage;
/* renamed from: lE  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2057lE extends C1885jE {
    public static final C2057lE f = new C1885jE(1, 0, 1);

    @Override // defpackage.C1885jE
    public final boolean equals(Object obj) {
        if (obj instanceof C2057lE) {
            if (!isEmpty() || !((C2057lE) obj).isEmpty()) {
                C2057lE c2057lE = (C2057lE) obj;
                if (this.b == c2057lE.b) {
                    if (this.c == c2057lE.c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.C1885jE
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.b * 31) + this.c;
    }

    @Override // defpackage.C1885jE
    public final boolean isEmpty() {
        if (this.b > this.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.C1885jE
    public final String toString() {
        return this.b + ".." + this.c;
    }
}
