package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.p;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.w0;
/* loaded from: classes.dex */
public class g implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public q0 a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, q0 q0Var, int i3, int i4, int i5, int i6) {
        if (q0Var == null) {
            return null;
        }
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int min = Math.min(i3, i5) - p.a(i6 * 2);
            q0Var.a = min;
            q0Var.b = min;
        } else if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int min2 = Math.min(i3, i5) - p.a(i6 * 2);
            q0Var.a = min2;
            q0Var.b = (min2 * 9) / 16;
        } else if (unitDisplayType == UnitDisplayType.MRECT) {
            q0Var.a = p.a(300);
            q0Var.b = p.a(250);
        } else if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            w0.a(unitDisplayType, q0Var, i, i2, i3, i4);
        } else {
            q0Var.a = 0;
            q0Var.b = 0;
        }
        return q0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public q0 a(UnitDisplayType unitDisplayType, int i, int i2, q0 q0Var, int i3, ViewGroup viewGroup, ImageView imageView) {
        q0 q0Var2 = new q0(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            if (imageView != null) {
                imageView.getLayoutParams().width = q0Var.a;
                imageView.getLayoutParams().height = q0Var.a;
            }
            int i4 = q0Var.a;
            w0.a(unitDisplayType, q0Var2, i, i2, i4, i4);
        } else {
            w0.a(unitDisplayType, q0Var2, i, i2, q0Var.a, q0Var.b);
            if (imageView != null) {
                imageView.getLayoutParams().width = q0Var2.a;
                imageView.getLayoutParams().height = q0Var2.b;
            }
        }
        return q0Var2;
    }
}
