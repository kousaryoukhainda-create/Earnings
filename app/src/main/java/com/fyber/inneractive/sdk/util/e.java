package com.fyber.inneractive.sdk.util;
/* loaded from: classes.dex */
public class e implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ b b;

    public e(b bVar, Object obj) {
        this.b = bVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a((b) this.a);
    }
}
