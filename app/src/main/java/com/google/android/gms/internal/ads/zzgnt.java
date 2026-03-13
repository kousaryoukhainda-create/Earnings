package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzgnt extends RuntimeException {
    public zzgnt(String str) {
        super(str);
    }

    public static Object zza(zzgns zzgnsVar) {
        try {
            return zzgnsVar.zza();
        } catch (Exception e) {
            throw new zzgnt(e);
        }
    }

    public zzgnt(String str, Throwable th) {
        super(str, th);
    }

    public zzgnt(Throwable th) {
        super(th);
    }
}
