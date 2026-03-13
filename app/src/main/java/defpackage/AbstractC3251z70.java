package defpackage;

import android.os.Trace;
/* renamed from: z70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3251z70 {
    public static void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
