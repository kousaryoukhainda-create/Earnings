package com.fyber.fairbid;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public abstract class h6<U, V> {
    public final Class<? extends InterfaceC0550Qb>[] a;
    public InterfaceC0550Qb b;
    public Handler c;

    /* loaded from: classes.dex */
    public class a extends g6 {
        public final /* synthetic */ EnumC2333oW a;

        public a(EnumC2333oW enumC2333oW) {
            this.a = enumC2333oW;
        }

        @Override // com.fyber.fairbid.g6
        public final void b() {
            h6.this.b.onRequestError(this.a);
        }
    }

    public h6(Class<? extends InterfaceC0550Qb>... clsArr) {
        this.a = clsArr;
    }

    public final h6<U, V> a(InterfaceC0550Qb interfaceC0550Qb) {
        this.b = interfaceC0550Qb;
        return this;
    }

    public abstract void a(V v);

    public abstract void b(U u);

    public final h6<U, V> a(h6 h6Var) {
        this.b = h6Var.b;
        return this;
    }

    public final void a(EnumC2333oW enumC2333oW) {
        a aVar = new a(enumC2333oW);
        Handler handler = this.c;
        if (handler != null) {
            handler.post(aVar);
            return;
        }
        com.fyber.d.a().getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aVar.run();
        } else {
            com.fyber.e.h.post(aVar);
        }
    }
}
