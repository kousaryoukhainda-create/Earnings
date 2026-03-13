package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class zzxr extends zzxv implements zzzh {
    protected zzxk zza = zzxk.zze();

    private final void zzc(zzxt zzxtVar) {
        if (zzxtVar.zza == ((zzxv) zzb(6, null, null))) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public final zzxk zzT() {
        if (this.zza.zzl()) {
            this.zza = this.zza.clone();
        }
        return this.zza;
    }

    public final Object zzU(zzxd zzxdVar) {
        zzxt zzxtVar = (zzxt) zzxdVar;
        zzc(zzxtVar);
        Object zzf = this.zza.zzf(zzxtVar.zzd);
        if (zzf == null) {
            return zzxtVar.zzb;
        }
        zzxs zzxsVar = zzxtVar.zzd;
        if (zzxsVar.zzd) {
            if (zzxsVar.zzc.zza() == zzabb.ENUM) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) zzf) {
                    arrayList.add(zzxtVar.zza(obj));
                }
                return arrayList;
            }
            return zzf;
        }
        return zzxtVar.zza(zzf);
    }

    public final boolean zzV(zzxd zzxdVar) {
        zzxt zzxtVar = (zzxt) zzxdVar;
        zzc(zzxtVar);
        zzxk zzxkVar = this.zza;
        zzxs zzxsVar = zzxtVar.zzd;
        if (!zzxsVar.zzd) {
            if (zzxkVar.zza.get(zzxsVar) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }
}
