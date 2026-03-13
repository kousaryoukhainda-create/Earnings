package com.applovin.impl;

import android.os.Handler;
import android.os.Message;
import com.applovin.impl.ia;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class wl implements ia {
    private static final List b = new ArrayList(50);
    private final Handler a;

    public wl(Handler handler) {
        this.a = handler;
    }

    @Override // com.applovin.impl.ia
    public void b(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.applovin.impl.ia
    public boolean c(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.applovin.impl.ia
    public ia.a d(int i) {
        return a().a(this.a.obtainMessage(i), this);
    }

    /* loaded from: classes.dex */
    public static final class b implements ia.a {
        private Message a;
        private wl b;

        private b() {
        }

        private void b() {
            this.a = null;
            this.b = null;
            wl.b(this);
        }

        public boolean a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) b1.a(this.a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        @Override // com.applovin.impl.ia.a
        public void a() {
            ((Message) b1.a(this.a)).sendToTarget();
            b();
        }

        public b a(Message message, wl wlVar) {
            this.a = message;
            this.b = wlVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b bVar) {
        List list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.ia
    public boolean a(int i) {
        return this.a.hasMessages(i);
    }

    @Override // com.applovin.impl.ia
    public boolean a(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.applovin.impl.ia
    public void a(Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.impl.ia
    public boolean a(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.applovin.impl.ia
    public boolean a(ia.a aVar) {
        return ((b) aVar).a(this.a);
    }

    @Override // com.applovin.impl.ia
    public ia.a a(int i, Object obj) {
        return a().a(this.a.obtainMessage(i, obj), this);
    }

    @Override // com.applovin.impl.ia
    public ia.a a(int i, int i2, int i3) {
        return a().a(this.a.obtainMessage(i, i2, i3), this);
    }

    @Override // com.applovin.impl.ia
    public ia.a a(int i, int i2, int i3, Object obj) {
        return a().a(this.a.obtainMessage(i, i2, i3, obj), this);
    }

    private static b a() {
        b bVar;
        List list = b;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    bVar = new b();
                } else {
                    bVar = (b) list.remove(list.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
