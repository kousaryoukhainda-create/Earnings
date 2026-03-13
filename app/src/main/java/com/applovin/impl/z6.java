package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.ae;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public interface z6 {

    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final ae.a b;
        private final CopyOnWriteArrayList c;

        /* renamed from: com.applovin.impl.z6$a$a */
        /* loaded from: classes.dex */
        public static final class C0040a {
            public Handler a;
            public z6 b;

            public C0040a(Handler handler, z6 z6Var) {
                this.a = handler;
                this.b = z6Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i, ae.a aVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = aVar;
        }

        public void a(Handler handler, z6 z6Var) {
            b1.a(handler);
            b1.a(z6Var);
            this.c.add(new C0040a(handler, z6Var));
        }

        public void b() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0040a c0040a = (C0040a) it.next();
                xp.a(c0040a.a, (Runnable) new El0(this, c0040a.b, 2));
            }
        }

        public void c() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0040a c0040a = (C0040a) it.next();
                xp.a(c0040a.a, (Runnable) new El0(this, c0040a.b, 3));
            }
        }

        public void d() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0040a c0040a = (C0040a) it.next();
                xp.a(c0040a.a, (Runnable) new El0(this, c0040a.b, 1));
            }
        }

        public void e(z6 z6Var) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0040a c0040a = (C0040a) it.next();
                if (c0040a.b == z6Var) {
                    this.c.remove(c0040a);
                }
            }
        }

        public /* synthetic */ void b(z6 z6Var) {
            z6Var.a(this.a, this.b);
        }

        public /* synthetic */ void c(z6 z6Var) {
            z6Var.c(this.a, this.b);
        }

        public /* synthetic */ void d(z6 z6Var) {
            z6Var.b(this.a, this.b);
        }

        public void a() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0040a c0040a = (C0040a) it.next();
                xp.a(c0040a.a, (Runnable) new El0(this, c0040a.b, 0));
            }
        }

        public void a(int i) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0040a c0040a = (C0040a) it.next();
                xp.a(c0040a.a, (Runnable) new RunnableC2279np(this, c0040a.b, i, 11));
            }
        }

        public void a(Exception exc) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0040a c0040a = (C0040a) it.next();
                xp.a(c0040a.a, (Runnable) new RunnableC1382fi0(11, this, c0040a.b, exc));
            }
        }

        public /* synthetic */ void a(z6 z6Var) {
            z6Var.d(this.a, this.b);
        }

        public /* synthetic */ void a(z6 z6Var, int i) {
            z6Var.e(this.a, this.b);
            z6Var.a(this.a, this.b, i);
        }

        public /* synthetic */ void a(z6 z6Var, Exception exc) {
            z6Var.a(this.a, this.b, exc);
        }

        public a a(int i, ae.a aVar) {
            return new a(this.c, i, aVar);
        }
    }

    void a(int i, ae.a aVar);

    void a(int i, ae.a aVar, int i2);

    void a(int i, ae.a aVar, Exception exc);

    void b(int i, ae.a aVar);

    void c(int i, ae.a aVar);

    void d(int i, ae.a aVar);

    void e(int i, ae.a aVar);
}
