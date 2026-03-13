package com.fyber.fairbid;

import com.fyber.fairbid.internal.Utils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class bb {
    @NotNull
    public final cb a;
    @NotNull
    public final Utils.ClockHelper b;

    public bb(@NotNull cb metricsStore, @NotNull Utils.ClockHelper clockHelper) {
        Intrinsics.checkNotNullParameter(metricsStore, "metricsStore");
        Intrinsics.checkNotNullParameter(clockHelper, "clockHelper");
        this.a = metricsStore;
        this.b = clockHelper;
    }

    @NotNull
    public final ab a() {
        cb cbVar = this.a;
        long currentTimeMillis = this.b.getCurrentTimeMillis();
        long j = cbVar.a.getLong("first_sdk_start_timestamp", -1L);
        Long valueOf = Long.valueOf(j);
        Long l = null;
        if (j == -1) {
            valueOf = null;
        }
        Long valueOf2 = Long.valueOf(currentTimeMillis);
        if (valueOf == null) {
            valueOf = valueOf2;
        }
        long longValue = valueOf.longValue();
        long j2 = cbVar.a.getLong("first_sdk_version_start_timestamp", -1L);
        Long valueOf3 = Long.valueOf(j2);
        if (j2 == -1) {
            valueOf3 = null;
        }
        Long valueOf4 = Long.valueOf(currentTimeMillis);
        if (valueOf3 == null) {
            valueOf3 = valueOf4;
        }
        long longValue2 = valueOf3.longValue();
        long j3 = cbVar.a.getLong("first_app_version_start_timestamp", -1L);
        Long valueOf5 = Long.valueOf(j3);
        if (j3 != -1) {
            l = valueOf5;
        }
        Long valueOf6 = Long.valueOf(currentTimeMillis);
        if (l == null) {
            l = valueOf6;
        }
        return new ab(cbVar.a.getInt("num_sdk_starts", 0), longValue, cbVar.a.getInt("num_app_version_starts", 0), l.longValue(), cbVar.a.getInt("num_sdk_version_starts", 0), longValue2);
    }
}
