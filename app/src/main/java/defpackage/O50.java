package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: O50  reason: default package */
/* loaded from: classes.dex */
public final class O50 {
    public static final O50 c = new O50();
    public final ThreadPoolExecutor a;
    public final ExecutorC0149Ap b;

    public O50() {
        C2348of0 c2348of0 = C2348of0.b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C2348of0.c, C2348of0.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = threadPoolExecutor;
        this.b = C2348of0.b.a;
    }
}
