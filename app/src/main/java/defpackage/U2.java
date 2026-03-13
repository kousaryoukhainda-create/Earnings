package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: U2  reason: default package */
/* loaded from: classes.dex */
public final class U2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final C1187dT e;
    public final ArrayList f;

    public U2(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, C1187dT currentProcessDetails, ArrayList appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.a = packageName;
        this.b = versionName;
        this.c = appBuildVersion;
        this.d = deviceManufacturer;
        this.e = currentProcessDetails;
        this.f = appProcessDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U2)) {
            return false;
        }
        U2 u2 = (U2) obj;
        if (Intrinsics.a(this.a, u2.a) && Intrinsics.a(this.b, u2.b) && Intrinsics.a(this.c, u2.c) && Intrinsics.a(this.d, u2.d) && this.e.equals(u2.e) && this.f.equals(u2.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = AbstractC2437ph.b(AbstractC2437ph.b(AbstractC2437ph.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        return this.f.hashCode() + ((this.e.hashCode() + b) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ')';
    }
}
