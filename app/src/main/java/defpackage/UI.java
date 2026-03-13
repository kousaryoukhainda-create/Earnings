package defpackage;
/* renamed from: UI  reason: default package */
/* loaded from: classes.dex */
public final class UI implements InterfaceC1523hM {
    public InterfaceC1523hM[] a;

    @Override // defpackage.InterfaceC1523hM
    public final HU a(Class cls) {
        InterfaceC1523hM[] interfaceC1523hMArr;
        for (InterfaceC1523hM interfaceC1523hM : this.a) {
            if (interfaceC1523hM.b(cls)) {
                return interfaceC1523hM.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC1523hM
    public final boolean b(Class cls) {
        for (InterfaceC1523hM interfaceC1523hM : this.a) {
            if (interfaceC1523hM.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
