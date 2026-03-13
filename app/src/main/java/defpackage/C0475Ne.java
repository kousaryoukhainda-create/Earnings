package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ne  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0475Ne extends C0449Me {
    public static void g(Iterable elements, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        for (Object obj : elements) {
            collection.add(obj);
        }
    }
}
