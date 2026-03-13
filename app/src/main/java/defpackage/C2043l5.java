package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: l5  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2043l5 extends C1957k5 {
    public static List b(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(asList, "asList(...)");
        return asList;
    }

    public static void c(byte[] bArr, int i, byte[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
    }

    public static final void d(Object[] objArr, int i, Object[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i2, destination, i, i3 - i2);
    }

    public static final void e(Object[] objArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }
}
