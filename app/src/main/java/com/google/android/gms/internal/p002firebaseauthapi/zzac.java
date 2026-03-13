package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzac  reason: invalid package */
/* loaded from: classes3.dex */
abstract class zzac extends zzd<String> {
    final CharSequence zza;
    private final zzf zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    public zzac(zzv zzvVar, CharSequence charSequence) {
        zzf zzfVar;
        int i;
        zzfVar = zzvVar.zza;
        this.zzb = zzfVar;
        this.zzc = false;
        i = zzvVar.zzc;
        this.zze = i;
        this.zza = charSequence;
    }

    public abstract int zza(int i);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    public final /* synthetic */ String zza() {
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 != -1) {
                int zzb = zzb(i2);
                if (zzb == -1) {
                    zzb = this.zza.length();
                    this.zzd = -1;
                } else {
                    this.zzd = zza(zzb);
                }
                int i3 = this.zzd;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.zzd = i4;
                    if (i4 > this.zza.length()) {
                        this.zzd = -1;
                    }
                } else {
                    while (i < zzb && this.zzb.zza(this.zza.charAt(i))) {
                        i++;
                    }
                    while (zzb > i && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                        zzb--;
                    }
                    int i5 = this.zze;
                    if (i5 == 1) {
                        zzb = this.zza.length();
                        this.zzd = -1;
                        while (zzb > i && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                            zzb--;
                        }
                    } else {
                        this.zze = i5 - 1;
                    }
                    return this.zza.subSequence(i, zzb).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzb(int i);
}
