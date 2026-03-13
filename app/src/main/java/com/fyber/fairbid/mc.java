package com.fyber.fairbid;

import android.os.Build;
import j$.util.Map;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class mc {
    public static Object a(HashMap hashMap, Object obj) {
        EnumC1119r0 enumC1119r0 = EnumC1119r0.UNKNOWN;
        if (Build.VERSION.SDK_INT >= 28) {
            return Map.EL.getOrDefault(hashMap, obj, enumC1119r0);
        }
        Object obj2 = hashMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        return enumC1119r0;
    }
}
