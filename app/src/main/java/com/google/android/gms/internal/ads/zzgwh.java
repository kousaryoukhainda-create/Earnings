package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class zzgwh extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = UserVerificationMethods.USER_VERIFY_PATTERN;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];

    public zzgwh(int i) {
    }

    private final void zzc(int i) {
        this.zzc.add(new zzgwg(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.zzf == this.zze.length) {
                zzc(1);
            }
            byte[] bArr = this.zze;
            int i2 = this.zzf;
            this.zzf = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int zza() {
        return this.zzd + this.zzf;
    }

    public final synchronized zzgwj zzb() {
        try {
            int i = this.zzf;
            byte[] bArr = this.zze;
            if (i < bArr.length) {
                if (i > 0) {
                    this.zzc.add(new zzgwg(Arrays.copyOf(bArr, i)));
                }
            } else {
                this.zzc.add(new zzgwg(this.zze));
                this.zze = zza;
            }
            this.zzd += this.zzf;
            this.zzf = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzgwj.zzu(this.zzc);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i3 = this.zzf;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.zzf += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        zzc(i5);
        System.arraycopy(bArr, i + i4, this.zze, 0, i5);
        this.zzf = i5;
    }
}
