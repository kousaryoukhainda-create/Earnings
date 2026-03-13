package defpackage;

import android.util.Base64;
import java.util.Arrays;
/* renamed from: d9  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166d9 {
    public final String a;
    public final byte[] b;
    public final EnumC0849aT c;

    public C1166d9(String str, byte[] bArr, EnumC0849aT enumC0849aT) {
        this.a = str;
        this.b = bArr;
        this.c = enumC0849aT;
    }

    public static C3244z4 a() {
        C3244z4 c3244z4 = new C3244z4(6);
        c3244z4.f = EnumC0849aT.b;
        return c3244z4;
    }

    public final C1166d9 b(EnumC0849aT enumC0849aT) {
        C3244z4 a = a();
        a.e0(this.a);
        if (enumC0849aT != null) {
            a.f = enumC0849aT;
            a.d = this.b;
            return a.n();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1166d9)) {
            return false;
        }
        C1166d9 c1166d9 = (C1166d9) obj;
        if (this.a.equals(c1166d9.a) && Arrays.equals(this.b, c1166d9.b) && this.c.equals(c1166d9.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.a + ", " + this.c + ", " + encodeToString + ")";
    }
}
