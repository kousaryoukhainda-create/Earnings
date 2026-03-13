package com.google.android.gms.internal.play_billing;

import java.util.Set;
/* loaded from: classes3.dex */
public final class zzds {
    public static int zza(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
