package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* loaded from: classes3.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView b;

    public f(TimePickerView timePickerView) {
        this.b = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.v;
        this.b.getClass();
        return false;
    }
}
