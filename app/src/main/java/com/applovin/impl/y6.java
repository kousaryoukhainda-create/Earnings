package com.applovin.impl;

import com.applovin.impl.z6;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public interface y6 {

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public final int a;

        public a(Throwable th, int i) {
            super(th);
            this.a = i;
        }
    }

    void a(z6.a aVar);

    boolean a(String str);

    int b();

    void b(z6.a aVar);

    boolean c();

    Map d();

    UUID e();

    y4 f();

    a getError();
}
