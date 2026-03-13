package j$.util.stream;

import j$.util.function.Consumer;
/* renamed from: j$.util.stream.j3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1774j3 extends AbstractC1779k3 implements Consumer {
    final Object[] b;

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1774j3(int i) {
        this.b = new Object[i];
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        this.a = i + 1;
        this.b[i] = obj;
    }
}
