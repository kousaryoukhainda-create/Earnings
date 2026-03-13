package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
final class zzgj extends zzfxd {
    private final Map zza;

    public zzgj(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean containsValue(Object obj) {
        return zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final Set entrySet() {
        return zzfzp.zzc(this.zza.entrySet(), new zzfuo() { // from class: com.google.android.gms.internal.ads.zzgh
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final boolean zza(Object obj) {
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && zze(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final int hashCode() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final Set keySet() {
        return zzfzp.zzc(this.zza.keySet(), new zzfuo() { // from class: com.google.android.gms.internal.ads.zzgi
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, com.google.android.gms.internal.ads.zzfxe
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    public final Map zzb() {
        return this.zza;
    }
}
