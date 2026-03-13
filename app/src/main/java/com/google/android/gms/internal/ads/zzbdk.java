package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class zzbdk extends AbstractServiceConnectionC0559Qk {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdrw zzd;
    private C0585Rk zze;
    private AbstractC0378Jk zzf;

    private final void zzf(Context context) {
        String b;
        if (this.zzf == null && context != null && (b = AbstractC0378Jk.b(context, null, false)) != null) {
            AbstractC0378Jk.a(context, b, this);
        }
    }

    @Override // defpackage.AbstractServiceConnectionC0559Qk
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull AbstractC0378Jk abstractC0378Jk) {
        this.zzf = abstractC0378Jk;
        abstractC0378Jk.getClass();
        try {
            ((C2742tC) abstractC0378Jk.a).k();
        } catch (RemoteException unused) {
        }
        this.zze = abstractC0378Jk.c(new zzbdj(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final C0585Rk zza() {
        if (this.zze == null) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdi
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdk.this.zzc();
                }
            });
        }
        return this.zze;
    }

    public final void zzb(Context context, zzdrw zzdrwVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdrwVar;
        zzf(context);
    }

    public final /* synthetic */ void zzc() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zzd(int i) {
        zzdrw zzdrwVar = this.zzd;
        if (zzdrwVar != null) {
            zzdrv zza2 = zzdrwVar.zza();
            zza2.zzb("action", "cct_nav");
            zza2.zzb("cct_navs", String.valueOf(i));
            zza2.zzg();
        }
    }

    public final void zze(final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeF)).booleanValue() && this.zzd != null) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdh
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdk.this.zzd(i);
                }
            });
        }
    }
}
