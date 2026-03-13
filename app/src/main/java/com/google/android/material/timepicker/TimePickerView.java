package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int v = 0;
    public final MaterialButtonToggleGroup u;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d dVar = new d(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.u = materialButtonToggleGroup;
        materialButtonToggleGroup.f.add(new e(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        Field field = Sb0.a;
        chip.setAccessibilityLiveRegion(2);
        chip2.setAccessibilityLiveRegion(2);
        View$OnTouchListenerC2232nH view$OnTouchListenerC2232nH = new View$OnTouchListenerC2232nH(new GestureDetector(getContext(), new f(this)), 1);
        chip.setOnTouchListener(view$OnTouchListenerC2232nH);
        chip2.setOnTouchListener(view$OnTouchListenerC2232nH);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(dVar);
        chip2.setOnClickListener(dVar);
    }

    public final void m() {
        char c;
        C0245Eh c0245Eh;
        if (this.u.getVisibility() == 0) {
            C0375Jh c0375Jh = new C0375Jh();
            c0375Jh.b(this);
            Field field = Sb0.a;
            if (getLayoutDirection() == 0) {
                c = 2;
            } else {
                c = 1;
            }
            HashMap hashMap = c0375Jh.c;
            if (hashMap.containsKey(Integer.valueOf((int) R.id.material_clock_display)) && (c0245Eh = (C0245Eh) hashMap.get(Integer.valueOf((int) R.id.material_clock_display))) != null) {
                C0271Fh c0271Fh = c0245Eh.d;
                switch (c) {
                    case 1:
                        c0271Fh.i = -1;
                        c0271Fh.h = -1;
                        c0271Fh.F = -1;
                        c0271Fh.M = Integer.MIN_VALUE;
                        break;
                    case 2:
                        c0271Fh.k = -1;
                        c0271Fh.j = -1;
                        c0271Fh.G = -1;
                        c0271Fh.O = Integer.MIN_VALUE;
                        break;
                    case 3:
                        c0271Fh.m = -1;
                        c0271Fh.l = -1;
                        c0271Fh.H = 0;
                        c0271Fh.N = Integer.MIN_VALUE;
                        break;
                    case 4:
                        c0271Fh.n = -1;
                        c0271Fh.o = -1;
                        c0271Fh.I = 0;
                        c0271Fh.P = Integer.MIN_VALUE;
                        break;
                    case 5:
                        c0271Fh.p = -1;
                        c0271Fh.q = -1;
                        c0271Fh.r = -1;
                        c0271Fh.L = 0;
                        c0271Fh.S = Integer.MIN_VALUE;
                        break;
                    case 6:
                        c0271Fh.s = -1;
                        c0271Fh.t = -1;
                        c0271Fh.K = 0;
                        c0271Fh.R = Integer.MIN_VALUE;
                        break;
                    case 7:
                        c0271Fh.u = -1;
                        c0271Fh.v = -1;
                        c0271Fh.J = 0;
                        c0271Fh.Q = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        c0271Fh.B = -1.0f;
                        c0271Fh.A = -1;
                        c0271Fh.z = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            c0375Jh.a(this);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m();
        }
    }
}
