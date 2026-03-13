package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.zzc;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaj  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaaj {
    @SafeParcelable.Field(getter = "getMfaPendingCredential", id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getMfaInfoList", id = 2)
    private List<zzahq> zzb;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 3)
    private zzc zzc;

    @SafeParcelable.Constructor
    public zzaaj(String str, List<zzahq> list, zzc zzcVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzcVar;
    }

    public final zzc zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return Mi0.e(this.zzb);
    }
}
