package defpackage;

import java.util.Arrays;
/* renamed from: Cr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203Cr {
    public final C0281Fr a;
    public final byte[] b;

    public C0203Cr(C0281Fr c0281Fr, byte[] bArr) {
        if (c0281Fr != null) {
            if (bArr != null) {
                this.a = c0281Fr;
                this.b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0203Cr)) {
            return false;
        }
        C0203Cr c0203Cr = (C0203Cr) obj;
        if (!this.a.equals(c0203Cr.a)) {
            return false;
        }
        return Arrays.equals(this.b, c0203Cr.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
