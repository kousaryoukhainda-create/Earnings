package com.google.android.play.core.integrity;

import android.content.Context;
/* loaded from: classes3.dex */
public final class bp implements Jf0 {
    private final InterfaceC1378fg0 a;
    private final InterfaceC1378fg0 b;
    private final InterfaceC1378fg0 c;

    public bp(InterfaceC1378fg0 interfaceC1378fg0, InterfaceC1378fg0 interfaceC1378fg02, InterfaceC1378fg0 interfaceC1378fg03, InterfaceC1378fg0 interfaceC1378fg04) {
        this.a = interfaceC1378fg0;
        this.b = interfaceC1378fg02;
        this.c = interfaceC1378fg03;
    }

    @Override // defpackage.InterfaceC1378fg0
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.a.a(), (Rk0) this.b.a(), ((au) this.c).a(), new j());
    }
}
