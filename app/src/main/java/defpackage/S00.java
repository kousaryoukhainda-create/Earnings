package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: S00  reason: default package */
/* loaded from: classes2.dex */
public class S00 extends R00 {
    public static Set b(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet destination = new LinkedHashSet(C2062lJ.a(elements.length));
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : elements) {
            destination.add(obj);
        }
        return destination;
    }

    public static Set c(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        int length = elements.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet destination = new LinkedHashSet(C2062lJ.a(elements.length));
                Intrinsics.checkNotNullParameter(elements, "<this>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                for (Object obj : elements) {
                    destination.add(obj);
                }
                return destination;
            }
            return R00.a(elements[0]);
        }
        return C3312zr.b;
    }
}
