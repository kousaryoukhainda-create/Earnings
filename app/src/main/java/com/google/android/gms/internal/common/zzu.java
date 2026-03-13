package com.google.android.gms.internal.common;

import org.jspecify.annotations.NullMarked;
@NullMarked
/* loaded from: classes3.dex */
public final class zzu extends zzs {
    public static boolean zza(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
