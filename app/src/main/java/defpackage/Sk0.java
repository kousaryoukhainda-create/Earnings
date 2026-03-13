package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.C1080v;
import com.applovin.impl.sb;
/* renamed from: Sk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Sk0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ Sk0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((sb) this.c).a((ViewGroup) this.d, (Context) this.f, (AppLovinFullscreenAdViewObserver) this.g);
                return;
            default:
                C1080v.a((C1080v) this.c, (C1080v.b) this.d, (String) this.f, (String) this.g);
                return;
        }
    }
}
