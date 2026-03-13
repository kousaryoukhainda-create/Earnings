package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: We  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0709We implements InterfaceC0652Tz {
    public final /* synthetic */ int b;

    public /* synthetic */ C0709We(int i) {
        this.b = i;
    }

    @Override // defpackage.InterfaceC0652Tz
    public final Object invoke(Object obj, Object obj2) {
        C0735Xe c0735Xe;
        switch (this.b) {
            case 0:
                String acc = (String) obj;
                InterfaceC0376Ji element = (InterfaceC0376Ji) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC0428Li acc2 = (InterfaceC0428Li) obj;
                InterfaceC0376Ji element2 = (InterfaceC0376Ji) obj2;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element2, "element");
                InterfaceC0428Li minusKey = acc2.minusKey(element2.getKey());
                C2710sr c2710sr = C2710sr.b;
                if (minusKey != c2710sr) {
                    BI bi = BI.d;
                    InterfaceC3126xi interfaceC3126xi = (InterfaceC3126xi) minusKey.get(bi);
                    if (interfaceC3126xi == null) {
                        c0735Xe = new C0735Xe(element2, minusKey);
                    } else {
                        InterfaceC0428Li minusKey2 = minusKey.minusKey(bi);
                        if (minusKey2 == c2710sr) {
                            return new C0735Xe(interfaceC3126xi, element2);
                        }
                        c0735Xe = new C0735Xe(interfaceC3126xi, new C0735Xe(element2, minusKey2));
                    }
                    return c0735Xe;
                }
                return element2;
        }
    }
}
