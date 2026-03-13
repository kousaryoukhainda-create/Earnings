package j$.util.stream;
/* loaded from: classes4.dex */
final class W3 extends AbstractC1773j2 implements d4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ X3 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(X3 x3, InterfaceC1798o2 interfaceC1798o2, boolean z) {
        super(interfaceC1798o2);
        this.e = x3;
        this.d = z;
    }

    @Override // j$.util.stream.InterfaceC1798o2, j$.util.function.N
    public final void accept(long j) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.a.test(j);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept(j);
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
        this.a.accept(j);
    }

    @Override // j$.util.stream.d4
    public final long h() {
        return this.b;
    }
}
