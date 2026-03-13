package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajo  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzajo extends zzajq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzajp zzc;

    public zzajo(zzajp zzajpVar) {
        this.zzc = zzajpVar;
        this.zzb = zzajpVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final byte zza() {
        int i = this.zza;
        if (i < this.zzb) {
            this.zza = i + 1;
            return this.zzc.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
