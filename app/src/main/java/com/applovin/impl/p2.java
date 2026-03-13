package com.applovin.impl;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.impl.db;
import com.applovin.impl.o2;
import java.util.List;
/* loaded from: classes.dex */
public abstract class p2 {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) xp.a(p2.class.getClassLoader()));
        }
    }

    public static List a(o2.a aVar, List list, List list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static SparseArray a(o2.a aVar, SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray sparseArray3 = new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray3.put(sparseArray.keyAt(i), aVar.a((Bundle) sparseArray.valueAt(i)));
        }
        return sparseArray3;
    }

    public static o2 a(o2.a aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.a(bundle);
    }

    public static db a(o2.a aVar, List list) {
        db.a f = db.f();
        for (int i = 0; i < list.size(); i++) {
            f.b(aVar.a((Bundle) b1.a((Bundle) list.get(i))));
        }
        return f.a();
    }
}
