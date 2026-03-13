package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
/* renamed from: Cv  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0207Cv extends AbstractBinderC3316zv {
    public final TaskCompletionSource b;
    public final YT c;

    public BinderC0207Cv(YT yt, TaskCompletionSource taskCompletionSource) {
        this.c = yt;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.AbstractBinderC3316zv, defpackage.InterfaceC3000wC
    public final void c(Status status, DynamicLinkData dynamicLinkData) {
        WQ wq;
        J2 j2;
        if (dynamicLinkData == null) {
            wq = null;
        } else {
            wq = new WQ(dynamicLinkData);
        }
        TaskUtil.setResultOrApiException(status, wq, this.b);
        if (dynamicLinkData == null) {
            return;
        }
        Bundle bundle = dynamicLinkData.g;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle.getBundle("scionData");
        if (bundle2 == null || bundle2.keySet() == null || (j2 = (J2) this.c.get()) == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            ((K2) j2).a("fdl", str, bundle2.getBundle(str));
        }
    }
}
