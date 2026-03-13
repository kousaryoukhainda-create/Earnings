package com.fyber.inneractive.sdk.web;

import android.util.LruCache;
/* loaded from: classes.dex */
public class v<K> extends LruCache<K, y> {
    public v(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public int sizeOf(Object obj, y yVar) {
        String str;
        y yVar2 = yVar;
        int i = 0;
        for (String str2 : yVar2.b.keySet()) {
            if (str2 != null && (str = yVar2.b.get(str2)) != null) {
                i += str.length() + str2.length();
            }
        }
        return i + yVar2.a.length;
    }
}
