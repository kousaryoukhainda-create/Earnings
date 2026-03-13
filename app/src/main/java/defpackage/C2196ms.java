package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: ms  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2196ms {
    public static void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (cause != exception) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(exception, "exception");
            Integer num = PE.a;
            if (num != null && num.intValue() < 19) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(exception, "exception");
                Method method = JR.a;
                if (method != null) {
                    method.invoke(cause, exception);
                    return;
                }
                return;
            }
            cause.addSuppressed(exception);
        }
    }

    public static String b(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
