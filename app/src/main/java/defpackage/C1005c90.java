package defpackage;

import java.util.HashSet;
/* renamed from: c90  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1005c90 extends Z80 {
    public final int b;
    public boolean c;

    public C1005c90(int i, String str) {
        super(str);
        this.b = i;
        this.c = false;
    }

    @Override // defpackage.AbstractC1338f90
    public final void b(int i) {
        if (i == this.b) {
            this.c = true;
        }
    }

    @Override // defpackage.Z80, defpackage.AbstractC1338f90
    public final boolean d(AbstractC1338f90 abstractC1338f90) {
        if (!(abstractC1338f90 instanceof C1005c90)) {
            return false;
        }
        C1005c90 c1005c90 = (C1005c90) abstractC1338f90;
        if (this.b != c1005c90.b || !this.a.equals(c1005c90.a)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.Z80, defpackage.AbstractC1338f90
    public int g(L5 l5) {
        return this.b;
    }

    @Override // defpackage.Z80, defpackage.AbstractC1338f90
    public int h() {
        return 8;
    }

    @Override // defpackage.AbstractC1338f90
    public final boolean l() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, f90, e90] */
    @Override // defpackage.AbstractC1338f90
    public final AbstractC1338f90 m() {
        if (this.c) {
            return new C0920b90(new Z80(this.a));
        }
        C1005c90 r = r();
        ?? obj = new Object();
        obj.a = r;
        return obj;
    }

    @Override // defpackage.Z80, defpackage.AbstractC1338f90
    public String p(HashSet hashSet) {
        return this.a + "," + this.b;
    }

    public C1005c90 r() {
        return new C1005c90(this.b, this.a);
    }
}
