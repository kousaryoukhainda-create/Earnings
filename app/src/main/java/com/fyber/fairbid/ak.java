package com.fyber.fairbid;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.fyber.fairbid.sdk.R;
import com.fyber.fairbid.sdk.testsuite.views.TestSuiteActivity;
/* loaded from: classes.dex */
public final class ak implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ TestSuiteActivity b;

    public ak(TestSuiteActivity testSuiteActivity, View view) {
        this.b = testSuiteActivity;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 == i4) {
            return;
        }
        view.setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.a, "translationY", (i2 + i4) * 1.05f, 0.0f).setDuration(this.b.getResources().getInteger(R.integer.fb_splash_screen_slide_in_duration));
        duration.setInterpolator(new DecelerateInterpolator());
        duration.start();
        view.removeOnLayoutChangeListener(this);
        this.b.b = true;
    }
}
