package defpackage;

import android.os.Build;
/* renamed from: YN  reason: default package */
/* loaded from: classes.dex */
public final class YN extends AbstractC3038wh {
    public static final String e = EI.e("NetworkNotRoamingCtrlr");

    @Override // defpackage.AbstractC3038wh
    public final boolean a(Fe0 fe0) {
        if (fe0.j.a == 4) {
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC3038wh
    public final boolean b(Object obj) {
        C1267eO c1267eO = (C1267eO) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            EI.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !c1267eO.a;
        }
        if (c1267eO.a && c1267eO.d) {
            z = false;
        }
        return z;
    }
}
