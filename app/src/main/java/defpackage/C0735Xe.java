package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Xe  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0735Xe implements InterfaceC0428Li, Serializable {
    public final InterfaceC0428Li b;
    public final InterfaceC0376Ji c;

    public C0735Xe(InterfaceC0376Ji element, InterfaceC0428Li left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.b = left;
        this.c = element;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C0735Xe)) {
                return false;
            }
            C0735Xe c0735Xe = (C0735Xe) obj;
            c0735Xe.getClass();
            int i = 2;
            C0735Xe c0735Xe2 = c0735Xe;
            int i2 = 2;
            while (true) {
                InterfaceC0428Li interfaceC0428Li = c0735Xe2.b;
                if (interfaceC0428Li instanceof C0735Xe) {
                    c0735Xe2 = (C0735Xe) interfaceC0428Li;
                } else {
                    c0735Xe2 = null;
                }
                if (c0735Xe2 == null) {
                    break;
                }
                i2++;
            }
            C0735Xe c0735Xe3 = this;
            while (true) {
                InterfaceC0428Li interfaceC0428Li2 = c0735Xe3.b;
                if (interfaceC0428Li2 instanceof C0735Xe) {
                    c0735Xe3 = (C0735Xe) interfaceC0428Li2;
                } else {
                    c0735Xe3 = null;
                }
                if (c0735Xe3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C0735Xe c0735Xe4 = this;
            while (true) {
                InterfaceC0376Ji interfaceC0376Ji = c0735Xe4.c;
                if (!Intrinsics.a(c0735Xe.get(interfaceC0376Ji.getKey()), interfaceC0376Ji)) {
                    z = false;
                    break;
                }
                InterfaceC0428Li interfaceC0428Li3 = c0735Xe4.b;
                if (interfaceC0428Li3 instanceof C0735Xe) {
                    c0735Xe4 = (C0735Xe) interfaceC0428Li3;
                } else {
                    Intrinsics.c(interfaceC0428Li3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC0376Ji interfaceC0376Ji2 = (InterfaceC0376Ji) interfaceC0428Li3;
                    z = Intrinsics.a(c0735Xe.get(interfaceC0376Ji2.getKey()), interfaceC0376Ji2);
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC0428Li
    public final Object fold(Object obj, InterfaceC0652Tz operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.b.fold(obj, operation), this.c);
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0376Ji get(InterfaceC0402Ki key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C0735Xe c0735Xe = this;
        while (true) {
            InterfaceC0376Ji interfaceC0376Ji = c0735Xe.c.get(key);
            if (interfaceC0376Ji != null) {
                return interfaceC0376Ji;
            }
            InterfaceC0428Li interfaceC0428Li = c0735Xe.b;
            if (interfaceC0428Li instanceof C0735Xe) {
                c0735Xe = (C0735Xe) interfaceC0428Li;
            } else {
                return interfaceC0428Li.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0428Li minusKey(InterfaceC0402Ki key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC0376Ji interfaceC0376Ji = this.c;
        InterfaceC0376Ji interfaceC0376Ji2 = interfaceC0376Ji.get(key);
        InterfaceC0428Li interfaceC0428Li = this.b;
        if (interfaceC0376Ji2 != null) {
            return interfaceC0428Li;
        }
        InterfaceC0428Li minusKey = interfaceC0428Li.minusKey(key);
        if (minusKey == interfaceC0428Li) {
            return this;
        }
        if (minusKey != C2710sr.b) {
            return new C0735Xe(interfaceC0376Ji, minusKey);
        }
        return interfaceC0376Ji;
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0428Li plus(InterfaceC0428Li context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context == C2710sr.b) {
            return this;
        }
        return (InterfaceC0428Li) context.fold(this, new C0709We(1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new C0709We(0))) + ']';
    }
}
