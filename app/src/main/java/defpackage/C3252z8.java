package defpackage;

import com.huawei.hms.android.HwBuildEx;
/* renamed from: z8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3252z8 {
    public static final C3252z8 f = new C3252z8(200, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 10485760, 604800000, 81920);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C3252z8(int i, int i2, long j, long j2, int i3) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3252z8)) {
            return false;
        }
        C3252z8 c3252z8 = (C3252z8) obj;
        if (this.a == c3252z8.a && this.b == c3252z8.b && this.c == c3252z8.c && this.d == c3252z8.d && this.e == c3252z8.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.d;
        return this.e ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC2437ph.k(sb, this.e, "}");
    }
}
