package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
public final class Headers {
    public final String[] a;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public final ArrayList a = new ArrayList(20);

        public final void a(String str, String str2) {
            ArrayList arrayList = this.a;
            arrayList.add(str);
            arrayList.add(str2.trim());
        }

        public final void b(String str) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i < arrayList.size()) {
                    if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                        arrayList.remove(i);
                        arrayList.remove(i);
                        i -= 2;
                    }
                    i += 2;
                } else {
                    return;
                }
            }
        }

        public final void c(String str, String str2) {
            Headers.a(str);
            Headers.b(str2, str);
            b(str);
            a(str, str2);
        }
    }

    public Headers(Builder builder) {
        ArrayList arrayList = builder.a;
        this.a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str};
                        byte[] bArr = Util.a;
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    public static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str2, str};
                    byte[] bArr = Util.a;
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
                }
            }
            return;
        }
        throw new NullPointerException(AbstractC2437ph.h("value for name ", str2, " == null"));
    }

    public final String c(String str) {
        String[] strArr = this.a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String d(int i) {
        return this.a[i * 2];
    }

    public final Builder e() {
        Builder builder = new Builder();
        Collections.addAll(builder.a, this.a);
        return builder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Headers) && Arrays.equals(((Headers) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.a.length / 2;
    }

    public final String g(int i) {
        return this.a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int f = f();
        for (int i = 0; i < f; i++) {
            sb.append(d(i));
            sb.append(": ");
            sb.append(g(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
