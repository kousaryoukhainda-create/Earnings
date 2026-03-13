package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: Gb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0291Gb implements Iterable, Serializable {
    public static final C0291Gb d = new C0291Gb(AbstractC2658sE.b);
    public int b = 0;
    public final byte[] c;

    static {
        Class cls = R2.a;
    }

    public C0291Gb(byte[] bArr) {
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

    public byte c(int i) {
        return this.c[i];
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0291Gb) || size() != ((C0291Gb) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0291Gb) {
            C0291Gb c0291Gb = (C0291Gb) obj;
            int i = this.b;
            int i2 = c0291Gb.b;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size <= c0291Gb.size()) {
                if (size <= c0291Gb.size()) {
                    int e = e() + size;
                    int e2 = e();
                    int e3 = c0291Gb.e();
                    while (e2 < e) {
                        if (this.c[e2] != c0291Gb.c[e3]) {
                            return false;
                        }
                        e2++;
                        e3++;
                    }
                    return true;
                }
                StringBuilder i3 = AbstractC0324Hi.i(size, "Ran off end of other: 0, ", ", ");
                i3.append(c0291Gb.size());
                throw new IllegalArgumentException(i3.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    public byte f(int i) {
        return this.c[i];
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int size = size();
            int e = e();
            int i2 = size;
            for (int i3 = e; i3 < e + size; i3++) {
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
        C0291Gb c0213Db;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = B10.D(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int d2 = d(0, 47, size());
            if (d2 == 0) {
                c0213Db = d;
            } else {
                c0213Db = new C0213Db(this.c, e(), d2);
            }
            sb2.append(B10.D(c0213Db));
            sb2.append("...");
            sb = sb2.toString();
        }
        return AbstractC0324Hi.h(AbstractC0324Hi.j(size, "<ByteString@", hexString, " size=", " contents=\""), sb, "\">");
    }
}
