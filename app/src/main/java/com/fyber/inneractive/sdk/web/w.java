package com.fyber.inneractive.sdk.web;
/* loaded from: classes.dex */
public class w implements Runnable {
    public final /* synthetic */ x a;

    public w(x xVar) {
        this.a = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
