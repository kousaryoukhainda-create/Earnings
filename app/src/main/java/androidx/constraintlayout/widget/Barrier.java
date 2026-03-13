package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
/* loaded from: classes.dex */
public class Barrier extends AbstractC3124xh {
    public int j;
    public int k;
    public H9 l;

    public Barrier(Context context) {
        super(context);
        this.b = new int[32];
        this.i = new HashMap();
        this.d = context;
        f(null);
        super.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [H9, Lh] */
    public final void f(AttributeSet attributeSet) {
        int[] iArr = AbstractC2503qU.b;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.h = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
        ?? c0427Lh = new C0427Lh();
        c0427Lh.p0 = new C0427Lh[4];
        c0427Lh.q0 = 0;
        c0427Lh.r0 = 0;
        c0427Lh.s0 = true;
        c0427Lh.t0 = 0;
        c0427Lh.u0 = false;
        this.l = c0427Lh;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = obtainStyledAttributes2.getIndex(i2);
                if (index2 == 26) {
                    setType(obtainStyledAttributes2.getInt(index2, 0));
                } else if (index2 == 25) {
                    this.l.s0 = obtainStyledAttributes2.getBoolean(index2, true);
                } else if (index2 == 27) {
                    this.l.t0 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                }
            }
            obtainStyledAttributes2.recycle();
        }
        this.f = this.l;
        e();
    }

    public boolean getAllowsGoneWidget() {
        return this.l.s0;
    }

    public int getMargin() {
        return this.l.t0;
    }

    public int getType() {
        return this.j;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.s0 = z;
    }

    public void setDpMargin(int i) {
        this.l.t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.l.t0 = i;
    }

    public void setType(int i) {
        this.j = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[32];
        this.i = new HashMap();
        this.d = context;
        f(attributeSet);
        super.setVisibility(8);
    }
}
