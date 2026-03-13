package j$.util.stream;

import j$.util.function.InterfaceC1699l;
/* renamed from: j$.util.stream.f3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1754f3 extends AbstractC1769i3 implements InterfaceC1699l {
    final double[] c;

    @Override // j$.util.function.InterfaceC1699l
    public final /* synthetic */ InterfaceC1699l l(InterfaceC1699l interfaceC1699l) {
        return j$.com.android.tools.r8.a.a(this, interfaceC1699l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1754f3(int i) {
        this.c = new double[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1769i3
    public final void a(Object obj, long j) {
        InterfaceC1699l interfaceC1699l = (InterfaceC1699l) obj;
        for (int i = 0; i < j; i++) {
            interfaceC1699l.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.InterfaceC1699l
    public final void accept(double d) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = d;
    }
}
