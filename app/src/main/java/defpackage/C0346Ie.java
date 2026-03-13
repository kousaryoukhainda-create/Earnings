package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ie  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0346Ie extends C0320He {
    public static int b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List c(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length > 0) {
            return C2043l5.b(elements);
        }
        return C2968vr.b;
    }

    public static final List d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return C0320He.a(list.get(0));
            }
            return list;
        }
        return C2968vr.b;
    }

    public static void e() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
