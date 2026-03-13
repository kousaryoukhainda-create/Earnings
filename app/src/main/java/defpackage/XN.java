package defpackage;

import android.os.Build;
/* renamed from: XN  reason: default package */
/* loaded from: classes.dex */
public final class XN extends AbstractC3038wh {
    public static final String e = EI.e("NetworkMeteredCtrlr");

    @Override // defpackage.AbstractC3038wh
    public final boolean a(Fe0 fe0) {
        if (fe0.j.a == 5) {
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC3038wh
    public final boolean b(Object obj) {
        C1267eO c1267eO = (C1267eO) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            EI.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !c1267eO.a;
        }
        if (c1267eO.a && c1267eO.c) {
            z = false;
        }
        return z;
    }
}
