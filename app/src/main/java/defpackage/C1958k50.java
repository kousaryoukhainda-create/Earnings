package defpackage;

import java.util.HashMap;
/* renamed from: k50  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1958k50 extends HashMap {
    public final C1958k50 b;

    public C1958k50(C1958k50 c1958k50) {
        this.b = c1958k50;
    }

    public final C2704sm a(String str) {
        C1958k50 c1958k50;
        C2704sm c2704sm = (C2704sm) get(str);
        if (c2704sm == null && (c1958k50 = this.b) != null) {
            return c1958k50.a(str);
        }
        return c2704sm;
    }
}
