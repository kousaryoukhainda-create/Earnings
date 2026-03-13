package okhttp3.internal;

import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
/* loaded from: classes2.dex */
public final class Util {
    public static final byte[] a;
    public static final String[] b = new String[0];
    public static final ResponseBody c;
    public static final Charset d;
    public static final TimeZone e;
    public static final Comparator f;
    public static final Method g;
    public static final Pattern h;

    static {
        Method method;
        byte[] bArr = new byte[0];
        a = bArr;
        c = ResponseBody.c(bArr);
        RequestBody.c(bArr);
        C0343Ib.g("efbbbf");
        C0343Ib.g("feff");
        C0343Ib.g("fffe");
        C0343Ib.g("0000ffff");
        C0343Ib.g("ffff0000");
        d = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        e = DesugarTimeZone.getTimeZone("GMT");
        f = new Comparator<String>() { // from class: okhttp3.internal.Util.1
            @Override // java.util.Comparator
            public final int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        };
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        g = method;
        h = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    private Util() {
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [kb, java.lang.Object] */
    public static String b(String str) {
        InetAddress g2;
        int i = -1;
        int i2 = 0;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                g2 = g(1, str.length() - 1, str);
            } else {
                g2 = g(0, str.length(), str);
            }
            if (g2 == null) {
                return null;
            }
            byte[] address = g2.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                ?? obj = new Object();
                while (i2 < address.length) {
                    if (i2 == i) {
                        obj.C(58);
                        i2 += i4;
                        if (i2 == 16) {
                            obj.C(58);
                        }
                    } else {
                        if (i2 > 0) {
                            obj.C(58);
                        }
                        obj.D(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                return obj.u();
            }
            throw new AssertionError(AbstractC2437ph.h("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            while (i2 < lowerCase.length()) {
                char charAt = lowerCase.charAt(i2);
                if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                    i2++;
                }
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int c(long j, TimeUnit timeUnit) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis == 0 && i > 0) {
                        throw new IllegalArgumentException("timeout too small.");
                    }
                    return (int) millis;
                }
                throw new IllegalArgumentException("timeout too large.");
            }
            throw new NullPointerException("unit == null");
        }
        throw new IllegalArgumentException("timeout < 0");
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void e(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!o(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                if ("bio == null".equals(e3.getMessage())) {
                    return;
                }
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int f(char c2) {
        if (c2 < '0' || c2 > '9') {
            if (c2 < 'a' || c2 > 'f') {
                if (c2 < 'A' || c2 > 'F') {
                    return -1;
                }
                return c2 - '7';
            }
            return c2 - 'W';
        }
        return c2 - '0';
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress g(int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.g(int, int, java.lang.String):java.net.InetAddress");
    }

    public static int h(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int i(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static String k(HttpUrl httpUrl, boolean z) {
        boolean contains = httpUrl.d.contains(":");
        String str = httpUrl.d;
        if (contains) {
            str = AbstractC2437ph.h("[", str, "]");
        }
        int i = httpUrl.e;
        if (z || i != HttpUrl.b(httpUrl.a)) {
            return str + ":" + i;
        }
        return str;
    }

    public static List l(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List m(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] n(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean o(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    public static boolean p(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [kb, java.lang.Object] */
    public static boolean q(InterfaceC0817a30 interfaceC0817a30, int i, TimeUnit timeUnit) {
        long j;
        long nanoTime = System.nanoTime();
        if (interfaceC0817a30.g().e()) {
            j = interfaceC0817a30.g().c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        interfaceC0817a30.g().d(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            ?? obj = new Object();
            while (interfaceC0817a30.d(8192L, obj) != -1) {
                obj.w(obj.c);
            }
            if (j == Long.MAX_VALUE) {
                interfaceC0817a30.g().a();
                return true;
            }
            interfaceC0817a30.g().d(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                interfaceC0817a30.g().a();
                return false;
            }
            interfaceC0817a30.g().d(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                interfaceC0817a30.g().a();
            } else {
                interfaceC0817a30.g().d(nanoTime + j);
            }
            throw th;
        }
    }

    public static int r(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int s(int i, int i2, String str) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static ThreadFactory t(final String str, final boolean z) {
        return new ThreadFactory() { // from class: okhttp3.internal.Util.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static Headers u(ArrayList arrayList) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            Internal.a.b(builder, header.a.w(), header.b.w());
        }
        return new Headers(builder);
    }
}
