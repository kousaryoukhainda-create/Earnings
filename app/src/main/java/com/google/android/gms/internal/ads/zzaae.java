package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzaae implements zzca {
    public static final /* synthetic */ int zza = 0;

    static {
        zzfvj.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzaad
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                int i = zzaae.zza;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    if (invoke != null) {
                        return (zzca) invoke;
                    }
                    throw null;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    private zzaae() {
        throw null;
    }

    public /* synthetic */ zzaae(zzaag zzaagVar) {
    }
}
