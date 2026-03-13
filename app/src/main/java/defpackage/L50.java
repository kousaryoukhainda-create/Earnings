package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* renamed from: L50  reason: default package */
/* loaded from: classes.dex */
public abstract class L50 {
    public L50 addOnCanceledListener(VP vp) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public L50 addOnCompleteListener(WP wp) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract L50 addOnFailureListener(InterfaceC0846aQ interfaceC0846aQ);

    public abstract L50 addOnSuccessListener(InterfaceC1613iQ interfaceC1613iQ);

    public <TContinuationResult> L50 continueWith(InterfaceC2954vi interfaceC2954vi) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> L50 continueWithTask(InterfaceC2954vi interfaceC2954vi) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> L50 onSuccessTask(U40 u40) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public L50 addOnCanceledListener(Activity activity, VP vp) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public L50 addOnCompleteListener(Activity activity, WP wp) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> L50 continueWith(Executor executor, InterfaceC2954vi interfaceC2954vi) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> L50 continueWithTask(Executor executor, InterfaceC2954vi interfaceC2954vi) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> L50 onSuccessTask(Executor executor, U40 u40) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public L50 addOnCanceledListener(Executor executor, VP vp) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public L50 addOnCompleteListener(Executor executor, WP wp) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
