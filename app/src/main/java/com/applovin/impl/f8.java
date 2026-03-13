package com.applovin.impl;
/* loaded from: classes.dex */
public final class f8 extends RuntimeException {
    public final int a;

    public f8(int i) {
        super(a(i));
        this.a = i;
    }

    private static String a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "Undefined timeout.";
                }
                return "Detaching surface timed out.";
            }
            return "Setting foreground mode timed out.";
        }
        return "Player release timed out.";
    }
}
