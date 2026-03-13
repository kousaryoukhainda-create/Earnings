package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.a4;
import com.applovin.impl.cc;
/* loaded from: classes.dex */
public class xh extends cc {
    private final a4.a n;
    private final Context o;
    private final boolean p;

    public xh(a4.a aVar, boolean z, Context context) {
        super(cc.c.RIGHT_DETAIL);
        this.n = aVar;
        this.o = context;
        this.c = new SpannedString(aVar.a());
        this.p = z;
    }

    @Override // com.applovin.impl.cc
    public SpannedString f() {
        return new SpannedString(this.n.a(this.o));
    }

    @Override // com.applovin.impl.cc
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.cc
    public boolean p() {
        Boolean b = this.n.b(this.o);
        if (b != null) {
            return b.equals(Boolean.valueOf(this.p));
        }
        return false;
    }
}
