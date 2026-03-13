package com.applovin.impl;

import android.os.Build;
import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class e8 {
    public static final String a = AbstractC0324Hi.h(new StringBuilder("ExoPlayerLib/2.15.1 (Linux; Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.15.1");
    private static final HashSet b = new HashSet();
    private static String c = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (e8.class) {
            str = c;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (e8.class) {
            if (b.add(str)) {
                c += ", " + str;
            }
        }
    }
}
