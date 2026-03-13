package com.google.android.recaptcha.internal;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzfu {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        String str2 = "";
        for (String str3 : d.G(str, new char[]{'.'})) {
            String concat = str2.concat(String.valueOf(str3));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }

    public final void zza(@NotNull zzrv zzrvVar) {
        this.zza = C0553Qe.E(zzrvVar.zzf().zzi());
        this.zzb = C0553Qe.E(zzrvVar.zzg().zzi());
    }

    public final boolean zzb(@NotNull String str) {
        Set set = this.zza;
        if (set != null && this.zzb != null) {
            if (set.isEmpty()) {
                return true;
            }
            Set set2 = this.zzb;
            Intrinsics.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            if (zzc(str, set2)) {
                return false;
            }
            return zzc(str, set);
        }
        if (this.zzc == null) {
            this.zzc = Long.valueOf(System.currentTimeMillis());
        }
        this.zzd++;
        return true;
    }
}
