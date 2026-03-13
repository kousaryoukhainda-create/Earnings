package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzts {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzfx zzc;

    public zzts(zzacs zzacsVar, zzakd zzakdVar) {
    }

    public final void zza(zzfx zzfxVar) {
        if (zzfxVar != this.zzc) {
            this.zzc = zzfxVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
