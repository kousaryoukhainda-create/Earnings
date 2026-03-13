package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.o2;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
/* loaded from: classes.dex */
public final class z7 extends nh {
    public static final o2.a l = new Fk0(16);
    public final int d;
    public final String f;
    public final int g;
    public final e9 h;
    public final int i;
    public final xd j;
    final boolean k;

    private z7(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static z7 a(Throwable th, String str, int i, e9 e9Var, int i2, boolean z, int i3) {
        return new z7(1, th, null, i3, str, i, e9Var, e9Var == null ? 4 : i2, z);
    }

    public static /* synthetic */ z7 c(Bundle bundle) {
        return new z7(bundle);
    }

    private z7(int i, Throwable th, String str, int i2, String str2, int i3, e9 e9Var, int i4, boolean z) {
        this(a(i, str, str2, i3, e9Var, i4), th, i2, i, str2, i3, e9Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public static z7 a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    private static String a(int i, String str, String str2, int i2, e9 e9Var, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i == 1) {
            str3 = str2 + " error, index=" + i2 + ", format=" + e9Var + ", format_supported=" + t2.b(i3);
        } else if (i != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        return !TextUtils.isEmpty(str) ? AbstractC0324Hi.g(str3, ": ", str) : str3;
    }

    private z7(Bundle bundle) {
        super(bundle);
        this.d = bundle.getInt(nh.b(1001), 2);
        this.f = bundle.getString(nh.b(1002));
        this.g = bundle.getInt(nh.b(1003), -1);
        this.h = (e9) p2.a(e9.I, bundle.getBundle(nh.b(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION)));
        this.i = bundle.getInt(nh.b(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT), 4);
        this.k = bundle.getBoolean(nh.b(1006), false);
        this.j = null;
    }

    private z7(String str, Throwable th, int i, int i2, String str2, int i3, e9 e9Var, int i4, xd xdVar, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        b1.a(!z || i2 == 1);
        b1.a((th != null || i2 == 3) ? true : true);
        this.d = i2;
        this.f = str2;
        this.g = i3;
        this.h = e9Var;
        this.i = i4;
        this.j = xdVar;
        this.k = z;
    }

    public static z7 a(IOException iOException, int i) {
        return new z7(0, iOException, i);
    }

    public static z7 a(RuntimeException runtimeException, int i) {
        return new z7(2, runtimeException, i);
    }

    public z7 a(xd xdVar) {
        return new z7((String) xp.a((Object) getMessage()), getCause(), this.a, this.d, this.f, this.g, this.h, this.i, xdVar, this.b, this.k);
    }
}
