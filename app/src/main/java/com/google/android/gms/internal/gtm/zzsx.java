package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Set;
/* loaded from: classes3.dex */
public abstract class zzsx extends zzsq implements Set {
    private transient zzst zza;

    public static int zzf(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static zzsx zzi(Object obj, Object obj2, Object obj3) {
        return zzl(3, "", "0", "false");
    }

    public static zzsx zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, "GET", "HEAD", "POST", "PUT");
    }

    private static zzsx zzl(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int zzf = zzf(i);
                Object[] objArr2 = new Object[zzf];
                int i2 = zzf - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int zza = zzsp.zza(hashCode);
                        while (true) {
                            int i6 = zza & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                zza++;
                            }
                        }
                    } else {
                        throw new NullPointerException(AbstractC0324Hi.e(i5, "at index "));
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzth(obj3);
                }
                if (zzf(i4) < zzf / 2) {
                    return zzl(i4, objArr);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zztf(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzth(obj4);
        }
        return zztf.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzsx) && zzk() && ((zzsx) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zztg.zza(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzsq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzti iterator();

    public final zzst zzg() {
        zzst zzstVar = this.zza;
        if (zzstVar == null) {
            zzst zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzstVar;
    }

    public zzst zzh() {
        Object[] array = toArray();
        int i = zzst.zzd;
        return zzst.zzg(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
