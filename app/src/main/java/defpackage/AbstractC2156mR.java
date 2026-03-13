package defpackage;

import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
/* renamed from: mR  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2156mR {
    private static final Logger zza = new Logger("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken);

    public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

    public abstract void onVerificationFailed(C0285Fv c0285Fv);
}
