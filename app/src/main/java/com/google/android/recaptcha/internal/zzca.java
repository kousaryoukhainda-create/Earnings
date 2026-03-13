package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzca extends AbstractC3040wi {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzcb zzc;
    int zzd;
    zzcb zze;
    zzje zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzcb zzcbVar, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.zzc = zzcbVar;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzc(null, this);
    }
}
