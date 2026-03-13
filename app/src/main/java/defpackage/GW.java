package defpackage;
/* renamed from: GW  reason: default package */
/* loaded from: classes2.dex */
public abstract class GW extends K9 {
    public GW(InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        if (interfaceC2868ui != null && interfaceC2868ui.getContext() != C2710sr.b) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.InterfaceC2868ui
    public final InterfaceC0428Li getContext() {
        return C2710sr.b;
    }
}
