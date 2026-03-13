package com.applovin.exoplayer2.ui;

import android.graphics.Color;
import com.applovin.impl.xp;
/* loaded from: classes.dex */
abstract class c {
    public static String a(int i) {
        return xp.a("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }

    public static String a(String str) {
        return AbstractC2437ph.j(".", str, ",.", str, " *");
    }
}
