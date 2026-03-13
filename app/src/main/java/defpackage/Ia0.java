package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* renamed from: Ia0  reason: default package */
/* loaded from: classes.dex */
public final class Ia0 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static Ia0 d;
    public final C0335Ht a;

    public Ia0(C0335Ht c0335Ht) {
        this.a = c0335Ht;
    }

    public final boolean a(P8 p8) {
        if (TextUtils.isEmpty(p8.c)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        if (p8.f + p8.e < timeUnit.toSeconds(System.currentTimeMillis()) + b) {
            return true;
        }
        return false;
    }
}
