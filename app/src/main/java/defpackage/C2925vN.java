package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: vN  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2925vN extends AbstractC1214dk {
    public C2925vN() {
        this(C0967bk.b);
    }

    public final Object a(InterfaceC1052ck key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.a.get(key);
    }

    public final void b(InterfaceC1052ck key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a.put(key, obj);
    }

    public C2925vN(AbstractC1214dk initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        this.a.putAll(initialExtras.a);
    }
}
