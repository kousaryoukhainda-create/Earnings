package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j$.util.concurrent.ConcurrentHashMap;
/* renamed from: K2  reason: default package */
/* loaded from: classes.dex */
public final class K2 implements J2 {
    public static volatile K2 c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;

    public K2(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC2791tm0.a(str) && AbstractC2791tm0.b(bundle, str2) && AbstractC2791tm0.d(str, str2, bundle)) {
            if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.logEvent(str, str2, bundle);
        }
    }

    public final BI b(String str, C0750Xt c0750Xt) {
        Object obj;
        Preconditions.checkNotNull(c0750Xt);
        if (AbstractC2791tm0.a(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = AppMeasurement.FIAM_ORIGIN.equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (equals) {
                    obj = new Om0(appMeasurementSdk, c0750Xt);
                } else if ("clx".equals(str)) {
                    obj = new Um0(appMeasurementSdk, c0750Xt);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    concurrentHashMap.put(str, obj);
                    return new BI(14);
                }
            }
        }
        return null;
    }
}
