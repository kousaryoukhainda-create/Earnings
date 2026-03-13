package com.google.android.gms.analytics;

import java.util.Comparator;
/* loaded from: classes3.dex */
final class zzf implements Comparator {
    public zzf(zzg zzgVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzj) obj).getClass().getCanonicalName().compareTo(((zzj) obj2).getClass().getCanonicalName());
    }
}
