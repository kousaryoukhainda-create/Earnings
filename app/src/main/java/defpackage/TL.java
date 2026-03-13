package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.ykapps.earnings.R;
/* renamed from: TL  reason: default package */
/* loaded from: classes.dex */
public class TL {
    public final Context a;
    public final IL b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public YL h;
    public RL i;
    public SL j;
    public int f = 8388611;
    public final SL k = new SL(this);

    public TL(int i, IL il, Context context, View view, boolean z) {
        this.a = context;
        this.b = il;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final RL a() {
        RL y30;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                y30 = new View$OnKeyListenerC2684sc(context, this.e, this.d, this.c);
            } else {
                View view = this.e;
                Context context2 = this.a;
                boolean z = this.c;
                y30 = new Y30(this.d, this.b, context2, view, z);
            }
            y30.k(this.b);
            y30.q(this.k);
            y30.m(this.e);
            y30.f(this.h);
            y30.n(this.g);
            y30.o(this.f);
            this.i = y30;
        }
        return this.i;
    }

    public final boolean b() {
        RL rl = this.i;
        if (rl != null && rl.d()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.i = null;
        SL sl = this.j;
        if (sl != null) {
            sl.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        RL a = a();
        a.r(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.p(i);
            a.s(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.b = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.show();
    }
}
