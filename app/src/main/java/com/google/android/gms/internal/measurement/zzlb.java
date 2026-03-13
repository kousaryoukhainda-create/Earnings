package com.google.android.gms.internal.measurement;
/* loaded from: classes3.dex */
final class zzlb extends zzlf {
    private final int zzc;

    public zzlb(byte[] bArr, int i, int i2) {
        super(bArr);
        zzlg.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return ((zzlf) this).zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final byte zzb(int i) {
        return ((zzlf) this).zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final int zzd() {
        return 0;
    }
}
