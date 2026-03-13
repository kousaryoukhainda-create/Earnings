package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* renamed from: kD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1970kD {
    public Object[] a;
    public int b;
    public boolean c;

    public AbstractC1970kD(int i) {
        AbstractC1906jZ.n(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public static int f(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object obj) {
        obj.getClass();
        g(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        AbstractC1906jZ.l(length, objArr);
        g(this.b + length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public abstract AbstractC1970kD c(Object obj);

    public void d(Object obj) {
        a(obj);
    }

    public final void e(List list) {
        if (list instanceof Collection) {
            g(list.size() + this.b);
            if (list instanceof AbstractC2056lD) {
                this.b = ((AbstractC2056lD) list).f(this.b, this.a);
                return;
            }
        }
        for (Object obj : list) {
            c(obj);
        }
    }

    public final void g(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, f(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
