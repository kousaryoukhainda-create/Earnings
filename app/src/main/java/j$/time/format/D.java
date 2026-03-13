package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class D {
    public static final D a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(char c) {
        int i = c - '0';
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public final int hashCode() {
        return 182;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.D, java.lang.Object] */
    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            ((D) obj).getClass();
            return true;
        }
        return false;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
