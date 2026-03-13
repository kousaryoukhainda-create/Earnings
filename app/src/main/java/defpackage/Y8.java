package defpackage;
/* renamed from: Y8  reason: default package */
/* loaded from: classes.dex */
public final class Y8 {
    public final Z8 a;
    public final C0919b9 b;
    public final C0828a9 c;

    public Y8(Z8 z8, C0919b9 c0919b9, C0828a9 c0828a9) {
        this.a = z8;
        this.b = c0919b9;
        this.c = c0828a9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y8)) {
            return false;
        }
        Y8 y8 = (Y8) obj;
        if (this.a.equals(y8.a) && this.b.equals(y8.b) && this.c.equals(y8.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
