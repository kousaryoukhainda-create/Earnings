package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzam {
    public final Uri zza;
    public final String zzb;
    public final zzaj zzc;
    public final zzae zzd;
    public final List zze;
    public final String zzf;
    public final zzfxn zzg;
    public final Object zzh;
    public final long zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzam(Uri uri, String str, zzaj zzajVar, zzae zzaeVar, List list, String str2, zzfxn zzfxnVar, Object obj, long j, zzaq zzaqVar) {
        this.zza = uri;
        int i = zzbb.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfxnVar;
        zzfxk zzfxkVar = new zzfxk();
        if (zzfxnVar.size() <= 0) {
            zzfxkVar.zzi();
            this.zzh = null;
            this.zzi = -9223372036854775807L;
            return;
        }
        zzap zzapVar = (zzap) zzfxnVar.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        zzam zzamVar = (zzam) obj;
        if (this.zza.equals(zzamVar.zza) && this.zze.equals(zzamVar.zze) && this.zzg.equals(zzamVar.zzg)) {
            Object obj2 = -9223372036854775807L;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zze.hashCode();
        return (int) ((((this.zzg.hashCode() + ((hashCode + (this.zza.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
