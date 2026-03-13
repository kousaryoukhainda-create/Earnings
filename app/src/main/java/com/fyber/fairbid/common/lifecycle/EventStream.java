package com.fyber.fairbid.common.lifecycle;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class EventStream<V> {
    public final LinkedHashMap a = new LinkedHashMap();
    public int b = 0;
    public final SettableFuture<V> c = SettableFuture.create();
    public V d = null;

    /* loaded from: classes.dex */
    public interface EventListener<V> {
        void onEvent(V v);
    }

    /* loaded from: classes.dex */
    public class a implements EventListener<V> {
        public a() {
        }

        @Override // com.fyber.fairbid.common.lifecycle.EventStream.EventListener
        public final void onEvent(V v) {
            EventStream.this.sendEvent(v);
        }
    }

    public static <V> void bind(EventStream<V> eventStream, EventStream<V> eventStream2, Executor executor) {
        eventStream.addListener(new a(), executor);
    }

    public static <V> EventStream<V> create() {
        return new EventStream<>();
    }

    public synchronized void addListener(EventListener<V> eventListener, Executor executor) {
        this.a.put(eventListener, executor);
        if (this.b > 0) {
            executor.execute(new W1(26, this, eventListener));
        }
    }

    public int getEventsCount() {
        return this.b;
    }

    public SettableFuture<V> getFirstEventFuture() {
        return this.c;
    }

    public synchronized void removeListener(EventListener<V> eventListener) {
        this.a.remove(eventListener);
    }

    public synchronized void sendEvent(V v) {
        try {
            if (this.b == 0) {
                this.c.set(v);
            }
            this.d = v;
            this.b++;
            for (Map.Entry entry : this.a.entrySet()) {
                ((Executor) entry.getValue()).execute(new W1(25, entry, v));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(EventListener eventListener) {
        eventListener.onEvent(this.d);
    }
}
