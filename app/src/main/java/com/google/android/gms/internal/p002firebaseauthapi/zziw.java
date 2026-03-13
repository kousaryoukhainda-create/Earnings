package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziw  reason: invalid package */
/* loaded from: classes3.dex */
final class zziw implements zziv {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zziw(boolean z) {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zziv
    public final boolean zza() {
        return this.zza.get();
    }
}
