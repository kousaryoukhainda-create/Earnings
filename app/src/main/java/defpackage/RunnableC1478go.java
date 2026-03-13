package defpackage;

import androidx.fragment.app.E;
import androidx.fragment.app.h;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: go  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1478go implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ h c;
    public final /* synthetic */ E d;

    public /* synthetic */ RunnableC1478go(h hVar, E e, int i) {
        this.b = i;
        this.c = hVar;
        this.d = e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                h this$0 = this.c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                E operation = this.d;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                this$0.a(operation);
                return;
            default:
                h this$02 = this.c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                E operation2 = this.d;
                Intrinsics.checkNotNullParameter(operation2, "$operation");
                this$02.b.remove(operation2);
                this$02.c.remove(operation2);
                return;
        }
    }
}
