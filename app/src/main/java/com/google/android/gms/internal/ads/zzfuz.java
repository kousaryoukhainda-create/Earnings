package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfuz implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfvc zzb;

    public zzfuz(zzfvc zzfvcVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvcVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfuf.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
