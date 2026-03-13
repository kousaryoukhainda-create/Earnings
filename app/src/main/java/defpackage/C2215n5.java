package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: n5  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2215n5 extends C2043l5 {
    public static boolean f(Object[] objArr, Object obj) {
        int i;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (obj.equals(objArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static ArrayList g(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object h(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static String i(Object[] objArr, String separator, String prefix, String postfix, int i) {
        if ((i & 2) != 0) {
            prefix = "";
        }
        if ((i & 4) != 0) {
            postfix = "";
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) prefix);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                buffer.append((CharSequence) separator);
            }
            C2987w40.a(buffer, obj, null);
        }
        buffer.append((CharSequence) postfix);
        return buffer.toString();
    }

    public static List j(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return C0320He.a(Long.valueOf(jArr[0]));
        }
        return C2968vr.b;
    }

    public static List k(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                return new ArrayList(new V4(objArr, false));
            }
            return C0320He.a(objArr[0]);
        }
        return C2968vr.b;
    }
}
