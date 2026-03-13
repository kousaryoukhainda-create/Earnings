package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class a {
    private static final a f = new a();
    private final Object a = new Object();
    private boolean b = false;
    private final List<Runnable> c = new ArrayList();
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Runnable e = new RunnableC0123a();

    /* renamed from: com.huawei.hms.stats.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0123a implements Runnable {
        public RunnableC0123a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (!HiAnalyticsUtils.getInstance().getInitFlag()) {
                a.this.a();
            } else {
                a.this.b();
            }
        }
    }

    private a() {
    }

    public static a c() {
        return f;
    }

    public void a(Runnable runnable) {
        synchronized (this.a) {
            try {
                if (runnable == null) {
                    return;
                }
                if (this.b) {
                    return;
                }
                if (this.c.size() >= 60) {
                    return;
                }
                this.c.add(runnable);
                this.d.removeCallbacks(this.e);
                this.d.postDelayed(this.e, 10000L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.a) {
            HMSLog.i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.c.size());
            this.b = true;
            Iterator<Runnable> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().run();
                it.remove();
            }
            this.b = false;
        }
    }

    public void a() {
        synchronized (this.a) {
            HMSLog.i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.c.clear();
        }
    }
}
