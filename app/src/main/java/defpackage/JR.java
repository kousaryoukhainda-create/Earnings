package defpackage;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: JR  reason: default package */
/* loaded from: classes2.dex */
public abstract class JR {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        Intrinsics.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (Intrinsics.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (Intrinsics.a(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !Intrinsics.a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
