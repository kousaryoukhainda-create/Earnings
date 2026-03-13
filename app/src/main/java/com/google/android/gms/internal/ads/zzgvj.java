package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgvj extends ThreadLocal {
    final /* synthetic */ zzgvk zza;

    public zzgvj(zzgvk zzgvkVar) {
        this.zza = zzgvkVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzguw zzguwVar = zzguw.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzguwVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
