package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
/* renamed from: E50  reason: default package */
/* loaded from: classes.dex */
public abstract class E50 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public E50() {
        if (C1486gw.c == null) {
            C1486gw.c = new C1486gw(20);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        F0 f0;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate a = Sb0.a(view);
            if (a == null) {
                f0 = null;
            } else if (a instanceof E0) {
                f0 = ((E0) a).a;
            } else {
                f0 = new F0(a);
            }
            if (f0 == null) {
                f0 = new F0();
            }
            Sb0.l(view, f0);
            view.setTag(this.a, obj);
            Sb0.e(this.c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
