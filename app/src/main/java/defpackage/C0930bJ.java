package defpackage;

import java.util.Map;
/* renamed from: bJ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930bJ {
    public static int a(int i, Object obj, Object obj2) {
        ZI zi = (ZI) obj;
        XI xi = (XI) obj2;
        int i2 = 0;
        if (!zi.isEmpty()) {
            for (Map.Entry entry : zi.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                xi.getClass();
                int v0 = C0242Ee.v0(i);
                int a = XI.a(xi.a, key, value);
                i2 += C0242Ee.x0(a) + a + v0;
            }
        }
        return i2;
    }

    public static ZI b(Object obj, Object obj2) {
        ZI zi = (ZI) obj;
        ZI zi2 = (ZI) obj2;
        if (!zi2.isEmpty()) {
            if (!zi.b) {
                zi = zi.c();
            }
            zi.a();
            if (!zi2.isEmpty()) {
                zi.putAll(zi2);
            }
        }
        return zi;
    }

    public static void c(Object obj) {
        ((ZI) obj).b = false;
    }
}
