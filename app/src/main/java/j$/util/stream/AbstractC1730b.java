package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1730b implements InterfaceC1760h {
    private final AbstractC1730b a;
    private final AbstractC1730b b;
    protected final int c;
    private AbstractC1730b d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B0 E0(long j, IntFunction intFunction);

    abstract boolean H0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC1798o2 I0(int i, InterfaceC1798o2 interfaceC1798o2);

    abstract Spliterator L0(AbstractC1730b abstractC1730b, Supplier supplier, boolean z);

    abstract J0 w0(AbstractC1730b abstractC1730b, Spliterator spliterator, boolean z, IntFunction intFunction);

    abstract boolean y0(Spliterator spliterator, InterfaceC1798o2 interfaceC1798o2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC1744d3 z0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1730b(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = EnumC1739c3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & EnumC1739c3.l;
        this.e = 0;
        this.k = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1730b(AbstractC1730b abstractC1730b, int i) {
        if (abstractC1730b.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC1730b.h = true;
        abstractC1730b.d = this;
        this.b = abstractC1730b;
        this.c = EnumC1739c3.h & i;
        this.f = EnumC1739c3.l(i, abstractC1730b.f);
        AbstractC1730b abstractC1730b2 = abstractC1730b.a;
        this.a = abstractC1730b2;
        if (H0()) {
            abstractC1730b2.i = true;
        }
        this.e = abstractC1730b.e + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object u0(J3 j3) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k) {
            return j3.c(this, J0(j3.d()));
        }
        return j3.a(this, J0(j3.d()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final J0 v0(IntFunction intFunction) {
        AbstractC1730b abstractC1730b;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k && (abstractC1730b = this.b) != null && H0()) {
            this.e = 0;
            return F0(abstractC1730b, abstractC1730b.J0(0), intFunction);
        }
        return t0(J0(0), true, intFunction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator K0() {
        AbstractC1730b abstractC1730b = this.a;
        if (this != abstractC1730b) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC1730b.g;
        if (spliterator != null) {
            abstractC1730b.g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.InterfaceC1760h, j$.util.stream.E
    public final InterfaceC1760h sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC1760h, j$.util.stream.E
    public final InterfaceC1760h parallel() {
        this.a.k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC1730b abstractC1730b = this.a;
        Runnable runnable = abstractC1730b.j;
        if (runnable != null) {
            abstractC1730b.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC1760h
    public final InterfaceC1760h onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC1730b abstractC1730b = this.a;
        Runnable runnable2 = abstractC1730b.j;
        if (runnable2 != null) {
            runnable = new I3(runnable2, runnable);
        }
        abstractC1730b.j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC1760h, j$.util.stream.E
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC1730b abstractC1730b = this.a;
        if (this == abstractC1730b) {
            Spliterator spliterator = abstractC1730b.g;
            if (spliterator != null) {
                abstractC1730b.g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return L0(this, new C1725a(this, 0), abstractC1730b.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator D0() {
        return J0(0);
    }

    @Override // j$.util.stream.InterfaceC1760h
    public final boolean isParallel() {
        return this.a.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final J0 t0(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return w0(this, spliterator, z, intFunction);
        }
        B0 E0 = E0(x0(spliterator), intFunction);
        M0(spliterator, E0);
        return E0.b();
    }

    private Spliterator J0(int i) {
        int i2;
        int i3;
        AbstractC1730b abstractC1730b = this.a;
        Spliterator spliterator = abstractC1730b.g;
        if (spliterator != null) {
            abstractC1730b.g = null;
            if (abstractC1730b.k && abstractC1730b.i) {
                AbstractC1730b abstractC1730b2 = abstractC1730b.d;
                int i4 = 1;
                while (abstractC1730b != this) {
                    int i5 = abstractC1730b2.c;
                    if (abstractC1730b2.H0()) {
                        if (EnumC1739c3.SHORT_CIRCUIT.q(i5)) {
                            i5 &= ~EnumC1739c3.u;
                        }
                        spliterator = abstractC1730b2.G0(abstractC1730b, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = (~EnumC1739c3.t) & i5;
                            i3 = EnumC1739c3.s;
                        } else {
                            i2 = (~EnumC1739c3.s) & i5;
                            i3 = EnumC1739c3.t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    abstractC1730b2.e = i4;
                    abstractC1730b2.f = EnumC1739c3.l(i5, abstractC1730b.f);
                    i4++;
                    AbstractC1730b abstractC1730b3 = abstractC1730b2;
                    abstractC1730b2 = abstractC1730b2.d;
                    abstractC1730b = abstractC1730b3;
                }
            }
            if (i != 0) {
                this.f = EnumC1739c3.l(i, this.f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC1744d3 A0() {
        AbstractC1730b abstractC1730b = this;
        while (abstractC1730b.e > 0) {
            abstractC1730b = abstractC1730b.b;
        }
        return abstractC1730b.z0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long x0(Spliterator spliterator) {
        if (EnumC1739c3.SIZED.q(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC1798o2 M0(Spliterator spliterator, InterfaceC1798o2 interfaceC1798o2) {
        Objects.requireNonNull(interfaceC1798o2);
        r0(spliterator, N0(interfaceC1798o2));
        return interfaceC1798o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r0(Spliterator spliterator, InterfaceC1798o2 interfaceC1798o2) {
        Objects.requireNonNull(interfaceC1798o2);
        if (!EnumC1739c3.SHORT_CIRCUIT.q(this.f)) {
            interfaceC1798o2.o(spliterator.getExactSizeIfKnown());
            spliterator.a(interfaceC1798o2);
            interfaceC1798o2.n();
            return;
        }
        s0(spliterator, interfaceC1798o2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s0(Spliterator spliterator, InterfaceC1798o2 interfaceC1798o2) {
        AbstractC1730b abstractC1730b = this;
        while (abstractC1730b.e > 0) {
            abstractC1730b = abstractC1730b.b;
        }
        interfaceC1798o2.o(spliterator.getExactSizeIfKnown());
        boolean y0 = abstractC1730b.y0(spliterator, interfaceC1798o2);
        interfaceC1798o2.n();
        return y0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int B0() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean C0() {
        return EnumC1739c3.ORDERED.q(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC1798o2 N0(InterfaceC1798o2 interfaceC1798o2) {
        Objects.requireNonNull(interfaceC1798o2);
        AbstractC1730b abstractC1730b = this;
        while (abstractC1730b.e > 0) {
            AbstractC1730b abstractC1730b2 = abstractC1730b.b;
            interfaceC1798o2 = abstractC1730b.I0(abstractC1730b2.f, interfaceC1798o2);
            abstractC1730b = abstractC1730b2;
        }
        return interfaceC1798o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator O0(Spliterator spliterator) {
        return this.e == 0 ? spliterator : L0(this, new C1725a(spliterator, 7), this.a.k);
    }

    J0 F0(AbstractC1730b abstractC1730b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator G0(AbstractC1730b abstractC1730b, Spliterator spliterator) {
        return F0(abstractC1730b, spliterator, new C1805q(11)).spliterator();
    }
}
