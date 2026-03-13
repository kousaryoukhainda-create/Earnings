package defpackage;
/* renamed from: VI  reason: default package */
/* loaded from: classes.dex */
public final class VI implements InterfaceC1609iM {
    public InterfaceC1609iM[] a;

    @Override // defpackage.InterfaceC1609iM
    public final IU a(Class cls) {
        InterfaceC1609iM[] interfaceC1609iMArr;
        for (InterfaceC1609iM interfaceC1609iM : this.a) {
            if (interfaceC1609iM.b(cls)) {
                return interfaceC1609iM.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC1609iM
    public final boolean b(Class cls) {
        for (InterfaceC1609iM interfaceC1609iM : this.a) {
            if (interfaceC1609iM.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
