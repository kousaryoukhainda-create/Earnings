package j$.util.stream;

import java.security.AccessController;
import java.security.PrivilegedAction;
/* loaded from: classes4.dex */
abstract class M3 {
    static final boolean a = ((Boolean) AccessController.doPrivileged((PrivilegedAction<Object>) new Object())).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
