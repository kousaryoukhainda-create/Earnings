package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;
/* renamed from: QV  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class QV implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ RemoteConfigManager b;

    public /* synthetic */ QV(RemoteConfigManager remoteConfigManager) {
        this.b = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        RemoteConfigManager.a(this.b, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        RemoteConfigManager.b(this.b, (Boolean) obj);
    }
}
