package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmt  reason: invalid package */
/* loaded from: classes3.dex */
final /* synthetic */ class zzmt {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[zzzc.values().length];
        zza = iArr;
        try {
            iArr[zzzc.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzzc.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[zzzc.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
