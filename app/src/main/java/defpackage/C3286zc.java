package defpackage;

import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: zc  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3286zc extends AbstractC0292Gc {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY, 103, LocationRequest.PRIORITY_LOW_POWER, LocationRequest.PRIORITY_NO_POWER, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final NQ h = new NQ();
    public final ArrayList m = new ArrayList();
    public C3200yc n = new C3200yc(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public C3286zc(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.i = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Wh0.o0("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.k = 0;
                        this.j = 0;
                    } else {
                        this.k = 1;
                        this.j = 1;
                    }
                } else {
                    this.k = 0;
                    this.j = 1;
                }
            } else {
                this.k = 1;
                this.j = 0;
            }
        } else {
            this.k = 0;
            this.j = 0;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC0292Gc
    public final WC f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new WC(list, 8);
    }

    @Override // defpackage.AbstractC0292Gc, defpackage.InterfaceC2790tm
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = 4;
        this.n.h = 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x007e A[SYNTHETIC] */
    @Override // defpackage.AbstractC0292Gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.C0240Ec r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3286zc.g(Ec):void");
    }

    @Override // defpackage.AbstractC0292Gc, defpackage.InterfaceC2790tm
    /* renamed from: h */
    public final C0266Fc c() {
        C0266Fc c0266Fc;
        C0266Fc c = super.c();
        if (c != null) {
            return c;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            long j2 = this.y;
            if (j2 != -9223372036854775807L && this.e - j2 >= j && (c0266Fc = (C0266Fc) this.b.pollFirst()) != null) {
                this.o = Collections.emptyList();
                this.y = -9223372036854775807L;
                WC f = f();
                long j3 = this.e;
                c0266Fc.d = j3;
                c0266Fc.g = f;
                c0266Fc.h = j3;
                return c0266Fc;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.AbstractC0292Gc
    public final boolean i() {
        if (this.o != this.p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C2786tk c = ((C3200yc) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C2786tk c2786tk = (C2786tk) arrayList2.get(i3);
            if (c2786tk != null) {
                if (c2786tk.i != i) {
                    c2786tk = ((C3200yc) arrayList.get(i3)).c(i);
                    c2786tk.getClass();
                }
                arrayList3.add(c2786tk);
            }
        }
        return arrayList3;
    }

    public final void k() {
        C3200yc c3200yc = this.n;
        c3200yc.g = this.q;
        c3200yc.a.clear();
        c3200yc.b.clear();
        c3200yc.c.setLength(0);
        c3200yc.d = 15;
        c3200yc.e = 0;
        c3200yc.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i == 3) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.m;
                if (i3 < arrayList.size()) {
                    ((C3200yc) arrayList.get(i3)).g = i;
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            k();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.emptyList();
            }
        }
    }

    @Override // defpackage.AbstractC0292Gc, defpackage.InterfaceC2790tm
    public final void release() {
    }
}
