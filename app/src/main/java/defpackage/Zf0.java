package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: Zf0  reason: default package */
/* loaded from: classes.dex */
public final class Zf0 extends AbstractC1576i {
    public static ArrayList b;
    public static final HashMap c = new HashMap();
    public static String d;
    public final InterfaceC1660j a;

    public Zf0(InterfaceC1660j interfaceC1660j) {
        Log.d("AGC_Instance", "AGConnectInstanceImpl init");
        this.a = interfaceC1660j;
        if (b == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        new Fg0(b);
        new Fg0(null);
        if (interfaceC1660j instanceof Yf0) {
            Fg0.a(((Yf0) interfaceC1660j).h);
        }
        Log.d("AGC_Instance", "AGConnectInstanceImpl init end");
    }

    public static synchronized AbstractC1576i a(InterfaceC1660j interfaceC1660j, boolean z) {
        AbstractC1576i abstractC1576i;
        synchronized (Zf0.class) {
            HashMap hashMap = c;
            abstractC1576i = (AbstractC1576i) hashMap.get(interfaceC1660j.a());
            if (abstractC1576i == null || z) {
                abstractC1576i = new Zf0(interfaceC1660j);
                hashMap.put(interfaceC1660j.a(), abstractC1576i);
            }
        }
        return abstractC1576i;
    }

    public static synchronized AbstractC1576i b(String str) {
        AbstractC1576i abstractC1576i;
        synchronized (Zf0.class) {
            try {
                abstractC1576i = (AbstractC1576i) c.get(str);
                if (abstractC1576i == null) {
                    if ("DEFAULT_INSTANCE".equals(str)) {
                        Log.w("AGC_Instance", "please call `initialize()` first");
                    } else {
                        Log.w("AGC_Instance", "not find instance for : " + str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC1576i;
    }

    public static synchronized void c(Context context, C2607rg0 c2607rg0) {
        synchronized (Zf0.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("AGC_Instance", "context.getApplicationContext null");
                } else {
                    context = applicationContext;
                }
                Pf0 pf0 = new Pf0(0);
                HashMap hashMap = BF.a;
                hashMap.put("/agcgw/url", pf0);
                hashMap.put("/agcgw/backurl", new Pf0(1));
                if (b == null) {
                    b = new C0767Yk(context).b();
                }
                a(c2607rg0, true);
                d = "DEFAULT_INSTANCE";
                Log.i("AGC_Instance", "initFinish callback start");
                Iterator it = C2262nf0.a.iterator();
                if (!it.hasNext()) {
                    Log.i("AGC_Instance", "AGC SDK initialize end");
                } else if (it.next() == null) {
                    throw null;
                } else {
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
