package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: Lh  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0427Lh {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public int F;
    public int G;
    public final C2866uh H;
    public final C2866uh I;
    public final C2866uh J;
    public final C2866uh K;
    public final C2866uh L;
    public final C2866uh M;
    public final C2866uh N;
    public final C2866uh O;
    public final C2866uh[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public C0427Lh S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public C0344Ic b;
    public int b0;
    public C0344Ic c;
    public float c0;
    public float d0;
    public View e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public String j;
    public final float[] j0;
    public boolean k;
    public final C0427Lh[] k0;
    public boolean l;
    public final C0427Lh[] l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public C1599iC d = null;
    public C2082lb0 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public C0427Lh() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = 0;
        this.G = 0;
        C2866uh c2866uh = new C2866uh(this, 2);
        this.H = c2866uh;
        C2866uh c2866uh2 = new C2866uh(this, 3);
        this.I = c2866uh2;
        C2866uh c2866uh3 = new C2866uh(this, 4);
        this.J = c2866uh3;
        C2866uh c2866uh4 = new C2866uh(this, 5);
        this.K = c2866uh4;
        C2866uh c2866uh5 = new C2866uh(this, 6);
        this.L = c2866uh5;
        C2866uh c2866uh6 = new C2866uh(this, 8);
        this.M = c2866uh6;
        C2866uh c2866uh7 = new C2866uh(this, 9);
        this.N = c2866uh7;
        C2866uh c2866uh8 = new C2866uh(this, 7);
        this.O = c2866uh8;
        this.P = new C2866uh[]{c2866uh, c2866uh3, c2866uh2, c2866uh4, c2866uh5, c2866uh8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new C0427Lh[]{null, null};
        this.l0 = new C0427Lh[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(c2866uh);
        arrayList.add(c2866uh2);
        arrayList.add(c2866uh3);
        arrayList.add(c2866uh4);
        arrayList.add(c2866uh6);
        arrayList.add(c2866uh7);
        arrayList.add(c2866uh8);
        arrayList.add(c2866uh5);
    }

    public static void D(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void E(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void m(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        D(i, 0, "      size", sb);
        D(i2, 0, "      min", sb);
        D(i3, Integer.MAX_VALUE, "      max", sb);
        D(i4, 0, "      matchMin", sb);
        D(i5, 0, "      matchDef", sb);
        E(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void n(StringBuilder sb, String str, C2866uh c2866uh) {
        if (c2866uh.f == null) {
            return;
        }
        AbstractC0324Hi.w(sb, "    ", str, " : [ '");
        sb.append(c2866uh.f);
        sb.append("'");
        if (c2866uh.h != Integer.MIN_VALUE || c2866uh.g != 0) {
            sb.append(",");
            sb.append(c2866uh.g);
            if (c2866uh.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c2866uh.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void A() {
        this.H.g();
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.S = null;
        this.D = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] iArr = this.o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void B() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2866uh c2866uh = (C2866uh) arrayList.get(i);
            c2866uh.c = false;
            c2866uh.b = 0;
        }
    }

    public void C(C3244z4 c3244z4) {
        this.H.h();
        this.I.h();
        this.J.h();
        this.K.h();
        this.L.h();
        this.O.h();
        this.M.h();
        this.N.h();
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.H.i(i);
        this.J.i(i2);
        this.X = i;
        this.T = i2 - i;
        this.k = true;
    }

    public final void G(int i, int i2) {
        if (this.l) {
            return;
        }
        this.I.i(i);
        this.K.i(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.E) {
            this.L.i(i + this.Z);
        }
        this.l = true;
    }

    public final void H(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void I(int i) {
        this.o0[0] = i;
    }

    public final void J(int i) {
        this.o0[1] = i;
    }

    public final void K(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void L(boolean z, boolean z2) {
        int i;
        int i2;
        C1599iC c1599iC = this.d;
        boolean z3 = z & c1599iC.g;
        C2082lb0 c2082lb0 = this.e;
        boolean z4 = z2 & c2082lb0.g;
        int i3 = c1599iC.h.g;
        int i4 = c2082lb0.h.g;
        int i5 = c1599iC.i.g;
        int i6 = c2082lb0.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void M(UG ug, boolean z) {
        int i;
        int i2;
        C2082lb0 c2082lb0;
        C1599iC c1599iC;
        C2866uh c2866uh = this.H;
        ug.getClass();
        int n = UG.n(c2866uh);
        int n2 = UG.n(this.I);
        int n3 = UG.n(this.J);
        int n4 = UG.n(this.K);
        if (z && (c1599iC = this.d) != null) {
            C1307ep c1307ep = c1599iC.h;
            if (c1307ep.j) {
                C1307ep c1307ep2 = c1599iC.i;
                if (c1307ep2.j) {
                    n = c1307ep.g;
                    n3 = c1307ep2.g;
                }
            }
        }
        if (z && (c2082lb0 = this.e) != null) {
            C1307ep c1307ep3 = c2082lb0.h;
            if (c1307ep3.j) {
                C1307ep c1307ep4 = c2082lb0.i;
                if (c1307ep4.j) {
                    n2 = c1307ep3.g;
                    n4 = c1307ep4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.X = n;
        this.Y = n2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(this.T, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(C0452Mh c0452Mh, UG ug, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            AbstractC1424g90.p(c0452Mh, ug, this);
            hashSet.remove(this);
            b(ug, c0452Mh.S(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C2866uh) it.next()).d.a(c0452Mh, ug, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C2866uh) it2.next()).d.a(c0452Mh, ug, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C2866uh) it3.next()).d.a(c0452Mh, ug, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C2866uh) it4.next()).d.a(c0452Mh, ug, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C2866uh) it5.next()).d.a(c0452Mh, ug, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.UG r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0427Lh.b(UG, boolean):void");
    }

    public boolean c() {
        if (this.f0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0439 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.UG r31, boolean r32, boolean r33, boolean r34, boolean r35, defpackage.X20 r36, defpackage.X20 r37, int r38, boolean r39, defpackage.C2866uh r40, defpackage.C2866uh r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0427Lh.d(UG, boolean, boolean, boolean, boolean, X20, X20, int, boolean, uh, uh, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(UG ug) {
        ug.k(this.H);
        ug.k(this.I);
        ug.k(this.J);
        ug.k(this.K);
        if (this.Z > 0) {
            ug.k(this.L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [td0, lb0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [td0, iC] */
    public final void f() {
        if (this.d == null) {
            ?? abstractC2773td0 = new AbstractC2773td0(this);
            abstractC2773td0.h.e = 4;
            abstractC2773td0.i.e = 5;
            abstractC2773td0.f = 0;
            this.d = abstractC2773td0;
        }
        if (this.e == null) {
            ?? abstractC2773td02 = new AbstractC2773td0(this);
            C1307ep c1307ep = new C1307ep(abstractC2773td02);
            abstractC2773td02.k = c1307ep;
            abstractC2773td02.l = null;
            abstractC2773td02.h.e = 6;
            abstractC2773td02.i.e = 7;
            c1307ep.e = 8;
            abstractC2773td02.f = 1;
            this.e = abstractC2773td02;
        }
    }

    public C2866uh g(int i) {
        switch (AbstractC0324Hi.A(i)) {
            case 0:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                throw new AssertionError(AbstractC2437ph.x(i));
        }
    }

    public final int h(int i) {
        int[] iArr = this.o0;
        if (i == 0) {
            return iArr[0];
        }
        if (i != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int i() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final C0427Lh j(int i) {
        C2866uh c2866uh;
        C2866uh c2866uh2;
        if (i == 0) {
            C2866uh c2866uh3 = this.J;
            C2866uh c2866uh4 = c2866uh3.f;
            if (c2866uh4 != null && c2866uh4.f == c2866uh3) {
                return c2866uh4.d;
            }
            return null;
        } else if (i == 1 && (c2866uh2 = (c2866uh = this.K).f) != null && c2866uh2.f == c2866uh) {
            return c2866uh2.d;
        } else {
            return null;
        }
    }

    public final C0427Lh k(int i) {
        C2866uh c2866uh;
        C2866uh c2866uh2;
        if (i == 0) {
            C2866uh c2866uh3 = this.H;
            C2866uh c2866uh4 = c2866uh3.f;
            if (c2866uh4 != null && c2866uh4.f == c2866uh3) {
                return c2866uh4.d;
            }
            return null;
        } else if (i == 1 && (c2866uh2 = (c2866uh = this.I).f) != null && c2866uh2.f == c2866uh) {
            return c2866uh2.d;
        } else {
            return null;
        }
    }

    public void l(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.U);
        sb.append("\n");
        sb.append("    actualLeft:" + this.X);
        sb.append("\n");
        sb.append("    actualTop:" + this.Y);
        sb.append("\n");
        n(sb, "left", this.H);
        n(sb, "top", this.I);
        n(sb, "right", this.J);
        n(sb, "bottom", this.K);
        n(sb, "baseline", this.L);
        n(sb, "centerX", this.M);
        n(sb, "centerY", this.N);
        int i = this.T;
        int i2 = this.a0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        float[] fArr = this.j0;
        float f2 = fArr[0];
        m(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.U;
        int i7 = this.b0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        float f4 = fArr[1];
        m(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.V;
        int i11 = this.W;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        E(sb, "    horizontalBias", this.c0, 0.5f);
        E(sb, "    verticalBias", this.d0, 0.5f);
        D(this.h0, 0, "    horizontalChainStyle", sb);
        D(this.i0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int o() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int p() {
        C0427Lh c0427Lh = this.S;
        if (c0427Lh != null && (c0427Lh instanceof C0452Mh)) {
            return ((C0452Mh) c0427Lh).w0 + this.X;
        }
        return this.X;
    }

    public final int q() {
        C0427Lh c0427Lh = this.S;
        if (c0427Lh != null && (c0427Lh instanceof C0452Mh)) {
            return ((C0452Mh) c0427Lh).x0 + this.Y;
        }
        return this.Y;
    }

    public final boolean r(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.H.f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.J.f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 >= 2) {
                return false;
            }
            return true;
        }
        if (this.I.f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.K.f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.L.f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 >= 2) {
            return false;
        }
        return true;
    }

    public final boolean s(int i, int i2) {
        C2866uh c2866uh;
        C2866uh c2866uh2;
        C2866uh c2866uh3;
        C2866uh c2866uh4;
        if (i == 0) {
            C2866uh c2866uh5 = this.H;
            C2866uh c2866uh6 = c2866uh5.f;
            if (c2866uh6 != null && c2866uh6.c && (c2866uh4 = (c2866uh3 = this.J).f) != null && c2866uh4.c) {
                if ((c2866uh4.c() - c2866uh3.d()) - (c2866uh5.d() + c2866uh5.f.c()) >= i2) {
                    return true;
                }
                return false;
            }
        } else {
            C2866uh c2866uh7 = this.I;
            C2866uh c2866uh8 = c2866uh7.f;
            if (c2866uh8 != null && c2866uh8.c && (c2866uh2 = (c2866uh = this.K).f) != null && c2866uh2.c) {
                if ((c2866uh2.c() - c2866uh.d()) - (c2866uh7.d() + c2866uh7.f.c()) >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void t(int i, int i2, int i3, int i4, C0427Lh c0427Lh) {
        g(i).a(c0427Lh.g(i2), i3, i4);
    }

    public String toString() {
        String str = "";
        StringBuilder l = AbstractC0324Hi.l("");
        if (this.g0 != null) {
            str = AbstractC0324Hi.h(new StringBuilder("id: "), this.g0, " ");
        }
        l.append(str);
        l.append("(");
        l.append(this.X);
        l.append(", ");
        l.append(this.Y);
        l.append(") - (");
        l.append(this.T);
        l.append(" x ");
        return AbstractC2437ph.k(l, this.U, ")");
    }

    public final boolean u(int i) {
        C2866uh c2866uh;
        C2866uh c2866uh2;
        int i2 = i * 2;
        C2866uh[] c2866uhArr = this.P;
        C2866uh c2866uh3 = c2866uhArr[i2];
        C2866uh c2866uh4 = c2866uh3.f;
        if (c2866uh4 != null && c2866uh4.f != c2866uh3 && (c2866uh2 = (c2866uh = c2866uhArr[i2 + 1]).f) != null && c2866uh2.f == c2866uh) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        C2866uh c2866uh = this.H;
        C2866uh c2866uh2 = c2866uh.f;
        if (c2866uh2 == null || c2866uh2.f != c2866uh) {
            C2866uh c2866uh3 = this.J;
            C2866uh c2866uh4 = c2866uh3.f;
            if (c2866uh4 != null && c2866uh4.f == c2866uh3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean w() {
        C2866uh c2866uh = this.I;
        C2866uh c2866uh2 = c2866uh.f;
        if (c2866uh2 == null || c2866uh2.f != c2866uh) {
            C2866uh c2866uh3 = this.K;
            C2866uh c2866uh4 = c2866uh3.f;
            if (c2866uh4 != null && c2866uh4.f == c2866uh3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean x() {
        if (this.g && this.f0 != 8) {
            return true;
        }
        return false;
    }

    public boolean y() {
        if (!this.k && (!this.H.c || !this.J.c)) {
            return false;
        }
        return true;
    }

    public boolean z() {
        if (!this.l && (!this.I.c || !this.K.c)) {
            return false;
        }
        return true;
    }
}
