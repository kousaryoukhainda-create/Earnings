package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzgj implements zzgx {
    @NotNull
    public static final zzgj zza = new zzgj();

    private zzgj() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length == 3) {
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != (zza2 instanceof Integer)) {
                zza2 = null;
            }
            Integer num = (Integer) zza2;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
                    if (true != (zza3 instanceof Object)) {
                        zza3 = null;
                    }
                    if (zza3 != null) {
                        Object zza4 = zzgdVar.zzc().zza(zzueVarArr[2]);
                        if (true != (zza4 instanceof Object)) {
                            zza4 = null;
                        }
                        if (zza4 != null) {
                            if (zza3.equals(zza4)) {
                                zzgdVar.zzg(zzgdVar.zza() + intValue);
                                return;
                            }
                            return;
                        }
                        throw new zzce(4, 5, null);
                    }
                    throw new zzce(4, 5, null);
                }
                throw new zzce(4, 6, null);
            }
            throw new zzce(4, 5, null);
        }
        throw new zzce(4, 3, null);
    }
}
