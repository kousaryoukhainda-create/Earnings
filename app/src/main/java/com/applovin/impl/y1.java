package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.y1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public interface y1 {
    xo a();

    void a(Handler handler, a aVar);

    void a(a aVar);

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, long j, long j2);

        /* renamed from: com.applovin.impl.y1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0036a {
            private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

            /* renamed from: com.applovin.impl.y1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0037a {
                private final Handler a;
                private final a b;
                private boolean c;

                public C0037a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }

                public void a() {
                    this.c = true;
                }
            }

            public void a(Handler handler, a aVar) {
                b1.a(handler);
                b1.a(aVar);
                a(aVar);
                this.a.add(new C0037a(handler, aVar));
            }

            public void a(final int i, final long j, final long j2) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    final C0037a c0037a = (C0037a) it.next();
                    if (!c0037a.c) {
                        c0037a.a.post(new Runnable() { // from class: com.applovin.impl.W
                            @Override // java.lang.Runnable
                            public final void run() {
                                y1.a.C0036a.a(y1.a.C0036a.C0037a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0037a c0037a, int i, long j, long j2) {
                c0037a.b.a(i, j, j2);
            }

            public void a(a aVar) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    C0037a c0037a = (C0037a) it.next();
                    if (c0037a.b == aVar) {
                        c0037a.a();
                        this.a.remove(c0037a);
                    }
                }
            }
        }
    }
}
