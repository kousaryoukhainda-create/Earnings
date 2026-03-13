package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: w40  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2987w40 {
    public static void a(StringBuilder sb, Object obj, Function1 function1) {
        boolean z;
        Intrinsics.checkNotNullParameter(sb, "<this>");
        if (function1 != null) {
            sb.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }
}
