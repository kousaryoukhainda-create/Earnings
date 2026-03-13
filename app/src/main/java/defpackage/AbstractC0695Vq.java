package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.f;
/* renamed from: Vq  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0695Vq {
    public int a;
    public final Object b;
    public final Object c;

    public AbstractC0695Vq(f fVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = fVar;
    }

    public static AbstractC0695Vq a(f fVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return new C3100xQ(fVar, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C3100xQ(fVar, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return l() - this.a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public AbstractC0695Vq(InterfaceC0747Xq interfaceC0747Xq) {
        this.a = 0;
        this.c = new C2706sn();
        this.b = interfaceC0747Xq;
    }
}
