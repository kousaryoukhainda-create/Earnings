package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
/* renamed from: cT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1025cT {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(EnumC0849aT.b, 0);
        hashMap.put(EnumC0849aT.c, 1);
        hashMap.put(EnumC0849aT.d, 2);
        for (EnumC0849aT enumC0849aT : hashMap.keySet()) {
            a.append(((Integer) b.get(enumC0849aT)).intValue(), enumC0849aT);
        }
    }

    public static int a(EnumC0849aT enumC0849aT) {
        Integer num = (Integer) b.get(enumC0849aT);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC0849aT);
    }

    public static EnumC0849aT b(int i) {
        EnumC0849aT enumC0849aT = (EnumC0849aT) a.get(i);
        if (enumC0849aT != null) {
            return enumC0849aT;
        }
        throw new IllegalArgumentException(AbstractC0324Hi.e(i, "Unknown Priority for value "));
    }
}
