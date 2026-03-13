package j$.util.stream;

import j$.util.function.Predicate;
/* renamed from: j$.util.stream.p0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1801p0 extends AbstractC1820t0 {
    final /* synthetic */ EnumC1825u0 c;
    final /* synthetic */ Predicate d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1801p0(Predicate predicate, EnumC1825u0 enumC1825u0) {
        super(enumC1825u0);
        this.c = enumC1825u0;
        this.d = predicate;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        EnumC1825u0 enumC1825u0 = this.c;
        z = enumC1825u0.a;
        if (test == z) {
            this.a = true;
            z2 = enumC1825u0.b;
            this.b = z2;
        }
    }
}
