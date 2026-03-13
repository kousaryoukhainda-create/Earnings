package com.google.android.gms.internal.ads;

import java.util.Locale;
/* loaded from: classes3.dex */
public final class zzhs {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        int i5 = this.zze;
        int i6 = this.zzf;
        int i7 = this.zzg;
        int i8 = this.zzh;
        int i9 = this.zzi;
        int i10 = this.zzj;
        long j = this.zzk;
        int i11 = this.zzl;
        Locale locale = Locale.US;
        StringBuilder n = AbstractC2437ph.n("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        AbstractC2437ph.u(n, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        AbstractC2437ph.u(n, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        AbstractC2437ph.u(n, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        AbstractC2437ph.u(n, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        n.append(j);
        n.append("\n videoFrameProcessingOffsetCount=");
        n.append(i11);
        n.append("\n}");
        return n.toString();
    }

    public final synchronized void zza() {
    }
}
