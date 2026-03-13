package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes3.dex */
final class zzgbk extends zzgbi {
    private zzgbk() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final int zza(zzgbm zzgbmVar) {
        int i;
        int i2;
        synchronized (zzgbmVar) {
            i = zzgbmVar.remaining;
            i2 = i - 1;
            zzgbmVar.remaining = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzb(zzgbm zzgbmVar, Set set, Set set2) {
        Set set3;
        synchronized (zzgbmVar) {
            try {
                set3 = zzgbmVar.seenExceptions;
                if (set3 == null) {
                    zzgbmVar.seenExceptions = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzgbk(zzgbl zzgblVar) {
        super(null);
    }
}
