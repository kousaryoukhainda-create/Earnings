package com.google.android.recaptcha;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends AbstractC3040wi {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.zzb = recaptcha;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m12getClientBWLJW6A = this.zzb.m12getClientBWLJW6A(null, null, 0L, this);
        if (m12getClientBWLJW6A == EnumC0661Ui.b) {
            return m12getClientBWLJW6A;
        }
        return new JW(m12getClientBWLJW6A);
    }
}
