package defpackage;

import android.os.Bundle;
/* renamed from: Hk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0326Hk implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ BinderC0352Ik i;

    public RunnableC0326Hk(BinderC0352Ik binderC0352Ik, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.i = binderC0352Ik;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = i4;
        this.g = i5;
        this.h = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.c.onActivityLayout(this.b, this.c, this.d, this.f, this.g, this.h);
    }
}
