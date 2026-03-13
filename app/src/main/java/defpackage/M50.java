package defpackage;
/* renamed from: M50  reason: default package */
/* loaded from: classes.dex */
public final class M50 {
    public final C2869ui0 a = new C2869ui0();

    public final void a(Exception exc) {
        this.a.d(exc);
    }

    public final void b(Object obj) {
        C2869ui0 c2869ui0 = this.a;
        synchronized (c2869ui0.f) {
            try {
                if (!c2869ui0.g) {
                    c2869ui0.g = true;
                    c2869ui0.i = obj;
                    c2869ui0.f.notifyAll();
                    c2869ui0.e();
                }
            } finally {
            }
        }
    }
}
