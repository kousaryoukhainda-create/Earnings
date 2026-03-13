package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajw  reason: invalid package */
/* loaded from: classes3.dex */
public class zzajw extends zzajx {
    protected final byte[] zzb;

    public zzajw(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajp) || zzb() != ((zzajp) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zzajw) {
            zzajw zzajwVar = (zzajw) obj;
            int zza = zza();
            int zza2 = zzajwVar.zza();
            if (zza != 0 && zza2 != 0 && zza != zza2) {
                return false;
            }
            return zza(zzajwVar, 0, zzb());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final zzakb zzc() {
        return zzakb.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final zzajp zza(int i, int i2) {
        int zza = zzajp.zza(0, i2, zzb());
        if (zza == 0) {
            return zzajp.zza;
        }
        return new zzajt(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final int zzb(int i, int i2, int i3) {
        return zzalb.zza(i, this.zzb, zze(), i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final void zza(zzajm zzajmVar) throws IOException {
        zzajmVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajx
    public final boolean zza(zzajp zzajpVar, int i, int i2) {
        if (i2 <= zzajpVar.zzb()) {
            if (i2 <= zzajpVar.zzb()) {
                if (zzajpVar instanceof zzajw) {
                    zzajw zzajwVar = (zzajw) zzajpVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzajwVar.zzb;
                    int zze = zze() + i2;
                    int zze2 = zze();
                    int zze3 = zzajwVar.zze();
                    while (zze2 < zze) {
                        if (bArr[zze2] != bArr2[zze3]) {
                            return false;
                        }
                        zze2++;
                        zze3++;
                    }
                    return true;
                }
                return zzajpVar.zza(0, i2).equals(zza(0, i2));
            }
            throw new IllegalArgumentException(AbstractC0324Hi.d(i2, zzajpVar.zzb(), "Ran off end of other: 0, ", ", "));
        }
        int zzb = zzb();
        throw new IllegalArgumentException("Length too large: " + i2 + zzb);
    }
}
