package com.fyber.fairbid;

import android.os.Build;
/* loaded from: classes.dex */
public final class mf {
    public static boolean a(int i) {
        if (Build.VERSION.SDK_INT >= i) {
            return true;
        }
        return false;
    }

    public static boolean b(int i) {
        if (Build.VERSION.SDK_INT < i) {
            return true;
        }
        return false;
    }
}
