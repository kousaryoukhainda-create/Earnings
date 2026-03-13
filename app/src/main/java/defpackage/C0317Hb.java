package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: Hb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0317Hb implements Iterable, Serializable {
    public static final C0317Hb d = new C0317Hb(AbstractC2744tE.b);
    public static final InterfaceC0265Fb f;
    public int b = 0;
    public final byte[] c;

    static {
        InterfaceC0265Fb c2999wB;
        if (S2.a()) {
            c2999wB = new BI(18);
        } else {
            c2999wB = new C2999wB(18);
        }
        f = c2999wB;
    }

    public C0317Hb(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    public static int d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(AbstractC0324Hi.d(i, i2, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(AbstractC0324Hi.d(i2, i3, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(AbstractC2437ph.c(i, "Beginning index: ", " < 0"));
        }
        return i4;
    }

    public static C0317Hb e(int i, byte[] bArr, int i2) {
        d(i, i + i2, bArr.length);
        return new C0317Hb(f.c(i, bArr, i2));
    }

    public byte c(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0317Hb) || size() != ((C0317Hb) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0317Hb) {
            C0317Hb c0317Hb = (C0317Hb) obj;
            int i = this.b;
            int i2 = c0317Hb.b;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size <= c0317Hb.size()) {
                if (size <= c0317Hb.size()) {
                    int g = g() + size;
                    int g2 = g();
                    int g3 = c0317Hb.g();
                    while (g2 < g) {
                        if (this.c[g2] != c0317Hb.c[g3]) {
                            return false;
                        }
                        g2++;
                        g3++;
                    }
                    return true;
                }
                StringBuilder i3 = AbstractC0324Hi.i(size, "Ran off end of other: 0, ", ", ");
                i3.append(c0317Hb.size());
                throw new IllegalArgumentException(i3.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    public void f(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    public int g() {
        return 0;
    }

    public byte h(int i) {
        return this.c[i];
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int size = size();
            int g = g();
            int i2 = size;
            for (int i3 = g; i3 < g + size; i3++) {
                i2 = (i2 * 31) + this.c[i3];
            }
            if (i2 == 0) {
                i = 1;
            } else {
                i = i2;
            }
            this.b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0187Cb(this);
    }

    public int size() {
        return this.c.length;
    }

    public final String toString() {
        C0317Hb c0239Eb;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC1424g90.A(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int d2 = d(0, 47, size());
            if (d2 == 0) {
                c0239Eb = d;
            } else {
                c0239Eb = new C0239Eb(this.c, g(), d2);
            }
            sb2.append(AbstractC1424g90.A(c0239Eb));
            sb2.append("...");
            sb = sb2.toString();
        }
        return AbstractC0324Hi.h(AbstractC0324Hi.j(size, "<ByteString@", hexString, " size=", " contents=\""), sb, "\">");
    }
}
