package com.fyber.inneractive.sdk.util;
/* loaded from: classes.dex */
public class d implements Runnable {
    public final /* synthetic */ Object[] a;
    public final /* synthetic */ b b;

    public d(b bVar, Object[] objArr) {
        this.b = bVar;
        this.a = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object a = this.b.a(this.a);
        b bVar = this.b;
        if (bVar.f) {
            return;
        }
        bVar.c = new e(bVar, a);
        bVar.a().post(this.b.c);
    }
}
