package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Timer;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
/* renamed from: yh0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3211yh0 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final C2781th0 b = new C2781th0(1, 1, 1000, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC2364oo(1));
    public static final Timer c;

    static {
        StringBuilder b2 = Ki0.b("adjoe-waiter-");
        b2.append(Thread.currentThread().getName());
        c = new Timer(b2.toString());
    }
}
