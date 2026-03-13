package com.applovin.impl;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class vb {
    private static Collection a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return hc.a(iterable.iterator());
    }

    public static Object b(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return a(list);
            }
            throw new NoSuchElementException();
        }
        return wb.b(iterable.iterator());
    }

    public static Object[] c(Iterable iterable) {
        return a(iterable).toArray();
    }

    public static String d(Iterable iterable) {
        return wb.d(iterable.iterator());
    }

    public static Object a(Iterable iterable, Object obj) {
        return wb.a(iterable.iterator(), obj);
    }

    private static Object a(List list) {
        return list.get(list.size() - 1);
    }
}
