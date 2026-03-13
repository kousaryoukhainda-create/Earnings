package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes3.dex */
final class zzfyn extends zzfyr {
    final /* synthetic */ Comparator zza;

    public zzfyn(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
