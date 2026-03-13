package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: of  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2347of {
    public final Object a;
    public final AbstractC1036cc b;
    public final Function1 c;
    public final Object d;
    public final Throwable e;

    public C2347of(Object obj, AbstractC1036cc abstractC1036cc, Function1 function1, Object obj2, Throwable th) {
        this.a = obj;
        this.b = abstractC1036cc;
        this.c = function1;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C2347of a(C2347of c2347of, AbstractC1036cc abstractC1036cc, CancellationException cancellationException, int i) {
        Object obj = c2347of.a;
        if ((i & 2) != 0) {
            abstractC1036cc = c2347of.b;
        }
        AbstractC1036cc abstractC1036cc2 = abstractC1036cc;
        Function1 function1 = c2347of.c;
        Object obj2 = c2347of.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c2347of.e;
        }
        c2347of.getClass();
        return new C2347of(obj, abstractC1036cc2, function1, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2347of)) {
            return false;
        }
        C2347of c2347of = (C2347of) obj;
        if (Intrinsics.a(this.a, c2347of.a) && Intrinsics.a(this.b, c2347of.b) && Intrinsics.a(this.c, c2347of.c) && Intrinsics.a(this.d, c2347of.d) && Intrinsics.a(this.e, c2347of.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        AbstractC1036cc abstractC1036cc = this.b;
        if (abstractC1036cc == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC1036cc.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Function1 function1 = this.c;
        if (function1 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function1.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C2347of(Object obj, AbstractC1036cc abstractC1036cc, Function1 function1, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC1036cc, (i & 4) != 0 ? null : function1, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
