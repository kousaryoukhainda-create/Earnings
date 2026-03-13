package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafw  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzafw implements OnFailureListener {
    public zzafw(zzafu zzafuVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        Logger logger;
        logger = zzafu.zza;
        logger.e(AbstractC2437ph.g("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
