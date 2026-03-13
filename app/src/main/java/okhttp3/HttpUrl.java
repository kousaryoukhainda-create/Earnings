package okhttp3;

import com.applovin.exoplayer2.common.base.Ascii;
import com.fyber.fairbid.http.connection.HttpConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
public final class HttpUrl {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public String a;
        public String d;
        public final ArrayList f;
        public ArrayList g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final HttpUrl a() {
            if (this.a != null) {
                if (this.d != null) {
                    return new HttpUrl(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:118:0x0237
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final void b(okhttp3.HttpUrl r26, java.lang.String r27) {
            /*
                Method dump skipped, instructions count: 933
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.b(okhttp3.HttpUrl, java.lang.String):void");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int i = this.e;
            if (i != -1 || this.a != null) {
                if (i == -1) {
                    i = HttpUrl.b(this.a);
                }
                String str3 = this.a;
                if (str3 == null || i != HttpUrl.b(str3)) {
                    sb.append(':');
                    sb.append(i);
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append((String) arrayList.get(i2));
            }
            if (this.g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.g;
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3 += 2) {
                    String str4 = (String) arrayList2.get(i3);
                    String str5 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                }
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    public HttpUrl(Builder builder) {
        List list;
        this.a = builder.a;
        String str = builder.b;
        this.b = i(false, str, 0, str.length());
        String str2 = builder.c;
        this.c = i(false, str2, 0, str2.length());
        this.d = builder.d;
        int i = builder.e;
        this.e = i == -1 ? b(builder.a) : i;
        this.f = j(builder.f, false);
        ArrayList arrayList = builder.g;
        if (arrayList != null) {
            list = j(arrayList, true);
        } else {
            list = null;
        }
        this.g = list;
        String str3 = builder.h;
        this.h = str3 != null ? i(false, str3, 0, str3.length()) : null;
        this.i = builder.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kb] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [kb, java.lang.Object] */
    public static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || k(i3, i2, str)))) && (codePointAt != 43 || !z3)))) {
                i3 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.E(i, i3, str);
                ?? r11 = 0;
                while (i3 < i2) {
                    int codePointAt2 = str.codePointAt(i3);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            obj.F(str3);
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < 128 || !z4) && str2.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || (z && (!z2 || k(i3, i2, str)))))) {
                            obj.G(codePointAt2);
                        } else {
                            if (r11 == 0) {
                                r11 = new Object();
                            }
                            r11.G(codePointAt2);
                            while (!r11.a()) {
                                byte i4 = r11.i();
                                obj.C(37);
                                char[] cArr = j;
                                obj.C(cArr[((i4 & 255) >> 4) & 15]);
                                obj.C(cArr[i4 & Ascii.SI]);
                            }
                        }
                    }
                    i3 += Character.charCount(codePointAt2);
                    r11 = r11;
                }
                return obj.u();
            }
        }
        return str.substring(i, i2);
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals(HttpConnection.DEFAULT_SCHEME)) {
            return 443;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kb, java.lang.Object] */
    public static String i(boolean z, String str, int i, int i2) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt != '%' && (charAt != '+' || !z)) {
                i4++;
            } else {
                ?? obj = new Object();
                obj.E(i, i4, str);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i3 = i4 + 2) < i2) {
                        int f = Util.f(str.charAt(i4 + 1));
                        int f2 = Util.f(str.charAt(i3));
                        if (f != -1 && f2 != -1) {
                            obj.C((f << 4) + f2);
                            i4 = i3;
                        }
                        obj.G(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            obj.C(32);
                        }
                        obj.G(codePointAt);
                    }
                    i4 += Character.charCount(codePointAt);
                }
                return obj.u();
            }
        }
        return str.substring(i, i2);
    }

    public static List j(ArrayList arrayList, boolean z) {
        String str;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            if (str2 != null) {
                str = i(z, str2, 0, str2.length());
            } else {
                str = null;
            }
            arrayList2.add(str);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean k(int i, int i2, String str) {
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && Util.f(str.charAt(i + 1)) != -1 && Util.f(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    public static ArrayList l(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.c.isEmpty()) {
            return "";
        }
        String str = this.i;
        return str.substring(str.indexOf(58, this.a.length() + 3) + 1, str.indexOf(64));
    }

    public final String d() {
        String str = this.i;
        int indexOf = str.indexOf(47, this.a.length() + 3);
        return str.substring(indexOf, Util.h(indexOf, str.length(), str, "?#"));
    }

    public final ArrayList e() {
        String str = this.i;
        int indexOf = str.indexOf(47, this.a.length() + 3);
        int h = Util.h(indexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < h) {
            int i = indexOf + 1;
            int i2 = Util.i(str, i, h, '/');
            arrayList.add(str.substring(i, i2));
            indexOf = i2;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof HttpUrl) && ((HttpUrl) obj).i.equals(this.i)) {
            return true;
        }
        return false;
    }

    public final String f() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, Util.i(str, indexOf, str.length(), '#'));
    }

    public final String g() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, Util.h(length, str.length(), str, ":@"));
    }

    public final Builder h() {
        ArrayList arrayList;
        Builder builder = new Builder();
        String str = this.a;
        builder.a = str;
        builder.b = g();
        builder.c = c();
        builder.d = this.d;
        int b = b(str);
        int i = this.e;
        if (i == b) {
            i = -1;
        }
        builder.e = i;
        ArrayList arrayList2 = builder.f;
        arrayList2.clear();
        arrayList2.addAll(e());
        String f = f();
        String str2 = null;
        if (f != null) {
            arrayList = l(a(f, 0, f.length(), " \"'<>#", true, false, true, true));
        } else {
            arrayList = null;
        }
        builder.g = arrayList;
        if (this.h != null) {
            String str3 = this.i;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        builder.h = str2;
        return builder;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI m() {
        Builder h = h();
        ArrayList arrayList = h.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList.set(i, a(str, 0, str.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = h.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) h.g.get(i2);
                if (str2 != null) {
                    h.g.set(i2, a(str2, 0, str2.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str3 = h.h;
        if (str3 != null) {
            h.h = a(str3, 0, str3.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String builder = h.toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                return URI.create(builder.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL n() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        return this.i;
    }
}
