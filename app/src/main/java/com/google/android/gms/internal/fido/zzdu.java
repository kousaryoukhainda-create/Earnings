package com.google.android.gms.internal.fido;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
/* loaded from: classes3.dex */
public final class zzdu implements Closeable {
    private final InputStream zza;
    private zzdt zzb;
    private final byte[] zzc = new byte[8];
    private final zzdv zzd = zzdv.zza();

    public zzdu(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() throws IOException {
        byte[] bArr;
        if (this.zzb.zza() < 24) {
            long zza = this.zzb.zza();
            this.zzb = null;
            return zza;
        } else if (this.zzb.zza() == 24) {
            int read = this.zza.read();
            if (read != -1) {
                this.zzb = null;
                return read & 255;
            }
            throw new EOFException();
        } else if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr2 = this.zzc;
            return ((bArr2[0] & 255) << 8) | (bArr2[1] & 255);
        } else if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            return (bArr[3] & 255) | ((bArr[1] & 255) << 16) | ((this.zzc[0] & 255) << 24) | ((bArr[2] & 255) << 8);
        } else if (this.zzb.zza() == 27) {
            zzk(this.zzc, 8);
            byte[] bArr3 = this.zzc;
            long j = bArr3[0];
            long j2 = bArr3[1];
            long j3 = bArr3[2];
            return (bArr3[7] & 255) | ((bArr3[6] & 255) << 8) | ((j2 & 255) << 48) | ((j & 255) << 56) | ((j3 & 255) << 40) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16);
        } else {
            throw new IOException(AbstractC0324Hi.d(this.zzb.zza(), this.zzb.zzc(), "invalid additional information ", " for major type "));
        }
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.zzb.zza() != 31) {
            return;
        }
        throw new IllegalStateException(AbstractC0324Hi.e(this.zzb.zza(), "expected definite length but found "));
    }

    private final void zzj(byte b) throws IOException {
        zzd();
        if (this.zzb.zzb() == b) {
            return;
        }
        throw new IllegalStateException(AbstractC0324Hi.d((b >> 5) & 7, this.zzb.zzc(), "expected major type ", " but found "));
    }

    private final void zzk(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int read = this.zza.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        this.zzb = null;
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long zzh = zzh();
        if (zzh >= 0 && zzh <= 2147483647L) {
            if (this.zza.available() >= zzh) {
                int i = (int) zzh;
                byte[] bArr = new byte[i];
                zzk(bArr, i);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        int i = (zzh > 0L ? 1 : (zzh == 0L ? 0 : -1));
        if (i >= 0) {
            if (i > 0) {
                this.zzd.zzg(zzh);
            }
            return zzh;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long zzb() throws IOException {
        boolean z;
        zzd();
        if (this.zzb.zzb() == 0) {
            z = true;
        } else if (this.zzb.zzb() == 32) {
            z = false;
        } else {
            throw new IllegalStateException(AbstractC0324Hi.e(this.zzb.zzc(), "expected major type 0 or 1 but found "));
        }
        long zzh = zzh();
        if (zzh >= 0) {
            if (z) {
                return zzh;
            }
            return ~zzh;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long zzc() throws IOException {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        int i = (zzh > 0L ? 1 : (zzh == 0L ? 0 : -1));
        if (i >= 0 && zzh <= 4611686018427387903L) {
            if (i > 0) {
                this.zzd.zzg(zzh + zzh);
            }
            return zzh;
        }
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    public final zzdt zzd() throws IOException {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            zzdt zzdtVar = new zzdt(read);
            this.zzb = zzdtVar;
            byte zzb = zzdtVar.zzb();
            if (zzb != Byte.MIN_VALUE && zzb != -96 && zzb != -64) {
                if (zzb != -32) {
                    if (zzb != 0 && zzb != 32) {
                        if (zzb != 64) {
                            if (zzb == 96) {
                                this.zzd.zze(-2L);
                            } else {
                                throw new IllegalStateException(AbstractC0324Hi.e(this.zzb.zzc(), "invalid major type: "));
                            }
                        } else {
                            this.zzd.zze(-1L);
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj((byte) -32);
        if (this.zzb.zza() <= 24) {
            int zzh = (int) zzh();
            if (zzh == 20) {
                return false;
            }
            if (zzh == 21) {
                return true;
            }
            throw new IllegalStateException("expected FALSE or TRUE");
        }
        throw new IllegalStateException("expected simple value");
    }

    public final byte[] zzg() throws IOException {
        zzj((byte) 64);
        return zzl();
    }
}
