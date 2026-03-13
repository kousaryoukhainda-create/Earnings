package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes3.dex */
final class zzazm implements Comparator {
    public zzazm(zzazo zzazoVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazs zzazsVar = (zzazs) obj;
        zzazs zzazsVar2 = (zzazs) obj2;
        int i = zzazsVar.zzc - zzazsVar2.zzc;
        if (i != 0) {
            return i;
        }
        return Long.compare(zzazsVar.zza, zzazsVar2.zza);
    }
}
