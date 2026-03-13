package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzlf extends zzle {
    protected final byte[] zza;

    public zzlf(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlg) || zzc() != ((zzlg) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (obj instanceof zzlf) {
            zzlf zzlfVar = (zzlf) obj;
            int zzi = zzi();
            int zzi2 = zzlfVar.zzi();
            if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
                return false;
            }
            int zzc = zzc();
            if (zzc <= zzlfVar.zzc()) {
                if (zzc <= zzlfVar.zzc()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzlfVar.zza;
                    zzlfVar.zzd();
                    int i = 0;
                    int i2 = 0;
                    while (i < zzc) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                int zzc2 = zzlfVar.zzc();
                StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 27 + String.valueOf(zzc2).length());
                sb.append("Ran off end of other: 0, ");
                sb.append(zzc);
                sb.append(", ");
                sb.append(zzc2);
                throw new IllegalArgumentException(sb.toString());
            }
            int zzc3 = zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 18 + String.valueOf(zzc3).length());
            sb2.append("Length too large: ");
            sb2.append(zzc);
            sb2.append(zzc3);
            throw new IllegalArgumentException(sb2.toString());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final zzlg zze(int i, int i2) {
        int zzj = zzlg.zzj(0, i2, zzc());
        if (zzj == 0) {
            return zzlg.zzb;
        }
        return new zzlb(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final void zzf(zzky zzkyVar) throws IOException {
        ((zzlj) zzkyVar).zzv(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzg(int i, int i2, int i3) {
        return zzmo.zzc(i, this.zza, 0, i3);
    }
}
