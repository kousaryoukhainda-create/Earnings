package com.google.android.gms.internal.p002firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg  reason: invalid package */
/* loaded from: classes3.dex */
public abstract class zzakg extends zzajm {
    private static final Logger zza = Logger.getLogger(zzakg.class.getName());
    private static final boolean zzb = zzanp.zzc();
    zzakj zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zza */
    /* loaded from: classes3.dex */
    public static abstract class zza extends zzakg {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        public zza(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.zza = bArr;
                this.zzb = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(int i) {
            if (zzakg.zzb) {
                long j = this.zzc;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    zzanp.zza(bArr, i2, (byte) (i | UserVerificationMethods.USER_VERIFY_PATTERN));
                    i >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                zzanp.zza(bArr2, i3, (byte) i);
                this.zzd += (int) (this.zzc - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                bArr3[i4] = (byte) (i | UserVerificationMethods.USER_VERIFY_PATTERN);
                this.zzd++;
                i >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            bArr4[i5] = (byte) i;
            this.zzd++;
        }

        public final void zza(byte b) {
            int i = this.zzc;
            this.zza[i] = b;
            this.zzc = i + 1;
            this.zzd++;
        }

        public final void zza(int i) {
            int i2 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = i >> Ascii.CAN;
            this.zzc = i2 + 4;
            this.zzd += 4;
        }

        public final void zzb(long j) {
            if (zzakg.zzb) {
                long j2 = this.zzc;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i = this.zzc;
                    this.zzc = i + 1;
                    zzanp.zza(bArr, i, (byte) (((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                zzanp.zza(bArr2, i2, (byte) j);
                this.zzd += (int) (this.zzc - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr3[i3] = (byte) (((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN);
                this.zzd++;
                j >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr4[i4] = (byte) j;
            this.zzd++;
        }

        public final void zza(long j) {
            int i = this.zzc;
            byte[] bArr = this.zza;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzc = i + 8;
            this.zzd += 8;
        }

        public final void zza(int i, int i2) {
            zzb((i << 3) | i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzb */
    /* loaded from: classes3.dex */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzb(String str, Throwable th) {
            super(AbstractC2437ph.g("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzb(int i, int i2, int i3, Throwable th) {
            this(i, i2, i3, th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private zzb(long r3, long r5, int r7, java.lang.Throwable r8) {
            /*
                r2 = this;
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r0 = "Pos: "
                java.lang.String r1 = ", limit: "
                java.lang.StringBuilder r3 = defpackage.AbstractC0324Hi.k(r3, r0, r1)
                r3.append(r5)
                java.lang.String r4 = ", len: "
                r3.append(r4)
                r3.append(r7)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakg.zzb.<init>(long, long, int, java.lang.Throwable):void");
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzc */
    /* loaded from: classes3.dex */
    public static class zzc extends zzakg {
        private final byte[] zza;
        private final int zzb;
        private int zzc;

        public zzc(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                if (((bArr.length - i2) | i2) >= 0) {
                    this.zza = bArr;
                    this.zzc = 0;
                    this.zzb = i2;
                    return;
                }
                Locale locale = Locale.US;
                throw new IllegalArgumentException(AbstractC0324Hi.d(bArr.length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final int zza() {
            return this.zzb - this.zzc;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte b) throws IOException {
            int i = this.zzc;
            try {
                int i2 = i + 1;
                try {
                    this.zza[i] = b;
                    this.zzc = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i2;
                    throw new zzb(i, this.zzb, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzd(int i, zzajp zzajpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i);
            zzc(3, zzajpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzf(int i, long j) throws IOException {
            zzk(i, 1);
            zzh(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i, int i2) throws IOException {
            zzk(i, 5);
            zzk(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzi(int i, int i2) throws IOException {
            zzk(i, 0);
            zzl(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzj(long j) throws IOException {
            int i;
            int i2;
            int i3 = this.zzc;
            if (zzakg.zzb && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    zzanp.zza(this.zza, i3, (byte) (((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j >>>= 7;
                    i3++;
                }
                i = i3 + 1;
                zzanp.zza(this.zza, i3, (byte) j);
            } else {
                while ((j & (-128)) != 0) {
                    try {
                        i2 = i3 + 1;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                    }
                    try {
                        this.zza[i3] = (byte) (((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        j >>>= 7;
                        i3 = i2;
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        i3 = i2;
                        throw new zzb(i3, this.zzb, 1, (Throwable) e);
                    }
                }
                i = i3 + 1;
                try {
                    this.zza[i3] = (byte) j;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i3 = i;
                    throw new zzb(i3, this.zzb, 1, (Throwable) e);
                }
            }
            this.zzc = i;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i) throws IOException {
            int i2 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                bArr[i2 + 3] = i >> Ascii.CAN;
                this.zzc = i2 + 4;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(i2, this.zzb, 4, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i) throws IOException {
            if (i >= 0) {
                zzn(i);
            } else {
                zzj(i);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzn(int i) throws IOException {
            int i2;
            int i3 = this.zzc;
            while ((i & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                    try {
                        this.zza[i3] = (byte) (i | UserVerificationMethods.USER_VERIFY_PATTERN);
                        i >>>= 7;
                        i3 = i2;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i2;
                        throw new zzb(i3, this.zzb, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    throw new zzb(i3, this.zzb, 1, (Throwable) e);
                }
            }
            i2 = i3 + 1;
            this.zza[i3] = (byte) i;
            this.zzc = i2;
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.zza, this.zzc, i2);
                this.zzc += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(this.zzc, this.zzb, i2, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(long j) throws IOException {
            int i = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                bArr[i + 7] = (byte) (j >> 56);
                this.zzc = i + 8;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(i, this.zzb, 8, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i, int i2) throws IOException {
            zzk(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i, boolean z) throws IOException {
            zzk(i, 0);
            zzb(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i, zzajp zzajpVar) throws IOException {
            zzk(i, 2);
            zzb(zzajpVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzn(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i, zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzk(i, 2);
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i, int i2) throws IOException {
            zzn((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzajp zzajpVar) throws IOException {
            zzn(zzajpVar.zzb());
            zzajpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(zzamc zzamcVar) throws IOException {
            zzn(zzamcVar.zzl());
            zzamcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i, zzamc zzamcVar) throws IOException {
            zzk(1, 3);
            zzl(2, i);
            zzk(3, 2);
            zzc(zzamcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i, long j) throws IOException {
            zzk(i, 0);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i, String str) throws IOException {
            zzk(i, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(String str) throws IOException {
            int i = this.zzc;
            try {
                int zzj = zzakg.zzj(str.length() * 3);
                int zzj2 = zzakg.zzj(str.length());
                if (zzj2 == zzj) {
                    int i2 = i + zzj2;
                    this.zzc = i2;
                    int zza = zzant.zza(str, this.zza, i2, zza());
                    this.zzc = i;
                    zzn((zza - i) - zzj2);
                    this.zzc = zza;
                    return;
                }
                zzn(zzant.zza(str));
                this.zzc = zzant.zza(str, this.zza, this.zzc, zza());
            } catch (zzanx e) {
                this.zzc = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zzb(int i, int i2) {
        return zzg(i2) + zzj(i << 3);
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zzd(int i) {
        return 4;
    }

    public static int zze(long j) {
        return 8;
    }

    public static int zzf(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzg(int i) {
        return 4;
    }

    public static int zzh(int i) {
        return zzj(zza(i));
    }

    public static int zzi(int i) {
        return zzj(i << 3);
    }

    public static int zzj(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzb(int i, zzamc zzamcVar) throws IOException;

    public abstract void zzb(int i, String str) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(zzajp zzajpVar) throws IOException;

    public abstract void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc() throws IOException;

    public abstract void zzc(int i, zzajp zzajpVar) throws IOException;

    public abstract void zzc(int i, zzamc zzamcVar, zzamv zzamvVar) throws IOException;

    public abstract void zzc(zzamc zzamcVar) throws IOException;

    public abstract void zzd(int i, zzajp zzajpVar) throws IOException;

    public abstract void zzf(int i, long j) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzh(long j) throws IOException;

    public abstract void zzi(int i, int i2) throws IOException;

    public abstract void zzj(long j) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzk(int i, int i2) throws IOException;

    public abstract void zzl(int i) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public final void zzm(int i) throws IOException {
        zzn(zza(i));
    }

    public abstract void zzn(int i) throws IOException;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzd */
    /* loaded from: classes3.dex */
    public static final class zzd extends zza {
        private final OutputStream zzf;

        public zzd(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.zzf = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i) throws IOException {
            if (this.zzb - this.zzc < i) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte b) throws IOException {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc() throws IOException {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzd(int i, zzajp zzajpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i);
            zzc(3, zzajpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzf(int i, long j) throws IOException {
            zzo(18);
            zza(i, 1);
            zza(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i, int i2) throws IOException {
            zzo(14);
            zza(i, 5);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzi(int i, int i2) throws IOException {
            zzo(20);
            zza(i, 0);
            if (i2 >= 0) {
                zzb(i2);
            } else {
                zzb(i2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzj(long j) throws IOException {
            zzo(10);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i) throws IOException {
            zzo(4);
            zza(i);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i) throws IOException {
            if (i >= 0) {
                zzn(i);
            } else {
                zzj(i);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzn(int i) throws IOException {
            zzo(5);
            zzb(i);
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.zzb;
            int i4 = this.zzc;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.zza, i4, i2);
                this.zzc += i2;
            } else {
                int i5 = i3 - i4;
                System.arraycopy(bArr, i, this.zza, i4, i5);
                int i6 = i + i5;
                i2 -= i5;
                this.zzc = this.zzb;
                this.zzd += i5;
                zze();
                if (i2 <= this.zzb) {
                    System.arraycopy(bArr, i6, this.zza, 0, i2);
                    this.zzc = i2;
                } else {
                    this.zzf.write(bArr, i6, i2);
                }
            }
            this.zzd += i2;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i, int i2) throws IOException {
            zzn((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i, int i2) throws IOException {
            zzo(20);
            zza(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i, boolean z) throws IOException {
            zzo(11);
            zza(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(long j) throws IOException {
            zzo(8);
            zza(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i, long j) throws IOException {
            zzo(20);
            zza(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzn(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzajp zzajpVar) throws IOException {
            zzn(zzajpVar.zzb());
            zzajpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i, zzamc zzamcVar) throws IOException {
            zzk(1, 3);
            zzl(2, i);
            zzk(3, 2);
            zzc(zzamcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i, zzajp zzajpVar) throws IOException {
            zzk(i, 2);
            zzb(zzajpVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i, zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzk(i, 2);
            zzb(zzamcVar, zzamvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i, String str) throws IOException {
            zzk(i, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(zzamc zzamcVar) throws IOException {
            zzn(zzamcVar.zzl());
            zzamcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(String str) throws IOException {
            int zza;
            try {
                int length = str.length() * 3;
                int zzj = zzakg.zzj(length);
                int i = zzj + length;
                int i2 = this.zzb;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzant.zza(str, bArr, 0, length);
                    zzn(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i > i2 - this.zzc) {
                    zze();
                }
                int zzj2 = zzakg.zzj(str.length());
                int i3 = this.zzc;
                try {
                    if (zzj2 == zzj) {
                        int i4 = i3 + zzj2;
                        this.zzc = i4;
                        int zza3 = zzant.zza(str, this.zza, i4, this.zzb - i4);
                        this.zzc = i3;
                        zza = (zza3 - i3) - zzj2;
                        zzb(zza);
                        this.zzc = zza3;
                    } else {
                        zza = zzant.zza(str);
                        zzb(zza);
                        this.zzc = zzant.zza(str, this.zza, this.zzc, zza);
                    }
                    this.zzd += zza;
                } catch (zzanx e) {
                    this.zzd -= this.zzc - i3;
                    this.zzc = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new zzb(e2);
                }
            } catch (zzanx e3) {
                zza(str, e3);
            }
        }
    }

    private zzakg() {
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zzc(int i) {
        return zzg(i);
    }

    public static int zze(int i) {
        return zzg(i);
    }

    public static int zzf(int i, int i2) {
        return zzj(zza(i2)) + zzj(i << 3);
    }

    public static int zzg(int i, int i2) {
        return zzj(i2) + zzj(i << 3);
    }

    public final void zzi(long j) throws IOException {
        zzj(zza(j));
    }

    public final void zzj(int i, int i2) throws IOException {
        zzl(i, zza(i2));
    }

    private static int zza(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zzb(int i, long j) {
        return zzg(j) + zzj(i << 3);
    }

    public static int zzc(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    public static int zzd(int i, int i2) {
        return zzg(i2) + zzj(i << 3);
    }

    public static int zze(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zzc(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zze(int i, long j) {
        return zzg(j) + zzj(i << 3);
    }

    public static int zzf(long j) {
        return zzg(zza(j));
    }

    public static int zzg(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    private static long zza(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzb(int i, zzalk zzalkVar) {
        int zzj = zzj(i << 3);
        int zza2 = zzalkVar.zza();
        return zzj(zza2) + zza2 + zzj;
    }

    public static int zzd(long j) {
        return zzg(j);
    }

    public final void zzg(int i, long j) throws IOException {
        zzh(i, zza(j));
    }

    public static int zza(int i, boolean z) {
        return zzj(i << 3) + 1;
    }

    public static int zzd(int i, long j) {
        return zzg(zza(j)) + zzj(i << 3);
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i, zzamc zzamcVar, zzamv zzamvVar) {
        return zza(zzamcVar, zzamvVar) + zzj(i << 3);
    }

    public static int zza(int i, zzajp zzajpVar) {
        int zzj = zzj(i << 3);
        int zzb2 = zzajpVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zzb(zzamc zzamcVar) {
        int zzl = zzamcVar.zzl();
        return zzj(zzl) + zzl;
    }

    public static int zza(zzajp zzajpVar) {
        int zzb2 = zzajpVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzb(int i, zzajp zzajpVar) {
        int zzg = zzg(2, i);
        return zza(3, zzajpVar) + zzg + (zzj(8) << 1);
    }

    public static int zza(int i, double d) {
        return zzj(i << 3) + 8;
    }

    public static int zza(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static zzakg zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zza(int i, float f) {
        return zzj(i << 3) + 4;
    }

    @Deprecated
    public static int zza(int i, zzamc zzamcVar, zzamv zzamvVar) {
        return ((zzajf) zzamcVar).zza(zzamvVar) + (zzj(i << 3) << 1);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(zzamc zzamcVar) {
        return zzamcVar.zzl();
    }

    public final void zzb(boolean z) throws IOException {
        zzb(z ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i, zzalk zzalkVar) {
        int zzg = zzg(2, i);
        return zzb(3, zzalkVar) + zzg + (zzj(8) << 1);
    }

    public final void zzb(int i, double d) throws IOException {
        zzf(i, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) throws IOException {
        zzh(Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i, float f) throws IOException {
        zzh(i, Float.floatToRawIntBits(f));
    }

    public static int zza(zzalk zzalkVar) {
        int zza2 = zzalkVar.zza();
        return zzj(zza2) + zza2;
    }

    public final void zzb(float f) throws IOException {
        zzk(Float.floatToRawIntBits(f));
    }

    public static int zza(int i, zzamc zzamcVar) {
        return zzb(zzamcVar) + zzj(24) + zzg(2, i) + (zzj(8) << 1);
    }

    public static int zza(zzamc zzamcVar, zzamv zzamvVar) {
        int zza2 = ((zzajf) zzamcVar).zza(zzamvVar);
        return zzj(zza2) + zza2;
    }

    public static int zza(int i, String str) {
        return zza(str) + zzj(i << 3);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzant.zza(str);
        } catch (zzanx unused) {
            length = str.getBytes(zzalb.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzakg zza(OutputStream outputStream, int i) {
        return new zzd(outputStream, i);
    }

    public final void zza(String str, zzanx zzanxVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzanxVar);
        byte[] bytes = str.getBytes(zzalb.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }
}
