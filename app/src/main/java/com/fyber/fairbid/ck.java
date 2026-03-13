package com.fyber.fairbid;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ck {
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    public final int c;
    public final double d;
    public final double e;
    public final double f;
    @NotNull
    public final lb g;
    @NotNull
    public final mb h;

    public ck(@NotNull String id, @NotNull String networkName, int i, double d, double d2, double d3, @NotNull lb requestStatus, @NotNull mb instanceType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        this.a = id;
        this.b = networkName;
        this.c = i;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = requestStatus;
        this.h = instanceType;
    }

    public static ck a(ck ckVar, double d, lb lbVar, int i) {
        String id = (i & 1) != 0 ? ckVar.a : null;
        String networkName = (i & 2) != 0 ? ckVar.b : null;
        int i2 = (i & 4) != 0 ? ckVar.c : 0;
        double d2 = (i & 8) != 0 ? ckVar.d : d;
        double d3 = (i & 16) != 0 ? ckVar.e : 0.0d;
        double d4 = (i & 32) != 0 ? ckVar.f : 0.0d;
        lb requestStatus = (i & 64) != 0 ? ckVar.g : lbVar;
        mb instanceType = (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ckVar.h : null;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return new ck(id, networkName, i2, d2, d3, d4, requestStatus, instanceType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ck) {
            ck ckVar = (ck) obj;
            return Intrinsics.a(this.a, ckVar.a) && Intrinsics.a(this.b, ckVar.b) && this.c == ckVar.c && Double.compare(this.d, ckVar.d) == 0 && Double.compare(this.e, ckVar.e) == 0 && Double.compare(this.f, ckVar.f) == 0 && this.g == ckVar.g && this.h == ckVar.h;
        }
        return false;
    }

    public final int hashCode() {
        int a = fm.a(this.b, this.a.hashCode() * 31, 31);
        long doubleToLongBits = Double.doubleToLongBits(this.d);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.e);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f);
        int i3 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        int hashCode = this.g.hashCode();
        return this.h.hashCode() + ((hashCode + ((i3 + ((i2 + ((i + ((this.c + a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TestSuiteNetworkInstance(id=" + this.a + ", networkName=" + this.b + ", networkIcon=" + this.c + ", price=" + this.d + ", manualECpm=" + this.e + ", autoECpm=" + this.f + ", requestStatus=" + this.g + ", instanceType=" + this.h + ')';
    }

    public final boolean a() {
        return !(this.e == 0.0d);
    }
}
