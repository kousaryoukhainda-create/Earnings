package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Gg0  reason: default package */
/* loaded from: classes2.dex */
public class Gg0 extends ScheduledThreadPoolExecutor {
    public final boolean b;
    public final C0479Ni c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Gg0(int r3, int r4) {
        /*
            r2 = this;
            r0 = r4 & 1
            r1 = 1
            if (r0 == 0) goto L6
            r3 = 1
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            Ni r4 = defpackage.C0479Ni.p
            r2.<init>(r3)
            r2.b = r1
            r2.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Gg0.<init>(int, int):void");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        super.afterExecute(runnable, th);
        if (this.b) {
            if (th == null && (runnable instanceof Future)) {
                try {
                    if (((Future) runnable).isDone()) {
                        ((Future) runnable).get();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException e) {
                    th = e;
                } catch (ExecutionException e2) {
                    th = e2.getCause();
                }
            }
            if (th != null) {
                this.c.invoke(th);
            }
        }
    }
}
