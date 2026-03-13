package defpackage;

import java.util.regex.Pattern;
/* renamed from: rd0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2601rd0 {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(NQ nq) {
        nq.getClass();
        String i = nq.i(AbstractC1629id.c);
        if (i != null && i.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = Ha0.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void d(NQ nq) {
        int i = nq.b;
        if (a(nq)) {
            return;
        }
        nq.G(i);
        throw QQ.a(null, "Expected WEBVTT. Got " + nq.i(AbstractC1629id.c));
    }
}
