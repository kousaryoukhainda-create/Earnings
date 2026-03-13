package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: qS  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2501qS {
    public final String a;
    public final boolean b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final C2415pS f;
    public final C2415pS g;

    public C2501qS(String str, boolean z, Float f, Float f2, Float f3, C2415pS c2415pS, C2415pS c2415pS2) {
        this.a = str;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = c2415pS;
        this.g = c2415pS2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2501qS)) {
            return false;
        }
        C2501qS c2501qS = (C2501qS) obj;
        if (Intrinsics.a(this.a, c2501qS.a) && this.b == c2501qS.b && Intrinsics.a(this.c, c2501qS.c) && Intrinsics.a(this.d, c2501qS.d) && Intrinsics.a(this.e, c2501qS.e) && Intrinsics.a(this.f, c2501qS.f) && Intrinsics.a(this.g, c2501qS.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i2 = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = hashCode * 31;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (i + i3) * 31;
        Float f = this.c;
        if (f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Float f2 = this.d;
        if (f2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = f2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        Float f3 = this.e;
        if (f3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f3.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        C2415pS c2415pS = this.f;
        if (c2415pS == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2415pS.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        C2415pS c2415pS2 = this.g;
        if (c2415pS2 != null) {
            i2 = c2415pS2.hashCode();
        }
        return i8 + i2;
    }

    public final String toString() {
        StringBuilder b = Ki0.b("PlaytimeInAppPurchaseRewardConfig(description=");
        b.append(this.a);
        b.append(", isEnabled=");
        b.append(this.b);
        b.append(", exchangeRate=");
        b.append(this.c);
        b.append(", maxLimitPerCampaignUSD=");
        b.append(this.d);
        b.append(", maxLimitPerCampaignCoins=");
        b.append(this.e);
        b.append(", completedRewards=");
        b.append(this.f);
        b.append(", pendingRewards=");
        b.append(this.g);
        b.append(')');
        return b.toString();
    }
}
