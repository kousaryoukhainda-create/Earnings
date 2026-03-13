package com.fyber.fairbid;

import android.content.Context;
/* loaded from: classes.dex */
public final class dm extends rj<a, Void> {
    public static final am i = new am();
    public h6<C2857uc0, C2771tc0> e;
    public final s5 f;
    public final Context g;
    public final boolean h;

    /* loaded from: classes.dex */
    public interface a {
    }

    public dm(dm dmVar) {
        super(dmVar.b, dmVar.d);
        this.h = true;
        this.e = dmVar.e;
        this.g = dmVar.g;
        this.f = new s5(dmVar.f).b(dmVar.f.c());
        this.h = false;
    }

    public final String e() {
        return (String) this.f.a("CURRENCY_ID");
    }

    public dm(s5 s5Var, String str, Context context) {
        super(s5Var.b().a(), str);
        this.h = true;
        this.f = s5Var;
        this.g = context.getApplicationContext();
    }
}
