package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes3.dex */
public final class zzfyd {
    public static ArrayList zza(int i) {
        zzfwk.zza(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List zzb(List list, zzfuc zzfucVar) {
        if (list instanceof RandomAccess) {
            return new zzfya(list, zzfucVar);
        }
        return new zzfyc(list, zzfucVar);
    }
}
