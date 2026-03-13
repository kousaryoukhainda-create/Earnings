package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: bF  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0926bF extends C2230nF {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0926bF(YE ye) {
        super(true);
        C2171md c2171md;
        C2171md c2171md2;
        boolean z = true;
        A(ye);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2230nF.c;
        InterfaceC2085ld interfaceC2085ld = (InterfaceC2085ld) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2085ld instanceof C2171md) {
            c2171md = (C2171md) interfaceC2085ld;
        } else {
            c2171md = null;
        }
        if (c2171md != null) {
            C2230nF h = c2171md.h();
            while (!h.u()) {
                InterfaceC2085ld interfaceC2085ld2 = (InterfaceC2085ld) atomicReferenceFieldUpdater.get(h);
                if (interfaceC2085ld2 instanceof C2171md) {
                    c2171md2 = (C2171md) interfaceC2085ld2;
                } else {
                    c2171md2 = null;
                }
                if (c2171md2 != null) {
                    h = c2171md2.h();
                }
            }
            this.d = z;
        }
        z = false;
        this.d = z;
    }

    @Override // defpackage.C2230nF
    public final boolean u() {
        return this.d;
    }

    @Override // defpackage.C2230nF
    public final boolean v() {
        return true;
    }
}
