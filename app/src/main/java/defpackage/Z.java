package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Z  reason: default package */
/* loaded from: classes.dex */
public abstract class Z {
    protected int memoizedHashCode;

    public static void b(List list, List list2) {
        Charset charset = AbstractC2658sE.a;
        list.getClass();
        if (list instanceof InterfaceC2489qG) {
            List m = ((InterfaceC2489qG) list).m();
            InterfaceC2489qG interfaceC2489qG = (InterfaceC2489qG) list2;
            int size = list2.size();
            for (Object obj : m) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC2489qG.size() - size) + " is null.";
                    for (int size2 = interfaceC2489qG.size() - 1; size2 >= size; size2--) {
                        interfaceC2489qG.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof C0291Gb) {
                    interfaceC2489qG.a((C0291Gb) obj);
                } else {
                    interfaceC2489qG.add((String) obj);
                }
            }
        } else if (list instanceof ZS) {
            list2.addAll(list);
        } else {
            if (list2 instanceof ArrayList) {
                ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
            }
            int size3 = list2.size();
            for (Object obj2 : list) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                    for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                        list2.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list2.add(obj2);
            }
        }
    }

    public abstract int f(UY uy);

    public abstract void i(C0190Ce c0190Ce);
}
