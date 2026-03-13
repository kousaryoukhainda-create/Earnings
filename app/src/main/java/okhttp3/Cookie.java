package okhttp3;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;
/* loaded from: classes2.dex */
public final class Cookie {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* loaded from: classes2.dex */
    public static final class Builder {
    }

    public Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.h = z4;
    }

    public static int a(boolean z, String str, int i, int i2) {
        boolean z2;
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static long b(int i, String str) {
        int a = a(false, str, 0, i);
        Pattern pattern = m;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (a < i) {
            int a2 = a(true, str, a + 1, i);
            matcher.region(a, a2);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(l).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else {
                if (i5 == -1) {
                    Pattern pattern2 = k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i5 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(j).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            a = a(false, str, a2 + 1, i);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 >= 1601) {
            if (i5 != -1) {
                if (i4 >= 1 && i4 <= 31) {
                    if (i3 >= 0 && i3 <= 23) {
                        if (i6 >= 0 && i6 <= 59) {
                            if (i7 >= 0 && i7 <= 59) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i2);
                                gregorianCalendar.set(2, i5 - 1);
                                gregorianCalendar.set(5, i4);
                                gregorianCalendar.set(11, i3);
                                gregorianCalendar.set(12, i6);
                                gregorianCalendar.set(13, i7);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException();
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (!cookie.a.equals(this.a) || !cookie.b.equals(this.b) || !cookie.d.equals(this.d) || !cookie.e.equals(this.e) || cookie.c != this.c || cookie.f != this.f || cookie.g != this.g || cookie.h != this.h || cookie.i != this.i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b = AbstractC2437ph.b(AbstractC2437ph.b(AbstractC2437ph.b(AbstractC2437ph.b(527, 31, this.a), 31, this.b), 31, this.d), 31, this.e);
        long j2 = this.c;
        return ((((((((b + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) HttpDate.a.get()).format(new Date(j2)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
