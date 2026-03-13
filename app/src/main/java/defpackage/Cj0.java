package defpackage;

import android.graphics.Point;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Cj0  reason: default package */
/* loaded from: classes2.dex */
public final class Cj0 {
    public final Point a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;

    public Cj0(Point screenSize, long j, String appId, String deviceType, int i) {
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.a = screenSize;
        this.b = j;
        this.c = appId;
        this.d = deviceType;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cj0)) {
            return false;
        }
        Cj0 cj0 = (Cj0) obj;
        if (Intrinsics.a(this.a, cj0.a) && this.b == cj0.b && Intrinsics.a(this.c, cj0.c) && Intrinsics.a(this.d, cj0.d) && this.e == cj0.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return this.e + AbstractC2437ph.b(AbstractC2437ph.b((((int) (j ^ (j >>> 32))) + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder b = Ki0.b("BackendSetupInfo(screenSize=");
        b.append(this.a);
        b.append(", appVersion=");
        b.append(this.b);
        b.append(", appId=");
        b.append(this.c);
        b.append(", deviceType=");
        b.append(this.d);
        b.append(", targetSDKVersion=");
        b.append(this.e);
        b.append(')');
        return b.toString();
    }
}
