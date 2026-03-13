package defpackage;

import java.io.Serializable;
import java.util.List;
/* renamed from: wO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3012wO implements Serializable {
    public final List b;
    public final Boolean c;
    public final String d;
    public final List f;

    public C3012wO(List list, Boolean bool, String str, List list2) {
        this.b = list;
        this.c = bool;
        this.d = str;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3012wO.class != obj.getClass()) {
            return false;
        }
        C3012wO c3012wO = (C3012wO) obj;
        List list = c3012wO.b;
        List list2 = this.b;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        Boolean bool = c3012wO.c;
        Boolean bool2 = this.c;
        if (bool2 == null ? bool != null : !bool2.equals(bool)) {
            return false;
        }
        String str = c3012wO.d;
        String str2 = this.d;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list3 = c3012wO.f;
        List list4 = this.f;
        if (list4 != null) {
            return list4.equals(list3);
        }
        if (list3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str = this.d;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        List list2 = this.f;
        if (list2 != null) {
            i4 = list2.hashCode();
        }
        return i7 + i4;
    }
}
