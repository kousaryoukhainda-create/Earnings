package j$.util.stream;

import java.util.Comparator;
/* loaded from: classes4.dex */
abstract class C2 extends AbstractC1778k2 {
    protected final Comparator b;
    protected boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(InterfaceC1798o2 interfaceC1798o2, Comparator comparator) {
        super(interfaceC1798o2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC1778k2, j$.util.stream.InterfaceC1798o2
    public final boolean r() {
        this.c = true;
        return false;
    }
}
