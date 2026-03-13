package com.google.android.gms.internal.p002firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabv  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzabv implements zzafn<zzahn> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzabv(zzaam zzaamVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zza.zza(Li0.d(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        zzafl zzaflVar;
        zzagm zzagmVar = new zzagm(zzahnVar.zzc());
        zzaflVar = this.zzb.zza;
        zzaflVar.zza(zzagmVar, new zzaby(this, this.zza, this));
    }
}
