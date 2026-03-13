package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* renamed from: GD  reason: default package */
/* loaded from: classes3.dex */
public final class GD {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public AnimatorSet f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;
    public C2556r4 l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public C2556r4 r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    public GD(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(C2556r4 c2556r4, int i) {
        if (this.c == null && this.e == null) {
            Context context = this.a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.c;
            TextInputLayout textInputLayout = this.b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.e = new FrameLayout(context);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i != 0 && i != 1) {
            this.c.addView(c2556r4, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.e.setVisibility(0);
            this.e.addView(c2556r4);
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public final void b() {
        if (this.c != null) {
            TextInputLayout textInputLayout = this.b;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.a;
                boolean H = AbstractC1522hL.H(context);
                LinearLayout linearLayout = this.c;
                Field field = Sb0.a;
                int paddingStart = editText.getPaddingStart();
                if (H) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (H) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (H) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, C2556r4 c2556r4, int i, int i2, int i3) {
        float f;
        if (c2556r4 != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c2556r4, View.ALPHA, f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(AbstractC2297o3.a);
                arrayList.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c2556r4, View.TRANSLATION_Y, -this.g, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(AbstractC2297o3.d);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final boolean e() {
        if (this.i == 1 && this.l != null && !TextUtils.isEmpty(this.j)) {
            return true;
        }
        return false;
    }

    public final TextView f(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.r;
        }
        return this.l;
    }

    public final void g() {
        this.j = null;
        c();
        if (this.h == 1) {
            if (this.q && !TextUtils.isEmpty(this.p)) {
                this.i = 2;
            } else {
                this.i = 0;
            }
        }
        j(this.h, this.i, i(this.l, null));
    }

    public final void h(C2556r4 c2556r4, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.e) != null) {
            frameLayout.removeView(c2556r4);
        } else {
            linearLayout.removeView(c2556r4);
        }
        int i2 = this.d - 1;
        this.d = i2;
        LinearLayout linearLayout2 = this.c;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(C2556r4 c2556r4, CharSequence charSequence) {
        Field field = Sb0.a;
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled() && (this.i != this.h || c2556r4 == null || !TextUtils.equals(c2556r4.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void j(int i, int i2, boolean z) {
        TextView f;
        TextView f2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.q, this.r, 2, i, i2);
            d(arrayList, this.k, this.l, 1, i, i2);
            int size = arrayList.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new FD(this, i2, f(i), i, f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (f2 = f(i2)) != null) {
                f2.setVisibility(0);
                f2.setAlpha(1.0f);
            }
            if (i != 0 && (f = f(i)) != null) {
                f.setVisibility(4);
                if (i == 1) {
                    f.setText((CharSequence) null);
                }
            }
            this.h = i2;
        }
        TextInputLayout textInputLayout = this.b;
        textInputLayout.q();
        textInputLayout.s(z, false);
        textInputLayout.z();
    }
}
