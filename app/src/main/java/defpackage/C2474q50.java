package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: q50  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2474q50 implements InterfaceC2059lG, Serializable {
    public InterfaceC0263Ez b;
    public volatile Object c;
    public final Object d;

    public C2474q50(InterfaceC0263Ez initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.b = initializer;
        this.c = C0539Pq.o;
        this.d = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.c;
        C0539Pq c0539Pq = C0539Pq.o;
        if (obj2 != c0539Pq) {
            return obj2;
        }
        synchronized (this.d) {
            obj = this.c;
            if (obj == c0539Pq) {
                InterfaceC0263Ez interfaceC0263Ez = this.b;
                Intrinsics.b(interfaceC0263Ez);
                obj = interfaceC0263Ez.invoke();
                this.c = obj;
                this.b = null;
            }
        }
        return obj;
    }

    public final boolean b() {
        if (this.c != C0539Pq.o) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (b()) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
