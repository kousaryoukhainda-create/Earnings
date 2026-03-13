package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1699l;
/* renamed from: j$.util.o  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1721o implements InterfaceC1699l {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C1721o(Consumer consumer) {
        this.a = consumer;
    }

    @Override // j$.util.function.InterfaceC1699l
    public final void accept(double d) {
        this.a.accept(Double.valueOf(d));
    }

    @Override // j$.util.function.InterfaceC1699l
    public final /* synthetic */ InterfaceC1699l l(InterfaceC1699l interfaceC1699l) {
        return j$.com.android.tools.r8.a.a(this, interfaceC1699l);
    }
}
