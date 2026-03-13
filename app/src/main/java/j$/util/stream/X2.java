package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class X2 extends AbstractC1740d implements Iterable, j$.lang.a {
    Object e;
    Object[] f;

    public abstract Object c(int i);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void v(Object obj, int i, int i2, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int w(Object obj);

    protected abstract Object[] z();

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2(int i) {
        super(i);
        this.e = c(1 << this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2() {
        this.e = c(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(long j) {
        long w;
        int i;
        int i2 = this.c;
        if (i2 == 0) {
            w = w(this.e);
        } else {
            w = w(this.f[i2]) + this.d[i2];
        }
        if (j > w) {
            if (this.f == null) {
                Object[] z = z();
                this.f = z;
                this.d = new long[8];
                z[0] = this.e;
            }
            int i3 = this.c + 1;
            while (j > w) {
                Object[] objArr = this.f;
                if (i3 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int i4 = this.a;
                if (i3 != 0 && i3 != 1) {
                    i4 = Math.min((i4 + i3) - 1, 30);
                }
                int i5 = 1 << i4;
                this.f[i3] = c(i5);
                long[] jArr = this.d;
                jArr[i3] = jArr[i3 - 1] + w(this.f[i]);
                w += i5;
                i3++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int x(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            for (int i = 0; i <= this.c; i++) {
                if (j < this.d[i] + w(this.f[i])) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    public void d(Object obj, int i) {
        long j = i;
        long count = count() + j;
        if (count > w(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, w(obj2));
            i += w(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    public Object e() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c = c((int) count);
        d(c, 0);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A() {
        long w;
        if (this.b == w(this.e)) {
            if (this.f == null) {
                Object[] z = z();
                this.f = z;
                this.d = new long[8];
                z[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    w = w(this.e);
                } else {
                    w = w(objArr[i]) + this.d[i];
                }
                y(w + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    @Override // j$.util.stream.AbstractC1740d
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void g(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            v(obj2, 0, w(obj2), obj);
        }
        v(this.e, 0, this.b, obj);
    }
}
