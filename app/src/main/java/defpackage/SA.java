package defpackage;

import com.google.android.gms.ads.MobileAds;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: SA  reason: default package */
/* loaded from: classes.dex */
public final class SA {
    public final boolean a;

    public SA(boolean z) {
        Intrinsics.checkNotNullParameter(MobileAds.ERROR_DOMAIN, "adsSdkName");
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SA)) {
            return false;
        }
        SA sa = (SA) obj;
        sa.getClass();
        if (this.a == sa.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        return 1169068184 + i;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.a;
    }
}
