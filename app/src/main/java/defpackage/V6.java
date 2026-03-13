package defpackage;
/* renamed from: V6  reason: default package */
/* loaded from: classes.dex */
public final class V6 implements InterfaceC2154mP {
    public static final V6 a = new Object();
    public static final C0980bu b = C0980bu.a("baseAddress");
    public static final C0980bu c = C0980bu.a("size");
    public static final C0980bu d = C0980bu.a("name");
    public static final C0980bu e = C0980bu.a("uuid");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        C1164d8 c1164d8 = (C1164d8) ((AbstractC3128xj) obj);
        interfaceC2240nP.g(b, c1164d8.a);
        interfaceC2240nP.g(c, c1164d8.b);
        interfaceC2240nP.a(d, c1164d8.c);
        String str = c1164d8.d;
        if (str != null) {
            bArr = str.getBytes(AbstractC0506Oj.a);
        } else {
            bArr = null;
        }
        interfaceC2240nP.a(e, bArr);
    }
}
