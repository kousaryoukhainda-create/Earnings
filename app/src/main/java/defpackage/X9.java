package defpackage;

import android.view.View;
/* renamed from: X9  reason: default package */
/* loaded from: classes3.dex */
public final class X9 implements KP {
    public final /* synthetic */ AbstractC1279ea b;

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.b.a(0);
    }

    @Override // defpackage.KP
    public Pd0 e(View view, Pd0 pd0) {
        int a = pd0.a();
        AbstractC1279ea abstractC1279ea = this.b;
        abstractC1279ea.h = a;
        abstractC1279ea.i = pd0.b();
        abstractC1279ea.j = pd0.c();
        abstractC1279ea.e();
        return pd0;
    }
}
