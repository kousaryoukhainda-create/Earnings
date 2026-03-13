package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: P4  reason: default package */
/* loaded from: classes.dex */
public final class P4 {
    public final String a;
    public final String b;
    public final String c;
    public final U2 d;

    public P4(String appId, String deviceModel, String osVersion, U2 androidAppInfo) {
        EnumC2920vI logEnvironment = EnumC2920vI.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter("2.1.2", "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.a = appId;
        this.b = deviceModel;
        this.c = osVersion;
        this.d = androidAppInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P4)) {
            return false;
        }
        P4 p4 = (P4) obj;
        if (Intrinsics.a(this.a, p4.a) && Intrinsics.a(this.b, p4.b) && Intrinsics.a(this.c, p4.c) && this.d.equals(p4.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = AbstractC2437ph.b((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 47595001) * 31, 31, this.c);
        return this.d.hashCode() + ((EnumC2920vI.LOG_ENVIRONMENT_PROD.hashCode() + b) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.b + ", sessionSdkVersion=2.1.2, osVersion=" + this.c + ", logEnvironment=" + EnumC2920vI.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.d + ')';
    }
}
