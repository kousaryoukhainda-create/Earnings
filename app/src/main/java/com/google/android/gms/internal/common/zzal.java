package com.google.android.gms.internal.common;

import org.jspecify.annotations.NullMarked;
@NullMarked
/* loaded from: classes3.dex */
public final class zzal {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC0324Hi.e(i2, "at index "));
            }
        }
        return objArr;
    }
}
