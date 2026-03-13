package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.y6;
import com.applovin.impl.z6;
import com.huawei.hms.support.api.entity.auth.AuthCode;
/* loaded from: classes.dex */
public interface a7 {
    public static final a7 a;
    public static final a7 b;

    /* loaded from: classes.dex */
    public class a implements a7 {
        @Override // com.applovin.impl.a7
        public final /* synthetic */ void a() {
            AbstractC2520qf0.a(this);
        }

        @Override // com.applovin.impl.a7
        public final /* synthetic */ b b(Looper looper, z6.a aVar, e9 e9Var) {
            return AbstractC2520qf0.b(this, looper, aVar, e9Var);
        }

        @Override // com.applovin.impl.a7
        public y6 a(Looper looper, z6.a aVar, e9 e9Var) {
            if (e9Var.p == null) {
                return null;
            }
            return new t7(new y6.a(new sp(1), AuthCode.StatusCode.WAITING_CONNECT));
        }

        @Override // com.applovin.impl.a7
        public final /* synthetic */ void b() {
            AbstractC2520qf0.c(this);
        }

        @Override // com.applovin.impl.a7
        public int a(e9 e9Var) {
            return e9Var.p != null ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        public static final b a = new C2394p80(7);

        void a();
    }

    static {
        a aVar = new a();
        a = aVar;
        b = aVar;
    }

    int a(e9 e9Var);

    y6 a(Looper looper, z6.a aVar, e9 e9Var);

    void a();

    b b(Looper looper, z6.a aVar, e9 e9Var);

    void b();
}
