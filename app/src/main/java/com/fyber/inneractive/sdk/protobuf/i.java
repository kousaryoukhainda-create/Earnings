package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class i implements Iterable<Byte>, Serializable {
    public static final i b = new h(y.b);
    public static final e c;
    public int a = 0;

    /* loaded from: classes.dex */
    public class a extends b {
        public int a = 0;
        public final int b;

        public a() {
            this.b = i.this.size();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.f
        public byte a() {
            int i = this.a;
            if (i < this.b) {
                this.a = i + 1;
                return i.this.d(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a < this.b) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b implements f {
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements e {
        @Override // com.fyber.inneractive.sdk.protobuf.i.e
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends h {
        private static final long serialVersionUID = 1;
        public final int e;
        public final int f;

        public d(byte[] bArr, int i, int i2) {
            super(bArr);
            i.a(i, i + i2, bArr.length);
            this.e = i;
            this.f = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h, com.fyber.inneractive.sdk.protobuf.i
        public void a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d, this.e + i, bArr, i2, i3);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h, com.fyber.inneractive.sdk.protobuf.i
        public byte c(int i) {
            i.a(i, this.f);
            return this.d[this.e + i];
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h, com.fyber.inneractive.sdk.protobuf.i
        public byte d(int i) {
            return this.d[this.e + i];
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h
        public int j() {
            return this.e;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h, com.fyber.inneractive.sdk.protobuf.i
        public int size() {
            return this.f;
        }

        public Object writeReplace() {
            return new h(h());
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface f extends Iterator<Byte> {
        byte a();
    }

    /* loaded from: classes.dex */
    public static abstract class g extends i {
        @Override // com.fyber.inneractive.sdk.protobuf.i, java.lang.Iterable
        public Iterator<Byte> iterator() {
            return new a();
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        private static final long serialVersionUID = 1;
        public final byte[] d;

        public h(byte[] bArr) {
            bArr.getClass();
            this.d = bArr;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public void a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d, i, bArr, i2, i3);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final i b(int i, int i2) {
            int a = i.a(i, i2, size());
            if (a == 0) {
                return i.b;
            }
            return new d(this.d, j() + i, a);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public byte c(int i) {
            return this.d[i];
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public byte d(int i) {
            return this.d[i];
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final boolean e() {
            int j = j();
            return q1.b(this.d, j, size() + j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                int i = this.a;
                int i2 = hVar.a;
                if (i != 0 && i2 != 0 && i != i2) {
                    return false;
                }
                return a(hVar, 0, size());
            }
            return obj.equals(this);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final j g() {
            return j.a(this.d, j(), size(), true);
        }

        public int j() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public int size() {
            return this.d.length;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final void a(com.fyber.inneractive.sdk.protobuf.h hVar) throws IOException {
            hVar.a(this.d, j(), size());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final String a(Charset charset) {
            return new String(this.d, j(), size(), charset);
        }

        public final boolean a(i iVar, int i, int i2) {
            if (i2 <= iVar.size()) {
                int i3 = i + i2;
                if (i3 <= iVar.size()) {
                    if (iVar instanceof h) {
                        h hVar = (h) iVar;
                        byte[] bArr = this.d;
                        byte[] bArr2 = hVar.d;
                        int j = j() + i2;
                        int j2 = j();
                        int j3 = hVar.j() + i;
                        while (j2 < j) {
                            if (bArr[j2] != bArr2[j3]) {
                                return false;
                            }
                            j2++;
                            j3++;
                        }
                        return true;
                    }
                    return iVar.b(i, i3).equals(b(0, i2));
                }
                StringBuilder n = AbstractC2437ph.n("Ran off end of other: ", i, ", ", i2, ", ");
                n.append(iVar.size());
                throw new IllegalArgumentException(n.toString());
            }
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final int b(int i, int i2, int i3) {
            byte[] bArr = this.d;
            int j = j() + i2;
            Charset charset = y.a;
            for (int i4 = j; i4 < j + i3; i4++) {
                i = (i * 31) + bArr[i4];
            }
            return i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0104i implements e {
        @Override // com.fyber.inneractive.sdk.protobuf.i.e
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        e cVar;
        if (com.fyber.inneractive.sdk.protobuf.d.a()) {
            cVar = new C0104i();
        } else {
            cVar = new c();
        }
        c = cVar;
    }

    public static i a(byte[] bArr, int i, int i2) {
        a(i, i + i2, bArr.length);
        return new h(c.a(bArr, i, i2));
    }

    public abstract String a(Charset charset);

    public abstract void a(com.fyber.inneractive.sdk.protobuf.h hVar) throws IOException;

    public abstract void a(byte[] bArr, int i, int i2, int i3);

    public abstract int b(int i, int i2, int i3);

    public abstract i b(int i, int i2);

    public abstract byte c(int i);

    public abstract byte d(int i);

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    @Override // java.lang.Iterable
    /* renamed from: f */
    public f iterator() {
        return new a();
    }

    public abstract j g();

    public final byte[] h() {
        int size = size();
        if (size == 0) {
            return y.b;
        }
        byte[] bArr = new byte[size];
        a(bArr, 0, 0, size);
        return bArr;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            i = b(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public final String i() {
        Charset charset = y.a;
        if (size() == 0) {
            return "";
        }
        return a(charset);
    }

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = i1.a(this);
        } else {
            str = i1.a(b(0, 47)) + "...";
        }
        return AbstractC0324Hi.h(AbstractC0324Hi.j(size, "<ByteString@", hexString, " size=", " contents=\""), str, "\">");
    }

    public static i a(String str) {
        return new h(str.getBytes(y.a));
    }

    public static void a(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.d(i, i2, "Index > length: ", ", "));
        }
    }

    public static int a(int i, int i2, int i3) {
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
}
