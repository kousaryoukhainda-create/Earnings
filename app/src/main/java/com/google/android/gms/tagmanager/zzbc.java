package com.google.android.gms.tagmanager;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbc {
    final String zza;
    final byte[] zzb;

    public zzbc(String str, byte[] bArr) {
        this.zza = str;
        this.zzb = bArr;
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.zzb);
        return "KeyAndSerialized: key = " + this.zza + " serialized hash = " + hashCode;
    }
}
