package defpackage;

import java.io.IOException;
/* renamed from: C90  reason: default package */
/* loaded from: classes.dex */
public final class C90 {
    public static final C90 f = new C90(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public C90(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int v0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                ((Integer) this.c[i3]).getClass();
                                v0 = C0190Ce.f0(i5);
                            } else {
                                int i7 = EE.b;
                                throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                            }
                        } else {
                            i2 = ((C90) this.c[i3]).a() + (C0190Ce.s0(i5) * 2) + i2;
                        }
                    } else {
                        v0 = C0190Ce.b0(i5, (C0291Gb) this.c[i3]);
                    }
                } else {
                    ((Long) this.c[i3]).getClass();
                    v0 = C0190Ce.g0(i5);
                }
            } else {
                v0 = C0190Ce.v0(i5, ((Long) this.c[i3]).longValue());
            }
            i2 = v0 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void b(WC wc) {
        if (this.a == 0) {
            return;
        }
        wc.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                wc.Q(i3, ((Integer) obj).intValue());
                            } else {
                                int i5 = EE.b;
                                throw new RuntimeException(new IOException("Protocol message tag had invalid wire type."));
                            }
                        } else {
                            C0190Ce c0190Ce = (C0190Ce) wc.c;
                            c0190Ce.G0(i3, 3);
                            ((C90) obj).b(wc);
                            c0190Ce.G0(i3, 4);
                        }
                    } else {
                        wc.N(i3, (C0291Gb) obj);
                    }
                } else {
                    wc.R(i3, ((Long) obj).longValue());
                }
            } else {
                wc.V(i3, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C90)) {
            return false;
        }
        C90 c90 = (C90) obj;
        int i = this.a;
        if (i == c90.a) {
            int[] iArr = this.b;
            int[] iArr2 = c90.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c90.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
