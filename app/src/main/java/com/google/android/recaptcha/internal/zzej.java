package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzej {
    @NotNull
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzej(@NotNull String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzej) {
            zzej zzejVar = (zzej) obj;
            if (Intrinsics.a(zzejVar.zza, this.zza) && zzejVar.zzb == this.zzb && zzejVar.zzc == this.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    @NotNull
    public final String zzc() {
        return this.zza;
    }
}
