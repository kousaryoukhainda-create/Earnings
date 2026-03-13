package defpackage;
/* renamed from: tH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2747tH extends AbstractC2833uH {
    public final C2187ml a;

    public C2747tH(C2187ml c2187ml) {
        this.a = c2187ml;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2747tH.class == obj.getClass()) {
            return this.a.equals(((C2747tH) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (C2747tH.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
