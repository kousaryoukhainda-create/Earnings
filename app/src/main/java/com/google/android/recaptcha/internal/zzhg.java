package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzhg implements zzgx {
    @NotNull
    public static final zzhg zza = new zzhg();

    private zzhg() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length != 0) {
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object[] zzg = zzgdVar.zzc().zzg(C2215n5.k(zzueVarArr).subList(1, length));
                try {
                    zzgdVar.zzc().zze(i, method.invoke(null, Arrays.copyOf(zzg, zzg.length)));
                    return;
                } catch (Exception e) {
                    throw new zzce(6, 15, e);
                }
            }
            throw new zzce(4, 5, null);
        }
        throw new zzce(4, 3, null);
    }
}
