package defpackage;

import java.util.Map;
/* renamed from: sF  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2659sF implements InterfaceC2154mP {
    public final /* synthetic */ int a;

    public /* synthetic */ C2659sF(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
                interfaceC2240nP.a(VT.g, entry.getKey());
                interfaceC2240nP.a(VT.h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
