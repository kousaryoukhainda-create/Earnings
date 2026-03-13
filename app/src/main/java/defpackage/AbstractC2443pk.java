package defpackage;

import android.app.Activity;
import com.fyber.d;
import com.fyber.fairbid.g9;
import com.fyber.fairbid.h6;
import com.fyber.fairbid.s5;
import com.fyber.fairbid.y5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Modifier;
/* renamed from: pk  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2443pk {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public AbstractC2443pk(InterfaceC0550Qb interfaceC0550Qb) {
        this.a = 1;
        this.b = a().a(interfaceC0550Qb);
        this.c = new s5();
        c();
    }

    public abstract h6 a();

    public abstract void b(Activity activity, s5 s5Var);

    public abstract void c();

    public abstract void d(StringBuilder sb);

    public abstract int e();

    public abstract String f();

    public void g(Activity activity) {
        h6 h6Var = (h6) this.b;
        if (activity == null) {
            h6Var.a(EnumC2333oW.NULL_CONTEXT_REFERENCE);
        } else if (!g9.b()) {
            h6Var.a(EnumC2333oW.DEVICE_NOT_SUPPORTED);
        } else if (d.a().d != y5.d) {
            if (h6Var.b != null) {
                for (Class<? extends InterfaceC0550Qb> cls : h6Var.a) {
                    if (cls.isAssignableFrom(h6Var.b.getClass())) {
                        new WeakReference(activity);
                        d.a().c.execute(new C2676sW(this, activity));
                        return;
                    }
                }
            }
            h6Var.a(EnumC2333oW.MISMATCH_CALLBACK_TYPE);
        } else {
            h6Var.a(EnumC2333oW.SDK_NOT_STARTED);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(getClass().getName());
                sb.append('@');
                sb.append(Integer.toHexString(hashCode()));
                sb.append('[');
                sb.append(Modifier.toString(e()));
                d(sb);
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public AbstractC2443pk(AbstractC2013kk abstractC2013kk) {
        this.a = 0;
        this.c = abstractC2013kk;
        this.b = null;
    }
}
