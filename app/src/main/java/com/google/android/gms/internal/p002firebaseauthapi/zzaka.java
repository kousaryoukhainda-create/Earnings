package com.google.android.gms.internal.p002firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaka  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaka extends zzakb {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final int zzaa() throws IOException {
        int i;
        int i2 = this.zzg;
        int i3 = this.zze;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzg = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << Ascii.SO) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << Ascii.FS)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzg = i5;
                return i;
            }
        }
        return (int) zzm();
    }

    private final long zzab() throws IOException {
        int i = this.zzg;
        if (this.zze - i >= 8) {
            byte[] bArr = this.zzd;
            this.zzg = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzalf.zzj();
    }

    private final long zzac() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.zzg;
        int i2 = this.zze;
        if (i2 != i) {
            byte[] bArr = this.zzd;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzg = i3;
                return b;
            } else if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << Ascii.SO) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                        if (i9 < 0) {
                            i4 = i8;
                            j = (-2080896) ^ i9;
                        } else {
                            long j4 = i9;
                            i4 = i + 5;
                            long j5 = j4 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i4] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i4] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i11;
                                                }
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                                i4 = i10;
                            }
                            j = j5 ^ j3;
                        }
                    }
                }
                this.zzg = i4;
                return j;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i = this.zze + this.zzf;
        this.zze = i;
        int i2 = i - this.zzh;
        int i3 = this.zzj;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzf = i4;
            this.zze = i - i4;
            return;
        }
        this.zzf = 0;
    }

    private final byte zzy() throws IOException {
        int i = this.zzg;
        if (i != this.zze) {
            byte[] bArr = this.zzd;
            this.zzg = i + 1;
            return bArr[i];
        }
        throw zzalf.zzj();
    }

    private final int zzz() throws IOException {
        int i = this.zzg;
        if (this.zze - i >= 4) {
            byte[] bArr = this.zzd;
            this.zzg = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzab());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzd() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zze() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzf() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzg() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzh() throws IOException {
        return zzakb.zze(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int zzaa = zzaa();
        this.zzi = zzaa;
        if ((zzaa >>> 3) != 0) {
            return zzaa;
        }
        throw zzalf.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzj() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzk() throws IOException {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzl() throws IOException {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzm() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzy = zzy();
            j |= (zzy & Ascii.DEL) << i;
            if ((zzy & 128) == 0) {
                return j;
            }
        }
        throw zzalf.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzn() throws IOException {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzo() throws IOException {
        return zzakb.zza(zzac());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzp() throws IOException {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final zzajp zzq() throws IOException {
        byte[] bArr;
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzaa <= i - i2) {
                zzajp zza = zzajp.zza(this.zzd, i2, zzaa);
                this.zzg += zzaa;
                return zza;
            }
        }
        if (zzaa == 0) {
            return zzajp.zza;
        }
        if (zzaa > 0) {
            int i3 = this.zze;
            int i4 = this.zzg;
            if (zzaa <= i3 - i4) {
                int i5 = zzaa + i4;
                this.zzg = i5;
                bArr = Arrays.copyOfRange(this.zzd, i4, i5);
                return zzajp.zzb(bArr);
            }
        }
        if (zzaa <= 0) {
            if (zzaa == 0) {
                bArr = zzalb.zzb;
                return zzajp.zzb(bArr);
            }
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzr() throws IOException {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzaa <= i - i2) {
                String str = new String(this.zzd, i2, zzaa, zzalb.zza);
                this.zzg += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa < 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzs() throws IOException {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzaa <= i - i2) {
                String zzb = zzant.zzb(this.zzd, i2, zzaa);
                this.zzg += zzaa;
                return zzb;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa <= 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzt() throws IOException {
        if (this.zzg == this.zze) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzu() throws IOException {
        if (zzac() != 0) {
            return true;
        }
        return false;
    }

    private zzaka(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzj = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i2 + i;
        this.zzg = i;
        this.zzh = i;
    }

    private final void zzf(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (i <= i2 - i3) {
                this.zzg = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zza(int i) throws zzalf {
        if (i >= 0) {
            int zzc = i + zzc();
            if (zzc >= 0) {
                int i2 = this.zzj;
                if (zzc <= i2) {
                    this.zzj = zzc;
                    zzad();
                    return i2;
                }
                throw zzalf.zzj();
            }
            throw zzalf.zzi();
        }
        throw zzalf.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzb(int i) throws zzalf {
        if (this.zzi != i) {
            throw zzalf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzc(int i) {
        this.zzj = i;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzd(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zze - this.zzg >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzd;
                    int i4 = this.zzg;
                    this.zzg = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzalf.zze();
            }
            while (i3 < 10) {
                if (zzy() < 0) {
                    i3++;
                }
            }
            throw zzalf.zze();
            return true;
        } else if (i2 == 1) {
            zzf(8);
            return true;
        } else if (i2 == 2) {
            zzf(zzaa());
            return true;
        } else if (i2 == 3) {
            zzx();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            zzw();
            return false;
        } else if (i2 == 5) {
            zzf(4);
            return true;
        } else {
            throw zzalf.zza();
        }
    }
}
