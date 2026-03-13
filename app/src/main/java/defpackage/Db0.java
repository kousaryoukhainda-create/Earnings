package defpackage;

import android.text.TextUtils;
import android.view.View;
/* renamed from: Db0  reason: default package */
/* loaded from: classes.dex */
public final class Db0 extends E50 {
    public final /* synthetic */ int e;

    public Db0(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.E50
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Lb0.b(view);
            case 1:
                return Nb0.b(view);
            default:
                return Boolean.valueOf(Lb0.c(view));
        }
    }

    @Override // defpackage.E50
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                Lb0.h(view, (CharSequence) obj);
                return;
            case 1:
                Nb0.e(view, (CharSequence) obj);
                return;
            default:
                Lb0.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // defpackage.E50
    public final boolean e(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        switch (this.e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z3 = false;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    z3 = true;
                }
                return !z3;
        }
    }
}
