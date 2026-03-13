package defpackage;
/* renamed from: Pf0  reason: default package */
/* loaded from: classes.dex */
public final class Pf0 {
    public final /* synthetic */ int a;

    public final String a(InterfaceC1660j interfaceC1660j) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                if (interfaceC1660j.c().equals(C1490h.c)) {
                    str = "/agcgw_all/CN";
                } else if (interfaceC1660j.c().equals(C1490h.e)) {
                    str = "/agcgw_all/RU";
                } else if (interfaceC1660j.c().equals(C1490h.d)) {
                    str = "/agcgw_all/DE";
                } else if (interfaceC1660j.c().equals(C1490h.f)) {
                    str = "/agcgw_all/SG";
                } else {
                    return null;
                }
                return interfaceC1660j.b(str);
            default:
                if (interfaceC1660j.c().equals(C1490h.c)) {
                    str2 = "/agcgw_all/CN_back";
                } else if (interfaceC1660j.c().equals(C1490h.e)) {
                    str2 = "/agcgw_all/RU_back";
                } else if (interfaceC1660j.c().equals(C1490h.d)) {
                    str2 = "/agcgw_all/DE_back";
                } else if (interfaceC1660j.c().equals(C1490h.f)) {
                    str2 = "/agcgw_all/SG_back";
                } else {
                    return null;
                }
                return interfaceC1660j.b(str2);
        }
    }
}
