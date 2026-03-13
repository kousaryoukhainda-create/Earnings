package defpackage;
/* renamed from: aS  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848aS {
    public final C0545Pw a;

    public C0848aS(C0545Pw c0545Pw) {
        this.a = c0545Pw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0848aS)) {
            return false;
        }
        return this.a.equals(((C0848aS) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
