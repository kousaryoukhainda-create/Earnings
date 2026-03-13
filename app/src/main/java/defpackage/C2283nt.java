package defpackage;

import java.util.Collections;
/* renamed from: nt  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2283nt {
    public static volatile C2283nt a;
    public static final C2283nt b;

    /* JADX WARN: Type inference failed for: r0v0, types: [nt, java.lang.Object] */
    static {
        ?? obj = new Object();
        Collections.emptyMap();
        b = obj;
    }

    public static C2283nt a() {
        ST st = ST.c;
        C2283nt c2283nt = a;
        if (c2283nt == null) {
            synchronized (C2283nt.class) {
                try {
                    c2283nt = a;
                    if (c2283nt == null) {
                        Class cls = AbstractC2111lt.a;
                        C2283nt c2283nt2 = null;
                        if (cls != null) {
                            try {
                                c2283nt2 = (C2283nt) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c2283nt2 == null) {
                            c2283nt2 = b;
                        }
                        a = c2283nt2;
                        c2283nt = c2283nt2;
                    }
                } finally {
                }
            }
        }
        return c2283nt;
    }
}
