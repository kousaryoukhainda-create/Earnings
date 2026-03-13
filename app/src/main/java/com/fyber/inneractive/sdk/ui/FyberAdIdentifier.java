package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
/* loaded from: classes.dex */
public class FyberAdIdentifier implements View.OnClickListener {
    public ImageView a;
    public View b;
    public Animator e;
    public ClickListener g;
    public Bitmap h;
    public Corner c = Corner.BOTTOM_LEFT;
    public boolean d = false;
    public float f = 0.0f;

    /* loaded from: classes.dex */
    public interface ClickListener {
        void a();
    }

    /* loaded from: classes.dex */
    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Corner.values().length];
            a = iArr;
            try {
                iArr[Corner.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Corner.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Corner.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Corner.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.a.getId()) {
            if (this.e == null) {
                AnimatorSet animatorSet = new AnimatorSet();
                ImageView imageView = this.a;
                Property property = View.ROTATION_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, 90.0f);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a, "imageAlpha", 255, 25);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat, ofInt);
                animatorSet2.addListener(new c(this, animatorSet));
                animatorSet2.setDuration(225L);
                this.e = animatorSet2;
                animatorSet2.start();
                float f = 0.0f;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.a, property, 0.0f);
                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.a, "imageAlpha", 25, 255);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ofFloat2, ofInt2);
                animatorSet3.setDuration(225L);
                View view2 = this.b;
                Property property2 = View.TRANSLATION_X;
                if (this.d) {
                    f = this.f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, property2, f);
                ofFloat3.setDuration(450L);
                animatorSet.setDuration(450L);
                animatorSet.playTogether(ofFloat3, animatorSet3);
                animatorSet.addListener(new d(this));
            }
        } else if (view.getId() == this.b.getId() && this.g != null) {
            a();
            this.g.a();
        }
    }

    public FyberAdIdentifier a(ClickListener clickListener) {
        this.g = clickListener;
        return this;
    }

    public final void a() {
        this.d = false;
        this.b.setTranslationX(0.0f);
        this.a.setImageResource(R.drawable.fyber_info_button);
        Animator animator = this.e;
        if (animator != null) {
            animator.removeAllListeners();
            this.e = null;
        }
    }

    public static boolean a(FyberAdIdentifier fyberAdIdentifier) {
        Corner corner = fyberAdIdentifier.c;
        return corner == Corner.TOP_LEFT || corner == Corner.BOTTOM_LEFT;
    }
}
