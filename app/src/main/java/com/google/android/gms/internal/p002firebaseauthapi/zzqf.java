package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqf  reason: invalid package */
/* loaded from: classes3.dex */
final class zzqf extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        return zzqg.zza();
    }
}
