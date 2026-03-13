package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: UQ  reason: default package */
/* loaded from: classes2.dex */
public final class UQ implements Comparable {
    public static final String c;
    public final C0343Ib b;

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        c = separator;
    }

    public UQ(C0343Ib bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.b = bytes;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        UQ other = (UQ) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.b.compareTo(other.b);
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        int a = AbstractC1318f.a(this);
        C0343Ib c0343Ib = this.b;
        if (a == -1) {
            a = 0;
        } else if (a < c0343Ib.i() && c0343Ib.n(a) == 92) {
            a++;
        }
        int i = c0343Ib.i();
        int i2 = a;
        while (a < i) {
            if (c0343Ib.n(a) == 47 || c0343Ib.n(a) == 92) {
                arrayList.add(c0343Ib.t(i2, a));
                i2 = a + 1;
            }
            a++;
        }
        if (i2 < c0343Ib.i()) {
            arrayList.add(c0343Ib.t(i2, c0343Ib.i()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UQ) && Intrinsics.a(((UQ) obj).b, this.b)) {
            return true;
        }
        return false;
    }

    public final String f() {
        C0343Ib c0343Ib = AbstractC1318f.a;
        C0343Ib c0343Ib2 = AbstractC1318f.a;
        C0343Ib c0343Ib3 = this.b;
        int p = C0343Ib.p(c0343Ib3, c0343Ib2);
        if (p == -1) {
            p = C0343Ib.p(c0343Ib3, AbstractC1318f.b);
        }
        if (p != -1) {
            c0343Ib3 = C0343Ib.u(c0343Ib3, p + 1, 0, 2);
        } else if (k() != null && c0343Ib3.i() == 2) {
            c0343Ib3 = C0343Ib.f;
        }
        return c0343Ib3.w();
    }

    public final UQ g() {
        C0343Ib c0343Ib = AbstractC1318f.d;
        C0343Ib c0343Ib2 = this.b;
        if (Intrinsics.a(c0343Ib2, c0343Ib)) {
            return null;
        }
        C0343Ib c0343Ib3 = AbstractC1318f.a;
        if (Intrinsics.a(c0343Ib2, c0343Ib3)) {
            return null;
        }
        C0343Ib prefix = AbstractC1318f.b;
        if (Intrinsics.a(c0343Ib2, prefix)) {
            return null;
        }
        C0343Ib suffix = AbstractC1318f.e;
        c0343Ib2.getClass();
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int i = c0343Ib2.i();
        byte[] bArr = suffix.b;
        if (c0343Ib2.s(i - bArr.length, suffix, bArr.length) && (c0343Ib2.i() == 2 || c0343Ib2.s(c0343Ib2.i() - 3, c0343Ib3, 1) || c0343Ib2.s(c0343Ib2.i() - 3, prefix, 1))) {
            return null;
        }
        int p = C0343Ib.p(c0343Ib2, c0343Ib3);
        if (p == -1) {
            p = C0343Ib.p(c0343Ib2, prefix);
        }
        if (p == 2 && k() != null) {
            if (c0343Ib2.i() == 3) {
                return null;
            }
            return new UQ(C0343Ib.u(c0343Ib2, 0, 3, 1));
        }
        if (p == 1) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            if (c0343Ib2.s(0, prefix, prefix.b.length)) {
                return null;
            }
        }
        if (p == -1 && k() != null) {
            if (c0343Ib2.i() == 2) {
                return null;
            }
            return new UQ(C0343Ib.u(c0343Ib2, 0, 2, 1));
        } else if (p == -1) {
            return new UQ(c0343Ib);
        } else {
            if (p == 0) {
                return new UQ(C0343Ib.u(c0343Ib2, 0, 1, 1));
            }
            return new UQ(C0343Ib.u(c0343Ib2, 0, p, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kb, java.lang.Object] */
    public final UQ h(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        ?? obj = new Object();
        obj.F(child);
        return AbstractC1318f.b(this, AbstractC1318f.d(obj, false), false);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final File i() {
        return new File(this.b.w());
    }

    public final Path j() {
        Path path;
        path = Paths.get(this.b.w(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(toString())");
        return path;
    }

    public final Character k() {
        C0343Ib c0343Ib = AbstractC1318f.a;
        C0343Ib c0343Ib2 = this.b;
        if (C0343Ib.l(c0343Ib2, c0343Ib) != -1 || c0343Ib2.i() < 2 || c0343Ib2.n(1) != 58) {
            return null;
        }
        char n = (char) c0343Ib2.n(0);
        if (('a' > n || n >= '{') && ('A' > n || n >= '[')) {
            return null;
        }
        return Character.valueOf(n);
    }

    public final String toString() {
        return this.b.w();
    }
}
