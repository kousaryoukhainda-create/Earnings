package com.fyber.fairbid.common.concurrency;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class PauseSignal {
    public final String a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public long d = 0;
    public long e = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(PauseSignal pauseSignal);

        void b(PauseSignal pauseSignal);
    }

    public PauseSignal(String str) {
        this.a = str;
    }

    public final void a(a aVar) {
        this.c.add(aVar);
    }
}
