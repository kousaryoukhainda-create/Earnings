package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes.dex */
public abstract class hb extends bb implements Set {
    private transient db b;

    private static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static hb h() {
        return oi.i;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof hb) && g() && ((hb) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        return rj.a(this, obj);
    }

    public db f() {
        return db.a(toArray());
    }

    public boolean g() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return rj.a(this);
    }

    @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract pp iterator();

    @Override // com.applovin.impl.bb
    public db a() {
        db dbVar = this.b;
        if (dbVar == null) {
            db f = f();
            this.b = f;
            return f;
        }
        return dbVar;
    }

    public static int a(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        Preconditions.checkArgument(max < 1073741824, "collection too large");
        return 1073741824;
    }

    private static hb a(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int a = a(i);
                Object[] objArr2 = new Object[a];
                int i2 = a - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object a2 = fg.a(objArr[i5], i5);
                    int hashCode = a2.hashCode();
                    int a3 = ja.a(hashCode);
                    while (true) {
                        int i6 = a3 & i2;
                        Object obj = objArr2[i6];
                        if (obj == null) {
                            objArr[i4] = a2;
                            objArr2[i6] = a2;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj.equals(a2)) {
                            break;
                        } else {
                            a3++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    return new hk(objArr[0], i3);
                }
                if (a(i4) < a / 2) {
                    return a(i4, objArr);
                }
                if (a(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new oi(objArr, i3, objArr2, i2, i4);
            }
            return a(objArr[0]);
        }
        return h();
    }

    public static hb a(Collection collection) {
        if ((collection instanceof hb) && !(collection instanceof SortedSet)) {
            hb hbVar = (hb) collection;
            if (!hbVar.e()) {
                return hbVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static hb a(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return a(objArr.length, (Object[]) objArr.clone());
            }
            return a(objArr[0]);
        }
        return h();
    }

    public static hb a(Object obj, Object obj2) {
        return a(2, obj, obj2);
    }

    public static hb a(Object obj, Object obj2, Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    public static hb a(Object obj) {
        return new hk(obj);
    }
}
