package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public final class zzflu {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzflu zza = new zzflu();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzflu zza() {
        return zza;
    }

    public final void zzc() {
        boolean inKeyguardRestrictedInputMode;
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (Build.VERSION.SDK_INT >= 22) {
            inKeyguardRestrictedInputMode = keyguardManager.isDeviceLocked();
        } else {
            inKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
        }
        zzd(this.zzc, inKeyguardRestrictedInputMode);
        this.zzd = inKeyguardRestrictedInputMode;
    }

    public final void zzd(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (z2 || z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.zzd || this.zzc) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            for (zzfkt zzfktVar : zzflk.zza().zzc()) {
                zzfma zzg = zzfktVar.zzg();
                if (z2 || z) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zzg.zzm(z5);
            }
        }
    }

    public final void zze(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzflt(this), intentFilter);
    }
}
