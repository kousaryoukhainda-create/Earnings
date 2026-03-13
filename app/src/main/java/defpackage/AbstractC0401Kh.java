package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* renamed from: Kh  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0401Kh {
    public static final String f = EI.e("ConstraintTracker");
    public final N50 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    public AbstractC0401Kh(Context context, N50 n50) {
        this.b = context.getApplicationContext();
        this.a = n50;
    }

    public abstract Object a();

    public final void b(AbstractC3038wh abstractC3038wh) {
        synchronized (this.c) {
            try {
                if (this.d.remove(abstractC3038wh) && this.d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.c) {
            try {
                Object obj2 = this.e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.e = obj;
                    ((ExecutorC2625rs) ((YZ) this.a).d).execute(new RunnableC1881jA(this, false, new ArrayList(this.d), 4));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
