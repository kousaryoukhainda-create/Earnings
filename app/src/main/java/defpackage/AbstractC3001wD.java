package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* renamed from: wD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3001wD extends AbstractC2056lD implements Set {
    public static final /* synthetic */ int d = 0;
    public transient AbstractC2571rD c;

    public static int o(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static AbstractC3001wD p(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int o = o(i);
                Object[] objArr2 = new Object[o];
                int i2 = o - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int j0 = AbstractC0957bf.j0(hashCode);
                        while (true) {
                            int i6 = j0 & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                j0++;
                            }
                        }
                    } else {
                        throw new NullPointerException(AbstractC0324Hi.e(i5, "at index "));
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new C2296o20(obj3);
                } else if (o(i4) < o / 2) {
                    return p(i4, objArr);
                } else {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new LV(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C2296o20(obj4);
        }
        return LV.l;
    }

    public static AbstractC3001wD r(Collection collection) {
        if ((collection instanceof AbstractC3001wD) && !(collection instanceof SortedSet)) {
            AbstractC3001wD abstractC3001wD = (AbstractC3001wD) collection;
            if (!abstractC3001wD.l()) {
                return abstractC3001wD;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    @Override // defpackage.AbstractC2056lD
    public AbstractC2571rD e() {
        AbstractC2571rD abstractC2571rD = this.c;
        if (abstractC2571rD == null) {
            AbstractC2571rD t = t();
            this.c = t;
            return t;
        }
        return abstractC2571rD;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3001wD) && (this instanceof LV)) {
            AbstractC3001wD abstractC3001wD = (AbstractC3001wD) obj;
            abstractC3001wD.getClass();
            if ((abstractC3001wD instanceof LV) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC2870uj.v(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2870uj.G(this);
    }

    public AbstractC2571rD t() {
        Object[] array = toArray(AbstractC2056lD.b);
        C2400pD c2400pD = AbstractC2571rD.c;
        return AbstractC2571rD.o(array.length, array);
    }
}
