package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzt extends LinkedHashMap {
    final /* synthetic */ zzv zza;

    public zzt(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zza) {
            try {
                int size = size();
                zzv zzvVar = this.zza;
                i = zzvVar.zza;
                boolean z = false;
                if (size <= i) {
                    return false;
                }
                arrayDeque = zzvVar.zzf;
                arrayDeque.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                int size2 = size();
                i2 = this.zza.zza;
                if (size2 > i2) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
