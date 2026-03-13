package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import com.applovin.impl.tl;
import io.adjoe.protection.b;
import java.util.List;
/* renamed from: r2  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2552r2 implements InterfaceC1006cA {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object f;

    public /* synthetic */ C2552r2(Context context, boolean z, boolean z2, C3302zk c3302zk) {
        this.d = context;
        this.b = z;
        this.c = z2;
        this.f = c3302zk;
    }

    public void a(String str) {
        Context context = (Context) this.d;
        boolean z = this.b;
        boolean z2 = this.c;
        C3302zk c3302zk = (C3302zk) this.f;
        b.b = str;
        try {
            b.f(context, str, z, z2);
        } catch (Exception e) {
            b.a.getClass();
            C1314ew.q("register_token_error", c3302zk, e);
            b.i(new C2467q2("Prepare advertisingId error", e));
            b.i = false;
        }
    }

    @Override // defpackage.InterfaceC1006cA
    public Object apply(Object obj) {
        List a;
        MotionEvent motionEvent = (MotionEvent) this.f;
        boolean z = this.b;
        a = ((com.applovin.impl.sdk.ad.b) this.d).a(motionEvent, z, this.c, (tl) obj);
        return a;
    }

    public /* synthetic */ C2552r2(com.applovin.impl.sdk.ad.b bVar, MotionEvent motionEvent, boolean z, boolean z2) {
        this.d = bVar;
        this.f = motionEvent;
        this.b = z;
        this.c = z2;
    }
}
