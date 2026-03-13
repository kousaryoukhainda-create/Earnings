package com.fyber.inneractive.sdk.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public class m<T> {
    public final Queue<T> a = new ConcurrentLinkedQueue();
    public a<T> b;

    /* loaded from: classes.dex */
    public interface a<TT> {
        TT a();
    }

    public m(int i, a<T> aVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.offer(aVar.a());
        }
        this.b = aVar;
    }

    public T a() {
        T poll = this.a.poll();
        if (poll == null) {
            return this.b.a();
        }
        return poll;
    }
}
