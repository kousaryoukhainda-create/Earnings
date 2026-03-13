package defpackage;

import java.nio.ByteBuffer;
/* renamed from: kr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2023kr {
    public int a = 1;
    public final KM b;
    public KM c;
    public KM d;
    public int e;
    public int f;

    public C2023kr(KM km) {
        this.b = km;
        this.c = km;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        HM c = this.c.b.c();
        int a = c.a(6);
        if ((a != 0 && ((ByteBuffer) c.d).get(a + c.a) != 0) || this.e == 65039) {
            return true;
        }
        return false;
    }
}
