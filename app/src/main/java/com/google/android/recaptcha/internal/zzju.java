package com.google.android.recaptcha.internal;

import java.io.Serializable;
/* loaded from: classes.dex */
final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    public zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        }
        throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final boolean zzc(zzjv zzjvVar) {
        boolean z;
        if (this.zza.length != zzjvVar.zze().length) {
            return false;
        }
        int i = 0;
        boolean z2 = true;
        while (true) {
            byte[] bArr = this.zza;
            if (i < bArr.length) {
                if (bArr[i] == zzjvVar.zze()[i]) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
                i++;
            } else {
                return z2;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zze() {
        return this.zza;
    }
}
