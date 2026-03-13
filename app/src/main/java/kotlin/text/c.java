package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes2.dex */
public class c extends C40 {
    public static Integer e(String str) {
        boolean z;
        int i;
        Integer valueOf;
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (Intrinsics.d(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt != '+') {
                if (charAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        if (z) {
            valueOf = Integer.valueOf(i3);
        } else {
            valueOf = Integer.valueOf(-i3);
        }
        return valueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Long f(java.lang.String r18) {
        /*
            r0 = r18
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 10
            kotlin.text.CharsKt__CharJVMKt.checkRadix(r1)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L18
            goto L84
        L18:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= 0) goto L3c
            r6 = 1
            if (r2 != r6) goto L2e
            goto L84
        L2e:
            r9 = 43
            if (r5 == r9) goto L3b
            r4 = 45
            if (r5 == r4) goto L37
            goto L84
        L37:
            r7 = -9223372036854775808
            r4 = 1
            goto L3d
        L3b:
            r4 = 1
        L3c:
            r6 = 0
        L3d:
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = 0
            r13 = r9
        L45:
            if (r4 >= r2) goto L76
            char r5 = r0.charAt(r4)
            int r5 = java.lang.Character.digit(r5, r1)
            if (r5 >= 0) goto L52
            goto L84
        L52:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L62
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L84
            long r13 = (long) r1
            long r13 = r7 / r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L62
            goto L84
        L62:
            long r9 = (long) r1
            long r11 = r11 * r9
            long r9 = (long) r5
            long r16 = r7 + r9
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 >= 0) goto L6d
            goto L84
        L6d:
            long r11 = r11 - r9
            int r4 = r4 + 1
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L45
        L76:
            if (r6 == 0) goto L7e
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
        L7c:
            r3 = r0
            goto L84
        L7e:
            long r0 = -r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L7c
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.c.f(java.lang.String):java.lang.Long");
    }
}
