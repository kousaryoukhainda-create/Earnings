package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: Md  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448Md {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public C0448Md(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            AG ag = (AG) entry.getValue();
            List list = (List) this.a.get(ag);
            if (list == null) {
                list = new ArrayList();
                this.a.put(ag, list);
            }
            list.add((C0474Nd) entry.getKey());
        }
    }

    public static void a(List list, HG hg, AG ag, GG gg) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0474Nd c0474Nd = (C0474Nd) list.get(size);
                c0474Nd.getClass();
                try {
                    int i = c0474Nd.a;
                    Method method = c0474Nd.b;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(gg, hg, ag);
                            }
                        } else {
                            method.invoke(gg, hg);
                        }
                    } else {
                        method.invoke(gg, null);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
