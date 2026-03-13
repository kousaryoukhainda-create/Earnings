package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqq implements zzpj {
    final /* synthetic */ zzqs zza;

    public /* synthetic */ zzqq(zzqs zzqsVar, zzqr zzqrVar) {
        this.zza = zzqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zza(Exception exc) {
        zzdo.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzqs.zzae(this.zza).zzb(exc);
    }
}
