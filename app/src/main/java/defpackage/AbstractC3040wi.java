package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: wi  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3040wi extends K9 {
    private final InterfaceC0428Li _context;
    private transient InterfaceC2868ui intercepted;

    public AbstractC3040wi(InterfaceC2868ui interfaceC2868ui, InterfaceC0428Li interfaceC0428Li) {
        super(interfaceC2868ui);
        this._context = interfaceC0428Li;
    }

    @Override // defpackage.InterfaceC2868ui
    @NotNull
    public InterfaceC0428Li getContext() {
        InterfaceC0428Li interfaceC0428Li = this._context;
        Intrinsics.b(interfaceC0428Li);
        return interfaceC0428Li;
    }

    @NotNull
    public final InterfaceC2868ui intercepted() {
        InterfaceC2868ui interfaceC2868ui;
        InterfaceC2868ui interfaceC2868ui2 = this.intercepted;
        InterfaceC2868ui interfaceC2868ui3 = interfaceC2868ui2;
        if (interfaceC2868ui2 == null) {
            InterfaceC3126xi interfaceC3126xi = (InterfaceC3126xi) getContext().get(BI.d);
            if (interfaceC3126xi != null) {
                interfaceC2868ui = new C0253Ep((AbstractC0531Pi) interfaceC3126xi, this);
            } else {
                interfaceC2868ui = this;
            }
            this.intercepted = interfaceC2868ui;
            interfaceC2868ui3 = interfaceC2868ui;
        }
        return interfaceC2868ui3;
    }

    @Override // defpackage.K9
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1911jc c1911jc;
        InterfaceC2868ui interfaceC2868ui = this.intercepted;
        if (interfaceC2868ui != null && interfaceC2868ui != this) {
            InterfaceC0376Ji interfaceC0376Ji = getContext().get(BI.d);
            Intrinsics.b(interfaceC0376Ji);
            InterfaceC3126xi interfaceC3126xi = (InterfaceC3126xi) interfaceC0376Ji;
            C0253Ep c0253Ep = (C0253Ep) interfaceC2868ui;
            do {
                atomicReferenceFieldUpdater = C0253Ep.j;
            } while (atomicReferenceFieldUpdater.get(c0253Ep) == AbstractC0867af0.d);
            Object obj = atomicReferenceFieldUpdater.get(c0253Ep);
            if (obj instanceof C1911jc) {
                c1911jc = (C1911jc) obj;
            } else {
                c1911jc = null;
            }
            if (c1911jc != null) {
                c1911jc.o();
            }
        }
        this.intercepted = C2433pf.c;
    }

    public AbstractC3040wi(InterfaceC2868ui interfaceC2868ui) {
        this(interfaceC2868ui, interfaceC2868ui != null ? interfaceC2868ui.getContext() : null);
    }
}
