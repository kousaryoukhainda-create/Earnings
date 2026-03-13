package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
/* renamed from: Av  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0155Av extends AbstractBinderC3316zv {
    public final TaskCompletionSource b;

    public BinderC0155Av(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // defpackage.AbstractBinderC3316zv, defpackage.InterfaceC3000wC
    public final void d(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
        TaskUtil.setResultOrApiException(status, shortDynamicLinkImpl, this.b);
    }
}
