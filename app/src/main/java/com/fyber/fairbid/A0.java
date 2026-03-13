package com.fyber.fairbid;

import java.util.Observable;
import java.util.Observer;
/* loaded from: classes.dex */
public final /* synthetic */ class A0 implements Observer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;

    public /* synthetic */ A0(ci ciVar, int i) {
        this.a = i;
        this.b = ciVar;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        switch (this.a) {
            case 0:
                n8.c((n8) this.b, observable, obj);
                return;
            default:
                w3.d((w3) this.b, observable, obj);
                return;
        }
    }
}
