package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: Jg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0374Jg implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public ThreadFactoryC0374Jg(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder l = AbstractC0324Hi.l(str);
        l.append(this.a.incrementAndGet());
        return new Thread(runnable, l.toString());
    }
}
