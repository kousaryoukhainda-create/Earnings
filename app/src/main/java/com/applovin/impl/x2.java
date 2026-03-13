package com.applovin.impl;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
/* loaded from: classes.dex */
public final class x2 {
    public static final x2 g = new x2(-1, -16777216, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public x2(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    public static x2 a(CaptioningManager.CaptionStyle captionStyle) {
        if (xp.a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static x2 b(CaptioningManager.CaptionStyle captionStyle) {
        return new x2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static x2 c(CaptioningManager.CaptionStyle captionStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (captionStyle.hasForegroundColor()) {
            i = captionStyle.foregroundColor;
        } else {
            i = g.a;
        }
        int i6 = i;
        if (captionStyle.hasBackgroundColor()) {
            i2 = captionStyle.backgroundColor;
        } else {
            i2 = g.b;
        }
        int i7 = i2;
        if (captionStyle.hasWindowColor()) {
            i3 = captionStyle.windowColor;
        } else {
            i3 = g.c;
        }
        int i8 = i3;
        if (captionStyle.hasEdgeType()) {
            i4 = captionStyle.edgeType;
        } else {
            i4 = g.d;
        }
        int i9 = i4;
        if (captionStyle.hasEdgeColor()) {
            i5 = captionStyle.edgeColor;
        } else {
            i5 = g.e;
        }
        return new x2(i6, i7, i8, i9, i5, captionStyle.getTypeface());
    }
}
