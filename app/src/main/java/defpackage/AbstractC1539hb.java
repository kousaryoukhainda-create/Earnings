package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* renamed from: hb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1539hb extends AbstractC0401Kh {
    public static final String h = EI.e("BrdcstRcvrCnstrntTrckr");
    public final C2381p2 g;

    public AbstractC1539hb(Context context, N50 n50) {
        super(context, n50);
        this.g = new C2381p2(this, 2);
    }

    @Override // defpackage.AbstractC0401Kh
    public final void d() {
        EI.c().a(h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.b.registerReceiver(this.g, f());
    }

    @Override // defpackage.AbstractC0401Kh
    public final void e() {
        EI.c().a(h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
