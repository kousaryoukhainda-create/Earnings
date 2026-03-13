package defpackage;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
/* renamed from: h90  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1510h90 {
    public int a;
    public int b;
    public int c;
    public C1510h90[] d;
    public boolean e;
    public C1150d1 f;
    public int g;
    public int h;
    public AbstractC1338f90[] i;
    public AbstractC1338f90[] j;

    public static int a(String str, int i, int i2, AbstractC1338f90[] abstractC1338f90Arr) {
        Y80 y80;
        char charAt = str.charAt(i);
        int i3 = 0;
        if (charAt == ')') {
            return 0;
        }
        int i4 = i;
        while (charAt == '[') {
            i3++;
            i4++;
            charAt = str.charAt(i4);
        }
        if (charAt == 'L') {
            int indexOf = str.indexOf(59, i4 + 1);
            if (i3 > 0) {
                int i5 = indexOf + 1;
                abstractC1338f90Arr[i2] = new Z80(str.substring(i, i5));
                return i5;
            }
            int i6 = indexOf + 1;
            abstractC1338f90Arr[i2] = new Z80(str.substring(i + 1, indexOf).replace('/', '.'));
            return i6;
        } else if (i3 > 0) {
            int i7 = i4 + 1;
            abstractC1338f90Arr[i2] = new Z80(str.substring(i, i7));
            return i7;
        } else {
            if (charAt != 'F') {
                if (charAt != 'S' && charAt != 'Z' && charAt != 'I') {
                    if (charAt != 'J') {
                        switch (charAt) {
                            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                                break;
                            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                                y80 = C1262eJ.j;
                                break;
                            default:
                                y80 = null;
                                break;
                        }
                    } else {
                        y80 = C1262eJ.k;
                    }
                }
                y80 = C1262eJ.h;
            } else {
                y80 = C1262eJ.i;
            }
            if (y80 != null) {
                abstractC1338f90Arr[i2] = y80;
                return i4 + 1;
            }
            throw new Exception("bad method descriptor: ".concat(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0252, code lost:
        r7 = defpackage.AbstractC1281eb.C(r12);
        r5.add(r7);
        r7.b = r11 - r7.a;
        r7.e = true;
        r7.d = new defpackage.C1510h90[]{r10};
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0267, code lost:
        r5.add(r10);
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026b, code lost:
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x026d, code lost:
        r3 = (defpackage.C1510h90[]) r5.toArray(new defpackage.C1510h90[r5.size()]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0279, code lost:
        if (r2 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027d, code lost:
        r5 = r2.c.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0283, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0285, code lost:
        if (r5 < 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0287, code lost:
        r7 = ((defpackage.C2024ks) r2.c.get(r5)).c;
        r8 = r3.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0293, code lost:
        if (r9 >= r8) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0295, code lost:
        r10 = r3[r9];
        r11 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0299, code lost:
        if (r11 > r7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x029e, code lost:
        if (r7 >= (r11 + r10.b)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a0, code lost:
        r7 = ((defpackage.C2024ks) r2.c.get(r5)).a;
        r8 = ((defpackage.C2024ks) r2.c.get(r5)).b;
        r9 = ((defpackage.C2024ks) r2.c.get(r5)).d;
        r10.c--;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c5, code lost:
        if (r11 >= r3.length) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02c7, code lost:
        r12 = r3[r11];
        r13 = r12.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02cb, code lost:
        if (r7 > r13) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02cd, code lost:
        if (r13 >= r8) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02cf, code lost:
        r14 = r12.f;
        r13 = new defpackage.C1150d1(2, (byte) 0);
        r13.f = r10;
        r13.c = r9;
        r13.d = r14;
        r12.f = r13;
        r10.c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e4, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02e6, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02f3, code lost:
        throw new java.lang.Exception(defpackage.AbstractC0324Hi.e(r7, "no basic block at "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f4, code lost:
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0191, code lost:
        r2 = r7.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0193, code lost:
        if (r2 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
        r3 = r2.c.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019b, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019d, code lost:
        if (r3 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019f, code lost:
        defpackage.AbstractC1281eb.E(r12, ((defpackage.C2024ks) r2.c.get(r3)).a, true, false);
        defpackage.AbstractC1281eb.E(r12, ((defpackage.C2024ks) r2.c.get(r3)).c, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bb, code lost:
        r3 = (defpackage.C1623ia[]) r12.values().toArray(new defpackage.C1623ia[r12.size()]);
        java.util.Arrays.sort(r3);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d4, code lost:
        if (r3.length <= 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d6, code lost:
        r8 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01db, code lost:
        if (r8.b != 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01dd, code lost:
        r7 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01df, code lost:
        if (r7 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e1, code lost:
        if (r7 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e3, code lost:
        r9 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e5, code lost:
        if (r9 <= 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e7, code lost:
        r7.d = r8.d;
        r7.b = r9;
        r7.e = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f1, code lost:
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f3, code lost:
        r7 = defpackage.AbstractC1281eb.C(0);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fa, code lost:
        r5.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fe, code lost:
        if (r8 >= r3.length) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0200, code lost:
        r9 = r8 + 1;
        r8 = r3[r8];
        r10 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0206, code lost:
        if (r10 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0208, code lost:
        r11 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020a, code lost:
        if (r11 <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020c, code lost:
        r10.d = r8.d;
        r10.b = r11;
        r10.e = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0216, code lost:
        r11 = r8.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0218, code lost:
        if (r10 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021a, code lost:
        r10 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021c, code lost:
        if (r10 <= 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021e, code lost:
        r7 = defpackage.AbstractC1281eb.C(r7.a + r10);
        r5.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0228, code lost:
        r7.b = (r11 + r8.g) - r7.a;
        r7.d = r8.d;
        r7.e = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0239, code lost:
        r8 = r7.b;
        r12 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023d, code lost:
        if (r8 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023f, code lost:
        r7.b = r11 - r12;
        r10.c++;
        r7.d = new defpackage.C1510h90[]{r10};
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024f, code lost:
        r12 = r12 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0250, code lost:
        if (r12 >= r11) goto L146;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C1510h90[] b(defpackage.RM r16, defpackage.C2173me r17) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1510h90.b(RM, me):h90[]");
    }

    public static void c(StringBuilder sb, int i, AbstractC1338f90[] abstractC1338f90Arr) {
        String abstractC1338f90;
        if (abstractC1338f90Arr == null) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            AbstractC1338f90 abstractC1338f902 = abstractC1338f90Arr[i2];
            if (abstractC1338f902 == null) {
                abstractC1338f90 = "<>";
            } else {
                abstractC1338f90 = abstractC1338f902.toString();
            }
            sb.append(abstractC1338f90);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String name = C1510h90.class.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append("[pos=");
        sb.append(this.a);
        sb.append(", len=");
        sb.append(this.b);
        sb.append(", in=");
        sb.append(this.c);
        sb.append(", exit{");
        C1510h90[] c1510h90Arr = this.d;
        if (c1510h90Arr != null) {
            for (C1510h90 c1510h90 : c1510h90Arr) {
                sb.append(c1510h90.a);
                sb.append(',');
            }
        }
        sb.append("}, {");
        for (C1150d1 c1150d1 = this.f; c1150d1 != null; c1150d1 = (C1150d1) c1150d1.d) {
            sb.append('(');
            sb.append(((C1510h90) c1150d1.f).a);
            sb.append(", ");
            sb.append(c1150d1.c);
            sb.append("), ");
        }
        sb.append("},\n stack={");
        c(sb, this.g, this.j);
        sb.append("}, locals={");
        c(sb, this.h, this.i);
        sb.append('}');
        sb.append(']');
        return sb.toString();
    }
}
