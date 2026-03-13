package defpackage;

import java.util.HashMap;
/* renamed from: w20  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2983w20 extends HashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: d */
    public final String put(String str, String str2) {
        if (Ka0.m(str2)) {
            return null;
        }
        return (String) super.put(str, str2);
    }
}
