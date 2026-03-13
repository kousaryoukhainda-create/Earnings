package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
/* renamed from: n40  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2214n40 extends AbstractC1539hb {
    public static final String i = EI.e("StorageNotLowTracker");

    @Override // defpackage.AbstractC0401Kh
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, f());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.AbstractC1539hb
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c(Boolean.TRUE);
                return;
            }
            return;
        }
        c(Boolean.FALSE);
    }
}
