package defpackage;

import java.util.List;
/* renamed from: b8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917b8 extends AbstractC0247Ej {
    public final C1002c8 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final AbstractC0221Dj e;
    public final List f;
    public final int g;

    public C0917b8(C1002c8 c1002c8, List list, List list2, Boolean bool, AbstractC0221Dj abstractC0221Dj, List list3, int i) {
        this.a = c1002c8;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = abstractC0221Dj;
        this.f = list3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        AbstractC0221Dj abstractC0221Dj;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0247Ej)) {
            return false;
        }
        C0917b8 c0917b8 = (C0917b8) ((AbstractC0247Ej) obj);
        if (this.a.equals(c0917b8.a) && ((list = this.b) != null ? list.equals(c0917b8.b) : c0917b8.b == null) && ((list2 = this.c) != null ? list2.equals(c0917b8.c) : c0917b8.c == null) && ((bool = this.d) != null ? bool.equals(c0917b8.d) : c0917b8.d == null) && ((abstractC0221Dj = this.e) != null ? abstractC0221Dj.equals(c0917b8.e) : c0917b8.e == null) && ((list3 = this.f) != null ? list3.equals(c0917b8.f) : c0917b8.f == null) && this.g == c0917b8.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        AbstractC0221Dj abstractC0221Dj = this.e;
        if (abstractC0221Dj == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC0221Dj.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        List list3 = this.f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((i5 ^ i) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return AbstractC2437ph.k(sb, this.g, "}");
    }
}
