package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.PhoneAuthCredential;
/* renamed from: nR  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2242nR extends AbstractC2152mN {
    public final PhoneAuthCredential a;

    public C2242nR(PhoneAuthCredential phoneAuthCredential) {
        Preconditions.checkNotNull(phoneAuthCredential);
        this.a = phoneAuthCredential;
    }
}
