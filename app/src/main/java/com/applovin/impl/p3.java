package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
/* loaded from: classes.dex */
abstract class p3 {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 != null) {
        } else {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void a(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }
}
