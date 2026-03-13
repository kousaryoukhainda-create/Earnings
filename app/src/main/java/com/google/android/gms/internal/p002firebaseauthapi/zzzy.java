package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzy  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzzy extends ThreadLocal<Mac> {
    private final /* synthetic */ zzzv zza;

    public zzzy(zzzv zzzvVar) {
        this.zza = zzzvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzzd<zzzq, Mac> zzzdVar = zzzd.zzb;
            str = this.zza.zzc;
            Mac zza = zzzdVar.zza(str);
            key = this.zza.zzd;
            zza.init(key);
            return zza;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
