package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafs  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzafs extends AbstractC2156mR {
    private final /* synthetic */ AbstractC2156mR zza;
    private final /* synthetic */ String zzb;

    public zzafs(AbstractC2156mR abstractC2156mR, String str) {
        this.zza = abstractC2156mR;
        this.zzb = str;
    }

    @Override // defpackage.AbstractC2156mR
    public final void onCodeAutoRetrievalTimeOut(@NonNull String str) {
        zzaft.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // defpackage.AbstractC2156mR
    public final void onCodeSent(@NonNull String str, @NonNull PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        this.zza.onCodeSent(str, phoneAuthProvider$ForceResendingToken);
    }

    @Override // defpackage.AbstractC2156mR
    public final void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // defpackage.AbstractC2156mR
    public final void onVerificationFailed(@NonNull C0285Fv c0285Fv) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationFailed(c0285Fv);
    }
}
