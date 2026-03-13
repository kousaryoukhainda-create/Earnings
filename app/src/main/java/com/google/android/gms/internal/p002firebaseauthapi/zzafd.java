package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafd  reason: invalid package */
/* loaded from: classes3.dex */
final class zzafd implements zzafe {
    private final /* synthetic */ String zza;

    public zzafd(zzaez zzaezVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(AbstractC2156mR abstractC2156mR, Object... objArr) {
        abstractC2156mR.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
