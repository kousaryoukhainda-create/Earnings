package com.applovin.impl;

import android.os.Handler;
/* loaded from: classes.dex */
public interface q1 {

    /* loaded from: classes.dex */
    public static final class a {
        private final Handler a;
        private final q1 b;

        public a(Handler handler, q1 q1Var) {
            Handler handler2;
            if (q1Var != null) {
                handler2 = (Handler) b1.a(handler);
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.b = q1Var;
        }

        public /* synthetic */ void c(Exception exc) {
            ((q1) xp.a(this.b)).c(exc);
        }

        public /* synthetic */ void d(Exception exc) {
            ((q1) xp.a(this.b)).a(exc);
        }

        public void a(Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC1215dk0(this, exc, 0));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC1215dk0(this, exc, 1));
            }
        }

        public /* synthetic */ void c(m5 m5Var) {
            m5Var.a();
            ((q1) xp.a(this.b)).c(m5Var);
        }

        public /* synthetic */ void d(m5 m5Var) {
            ((q1) xp.a(this.b)).a(m5Var);
        }

        public void a(String str, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC1300ek0(this, str, j, j2, 0));
            }
        }

        public void b(m5 m5Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC1053ck0(this, m5Var, 0));
            }
        }

        public /* synthetic */ void b(String str, long j, long j2) {
            ((q1) xp.a(this.b)).a(str, j, j2);
        }

        public void a(String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Ij0(5, this, str));
            }
        }

        public /* synthetic */ void b(String str) {
            ((q1) xp.a(this.b)).b(str);
        }

        public void a(m5 m5Var) {
            m5Var.a();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC1053ck0(this, m5Var, 1));
            }
        }

        public /* synthetic */ void b(e9 e9Var, p5 p5Var) {
            ((q1) xp.a(this.b)).b(e9Var);
            ((q1) xp.a(this.b)).b(e9Var, p5Var);
        }

        public void a(e9 e9Var, p5 p5Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC1382fi0(8, this, e9Var, p5Var));
            }
        }

        public void b(long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new com.fyber.fairbid.N(this, j, 2));
            }
        }

        public /* synthetic */ void a(long j) {
            ((q1) xp.a(this.b)).a(j);
        }

        public void b(boolean z) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC2389p6(2, this, z));
            }
        }

        public /* synthetic */ void a(boolean z) {
            ((q1) xp.a(this.b)).a(z);
        }

        public /* synthetic */ void a(int i, long j, long j2) {
            ((q1) xp.a(this.b)).b(i, j, j2);
        }

        public void b(int i, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new RunnableC3082x9(this, i, j, j2, 1));
            }
        }
    }

    void a(long j);

    void a(m5 m5Var);

    void a(Exception exc);

    void a(String str, long j, long j2);

    void a(boolean z);

    void b(int i, long j, long j2);

    void b(e9 e9Var);

    void b(e9 e9Var, p5 p5Var);

    void b(String str);

    void c(m5 m5Var);

    void c(Exception exc);
}
