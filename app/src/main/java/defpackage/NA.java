package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: NA  reason: default package */
/* loaded from: classes.dex */
public final class NA implements InterfaceC1328f40 {
    public final Ia0 a;
    public final TaskCompletionSource b;

    public NA(Ia0 ia0, TaskCompletionSource taskCompletionSource) {
        this.a = ia0;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.InterfaceC1328f40
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.InterfaceC1328f40
    public final boolean b(P8 p8) {
        if (p8.b == 4 && !this.a.a(p8)) {
            String str = p8.c;
            if (str != null) {
                this.b.setResult(new G8(str, p8.e, p8.f));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
