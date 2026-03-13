package com.fyber.fairbid;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ab implements u6 {
    public final int a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public ab(int i, long j, int i2, long j2, int i3, long j3) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = j2;
        this.e = i3;
        this.f = j3;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        return C2148mJ.e(new JQ("first_app_version_start_timestamp", Long.valueOf(this.d)), new JQ("first_sdk_start_timestamp", Long.valueOf(this.b)), new JQ("num_app_version_starts", Integer.valueOf(this.c)), new JQ("num_sdk_starts", Integer.valueOf(this.a)), new JQ("num_sdk_version_starts", Integer.valueOf(this.e)), new JQ("first_sdk_version_start_timestamp", Long.valueOf(this.f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ab) {
            ab abVar = (ab) obj;
            return this.a == abVar.a && this.b == abVar.b && this.c == abVar.c && this.d == abVar.d && this.e == abVar.e && this.f == abVar.f;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        int i2 = this.c;
        long j2 = this.d;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        int i4 = this.e;
        long j3 = this.f;
        return ((int) (j3 ^ (j3 >>> 32))) + ((i4 + ((i3 + ((i2 + ((i + (this.a * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "InstallMetrics(numSdkStarts=" + this.a + ", firstSdkStartTimestampMillis=" + this.b + ", numAppVersionStarts=" + this.c + ", firstAppVersionStartTimestampMillis=" + this.d + ", numSdkVersionStarts=" + this.e + ", firstSdkVersionStartTimestampMillis=" + this.f + ')';
    }
}
