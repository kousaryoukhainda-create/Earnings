package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: AL  reason: default package */
/* loaded from: classes2.dex */
public final class AL extends AbstractC2121m1 {
    public int b;
    public int c;

    @Override // defpackage.AbstractC2121m1
    public final boolean a(C0369Jb c0369Jb, int i) {
        int i2 = this.b;
        switch (i) {
            case 172:
                c0369Jb.u(i2);
                break;
            case 173:
                c0369Jb.A(i2);
                break;
            case 174:
                c0369Jb.k(i2);
                break;
            case 175:
                c0369Jb.h(i2);
                break;
            case 176:
                c0369Jb.d(i2);
                break;
            case 177:
                break;
            default:
                throw new RuntimeException(Constants.FATAL);
        }
        c0369Jb.B(167);
        c0369Jb.o((this.c - c0369Jb.c) + 3);
        return true;
    }
}
