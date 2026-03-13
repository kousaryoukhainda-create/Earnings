package defpackage;
/* renamed from: kf0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2004kf0 extends Fi0 {
    public String b;
    public String c;
    public String d;
    public long f;
    public boolean g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public long o;
    public long p;
    public long q;
    public int r;
    public boolean s;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2004kf0.class != obj.getClass()) {
            return false;
        }
        C2004kf0 c2004kf0 = (C2004kf0) obj;
        if (this.f != c2004kf0.f || this.g != c2004kf0.g || this.o != c2004kf0.o || this.p != c2004kf0.p || !this.b.equals(c2004kf0.b) || !Kj0.i(this.h, c2004kf0.h)) {
            return false;
        }
        return Kj0.i(this.i, c2004kf0.i);
    }

    public final int hashCode() {
        int i;
        long j = this.f;
        int hashCode = ((((this.b.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31;
        String str = this.h;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.i;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j2 = this.o;
        long j3 = this.p;
        return ((((i3 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder b = Ki0.b("PartnerApp{packageName='");
        b.append(this.b);
        b.append('\'');
        b.append(", installClicked=");
        b.append(this.f);
        b.append(", installed=");
        b.append(this.g);
        b.append(", clickUUID='");
        b.append(this.h);
        b.append('\'');
        b.append(", viewUUID='");
        b.append(this.i);
        b.append('\'');
        b.append(", creativeSetUUID='");
        b.append(this.j);
        b.append('\'');
        b.append(", targetingGroupUUID='");
        b.append(this.k);
        b.append('\'');
        b.append(", clickURL='");
        b.append(this.l);
        b.append('\'');
        b.append(", viewURL='");
        b.append(this.m);
        b.append('\'');
        b.append(", campaignUUID='");
        b.append(this.n);
        b.append('\'');
        b.append(", usage=");
        b.append(this.o);
        b.append(", lastRewardTime=");
        b.append(this.p);
        b.append(", postInstallRewardCoins=");
        b.append(this.r);
        b.append(", CampaignType=");
        b.append(this.d);
        b.append('}');
        return b.toString();
    }
}
