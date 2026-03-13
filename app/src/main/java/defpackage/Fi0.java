package defpackage;

import android.content.Context;
import io.adjoe.sdk.Playtime;
import j$.time.format.DateTimeFormatter;
/* renamed from: Fi0  reason: default package */
/* loaded from: classes2.dex */
public abstract class Fi0 {
    public static final void e() {
        EnumC2264ng0 enumC2264ng0 = EnumC2264ng0.b;
        Dg0.a();
    }

    public static void f(Context context) {
        DateTimeFormatter dateTimeFormatter = Kj0.a;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C2176mf0 o = C2176mf0.b.o(context);
            Boolean bool = Boolean.FALSE;
            if (!((Boolean) o.b("bl", Boolean.class, bool)).booleanValue()) {
                AbstractC1930jl0.h(Playtime.TAG, "Skipping PIR Progress Check, PIR Disabled for SDK");
            } else if (((Boolean) o.b("w", Boolean.class, bool)).booleanValue()) {
                AbstractC1930jl0.h(Playtime.TAG, "Skipping PIR Progress Check, SDK is disabled");
            } else if (VA.g.m(context).D().isEmpty()) {
                AbstractC1930jl0.h(Playtime.TAG, "Skipping PIR Progress Check, No PIR campaigns installed");
            } else {
                long longValue = ((Long) o.b("bn", Long.class, 0L)).longValue() + 60000;
                if (longValue >= currentTimeMillis) {
                    AbstractC1930jl0.h(Playtime.TAG, "Skipping PIR Progress Check, we've checked too recently. Next at " + Kj0.a(longValue));
                    return;
                }
                C1049ci0 c1049ci0 = C1049ci0.a;
                C1049ci0.c().t(context);
                o.c("bn", Long.valueOf(currentTimeMillis));
            }
        } catch (Exception e) {
            AbstractC1930jl0.i(Playtime.TAG, "Exception while checking PIR progress", e);
        }
    }
}
