package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
import java.util.HashMap;
/* renamed from: yU  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3190yU extends ConstraintLayout {
    public final DH u;
    public int v;
    public final OJ w;

    public AbstractC3190yU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        OJ oj = new OJ();
        this.w = oj;
        MV mv = new MV(0.5f);
        C1151d10 e = oj.b.a.e();
        e.e = mv;
        e.f = mv;
        e.g = mv;
        e.h = mv;
        oj.setShapeAppearanceModel(e.a());
        this.w.j(ColorStateList.valueOf(-1));
        OJ oj2 = this.w;
        Field field = Sb0.a;
        setBackground(oj2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3018wU.r, R.attr.materialClockStyle, 0);
        this.v = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.u = new DH(this, 20);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            Field field = Sb0.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            DH dh = this.u;
            handler.removeCallbacks(dh);
            handler.post(dh);
        }
    }

    public final void m() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        C0375Jh c0375Jh = new C0375Jh();
        c0375Jh.b(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.v;
                HashMap hashMap = c0375Jh.c;
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new C0245Eh());
                }
                C0271Fh c0271Fh = ((C0245Eh) hashMap.get(Integer.valueOf(id))).d;
                c0271Fh.z = R.id.circle_center;
                c0271Fh.A = i4;
                c0271Fh.B = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        c0375Jh.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            DH dh = this.u;
            handler.removeCallbacks(dh);
            handler.post(dh);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.w.j(ColorStateList.valueOf(i));
    }
}
