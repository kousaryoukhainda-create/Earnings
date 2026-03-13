package defpackage;

import java.nio.charset.Charset;
import java.util.UUID;
import java.util.regex.Pattern;
/* renamed from: Eg0  reason: default package */
/* loaded from: classes2.dex */
public abstract class Eg0 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Pattern b = Pattern.compile("(?:[A-Za-z][A-Za-z\\d_]*\\.)+[A-Za-z][A-Za-z\\d_]*$");
    public static final Pattern c = Pattern.compile("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$");
    public static final String d = Eg0.class.getSimpleName();

    public static String a(String str, String str2) {
        if (b(str)) {
            if (!b(str2)) {
                return str2;
            }
            return null;
        }
        return str;
    }

    public static boolean b(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean c(String... strArr) {
        for (String str : strArr) {
            if (b(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str) {
        if (str != null && str.length() >= 36) {
            try {
                return UUID.fromString(str).equals(new UUID(0L, 0L));
            } catch (Exception e) {
                AbstractC1930jl0.i(d, "Couldn't format GAID/uuid", e);
                return false;
            }
        }
        return true;
    }
}
