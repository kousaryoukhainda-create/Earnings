package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p {
    private final Queue a = new LinkedList();
    private final Object b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            try {
                if (b() <= 25) {
                    this.a.offer(appLovinAdImpl);
                } else {
                    n.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z;
        synchronized (this.b) {
            if (b() == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = (AppLovinAdImpl) this.a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            this.a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
