package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakb  reason: invalid package */
/* loaded from: classes3.dex */
public abstract class zzakb {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzakf zzc;
    private int zze;
    private int zzf;

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zze(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double zza() throws IOException;

    public abstract int zza(int i) throws zzalf;

    public abstract float zzb() throws IOException;

    public abstract void zzb(int i) throws zzalf;

    public abstract int zzc();

    public abstract void zzc(int i);

    public abstract int zzd() throws IOException;

    public abstract boolean zzd(int i) throws IOException;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    public abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzajp zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;

    public final void zzv() throws zzalf {
        if (this.zza + this.zze < this.zzf) {
            return;
        }
        throw zzalf.zzh();
    }

    public final void zzw() throws zzalf {
        if (this.zze == 0) {
            zzb(0);
        }
    }

    public final void zzx() throws IOException {
        int zzi;
        do {
            zzi = zzi();
            if (zzi == 0) {
                return;
            }
            zzv();
            this.zze++;
            this.zze--;
        } while (zzd(zzi));
    }

    private zzakb() {
        this.zzf = zzd;
        this.zzb = Integer.MAX_VALUE;
    }

    public static zzakb zza(byte[] bArr, int i, int i2, boolean z) {
        zzaka zzakaVar = new zzaka(bArr, i, i2, z);
        try {
            zzakaVar.zza(i2);
            return zzakaVar;
        } catch (zzalf e) {
            throw new IllegalArgumentException(e);
        }
    }
}
