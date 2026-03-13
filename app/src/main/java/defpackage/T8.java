package defpackage;
/* renamed from: T8  reason: default package */
/* loaded from: classes.dex */
public final class T8 extends VW {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public T8(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        this.f = j;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VW)) {
            return false;
        }
        VW vw = (VW) obj;
        if (this.b.equals(((T8) vw).b)) {
            T8 t8 = (T8) vw;
            if (this.c.equals(t8.c) && this.d.equals(t8.d) && this.e.equals(t8.e) && this.f == t8.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f;
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return BK.n(sb, this.f, "}");
    }
}
