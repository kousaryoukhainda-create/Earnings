package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: r5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2558r5 implements Runnable {
    public static Handler i;
    public boolean g;
    public final /* synthetic */ AbstractC2644s5 h;
    public volatile int c = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean f = new AtomicBoolean();
    public final YM b = new YM(this, new XM(this, 0));

    public RunnableC2558r5(AbstractC2644s5 abstractC2644s5) {
        this.h = abstractC2644s5;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (RunnableC2558r5.class) {
            try {
                if (i == null) {
                    i = new Handler(Looper.getMainLooper());
                }
                handler = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new RunnableC1881jA(this, false, obj, 11));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g = false;
        this.h.executePendingTask();
    }
}
