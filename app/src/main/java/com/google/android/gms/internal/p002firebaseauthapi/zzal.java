package com.google.android.gms.internal.p002firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzal  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzal<E> extends zzad<E> {
    private final zzaj<E> zza;

    public zzal(zzaj<E> zzajVar, int i) {
        super(zzajVar.size(), i);
        this.zza = zzajVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzad
    public final E zza(int i) {
        return this.zza.get(i);
    }
}
