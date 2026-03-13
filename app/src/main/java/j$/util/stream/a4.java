package j$.util.stream;
/* loaded from: classes4.dex */
final class a4 extends AbstractC1763h2 implements d4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ b4 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b4 b4Var, InterfaceC1798o2 interfaceC1798o2, boolean z) {
        super(interfaceC1798o2);
        this.e = b4Var;
        this.d = z;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final void accept(double d) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.a.test(d);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept(d);
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
        this.a.accept(d);
    }

    @Override // j$.util.stream.d4
    public final long h() {
        return this.b;
    }
}
