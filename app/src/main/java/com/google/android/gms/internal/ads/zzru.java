package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
final class zzru extends zzhh {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzru() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzhh, com.google.android.gms.internal.ads.zzhb
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzm() {
        return this.zzh;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final void zzo(int i) {
        this.zzi = i;
    }

    public final boolean zzp(zzhh zzhhVar) {
        ByteBuffer byteBuffer;
        zzcw.zzd(!zzhhVar.zzd(1073741824));
        zzcw.zzd(!zzhhVar.zzd(268435456));
        zzcw.zzd(!zzhhVar.zzd(4));
        if (zzq()) {
            if (this.zzh < this.zzi) {
                ByteBuffer byteBuffer2 = zzhhVar.zzc;
                if (byteBuffer2 != null && (byteBuffer = this.zzc) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i = this.zzh;
        this.zzh = i + 1;
        if (i == 0) {
            this.zze = zzhhVar.zze;
            if (zzhhVar.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhhVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhhVar.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}
