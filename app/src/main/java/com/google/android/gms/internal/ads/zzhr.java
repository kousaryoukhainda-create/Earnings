package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class zzhr implements zzlj, zzlm {
    private final int zzb;
    private zzln zzd;
    private int zze;
    private zzog zzf;
    private zzcx zzg;
    private int zzh;
    private zzvy zzi;
    private zzab[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzll zzq;
    private final Object zza = new Object();
    private final zzke zzc = new zzke();
    private long zzm = Long.MIN_VALUE;
    private zzbq zzp = zzbq.zza;

    public zzhr(int i) {
        this.zzb = i;
    }

    private final void zzZ(long j, boolean z) throws zzib {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzz(j, z);
    }

    public void zzA() {
    }

    public final void zzB() {
        zzll zzllVar;
        synchronized (this.zza) {
            zzllVar = this.zzq;
        }
        if (zzllVar != null) {
            zzllVar.zza(this);
        }
    }

    public void zzC() {
    }

    public void zzD() throws zzib {
    }

    public void zzE() {
    }

    public void zzF(zzab[] zzabVarArr, long j, long j2, zzug zzugVar) throws zzib {
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzG() {
        boolean z;
        if (this.zzh == 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzH(zzab[] zzabVarArr, zzvy zzvyVar, long j, long j2, zzug zzugVar) throws zzib {
        zzcw.zzf(!this.zzn);
        this.zzi = zzvyVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzabVarArr;
        this.zzk = j2;
        zzF(zzabVarArr, j, j2, zzugVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzI() {
        boolean z;
        if (this.zzh == 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzke zzkeVar = this.zzc;
        zzkeVar.zzb = null;
        zzkeVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzJ(long j) throws zzib {
        zzZ(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzL(zzll zzllVar) {
        synchronized (this.zza) {
            this.zzq = zzllVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public /* synthetic */ void zzM(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzN(zzbq zzbqVar) {
        if (!Objects.equals(this.zzp, zzbqVar)) {
            this.zzp = zzbqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzO() throws zzib {
        boolean z = true;
        if (this.zzh != 1) {
            z = false;
        }
        zzcw.zzf(z);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzP() {
        boolean z;
        if (this.zzh == 2) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzvy zzvyVar = this.zzi;
        zzvyVar.getClass();
        return zzvyVar.zze();
    }

    public final zzab[] zzT() {
        zzab[] zzabVarArr = this.zzj;
        zzabVarArr.getClass();
        return zzabVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final int zzcT() {
        return this.zzh;
    }

    public final int zzcU(zzke zzkeVar, zzhh zzhhVar, int i) {
        zzvy zzvyVar = this.zzi;
        zzvyVar.getClass();
        int zza = zzvyVar.zza(zzkeVar, zzhhVar, i);
        if (zza == -4) {
            if (zzhhVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                if (this.zzn) {
                    return -4;
                }
                return -3;
            }
            long j = zzhhVar.zze + this.zzk;
            zzhhVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (zza == -5) {
            zzab zzabVar = zzkeVar.zza;
            zzabVar.getClass();
            long j2 = zzabVar.zzt;
            if (j2 != Long.MAX_VALUE) {
                zzz zzb = zzabVar.zzb();
                zzb.zzae(j2 + this.zzk);
                zzkeVar.zza = zzb.zzag();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzcV() {
        return this.zzm;
    }

    public final zzib zzcW(Throwable th, zzab zzabVar, boolean z, int i) {
        int i2;
        if (zzabVar != null && !this.zzo) {
            this.zzo = true;
            try {
                int zzY = zzY(zzabVar) & 7;
                this.zzo = false;
                i2 = zzY;
            } catch (zzib unused) {
                this.zzo = false;
            } catch (Throwable th2) {
                this.zzo = false;
                throw th2;
            }
            return zzib.zzb(th, zzU(), this.zze, zzabVar, i2, z, i);
        }
        i2 = 4;
        return zzib.zzb(th, zzU(), this.zze, zzabVar, i2, z, i);
    }

    public final int zzd(long j) {
        zzvy zzvyVar = this.zzi;
        zzvyVar.getClass();
        return zzvyVar.zzb(j - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public int zze() throws zzib {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzbq zzh() {
        return this.zzp;
    }

    public final zzcx zzi() {
        zzcx zzcxVar = this.zzg;
        zzcxVar.getClass();
        return zzcxVar;
    }

    public final zzke zzk() {
        zzke zzkeVar = this.zzc;
        zzkeVar.zzb = null;
        zzkeVar.zza = null;
        return zzkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public zzkk zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzlm zzm() {
        return this;
    }

    public final zzln zzn() {
        zzln zzlnVar = this.zzd;
        zzlnVar.getClass();
        return zzlnVar;
    }

    public final zzog zzo() {
        zzog zzogVar = this.zzf;
        zzogVar.getClass();
        return zzogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzvy zzp() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzq() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzr() {
        boolean z = true;
        if (this.zzh != 1) {
            z = false;
        }
        zzcw.zzf(z);
        zzke zzkeVar = this.zzc;
        zzkeVar.zzb = null;
        zzkeVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzs(zzln zzlnVar, zzab[] zzabVarArr, zzvy zzvyVar, long j, boolean z, boolean z2, long j2, long j3, zzug zzugVar) throws zzib {
        boolean z3;
        if (this.zzh == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzcw.zzf(z3);
        this.zzd = zzlnVar;
        this.zzh = 1;
        zzy(z, z2);
        zzH(zzabVarArr, zzvyVar, j2, j3, zzugVar);
        zzZ(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public /* synthetic */ void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public void zzu(int i, Object obj) throws zzib {
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzv(int i, zzog zzogVar, zzcx zzcxVar) {
        this.zze = i;
        this.zzf = zzogVar;
        this.zzg = zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzw() throws IOException {
        zzvy zzvyVar = this.zzi;
        zzvyVar.getClass();
        zzvyVar.zzd();
    }

    public void zzx() {
        throw null;
    }

    public void zzy(boolean z, boolean z2) throws zzib {
    }

    public void zzz(long j, boolean z) throws zzib {
        throw null;
    }
}
