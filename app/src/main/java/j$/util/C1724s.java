package j$.util;

import j$.util.function.Consumer;
/* renamed from: j$.util.s  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1724s implements j$.util.function.B {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C1724s(Consumer consumer) {
        this.a = consumer;
    }

    @Override // j$.util.function.B
    public final void accept(int i) {
        this.a.accept(Integer.valueOf(i));
    }

    @Override // j$.util.function.B
    public final /* synthetic */ j$.util.function.B m(j$.util.function.B b) {
        return j$.com.android.tools.r8.a.b(this, b);
    }
}
