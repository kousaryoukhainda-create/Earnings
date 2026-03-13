package j$.time.format;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.e  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1676e implements InterfaceC1677f {
    private final InterfaceC1677f[] a;
    private final boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1676e(ArrayList arrayList, boolean z) {
        this((InterfaceC1677f[]) arrayList.toArray(new InterfaceC1677f[arrayList.size()]), z);
    }

    C1676e(InterfaceC1677f[] interfaceC1677fArr, boolean z) {
        this.a = interfaceC1677fArr;
        this.b = z;
    }

    public final C1676e a() {
        return !this.b ? this : new C1676e(this.a, false);
    }

    @Override // j$.time.format.InterfaceC1677f
    public final boolean l(z zVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            zVar.g();
        }
        try {
            for (InterfaceC1677f interfaceC1677f : this.a) {
                if (!interfaceC1677f.l(zVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                zVar.a();
            }
            return true;
        } finally {
            if (z) {
                zVar.a();
            }
        }
    }

    @Override // j$.time.format.InterfaceC1677f
    public final int n(w wVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC1677f[] interfaceC1677fArr = this.a;
        if (z) {
            wVar.r();
            int i2 = i;
            for (InterfaceC1677f interfaceC1677f : interfaceC1677fArr) {
                i2 = interfaceC1677f.n(wVar, charSequence, i2);
                if (i2 < 0) {
                    wVar.f(false);
                    return i;
                }
            }
            wVar.f(true);
            return i2;
        }
        for (InterfaceC1677f interfaceC1677f2 : interfaceC1677fArr) {
            i = interfaceC1677f2.n(wVar, charSequence, i);
            if (i < 0) {
                break;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC1677f[] interfaceC1677fArr = this.a;
        if (interfaceC1677fArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (InterfaceC1677f interfaceC1677f : interfaceC1677fArr) {
                sb.append(interfaceC1677f);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
