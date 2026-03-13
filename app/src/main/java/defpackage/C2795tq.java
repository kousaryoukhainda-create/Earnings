package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ykapps.earnings.R;
import java.util.LinkedHashSet;
/* renamed from: tq  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2795tq extends AbstractC0385Jr {
    public final C2452pq e;
    public final View$OnFocusChangeListenerC0552Qd f;
    public final C2538qq g;
    public final C0578Rd h;
    public final C0604Sd i;
    public boolean j;
    public boolean k;
    public long l;
    public StateListDrawable m;
    public OJ n;
    public AccessibilityManager o;
    public ValueAnimator p;
    public ValueAnimator q;

    public C2795tq(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new C2452pq(this, 0);
        this.f = new View$OnFocusChangeListenerC0552Qd(this, 1);
        this.g = new C2538qq(this, textInputLayout);
        this.h = new C0578Rd(this, 1);
        this.i = new C0604Sd(this, 1);
        this.j = false;
        this.k = false;
        this.l = Long.MAX_VALUE;
    }

    public static void d(C2795tq c2795tq, AutoCompleteTextView autoCompleteTextView) {
        boolean z;
        if (autoCompleteTextView == null) {
            c2795tq.getClass();
            return;
        }
        c2795tq.getClass();
        long currentTimeMillis = System.currentTimeMillis() - c2795tq.l;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            c2795tq.j = false;
        }
        if (!c2795tq.j) {
            c2795tq.g(!c2795tq.k);
            if (c2795tq.k) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        c2795tq.j = false;
    }

    public static boolean f(EditText editText) {
        if (editText.getKeyListener() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC0385Jr
    public final void a() {
        Context context = this.b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        OJ e = e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        OJ e2 = e(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.n = e;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, e);
        this.m.addState(new int[0], e2);
        int i = this.d;
        if (i == 0) {
            i = R.drawable.mtrl_dropdown_arrow;
        }
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new View$OnClickListenerC0630Td(this, 1));
        LinkedHashSet linkedHashSet = textInputLayout.h0;
        C0578Rd c0578Rd = this.h;
        linkedHashSet.add(c0578Rd);
        if (textInputLayout.g != null) {
            c0578Rd.a(textInputLayout);
        }
        textInputLayout.l0.add(this.i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC2297o3.a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new C0783Za(this, 1));
        this.q = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new C0783Za(this, 1));
        this.p = ofFloat2;
        ofFloat2.addListener(new C1407g1(this, 1));
        this.o = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // defpackage.AbstractC0385Jr
    public final boolean b(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [e10, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [jZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [jZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [jZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [jZ, java.lang.Object] */
    public final OJ e(float f, float f2, float f3, int i) {
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        C0539Pq c0539Pq = new C0539Pq(0);
        C0539Pq c0539Pq2 = new C0539Pq(0);
        C0539Pq c0539Pq3 = new C0539Pq(0);
        C0539Pq c0539Pq4 = new C0539Pq(0);
        C2462q c2462q = new C2462q(f);
        C2462q c2462q2 = new C2462q(f);
        C2462q c2462q3 = new C2462q(f2);
        C2462q c2462q4 = new C2462q(f2);
        ?? obj5 = new Object();
        obj5.a = obj;
        obj5.b = obj2;
        obj5.c = obj3;
        obj5.d = obj4;
        obj5.e = c2462q;
        obj5.f = c2462q2;
        obj5.g = c2462q4;
        obj5.h = c2462q3;
        obj5.i = c0539Pq;
        obj5.j = c0539Pq2;
        obj5.k = c0539Pq3;
        obj5.l = c0539Pq4;
        Paint paint = OJ.y;
        String simpleName = OJ.class.getSimpleName();
        Context context = this.b;
        int T = AbstractC2870uj.T(context, R.attr.colorSurface, simpleName);
        OJ oj = new OJ();
        oj.h(context);
        oj.j(ColorStateList.valueOf(T));
        oj.i(f3);
        oj.setShapeAppearanceModel(obj5);
        NJ nj = oj.b;
        if (nj.g == null) {
            nj.g = new Rect();
        }
        oj.b.g.set(0, i, 0, i);
        oj.invalidateSelf();
        return oj;
    }

    public final void g(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.q.cancel();
            this.p.start();
        }
    }
}
