package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Je  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0372Je extends C0346Ie {
    public static int f(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
