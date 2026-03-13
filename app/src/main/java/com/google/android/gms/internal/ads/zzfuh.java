package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes3.dex */
public final class zzfuh {
    private final String zza;
    private final zzfug zzb;
    private zzfug zzc;

    public /* synthetic */ zzfuh(String str, zzfui zzfuiVar) {
        zzfug zzfugVar = new zzfug();
        this.zzb = zzfugVar;
        this.zzc = zzfugVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfug zzfugVar = this.zzb.zzb;
        String str = "";
        while (zzfugVar != null) {
            Object obj = zzfugVar.zza;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzfugVar = zzfugVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfuh zza(Object obj) {
        zzfug zzfugVar = new zzfug();
        this.zzc.zzb = zzfugVar;
        this.zzc = zzfugVar;
        zzfugVar.zza = obj;
        return this;
    }
}
