package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: zh0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3297zh0 {
    public static final ExecutorService a;
    public static final ExecutorService b;
    public static final Rh0 c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = Executors.newFixedThreadPool(availableProcessors, new ThreadFactoryC2438ph0("io", 1));
        b = Executors.newSingleThreadExecutor(new ThreadFactoryC2438ph0("diskIO", 1));
        Executors.newScheduledThreadPool(availableProcessors, new ThreadFactoryC2438ph0("scheduled", 1));
        c = new Rh0(0);
    }
}
