package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class zzaqx extends zzhec implements Closeable {
    static {
        zzhej.zzb(zzaqx.class);
    }

    public zzaqx(zzhed zzhedVar, zzaqw zzaqwVar) throws IOException {
        zze(zzhedVar, zzhedVar.zzc(), zzaqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
