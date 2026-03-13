package defpackage;

import java.util.LinkedHashMap;
/* renamed from: r3  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2554r3 {
    public L5 a;
    public int b;
    public LinkedHashMap c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C2554r3)) {
            return false;
        }
        C2554r3 c2554r3 = (C2554r3) obj;
        if (!AbstractC0957bf.m0(this.a.p(this.b)).equals(AbstractC0957bf.m0(c2554r3.a.p(c2554r3.b)))) {
            return false;
        }
        LinkedHashMap linkedHashMap = c2554r3.c;
        LinkedHashMap linkedHashMap2 = this.c;
        if (linkedHashMap2 == linkedHashMap) {
            return true;
        }
        if (linkedHashMap2 == null) {
            if (linkedHashMap == null) {
                return true;
            }
            return false;
        } else if (linkedHashMap == null) {
            return false;
        } else {
            return linkedHashMap2.equals(linkedHashMap);
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = AbstractC0957bf.m0(this.a.p(this.b)).hashCode();
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap == null) {
            hashCode = 0;
        } else {
            hashCode = linkedHashMap.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        AbstractC2121m1 abstractC2121m1;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(AbstractC0957bf.m0(this.a.p(this.b)));
        if (this.c != null) {
            sb.append('(');
            for (String str : this.c.keySet()) {
                sb.append(str);
                sb.append('=');
                LinkedHashMap linkedHashMap = this.c;
                if (linkedHashMap != null && linkedHashMap.get(str) != null) {
                    abstractC2121m1 = ((C2469q3) this.c.get(str)).a;
                } else {
                    abstractC2121m1 = null;
                }
                sb.append(abstractC2121m1);
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append(')');
        }
        return sb.toString();
    }
}
