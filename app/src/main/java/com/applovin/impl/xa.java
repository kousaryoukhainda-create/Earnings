package com.applovin.impl;

import com.applovin.impl.af;
import com.applovin.impl.ud;
/* loaded from: classes.dex */
public abstract class xa implements af.b {
    public final String a;

    public xa(String str) {
        this.a = str;
    }

    @Override // com.applovin.impl.af.b
    public /* synthetic */ void a(ud.b bVar) {
        AbstractC3207yf0.a(this, bVar);
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ e9 b() {
        return AbstractC3207yf0.c(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.a;
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ byte[] a() {
        return AbstractC3207yf0.b(this);
    }
}
