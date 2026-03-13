package defpackage;

import java.io.DataInputStream;
/* renamed from: nE  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2229nE extends DL {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2229nE(int i, int i2, int i3, int i4) {
        super(i, i2, i3);
        this.d = i4;
    }

    @Override // defpackage.AbstractC2007kh
    public final int b() {
        switch (this.d) {
            case 0:
                return 11;
            default:
                return 10;
        }
    }

    @Override // defpackage.DL
    public final int e(L5 l5, int i, int i2) {
        switch (this.d) {
            case 0:
                return l5.g(new C2229nE(i, i2, l5.a, 0));
            default:
                return l5.g(new C2229nE(i, i2, l5.a, 1));
        }
    }

    @Override // defpackage.DL
    public final String f() {
        switch (this.d) {
            case 0:
                return "Interface";
            default:
                return "Method";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2229nE(DataInputStream dataInputStream, int i, int i2) {
        super(dataInputStream, i);
        this.d = i2;
    }
}
