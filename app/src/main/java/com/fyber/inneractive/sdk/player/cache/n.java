package com.fyber.inneractive.sdk.player.cache;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.player.cache.c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class n implements c.e {
    public static final n f = new n();
    public Context a;
    public c b;
    public boolean c = false;
    public final List<String> d = new CopyOnWriteArrayList();
    public final Runnable e = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            File a = n.a(n.this.a, "fyb.vamp.vid.cache");
            if (a != null) {
                try {
                    IAlog.a("VideoCache opening the cache in directory - %s", a);
                    n.this.b = c.a(a, 0, 1, 52428800L);
                    c cVar = n.this.b;
                    cVar.getClass();
                    IAlog.d("DiskLruCache delete cache", new Object[0]);
                    cVar.close();
                    m.a(cVar.a);
                    n.this.b = c.a(a, 0, 1, 52428800L);
                    c cVar2 = n.this.b;
                    synchronized (cVar2) {
                        j = cVar2.h;
                    }
                    IAlog.a("VideoCache opened the cache in directory - %s current size is %d", a, Long.valueOf(j));
                    n nVar = n.this;
                    nVar.b.l = nVar;
                    nVar.c = true;
                    n.this.getClass();
                } catch (Throwable th) {
                    t.a("Failed to open cache directory", th.getMessage(), null, null);
                    IAlog.a("Failed to open cache directory", th, new Object[0]);
                }
            }
        }
    }

    public static File a(Context context, String str) {
        File externalCacheDir;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (p.a != null && p.b("android.permission.WRITE_EXTERNAL_STORAGE") && "mounted".equals(p.c())) {
            String c = p.c();
            if (("mounted".equals(c) || "mounted_ro".equals(c)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 52428800) {
                return new File(context.getExternalCacheDir(), str);
            }
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || cacheDir.getFreeSpace() <= 52428800) {
            return null;
        }
        return new File(context.getCacheDir(), str);
    }

    public boolean a() {
        return this.c && com.fyber.inneractive.sdk.util.t.a();
    }

    public boolean a(c cVar, String str) {
        for (String str2 : this.d) {
            if (str2.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
