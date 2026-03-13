package com.appsflyer.internal;

import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public final class AFd1cSDK {
    private static long AFKeystoreWrapper = 0;
    private static int valueOf = 0;
    private static int values = 1;

    static {
        valueOf();
        View.resolveSize(0, 0);
        int i = valueOf + 39;
        values = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void AFKeystoreWrapper(java.lang.String r9, int r10, java.lang.Object[] r11) {
        /*
            if (r9 == 0) goto L6
            char[] r9 = r9.toCharArray()
        L6:
            char[] r9 = (char[]) r9
            java.lang.Object r0 = com.appsflyer.internal.AFg1rSDK.AFInAppEventParameterName
            monitor-enter(r0)
            long r1 = com.appsflyer.internal.AFd1cSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L35
            char[] r9 = com.appsflyer.internal.AFg1rSDK.AFInAppEventType(r1, r9, r10)     // Catch: java.lang.Throwable -> L35
            r10 = 4
            com.appsflyer.internal.AFg1rSDK.AFInAppEventType = r10     // Catch: java.lang.Throwable -> L35
        L14:
            int r1 = com.appsflyer.internal.AFg1rSDK.AFInAppEventType     // Catch: java.lang.Throwable -> L35
            int r2 = r9.length     // Catch: java.lang.Throwable -> L35
            if (r1 >= r2) goto L37
            int r2 = r1 + (-4)
            com.appsflyer.internal.AFg1rSDK.AFKeystoreWrapper = r2     // Catch: java.lang.Throwable -> L35
            char r3 = r9[r1]     // Catch: java.lang.Throwable -> L35
            int r4 = r1 % 4
            char r4 = r9[r4]     // Catch: java.lang.Throwable -> L35
            r3 = r3 ^ r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L35
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L35
            long r7 = com.appsflyer.internal.AFd1cSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L35
            long r5 = r5 * r7
            long r2 = r3 ^ r5
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L35
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L35
            r9[r1] = r2     // Catch: java.lang.Throwable -> L35
            int r1 = r1 + 1
            com.appsflyer.internal.AFg1rSDK.AFInAppEventType = r1     // Catch: java.lang.Throwable -> L35
            goto L14
        L35:
            r9 = move-exception
            goto L43
        L37:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L35
            int r2 = r9.length     // Catch: java.lang.Throwable -> L35
            int r2 = r2 - r10
            r1.<init>(r9, r10, r2)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            r9 = 0
            r11[r9] = r1
            return
        L43:
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1cSDK.AFKeystoreWrapper(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void valueOf() {
        AFKeystoreWrapper = -4836734234935930684L;
    }

    @NonNull
    private static AFf1xSDK values(@NonNull AFe1qSDK aFe1qSDK, String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (str == null) {
            return new AFf1xSDK(aFe1qSDK.values == AFe1aSDK.DEFAULT, AFf1wSDK.NA);
        }
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("ዅ\uedd1ዶ\ueb9a\ude6e봦䨥Ⱁ処縳༵\ueb04铖㬌찅\ua63b\udbc7\uf411脖攠ặ냣䙦⃗嶧䷼᭶鿊肑\u0ec5\ud846媆잃쯖鵗᧣ੳ蒣冧풖䥣䇄ᚷ鎅豓˰ꮇ仃\uf342\udf94梑ඦ㘲顡ⷡ쥕產啲\ue2f0葃렒ᘴ\ua7c0䍷！퍖擐㸓", ExpandableListView.getPackedPositionType(0L), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFe1qSDK.values == AFe1aSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = values(new StringBuilder(str3).reverse().toString(), aFe1qSDK.AFInAppEventType, "android", "v1", str4).equals(str);
        return new AFf1xSDK(equals, equals ? AFf1wSDK.SUCCESS : AFf1wSDK.FAILURE);
    }

    @NonNull
    public final AFf1xSDK valueOf(@NonNull AFe1qSDK aFe1qSDK, String str, @NonNull String str2, @NonNull String str3) {
        int i = valueOf + 75;
        int i2 = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        values = i2;
        if (i % 2 != 0) {
            if (aFe1qSDK != null && str2 != null) {
                int i3 = i2 + 35;
                int i4 = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                valueOf = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (str3 != null) {
                    int i5 = i4 + 1;
                    values = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i5 % 2 != 0) {
                        return values(aFe1qSDK, str, str2, str3);
                    }
                }
            }
            return new AFf1xSDK(false, AFf1wSDK.INTERNAL_ERROR);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
        return r5.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r5.length() < 116) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
        if (r5.length() < 12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
        com.appsflyer.internal.AFd1cSDK.values = (com.appsflyer.internal.AFd1cSDK.valueOf + 11) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String values(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = com.appsflyer.internal.AFd1cSDK.valueOf
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1cSDK.values = r1
            int r0 = r0 % 2
            r1 = 12
            java.lang.String r2 = "\u2063"
            java.lang.String r3 = ""
            r4 = 0
            if (r0 != 0) goto L33
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r4] = r6
            r0[r4] = r7
            r6 = 5
            r0[r6] = r8
            r0[r6] = r9
            r6 = 4
            r0[r6] = r3
            java.lang.String r6 = android.text.TextUtils.join(r2, r0)
            java.lang.String r5 = com.appsflyer.internal.AFc1nSDK.valueOf(r6, r5)
            int r6 = r5.length()
            r7 = 116(0x74, float:1.63E-43)
            if (r6 >= r7) goto L4e
            goto L45
        L33:
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r3}
            java.lang.String r6 = android.text.TextUtils.join(r2, r6)
            java.lang.String r5 = com.appsflyer.internal.AFc1nSDK.valueOf(r6, r5)
            int r6 = r5.length()
            if (r6 >= r1) goto L4e
        L45:
            int r6 = com.appsflyer.internal.AFd1cSDK.valueOf
            int r6 = r6 + 11
            int r6 = r6 % 128
            com.appsflyer.internal.AFd1cSDK.values = r6
            return r5
        L4e:
            java.lang.String r5 = r5.substring(r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1cSDK.values(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
