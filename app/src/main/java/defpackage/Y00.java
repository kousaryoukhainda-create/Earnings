package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: Y00  reason: default package */
/* loaded from: classes.dex */
public final class Y00 {
    public static final NS c = AbstractC1281eb.g("firebase_sessions_enabled");
    public static final NS d;
    public static final NS e;
    public static final NS f;
    public static final NS g;
    public final InterfaceC0249El a;
    public C0987c00 b;

    static {
        Intrinsics.checkNotNullParameter("firebase_sessions_sampling_rate", "name");
        d = new NS("firebase_sessions_sampling_rate");
        Intrinsics.checkNotNullParameter("firebase_sessions_restart_timeout", "name");
        e = new NS("firebase_sessions_restart_timeout");
        Intrinsics.checkNotNullParameter("firebase_sessions_cache_duration", "name");
        f = new NS("firebase_sessions_cache_duration");
        Intrinsics.checkNotNullParameter("firebase_sessions_cache_updated_time", "name");
        g = new NS("firebase_sessions_cache_updated_time");
    }

    public Y00(InterfaceC0249El dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.a = dataStore;
        AbstractC1281eb.M(new V00(this, null));
    }

    public static final void a(Y00 y00, C3097xN c3097xN) {
        y00.getClass();
        y00.b = new C0987c00((Boolean) c3097xN.c(c), (Double) c3097xN.c(d), (Integer) c3097xN.c(e), (Integer) c3097xN.c(f), (Long) c3097xN.c(g));
    }

    public final boolean b() {
        Integer num;
        C0987c00 c0987c00 = this.b;
        if (c0987c00 != null) {
            if (c0987c00 != null) {
                Long l = c0987c00.e;
                if (l != null && (num = c0987c00.d) != null && (System.currentTimeMillis() - l.longValue()) / 1000 < num.intValue()) {
                    return false;
                }
                return true;
            }
            Intrinsics.f("sessionConfigs");
            throw null;
        }
        Intrinsics.f("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.NS r6, java.lang.Object r7, defpackage.AbstractC3040wi r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.W00
            if (r0 == 0) goto L13
            r0 = r8
            W00 r0 = (defpackage.W00) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            W00 r0 = new W00
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            Ui r1 = defpackage.EnumC0661Ui.b
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.AbstractC1522hL.T(r8)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.AbstractC1522hL.T(r8)
            El r8 = r5.a     // Catch: java.io.IOException -> L27
            X00 r2 = new X00     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.d = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = defpackage.AbstractC2870uj.u(r8, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L58:
            B90 r6 = defpackage.B90.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Y00.c(NS, java.lang.Object, wi):java.lang.Object");
    }
}
