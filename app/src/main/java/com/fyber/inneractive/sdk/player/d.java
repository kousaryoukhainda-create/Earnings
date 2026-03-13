package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: classes.dex */
public class d {
    public com.fyber.inneractive.sdk.player.controller.g a;
    public ScheduledThreadPoolExecutor b;
    public boolean d = false;
    public Runnable c = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.getClass();
            IAlog.a("player progress monitor: run started", new Object[0]);
            int c = dVar.a.c();
            if (!dVar.d) {
                IAlog.a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(c));
                if (c >= 2000) {
                    IAlog.a("run: setting played 2 seconds flag", new Object[0]);
                    dVar.d = true;
                }
            }
            dVar.a.a(c);
        }
    }

    public d(com.fyber.inneractive.sdk.player.controller.g gVar) {
        this.a = gVar;
    }
}
