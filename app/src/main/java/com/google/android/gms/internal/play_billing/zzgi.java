package com.google.android.gms.internal.play_billing;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzgi extends zzgh {
    protected final byte[] zza;

    public zzgi(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgk) || zzd() != ((zzgk) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgi) {
            zzgi zzgiVar = (zzgi) obj;
            int zzi = zzi();
            int zzi2 = zzgiVar.zzi();
            if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzgiVar.zzd()) {
                if (zzd <= zzgiVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgiVar.zza;
                    zzgiVar.zzc();
                    int i = 0;
                    int i2 = 0;
                    while (i < zzd) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(AbstractC0324Hi.d(zzd, zzgiVar.zzd(), "Ran off end of other: 0, ", ", "));
            }
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final int zze(int i, int i2, int i3) {
        return zzhp.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final zzgk zzf(int i, int i2) {
        int zzh = zzgk.zzh(0, i2, zzd());
        if (zzh == 0) {
            return zzgk.zzb;
        }
        return new zzgf(this.zza, 0, zzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final void zzg(zzgc zzgcVar) throws IOException {
        ((zzgo) zzgcVar).zzc(this.zza, 0, zzd());
    }
}
