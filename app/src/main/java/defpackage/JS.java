package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: JS  reason: default package */
/* loaded from: classes.dex */
public final class JS implements InterfaceC0249El {
    public final InterfaceC0249El a;

    public JS(InterfaceC0249El delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // defpackage.InterfaceC0249El
    public final Object a(InterfaceC0652Tz interfaceC0652Tz, InterfaceC2868ui interfaceC2868ui) {
        return this.a.a(new IS(interfaceC0652Tz, null), interfaceC2868ui);
    }

    @Override // defpackage.InterfaceC0249El
    public final InterfaceC0649Tw getData() {
        return this.a.getData();
    }
}
