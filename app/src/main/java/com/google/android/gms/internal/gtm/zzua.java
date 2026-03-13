package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzua extends zztz {
    protected final byte[] zza;

    public zzua(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzud) || zzd() != ((zzud) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzua) {
            zzua zzuaVar = (zzua) obj;
            int zzk = zzk();
            int zzk2 = zzuaVar.zzk();
            if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzuaVar.zzd()) {
                if (zzd <= zzuaVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzuaVar.zza;
                    zzuaVar.zzc();
                    int i = 0;
                    int i2 = 0;
                    while (i < zzd) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(AbstractC0324Hi.d(zzd, zzuaVar.zzd(), "Ran off end of other: 0, ", ", "));
            }
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final int zze(int i, int i2, int i3) {
        return zzye.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final zzud zzf(int i, int i2) {
        int zzj = zzud.zzj(0, i2, zzd());
        if (zzj == 0) {
            return zzud.zzb;
        }
        return new zztx(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final void zzh(zztt zzttVar) throws IOException {
        zzttVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final boolean zzi() {
        return zzaaz.zzf(this.zza, 0, zzd());
    }
}
