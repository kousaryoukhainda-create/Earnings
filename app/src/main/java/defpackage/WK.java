package defpackage;

import java.util.HashSet;
/* renamed from: WK  reason: default package */
/* loaded from: classes.dex */
public abstract class WK {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (WK.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }
}
