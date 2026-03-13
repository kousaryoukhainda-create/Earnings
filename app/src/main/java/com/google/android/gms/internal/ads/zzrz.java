package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes3.dex */
public final class zzrz {
    private final HashSet zza;
    private LoudnessCodecController zzb;

    public zzrz() {
        throw null;
    }

    public final void zza(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        zzcw.zzf(this.zza.add(mediaCodec));
    }

    public final void zzb() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.zza.remove(mediaCodec) && (loudnessCodecController = this.zzb) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void zzd(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        create = LoudnessCodecController.create(i, zzgcz.zzc(), new zzrw(this));
        this.zzb = create;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public zzrz(zzry zzryVar) {
        this.zza = new HashSet();
    }
}
