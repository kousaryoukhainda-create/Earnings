package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: zS  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3274zS extends C3188yS {
    public final Object c;

    public C3274zS() {
        super(12);
        this.c = new Object();
    }

    @Override // defpackage.C3188yS
    public final Object a() {
        Object a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.C3188yS
    public final boolean c(Object instance) {
        boolean c;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.c) {
            c = super.c(instance);
        }
        return c;
    }
}
