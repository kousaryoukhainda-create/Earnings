package com.applovin.impl;

import android.os.Handler;
import android.os.SystemClock;
/* loaded from: classes.dex */
public interface wq {

    /* loaded from: classes.dex */
    public static final class a {
        private final Handler a;
        private final wq b;

        public a(Handler handler, wq wqVar) {
            Handler handler2;
            if (wqVar != null) {
                handler2 = (Handler) b1.a(handler);
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.b = wqVar;
        }

        public /* synthetic */ void c(m5 m5Var) {
            m5Var.a();
            ((wq) xp.a(this.b)).b(m5Var);
        }

        public /* synthetic */ void d(m5 m5Var) {
            ((wq) xp.a(this.b)).d(m5Var);
        }

        public void a(String str, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC1300ek0(this, str, j, j2, 1));
            }
        }

        public void b(m5 m5Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC2532ql0(this, m5Var, 1));
            }
        }

        public /* synthetic */ void b(String str, long j, long j2) {
            ((wq) xp.a(this.b)).b(str, j, j2);
        }

        public void a(String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Ij0(17, this, str));
            }
        }

        public /* synthetic */ void b(String str) {
            ((wq) xp.a(this.b)).a(str);
        }

        public void a(m5 m5Var) {
            m5Var.a();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC2532ql0(this, m5Var, 0));
            }
        }

        public /* synthetic */ void b(int i, long j) {
            ((wq) xp.a(this.b)).a(i, j);
        }

        public /* synthetic */ void b(e9 e9Var, p5 p5Var) {
            ((wq) xp.a(this.b)).a(e9Var);
            ((wq) xp.a(this.b)).a(e9Var, p5Var);
        }

        public void a(int i, long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC2617rl0(this, i, j));
            }
        }

        public void b(long j, int i) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC2617rl0(this, j, i));
            }
        }

        public void a(e9 e9Var, p5 p5Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC1382fi0(10, this, e9Var, p5Var));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Ij0(16, this, exc));
            }
        }

        public /* synthetic */ void a(Object obj, long j) {
            ((wq) xp.a(this.b)).a(obj, j);
        }

        public /* synthetic */ void a(long j, int i) {
            ((wq) xp.a(this.b)).a(j, i);
        }

        public void b(xq xqVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Ij0(15, this, xqVar));
            }
        }

        public /* synthetic */ void a(Exception exc) {
            ((wq) xp.a(this.b)).b(exc);
        }

        public /* synthetic */ void a(xq xqVar) {
            ((wq) xp.a(this.b)).a(xqVar);
        }

        public void a(Object obj) {
            if (this.a != null) {
                this.a.post(new RunnableC2630rx(this, obj, SystemClock.elapsedRealtime(), 4));
            }
        }
    }

    void a(int i, long j);

    void a(long j, int i);

    void a(e9 e9Var);

    void a(e9 e9Var, p5 p5Var);

    void a(xq xqVar);

    void a(Object obj, long j);

    void a(String str);

    void b(m5 m5Var);

    void b(Exception exc);

    void b(String str, long j, long j2);

    void d(m5 m5Var);
}
