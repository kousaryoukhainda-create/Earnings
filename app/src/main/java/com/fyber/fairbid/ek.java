package com.fyber.fairbid;

import com.fyber.fairbid.internal.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ek {
    @NotNull
    public final String a;
    public final int b;
    @NotNull
    public final Constants.AdType c;
    @NotNull
    public final List<bk> d;
    public final boolean e;
    @NotNull
    public final String f;

    public ek(@NotNull String name, int i, @NotNull Constants.AdType adType, @NotNull List<bk> adUnits, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        this.a = name;
        this.b = i;
        this.c = adType;
        this.d = adUnits;
        this.e = z;
        this.f = String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ek) {
            ek ekVar = (ek) obj;
            return Intrinsics.a(this.a, ekVar.a) && this.b == ekVar.b && this.c == ekVar.c && Intrinsics.a(this.d, ekVar.d) && this.e == ekVar.e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.b;
        int hashCode = this.c.hashCode();
        int hashCode2 = (this.d.hashCode() + ((hashCode + ((i + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        boolean z = this.e;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode2 + i2;
    }

    @NotNull
    public final String toString() {
        return "TestSuitePlacement(name=" + this.a + ", id=" + this.b + ", adType=" + this.c + ", adUnits=" + this.d + ", isMrec=" + this.e + ')';
    }
}
