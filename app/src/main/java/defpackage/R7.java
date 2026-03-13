package defpackage;

import java.util.List;
/* renamed from: R7  reason: default package */
/* loaded from: classes.dex */
public final class R7 extends AbstractC2784tj {
    public final List a;
    public final String b;

    public R7(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2784tj)) {
            return false;
        }
        AbstractC2784tj abstractC2784tj = (AbstractC2784tj) obj;
        if (this.a.equals(((R7) abstractC2784tj).a)) {
            String str = this.b;
            if (str == null) {
                if (((R7) abstractC2784tj).b == null) {
                    return true;
                }
            } else if (str.equals(((R7) abstractC2784tj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return AbstractC0324Hi.h(sb, this.b, "}");
    }
}
