package defpackage;

import java.util.Objects;
/* renamed from: ej  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297ej {
    public final C2293o1 a;
    public final C3244z4 b;

    public C1297ej(C2293o1 c2293o1, C0206Cu c0206Cu) {
        this.a = c2293o1;
        this.b = new C3244z4(c0206Cu);
    }

    public final void a(String str) {
        C3244z4 c3244z4 = this.b;
        synchronized (c3244z4) {
            if (!Objects.equals((String) c3244z4.d, str)) {
                C3244z4.W((C0206Cu) c3244z4.c, str, (String) c3244z4.f);
                c3244z4.d = str;
            }
        }
    }
}
