package defpackage;

import com.android.billingclient.api.a;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
/* renamed from: vh0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2953vh0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC2953vh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Object obj = this.c;
        switch (this.b) {
            case 0:
                RunnableC3125xh0 runnableC3125xh0 = (RunnableC3125xh0) obj;
                try {
                    runnableC3125xh0.z = new ArrayList();
                    StringBuilder sb = new StringBuilder("Start loading ");
                    sb.append(runnableC3125xh0.k);
                    sb.append(" (type = ");
                    int i = runnableC3125xh0.p;
                    if (i == 1) {
                        str = "CLICK";
                    } else if (i == 2) {
                        str = "AUTO";
                    } else if (i == 3) {
                        str = "VIEW";
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                    sb.append(")");
                    AbstractC1930jl0.c("TLL2", sb.toString());
                    runnableC3125xh0.e();
                    AbstractC3211yh0.c.schedule(runnableC3125xh0.g, runnableC3125xh0.b);
                    DateTimeFormatter dateTimeFormatter = Kj0.a;
                    runnableC3125xh0.x = System.currentTimeMillis();
                    runnableC3125xh0.m();
                    return;
                } catch (Exception e) {
                    AbstractC1930jl0.e("Pokemon", e);
                    return;
                }
            case 1:
                C3039wh0 c3039wh0 = (C3039wh0) obj;
                c3039wh0.getClass();
                RunnableC3125xh0 runnableC3125xh02 = c3039wh0.c;
                try {
                    if (runnableC3125xh02.w.getAndSet(true)) {
                        AbstractC1930jl0.k("TLL2", "Task was already finished.");
                        return;
                    }
                    AbstractC1930jl0.c("TLL2", "Wait time over");
                    if (runnableC3125xh02.p == 1) {
                        AbstractC1930jl0.c("TLL2", "Starting default Play Store link");
                        runnableC3125xh02.k("timeout");
                    }
                    StringBuilder b = Ki0.b("market://details?id=");
                    b.append(runnableC3125xh02.l);
                    runnableC3125xh02.h(b.toString(), "timeout");
                    return;
                } catch (Exception e2) {
                    AbstractC1930jl0.e("Pokemon", e2);
                    return;
                }
            default:
                ServiceConnectionC1057cm0 serviceConnectionC1057cm0 = (ServiceConnectionC1057cm0) obj;
                a aVar = serviceConnectionC1057cm0.c;
                aVar.t(0);
                C0316Ha c0316Ha = Im0.l;
                aVar.J(24, 6, c0316Ha);
                serviceConnectionC1057cm0.a(c0316Ha);
                return;
        }
    }
}
