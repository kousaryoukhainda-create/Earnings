package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: ug0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2865ug0 {
    public static final ExecutorService a;
    public static final ExecutorService b;
    public static final ScheduledExecutorService c;
    public static final Rh0 d;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = Executors.newFixedThreadPool(availableProcessors, new ThreadFactoryC2438ph0("io", 0));
        b = Executors.newSingleThreadExecutor(new ThreadFactoryC2438ph0("diskIO", 0));
        c = Executors.newScheduledThreadPool(availableProcessors, new ThreadFactoryC2438ph0("scheduled", 0));
        d = new Rh0(1);
    }
}
