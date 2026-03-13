package com.google.android.gms.internal.gtm;

import java.util.Comparator;
/* loaded from: classes3.dex */
final class zztv implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzud zzudVar = (zzud) obj;
        zzud zzudVar2 = (zzud) obj2;
        zztu zztuVar = new zztu(zzudVar);
        zztu zztuVar2 = new zztu(zzudVar2);
        while (zztuVar.hasNext() && zztuVar2.hasNext()) {
            int compareTo = Integer.valueOf(zztuVar.zza() & 255).compareTo(Integer.valueOf(zztuVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzudVar.zzd()).compareTo(Integer.valueOf(zzudVar2.zzd()));
    }
}
