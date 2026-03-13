package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzar  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzar<E> extends zzaj<E> {
    static final zzaj<Object> zza = new zzar(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzar(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzw.zza(i, this.zzc);
        E e = (E) this.zzb[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaj, com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final Object[] zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final int zza() {
        return this.zzc;
    }
}
