package j$.util.stream;
/* loaded from: classes4.dex */
final class O3 extends AbstractC1778k2 implements d4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ P3 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(P3 p3, InterfaceC1798o2 interfaceC1798o2, boolean z) {
        super(interfaceC1798o2);
        this.e = p3;
        this.d = z;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(obj);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept((InterfaceC1798o2) obj);
                }
                return;
            }
        }
        z = true;
        z2 = this.d;
        if (z2) {
            this.b++;
        }
        if (z2) {
        }
        this.a.accept((InterfaceC1798o2) obj);
    }

    @Override // j$.util.stream.d4
    public final long h() {
        return this.b;
    }
}
