package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
/* renamed from: j$.util.stream.w3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1838w3 implements Consumer, IntFunction {
    public final /* synthetic */ int a;

    private final void a(Object obj) {
    }

    private final void c(Object obj) {
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 2:
                return new Integer[i];
            case 3:
                return new Integer[i];
            case 4:
                return new Long[i];
            case 5:
                return new Long[i];
            case 6:
                return new Double[i];
            default:
                return new Double[i];
        }
    }
}
