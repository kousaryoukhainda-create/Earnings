package defpackage;

import android.os.Bundle;
import androidx.fragment.app.z;
/* renamed from: yf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3206yf implements IY {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3206yf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.IY
    public final Bundle a() {
        switch (this.a) {
            case 0:
                return AbstractActivityC0347If.b((AbstractActivityC0347If) this.b);
            case 1:
                return ((z) this.b).V();
            default:
                return CY.a((CY) this.b);
        }
    }
}
