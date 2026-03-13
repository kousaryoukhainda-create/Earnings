package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zztx extends zzua {
    private final int zzc;

    public zztx(byte[] bArr, int i, int i2) {
        super(bArr);
        zzud.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.d(i, i2, "Index > length: ", ", "));
        }
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.gtm.zzua
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final int zzd() {
        return this.zzc;
    }
}
