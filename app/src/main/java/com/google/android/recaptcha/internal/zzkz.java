package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
final class zzkz extends zzlc {
    private final int zzc;

    public zzkz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzle.zzi(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.d(i, i2, "Index > length: ", ", "));
        }
        return ((zzlc) this).zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zzb(int i) {
        return ((zzlc) this).zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzlc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i3);
    }
}
