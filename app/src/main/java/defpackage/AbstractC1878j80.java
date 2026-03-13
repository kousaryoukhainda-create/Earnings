package defpackage;

import android.os.Build;
/* renamed from: j80  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1878j80 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        a = true;
        b = true;
        if (i < 28) {
            z = false;
        }
        c = z;
    }
}
