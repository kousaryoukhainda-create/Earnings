package defpackage;

import android.content.Context;
/* renamed from: v8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2908v8 extends AbstractC0766Yj {
    public final Context a;
    public final InterfaceC1459ge b;
    public final InterfaceC1459ge c;
    public final String d;

    public C2908v8(Context context, InterfaceC1459ge interfaceC1459ge, InterfaceC1459ge interfaceC1459ge2, String str) {
        if (context != null) {
            this.a = context;
            if (interfaceC1459ge != null) {
                this.b = interfaceC1459ge;
                if (interfaceC1459ge2 != null) {
                    this.c = interfaceC1459ge2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0766Yj)) {
            return false;
        }
        AbstractC0766Yj abstractC0766Yj = (AbstractC0766Yj) obj;
        if (this.a.equals(((C2908v8) abstractC0766Yj).a)) {
            C2908v8 c2908v8 = (C2908v8) abstractC0766Yj;
            if (this.b.equals(c2908v8.b) && this.c.equals(c2908v8.c) && this.d.equals(c2908v8.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return AbstractC0324Hi.h(sb, this.d, "}");
    }
}
