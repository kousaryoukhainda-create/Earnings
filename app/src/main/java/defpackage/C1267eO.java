package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* renamed from: eO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267eO {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1267eO)) {
            return false;
        }
        C1267eO c1267eO = (C1267eO) obj;
        if (this.a == c1267eO.a && this.b == c1267eO.b && this.c == c1267eO.c && this.d == c1267eO.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z = this.b;
        ?? r1 = this.a;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (this.d) {
            return i2 + 4096;
        }
        return i2;
    }

    public final String toString() {
        return "[ Connected=" + this.a + " Validated=" + this.b + " Metered=" + this.c + " NotRoaming=" + this.d + " ]";
    }
}
