package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.c6;
import com.applovin.impl.h5;
/* loaded from: classes.dex */
public final class v5 implements h5.a {
    private final Context a;
    private final xo b;
    private final h5.a c;

    public v5(Context context, xo xoVar, h5.a aVar) {
        this.a = context.getApplicationContext();
        this.b = xoVar;
        this.c = aVar;
    }

    @Override // com.applovin.impl.h5.a
    /* renamed from: b */
    public u5 a() {
        u5 u5Var = new u5(this.a, this.c.a());
        xo xoVar = this.b;
        if (xoVar != null) {
            u5Var.a(xoVar);
        }
        return u5Var;
    }

    public v5(Context context, String str) {
        this(context, str, (xo) null);
    }

    public v5(Context context, String str, xo xoVar) {
        this(context, xoVar, new c6.b().a(str));
    }
}
