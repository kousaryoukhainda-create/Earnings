package defpackage;

import android.content.Context;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.l;
/* renamed from: Zi0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Zi0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ l c;
    public final /* synthetic */ b d;
    public final /* synthetic */ Context f;

    public /* synthetic */ Zi0(l lVar, b bVar, Context context, int i) {
        this.b = i;
        this.c = lVar;
        this.d = bVar;
        this.f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                l.b(this.c, this.d, this.f);
                return;
            default:
                l.a(this.c, this.d, this.f);
                return;
        }
    }
}
