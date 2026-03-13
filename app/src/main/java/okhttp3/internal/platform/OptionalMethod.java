package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;
/* loaded from: classes2.dex */
class OptionalMethod<T> {
    public final Class a;
    public final String b;
    public final Class[] c;

    public OptionalMethod(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Method a(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.b
            java.lang.Class[] r1 = r3.c
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L15
            int r0 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L13
            r0 = r0 & 1
            if (r0 != 0) goto L17
        L11:
            r4 = r2
            goto L17
        L13:
            goto L17
        L15:
            goto L11
        L17:
            if (r4 == 0) goto L28
            java.lang.Class r0 = r3.a
            if (r0 == 0) goto L28
            java.lang.Class r1 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L28
            goto L29
        L28:
            r2 = r4
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.OptionalMethod.a(java.lang.Class):java.lang.reflect.Method");
    }

    public final Object b(SSLSocket sSLSocket, Object... objArr) {
        Method a = a(sSLSocket.getClass());
        if (a != null) {
            try {
                return a.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.b + " not supported for object " + sSLSocket);
    }

    public final void c(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method a = a(sSLSocket.getClass());
            if (a != null) {
                try {
                    a.invoke(sSLSocket, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
