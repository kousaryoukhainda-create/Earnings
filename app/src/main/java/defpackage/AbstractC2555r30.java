package defpackage;

import java.sql.Date;
import java.sql.Timestamp;
/* renamed from: r30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2555r30 {
    public static final boolean a;
    public static final C2470q30 b;
    public static final C2470q30 c;
    public static final C1501h5 d;
    public static final C1501h5 e;
    public static final C1501h5 f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new C2470q30(0, Date.class);
            c = new C2470q30(1, Timestamp.class);
            d = C2298o30.c;
            e = C2298o30.d;
            f = C2384p30.c;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
