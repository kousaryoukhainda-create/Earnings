package defpackage;
/* renamed from: H8  reason: default package */
/* loaded from: classes.dex */
public final class H8 {
    public final String a;
    public final String b;

    public H8(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H8)) {
            return false;
        }
        H8 h8 = (H8) obj;
        if (this.a.equals(h8.a) && this.b.equals(h8.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return AbstractC0324Hi.h(sb, this.b, "}");
    }
}
