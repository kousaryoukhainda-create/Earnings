package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView b;

    public b(ClockFaceView clockFaceView) {
        this.b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.x.c) - clockFaceView.E;
        if (height != clockFaceView.v) {
            clockFaceView.v = height;
            clockFaceView.m();
            int i = clockFaceView.v;
            ClockHandView clockHandView = clockFaceView.x;
            clockHandView.l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
