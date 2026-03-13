package com.google.android.recaptcha.internal;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzha implements zzgx {
    @NotNull
    public static final zzha zza = new zzha();

    private zzha() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length != 0) {
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != (zza2 instanceof Class)) {
                zza2 = null;
            }
            Class cls = (Class) zza2;
            if (cls != null) {
                Class[] zzf = zzgdVar.zzc().zzf(C2215n5.k(zzueVarArr).subList(1, length));
                try {
                    zzgdVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
                    return;
                } catch (Exception e) {
                    throw new zzce(6, 9, e);
                }
            }
            throw new zzce(4, 5, null);
        }
        throw new zzce(4, 3, null);
    }
}
