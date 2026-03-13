package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: QW  reason: default package */
/* loaded from: classes2.dex */
public final class QW extends K implements RandomAccess {
    public final Object[] b;
    public final int c;
    public int d;
    public int f;

    public QW(Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.b = buffer;
        if (i >= 0) {
            if (i <= buffer.length) {
                this.c = buffer.length;
                this.f = i;
                return;
            }
            StringBuilder i2 = AbstractC0324Hi.i(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            i2.append(buffer.length);
            throw new IllegalArgumentException(i2.toString().toString());
        }
        throw new IllegalArgumentException(AbstractC0324Hi.e(i, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override // defpackage.AbstractC2633s
    public final int e() {
        return this.f;
    }

    public final void f() {
        if (20 <= this.f) {
            int i = this.d;
            int i2 = this.c;
            int i3 = (i + 20) % i2;
            Object[] objArr = this.b;
            if (i > i3) {
                C2043l5.e(objArr, i, i2);
                C2043l5.e(objArr, 0, i3);
            } else {
                C2043l5.e(objArr, i, i3);
            }
            this.d = i3;
            this.f -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f).toString());
    }

    @Override // java.util.List
    public final Object get(int i) {
        int e = e();
        if (i >= 0 && i < e) {
            return this.b[(this.d + i) % this.c];
        }
        throw new IndexOutOfBoundsException(AbstractC0324Hi.d(i, e, "index: ", ", size: "));
    }

    @Override // defpackage.K, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new PW(this);
    }

    @Override // defpackage.AbstractC2633s, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    @Override // defpackage.AbstractC2633s, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.f;
        if (length < i) {
            array = Arrays.copyOf(array, i);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int i2 = this.f;
        int i3 = this.d;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.b;
            if (i5 >= i2 || i3 >= this.c) {
                break;
            }
            array[i5] = objArr[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            array[i5] = objArr[i4];
            i5++;
            i4++;
        }
        Intrinsics.checkNotNullParameter(array, "array");
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }
}
