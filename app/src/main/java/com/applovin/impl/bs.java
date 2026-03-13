package com.applovin.impl;

import android.util.Pair;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class bs {
    private static long a(Map map, String str) {
        if (map != null) {
            try {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    public static Pair a(y6 y6Var) {
        Map d = y6Var.d();
        if (d == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(d, "LicenseDurationRemaining")), Long.valueOf(a(d, "PlaybackDurationRemaining")));
    }
}
