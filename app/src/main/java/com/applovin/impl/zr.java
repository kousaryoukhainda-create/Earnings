package com.applovin.impl;

import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class zr {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(ah ahVar) {
        String l = ahVar.l();
        return l != null && l.startsWith("WEBVTT");
    }

    public static long b(String str) {
        String[] b = xp.b(str, "\\.");
        long j = 0;
        for (String str2 : xp.a(b[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (b.length == 2) {
            j2 += Long.parseLong(b[1]);
        }
        return j2 * 1000;
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void b(ah ahVar) {
        int d = ahVar.d();
        if (a(ahVar)) {
            return;
        }
        ahVar.f(d);
        throw ch.a("Expected WEBVTT. Got " + ahVar.l(), null);
    }
}
