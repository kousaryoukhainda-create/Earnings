package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
/* renamed from: sa  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2680sa extends AbstractC1539hb {
    public static final String i = EI.e("BatteryChrgTracker");

    @Override // defpackage.AbstractC0401Kh
    public final Object a() {
        int intExtra;
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            EI.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.AbstractC1539hb
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L7;
     */
    @Override // defpackage.AbstractC1539hb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Intent r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L8
            return
        L8:
            EI r1 = defpackage.EI.c()
            java.lang.String r2 = "Received "
            java.lang.String r2 = r2.concat(r6)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r0]
            java.lang.String r4 = defpackage.C2680sa.i
            r1.a(r4, r2, r3)
            r1 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case -1886648615: goto L44;
                case -54942926: goto L39;
                case 948344062: goto L2e;
                case 1019184907: goto L23;
                default: goto L21;
            }
        L21:
            r0 = -1
            goto L4d
        L23:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2c
            goto L21
        L2c:
            r0 = 3
            goto L4d
        L2e:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L37
            goto L21
        L37:
            r0 = 2
            goto L4d
        L39:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L42
            goto L21
        L42:
            r0 = 1
            goto L4d
        L44:
            java.lang.String r2 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L4d
            goto L21
        L4d:
            switch(r0) {
                case 0: goto L63;
                case 1: goto L5d;
                case 2: goto L57;
                case 3: goto L51;
                default: goto L50;
            }
        L50:
            goto L68
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L68
        L57:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L68
        L5d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            goto L68
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2680sa.g(android.content.Intent):void");
    }
}
