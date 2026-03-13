package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzanv {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzanv(int i, String str, int i2, List list, byte[] bArr) {
        List unmodifiableList;
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zzd = unmodifiableList;
        this.zze = bArr;
    }

    public final int zza() {
        int i = this.zzc;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }
}
