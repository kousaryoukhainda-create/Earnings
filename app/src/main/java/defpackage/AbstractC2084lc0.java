package defpackage;

import android.os.Build;
/* renamed from: lc0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2084lc0 {
    public static final boolean a;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        a = z;
    }
}
