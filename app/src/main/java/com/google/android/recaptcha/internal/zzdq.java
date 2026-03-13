package com.google.android.recaptcha.internal;

import android.app.Application;
/* loaded from: classes.dex */
public final class zzdq extends AbstractC1431gG implements InterfaceC0263Ez {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        int i = zzav.zza;
        Object zzb = zzau.zza().zzb(735120228);
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
