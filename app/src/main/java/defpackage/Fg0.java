package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: Fg0  reason: default package */
/* loaded from: classes.dex */
public final class Fg0 {
    static {
        new HashMap();
        new HashMap();
    }

    public Fg0(ArrayList arrayList) {
        new HashMap();
        new HashMap();
        a(arrayList);
    }

    public static void a(ArrayList arrayList) {
        Log.d("AGC_ServiceRepository", "addService start");
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            Log.d("AGC_ServiceRepository", "addService end");
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
