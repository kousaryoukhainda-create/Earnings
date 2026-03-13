package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.FirebaseAuth;
/* renamed from: ym0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3221ym0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final String f;
    public final FirebaseAuth g;

    public C3221ym0(String str, String str2, int i, int i2, long j, String str3, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotEmpty(str3, "sessionInfo cannot be empty.");
        Preconditions.checkNotNull(firebaseAuth, "firebaseAuth cannot be null.");
        this.a = Preconditions.checkNotEmpty(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.b = Preconditions.checkNotEmpty(str2, "hashAlgorithm cannot be empty.");
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = str3;
        this.g = firebaseAuth;
    }

    public final String a(String str, String str2) {
        Preconditions.checkNotEmpty(str, "accountName cannot be empty.");
        Preconditions.checkNotEmpty(str2, "issuer cannot be empty.");
        StringBuilder sb = new StringBuilder("otpauth://totp/");
        AbstractC2437ph.w(sb, str2, ":", str, "?secret=");
        AbstractC2437ph.w(sb, this.a, "&issuer=", str2, "&algorithm=");
        sb.append(this.b);
        sb.append("&digits=");
        sb.append(this.c);
        return sb.toString();
    }
}
