package com.applovin.impl;
/* loaded from: classes.dex */
public abstract class fg {
    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AbstractC0324Hi.e(i, "at index "));
    }

    public static Object[] b(Object[] objArr, int i) {
        return mh.a(objArr, i);
    }

    public static Object[] a(Object... objArr) {
        return a(objArr, objArr.length);
    }

    public static Object[] a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }
}
