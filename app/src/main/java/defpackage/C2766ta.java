package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
/* renamed from: ta  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2766ta extends AbstractC1539hb {
    public static final String i = EI.e("BatteryNotLowTracker");

    @Override // defpackage.AbstractC0401Kh
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            EI.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
    }

    @Override // defpackage.AbstractC1539hb
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.AbstractC1539hb
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        EI.c().a(i, AbstractC2437ph.g("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                c(Boolean.FALSE);
                return;
            }
            return;
        }
        c(Boolean.TRUE);
    }
}
