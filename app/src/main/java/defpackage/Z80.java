package defpackage;

import java.util.HashSet;
/* renamed from: Z80  reason: default package */
/* loaded from: classes2.dex */
public class Z80 extends AbstractC1338f90 {
    public final String a;

    public Z80(String str) {
        this.a = str;
    }

    @Override // defpackage.AbstractC1338f90
    public boolean d(AbstractC1338f90 abstractC1338f90) {
        if (abstractC1338f90.l()) {
            return abstractC1338f90.d(this);
        }
        return this.a.equals(abstractC1338f90.f());
    }

    @Override // defpackage.AbstractC1338f90
    public AbstractC1338f90 e(int i) {
        if (i == 0) {
            return this;
        }
        int i2 = 0;
        String str = this.a;
        if (i > 0) {
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = '[';
            }
            if (str.charAt(0) != '[') {
                str = "L" + str.replace('.', '/') + ";";
            }
            return new Z80(new String(cArr) + str);
        }
        while (true) {
            int i4 = -i;
            if (i2 < i4) {
                if (str.charAt(i2) == '[') {
                    i2++;
                } else {
                    throw new Exception(BK.k(i, "no ", " dimensional array type: ", str));
                }
            } else {
                char charAt = str.charAt(i4);
                if (charAt == '[') {
                    return new Z80(str.substring(i4));
                }
                if (charAt == 'L') {
                    return new Z80(str.substring(i4 + 1, str.length() - 1).replace('/', '.'));
                }
                if (charAt == 'D') {
                    return C1262eJ.j;
                }
                if (charAt == 'F') {
                    return C1262eJ.i;
                }
                if (charAt == 'J') {
                    return C1262eJ.k;
                }
                return C1262eJ.h;
            }
        }
    }

    @Override // defpackage.AbstractC1338f90
    public final String f() {
        return this.a;
    }

    @Override // defpackage.AbstractC1338f90
    public int g(L5 l5) {
        return l5.c(this.a);
    }

    @Override // defpackage.AbstractC1338f90
    public int h() {
        return 7;
    }

    @Override // defpackage.AbstractC1338f90
    public final boolean i() {
        return false;
    }

    @Override // defpackage.AbstractC1338f90
    public final Y80 j() {
        return null;
    }

    @Override // defpackage.AbstractC1338f90
    public String p(HashSet hashSet) {
        return this.a;
    }

    @Override // defpackage.AbstractC1338f90
    public final void o(String str, C0397Kd c0397Kd) {
    }
}
