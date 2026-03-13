package defpackage;
/* renamed from: P7  reason: default package */
/* loaded from: classes.dex */
public final class P7 extends AbstractC2441pj {
    public final String a;
    public final String b;
    public final String c;

    public P7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2441pj)) {
            return false;
        }
        AbstractC2441pj abstractC2441pj = (AbstractC2441pj) obj;
        if (this.a.equals(((P7) abstractC2441pj).a)) {
            P7 p7 = (P7) abstractC2441pj;
            if (this.b.equals(p7.b) && this.c.equals(p7.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return AbstractC0324Hi.h(sb, this.c, "}");
    }
}
