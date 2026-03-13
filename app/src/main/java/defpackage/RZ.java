package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: RZ  reason: default package */
/* loaded from: classes2.dex */
public abstract class RZ extends SZ {
    public static C2780th X(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        C2129m5 c2129m5 = new C2129m5(it, 4);
        Intrinsics.checkNotNullParameter(c2129m5, "<this>");
        return new C2780th(c2129m5);
    }

    public static final C0571Qw Y(NZ nz, Function1 iterator) {
        if (nz instanceof Z70) {
            Z70 z70 = (Z70) nz;
            Intrinsics.checkNotNullParameter(iterator, "iterator");
            return new C0571Qw(z70.a, z70.b, iterator);
        }
        return new C0571Qw(nz, new C0668Up(4), iterator);
    }

    public static Z70 Z(NZ nz, Function1 transform) {
        Intrinsics.checkNotNullParameter(nz, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new Z70(nz, transform);
    }

    public static NZ a0(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        if (elements.length == 0) {
            return C3226yr.a;
        }
        return new C2129m5(elements, 0);
    }

    public static List b0(NZ nz) {
        Intrinsics.checkNotNullParameter(nz, "<this>");
        Iterator it = nz.iterator();
        if (!it.hasNext()) {
            return C2968vr.b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C0320He.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
