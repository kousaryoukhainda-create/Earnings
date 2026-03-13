package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: OA  reason: default package */
/* loaded from: classes.dex */
public final class OA implements InterfaceC1328f40 {
    public final TaskCompletionSource a;

    public OA(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.InterfaceC1328f40
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.InterfaceC1328f40
    public final boolean b(P8 p8) {
        int i = p8.b;
        if (i == 3 || i == 4 || i == 5) {
            this.a.trySetResult(p8.a);
            return true;
        }
        return false;
    }
}
