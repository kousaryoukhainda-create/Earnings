package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzhl implements zzgx {
    @NotNull
    public static final zzhl zza = new zzhl();

    private zzhl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length == 1) {
            zzgdVar.zzc().zze(i, zzgdVar.zzc().zza(zzueVarArr[0]));
            return;
        }
        throw new zzce(4, 3, null);
    }
}
