package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
final class zzyq extends zzyu {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzyq(zzyp zzypVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzyn zzynVar;
        List arrayList;
        List list = (List) zzaau.zzf(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzyo) {
                arrayList = new zzyn(i);
            } else if ((list instanceof zzzo) && (list instanceof zzyd)) {
                arrayList = ((zzyd) list).zzd(i);
            } else {
                arrayList = new ArrayList(i);
            }
            zzaau.zzs(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzaau.zzs(obj, j, arrayList2);
            zzynVar = arrayList2;
        } else if (list instanceof zzaap) {
            zzyn zzynVar2 = new zzyn(list.size() + i);
            zzynVar2.addAll(zzynVar2.size(), (zzaap) list);
            zzaau.zzs(obj, j, zzynVar2);
            zzynVar = zzynVar2;
        } else if ((list instanceof zzzo) && (list instanceof zzyd)) {
            zzyd zzydVar = (zzyd) list;
            if (!zzydVar.zzc()) {
                zzyd zzd = zzydVar.zzd(list.size() + i);
                zzaau.zzs(obj, j, zzd);
                return zzd;
            }
            return list;
        } else {
            return list;
        }
        return zzynVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzaau.zzf(obj, j);
        if (list instanceof zzyo) {
            unmodifiableList = ((zzyo) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzzo) && (list instanceof zzyd)) {
                zzyd zzydVar = (zzyd) list;
                if (zzydVar.zzc()) {
                    zzydVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzaau.zzs(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzaau.zzf(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzaau.zzs(obj, j, list);
    }

    private zzyq() {
        super(null);
    }
}
