package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* renamed from: Ke0  reason: default package */
/* loaded from: classes.dex */
public final class Ke0 {
    public static final String e = EI.e("WorkTimer");
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    /* JADX WARN: Type inference failed for: r0v0, types: [He0, java.lang.Object, java.util.concurrent.ThreadFactory] */
    public Ke0() {
        ?? obj = new Object();
        obj.a = 0;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(obj);
    }

    public final void a(String str, C0434Lo c0434Lo) {
        synchronized (this.d) {
            EI c = EI.c();
            String str2 = e;
            c.a(str2, "Starting timer for " + str, new Throwable[0]);
            b(str);
            Je0 je0 = new Je0(this, str);
            this.b.put(str, je0);
            this.c.put(str, c0434Lo);
            this.a.schedule(je0, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            try {
                if (((Je0) this.b.remove(str)) != null) {
                    EI c = EI.c();
                    String str2 = e;
                    c.a(str2, "Stopping timer for " + str, new Throwable[0]);
                    this.c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
