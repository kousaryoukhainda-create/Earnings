package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
/* renamed from: dV  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1189dV extends ViewGroup.MarginLayoutParams {
    public i a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public C1189dV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C1189dV(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C1189dV(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C1189dV(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C1189dV(C1189dV c1189dV) {
        super((ViewGroup.LayoutParams) c1189dV);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
