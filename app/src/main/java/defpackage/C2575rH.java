package defpackage;
/* renamed from: rH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2575rH extends AbstractC2833uH {
    public final C2187ml a = C2187ml.c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2575rH.class == obj.getClass()) {
            return this.a.equals(((C2575rH) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (C2575rH.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
