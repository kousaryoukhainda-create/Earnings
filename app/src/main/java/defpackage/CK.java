package defpackage;

import android.text.TextUtils;
/* renamed from: CK  reason: default package */
/* loaded from: classes.dex */
public final class CK {
    public final String a;
    public final boolean b;
    public final boolean c;

    public CK(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != CK.class) {
            return false;
        }
        CK ck = (CK) obj;
        if (TextUtils.equals(this.a, ck.a) && this.b == ck.b && this.c == ck.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int b = AbstractC2437ph.b(31, 31, this.a);
        int i2 = 1237;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (b + i) * 31;
        if (this.c) {
            i2 = 1231;
        }
        return i3 + i2;
    }
}
