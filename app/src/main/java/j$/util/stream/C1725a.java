package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import java.util.ArrayList;
/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1725a implements Supplier, j$.util.function.Q, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1725a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((InterfaceC1798o2) this.b).accept((InterfaceC1798o2) obj);
                return;
            default:
                ((ArrayList) this.b).add(obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 2:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return ((AbstractC1730b) this.b).D0();
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // j$.util.function.Q
    public Object apply(long j) {
        return AbstractC1840x0.D(j, (IntFunction) this.b);
    }
}
