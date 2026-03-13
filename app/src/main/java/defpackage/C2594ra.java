package defpackage;

import android.os.Build;
/* renamed from: ra  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2594ra extends AbstractC3038wh {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2594ra(AbstractC0401Kh abstractC0401Kh, int i) {
        super(abstractC0401Kh);
        this.e = i;
    }

    @Override // defpackage.AbstractC3038wh
    public final boolean a(Fe0 fe0) {
        switch (this.e) {
            case 0:
                return fe0.j.b;
            case 1:
                return fe0.j.d;
            case 2:
                if (fe0.j.a == 2) {
                    return true;
                }
                return false;
            case 3:
                int i = fe0.j.a;
                if (i != 3 && (Build.VERSION.SDK_INT < 30 || i != 6)) {
                    return false;
                }
                return true;
            default:
                return fe0.j.e;
        }
    }

    @Override // defpackage.AbstractC3038wh
    public final boolean b(Object obj) {
        switch (this.e) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C1267eO c1267eO = (C1267eO) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!c1267eO.a || !c1267eO.b) {
                        return true;
                    }
                    return false;
                }
                return true ^ c1267eO.a;
            case 3:
                C1267eO c1267eO2 = (C1267eO) obj;
                if (c1267eO2.a && !c1267eO2.c) {
                    return false;
                }
                return true;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
