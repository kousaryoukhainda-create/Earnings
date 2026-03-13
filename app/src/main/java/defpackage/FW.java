package defpackage;

import java.util.Set;
/* renamed from: FW  reason: default package */
/* loaded from: classes.dex */
public final class FW implements InterfaceC1026cU {
    public final Set a;
    public final InterfaceC1026cU b;

    public FW(Set set, InterfaceC1026cU interfaceC1026cU) {
        this.a = set;
        this.b = interfaceC1026cU;
    }

    @Override // defpackage.InterfaceC1026cU
    public final void a(C0566Qr c0566Qr) {
        if (this.a.contains(C2445pl.class)) {
            this.b.a(c0566Qr);
            return;
        }
        throw new RuntimeException("Attempting to publish an undeclared event " + c0566Qr + ".");
    }
}
