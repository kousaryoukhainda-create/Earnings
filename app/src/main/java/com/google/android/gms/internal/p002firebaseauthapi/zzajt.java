package com.google.android.gms.internal.p002firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajt  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzajt extends zzajw {
    private final int zzc;
    private final int zzd;

    public zzajt(byte[] bArr, int i, int i2) {
        super(bArr);
        zzajp.zza(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final byte zza(int i) {
        int zzb = zzb();
        if (((zzb - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.d(i, zzb, "Index > length: ", ", "));
        }
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i3);
    }
}
