package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagy  reason: invalid package */
/* loaded from: classes3.dex */
public enum zzagy {
    ACCESS_TOKEN("ACCESS_TOKEN"),
    ID_TOKEN(Constants.ID_TOKEN);
    
    private final String zzd;

    zzagy(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
