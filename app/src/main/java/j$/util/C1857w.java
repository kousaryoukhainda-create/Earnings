package j$.util;

import j$.util.function.Consumer;
/* renamed from: j$.util.w  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1857w implements j$.util.function.N {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C1857w(Consumer consumer) {
        this.a = consumer;
    }

    @Override // j$.util.function.N
    public final void accept(long j) {
        this.a.accept(Long.valueOf(j));
    }

    @Override // j$.util.function.N
    public final /* synthetic */ j$.util.function.N f(j$.util.function.N n) {
        return j$.com.android.tools.r8.a.c(this, n);
    }
}
