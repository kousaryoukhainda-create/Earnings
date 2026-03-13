package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1fSDK extends HashMap<String, Object> {
    private static long AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 0;
    private static char[] AFLogger = null;
    private static int afDebugLog = 0;
    private static int afErrorLog = 0;
    private static int afErrorLogForExcManagerOnly = 1;
    private static boolean afInfoLog;
    private static boolean afRDLog;
    private static char valueOf;
    private final Map<String, Object> AFKeystoreWrapper;
    private final Context values;

    /* loaded from: classes.dex */
    public static class AFa1ySDK {
        public final int AFInAppEventParameterName;
        public final String AFInAppEventType;
        public final int AFKeystoreWrapper;
        public final long valueOf;

        public AFa1ySDK() {
        }

        public static byte[] AFInAppEventParameterName(@NonNull byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        public static byte[] valueOf(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        public final String AFInAppEventType() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(HiAnalyticsConstant.BI_KEY_SDK_VER, this.AFInAppEventType);
                jSONObject.put("min", this.AFInAppEventParameterName);
                jSONObject.put("expire", this.AFKeystoreWrapper);
                jSONObject.put("ttl", this.valueOf);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }

        public final boolean equals(Object obj) {
            String str;
            if (this == obj) {
                return true;
            }
            if (obj != null && AFa1ySDK.class == obj.getClass()) {
                AFa1ySDK aFa1ySDK = (AFa1ySDK) obj;
                if (this.AFInAppEventParameterName == aFa1ySDK.AFInAppEventParameterName && this.AFKeystoreWrapper == aFa1ySDK.AFKeystoreWrapper && this.valueOf == aFa1ySDK.valueOf && (str = this.AFInAppEventType) != null && str.equals(aFa1ySDK.AFInAppEventType)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i;
            String str = this.AFInAppEventType;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return (((((i * 31) + this.AFInAppEventParameterName) * 31) + this.AFKeystoreWrapper) * 31) + ((int) this.valueOf);
        }

        public AFa1ySDK(String str, int i, int i2, long j) {
            this.AFInAppEventType = str;
            this.AFInAppEventParameterName = i;
            this.AFKeystoreWrapper = i2;
            this.valueOf = j;
        }
    }

    static {
        valueOf();
        Color.argb(0, 0, 0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        View.getDefaultSize(0, 0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.indexOf((CharSequence) "", '0');
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getJumpTapTimeout();
        KeyEvent.getDeadChar(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.getOffsetAfter("", 0);
        afErrorLogForExcManagerOnly = (afErrorLog + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    public AFb1fSDK(Map<String, Object> map, Context context) {
        this.AFKeystoreWrapper = map;
        this.values = context;
        put(AFInAppEventType(), AFKeystoreWrapper());
    }

    @NonNull
    private String AFInAppEventType() {
        afErrorLogForExcManagerOnly = (afErrorLog + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFKeystoreWrapper;
            Object[] objArr = new Object[1];
            AFInAppEventType("흓鼋屖꿣", "八鬵᳑覨㑖抗便လ헭ꎭ좠囡", View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFKeystoreWrapper;
            Object[] objArr2 = new Object[1];
            AFInAppEventType("ᆎ䐡\ue09a핊", "；㈽㎐嘘㲍", (-1706811119) - Color.red(0), "\u0000\u0000\u0000\u0000", (char) (View.MeasureSpec.getSize(0) + 19168), objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                Object[] objArr3 = new Object[1];
                values(null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", 127 - (Process.myTid() >> 22), objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder AFKeystoreWrapper = AFKeystoreWrapper(num, obj2, sb.toString());
            int length = AFKeystoreWrapper.length();
            if (length > 4) {
                AFKeystoreWrapper.delete(4, length);
                afErrorLogForExcManagerOnly = (afErrorLog + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                while (length < 4) {
                    length++;
                    AFKeystoreWrapper.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            values(null, null, "\u008a\u0089\u0088", (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, objArr4);
            AFKeystoreWrapper.insert(0, ((String) objArr4[0]).intern());
            return AFKeystoreWrapper.toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            AFInAppEventType("哥Њ\uf7a0핬", "ꐙ⺸뙸ꉒ虂䚍咕ᅩ孽⻀\uf654쟣ퟏ늦ꝴ瑠ȫ䅘ᅫẵ䱷킷舴\u128e\ue91e⪒煨串ᴆ됅Ꮚ\ue797古垃끹藘녧쒐蟉乖", KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000", (char) (((Process.getThreadPriority(0) + 20) >> 6) + 27895), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            values(null, null, "\u008f\u009b\u0091\u009a\u008c\u0093\u0099\u0089\u0098\u0097\u0089\u008f\u0096\u0093\u008c\u0095\u008f\u0094\u0089\u0088\u008f\u008a\u0089\u0088\u008f\u0090\u0091\u008c\u0093\u008b\u0092\u0089\u0091\u0089\u0090\u008f\u008e\u0089\u008d\u008c\u008b\u008a", 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            values(null, null, "\u009c\u009c\u009c\u009c\u008a\u0089\u0088", TextUtils.lastIndexOf("", '0', 0, 0) + UserVerificationMethods.USER_VERIFY_PATTERN, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) throws Exception {
        int charAt;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < 3) {
            int i2 = afErrorLog + 93;
            afErrorLogForExcManagerOnly = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i2 % 2 == 0) {
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i += 34;
            } else {
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
            }
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < intValue; i3++) {
            Integer num = null;
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = afErrorLog + 115;
                afErrorLogForExcManagerOnly = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 == 0) {
                    charAt = strArr[i4].charAt(i3);
                    int i6 = 46 / 0;
                    if (num == null) {
                        num = Integer.valueOf(charAt);
                    }
                    charAt ^= num.intValue();
                    num = Integer.valueOf(charAt);
                } else {
                    charAt = strArr[i4].charAt(i3);
                    if (num == null) {
                        num = Integer.valueOf(charAt);
                    }
                    charAt ^= num.intValue();
                    num = Integer.valueOf(charAt);
                }
            }
            sb.append(Integer.toHexString(num.intValue()));
        }
        return sb;
    }

    public static void valueOf() {
        AFInAppEventType = 0;
        valueOf = (char) 35907;
        AFInAppEventParameterName = 0L;
        afRDLog = true;
        AFLogger = new char[]{175, 176, 192, 163, 179, 162, 165, 204, 198, 199, 194, 202, 205, 197, 129, 200, 207, 211, 213, 218, 216, 201, 217, 196, 209, 208, 155, 154, 151, 143, 146, 147, 142, 139, 183, 214, 215, 206, 153, 212};
        afInfoLog = true;
        afDebugLog = 97;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void values(int[] r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r8 = r8.getBytes(r0)
        L8:
            byte[] r8 = (byte[]) r8
            if (r7 == 0) goto L10
            char[] r7 = r7.toCharArray()
        L10:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.appsflyer.internal.AFg1tSDK.AFKeystoreWrapper
            monitor-enter(r0)
            char[] r1 = com.appsflyer.internal.AFb1fSDK.AFLogger     // Catch: java.lang.Throwable -> L42
            int r2 = com.appsflyer.internal.AFb1fSDK.afDebugLog     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.appsflyer.internal.AFb1fSDK.afInfoLog     // Catch: java.lang.Throwable -> L42
            r4 = 0
            if (r3 == 0) goto L4d
            int r6 = r8.length     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFg1tSDK.values = r6     // Catch: java.lang.Throwable -> L42
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFg1tSDK.valueOf = r4     // Catch: java.lang.Throwable -> L42
        L25:
            int r7 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFg1tSDK.values     // Catch: java.lang.Throwable -> L42
            if (r7 >= r3) goto L44
            int r7 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFg1tSDK.values     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + r9
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r6[r7] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.appsflyer.internal.AFg1tSDK.valueOf = r5     // Catch: java.lang.Throwable -> L42
            goto L25
        L42:
            r6 = move-exception
            goto Lab
        L44:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r7
            return
        L4d:
            boolean r8 = com.appsflyer.internal.AFb1fSDK.afRDLog     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L7e
            int r6 = r7.length     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFg1tSDK.values = r6     // Catch: java.lang.Throwable -> L42
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFg1tSDK.valueOf = r4     // Catch: java.lang.Throwable -> L42
        L58:
            int r8 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFg1tSDK.values     // Catch: java.lang.Throwable -> L42
            if (r8 >= r3) goto L75
            int r8 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFg1tSDK.values     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            char r3 = r7[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r9
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r6[r8] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.appsflyer.internal.AFg1tSDK.valueOf = r5     // Catch: java.lang.Throwable -> L42
            goto L58
        L75:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r7
            return
        L7e:
            int r7 = r6.length     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFg1tSDK.values = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFg1tSDK.valueOf = r4     // Catch: java.lang.Throwable -> L42
        L85:
            int r8 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFg1tSDK.values     // Catch: java.lang.Throwable -> L42
            if (r8 >= r3) goto La2
            int r8 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFg1tSDK.values     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.appsflyer.internal.AFg1tSDK.valueOf     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r6[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r9
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r8] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.appsflyer.internal.AFg1tSDK.valueOf = r5     // Catch: java.lang.Throwable -> L42
            goto L85
        La2:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        Lab:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1fSDK.values(int[], java.lang.String, java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void AFInAppEventType(java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, char r12, java.lang.Object[] r13) {
        /*
            if (r11 == 0) goto L6
            char[] r11 = r11.toCharArray()
        L6:
            char[] r11 = (char[]) r11
            if (r9 == 0) goto Le
            char[] r9 = r9.toCharArray()
        Le:
            char[] r9 = (char[]) r9
            if (r8 == 0) goto L16
            char[] r8 = r8.toCharArray()
        L16:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.appsflyer.internal.AFg1vSDK.valueOf
            monitor-enter(r0)
            java.lang.Object r8 = r8.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r8 = (char[]) r8     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r11 = r11.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r11 = (char[]) r11     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L7c
            r12 = r12 ^ r2
            char r12 = (char) r12     // Catch: java.lang.Throwable -> L7c
            r8[r1] = r12     // Catch: java.lang.Throwable -> L7c
            r12 = 2
            char r2 = r11[r12]     // Catch: java.lang.Throwable -> L7c
            char r10 = (char) r10     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r10
            char r10 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r11[r12] = r10     // Catch: java.lang.Throwable -> L7c
            int r10 = r9.length     // Catch: java.lang.Throwable -> L7c
            char[] r12 = new char[r10]     // Catch: java.lang.Throwable -> L7c
            com.appsflyer.internal.AFg1vSDK.values = r1     // Catch: java.lang.Throwable -> L7c
        L3b:
            int r2 = com.appsflyer.internal.AFg1vSDK.values     // Catch: java.lang.Throwable -> L7c
            if (r2 >= r10) goto L7e
            int r3 = r2 + 2
            int r3 = r3 % 4
            int r4 = r2 + 3
            int r4 = r4 % 4
            int r2 = r2 % 4
            char r2 = r8[r2]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 * 32718
            char r3 = r11[r3]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r3
            r5 = 65535(0xffff, float:9.1834E-41)
            int r2 = r2 % r5
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            com.appsflyer.internal.AFg1vSDK.AFInAppEventParameterName = r2     // Catch: java.lang.Throwable -> L7c
            char r6 = r8[r4]     // Catch: java.lang.Throwable -> L7c
            int r6 = r6 * 32718
            int r6 = r6 + r3
            int r6 = r6 / r5
            char r3 = (char) r6     // Catch: java.lang.Throwable -> L7c
            r11[r4] = r3     // Catch: java.lang.Throwable -> L7c
            r8[r4] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = com.appsflyer.internal.AFg1vSDK.values     // Catch: java.lang.Throwable -> L7c
            char r4 = r9[r3]     // Catch: java.lang.Throwable -> L7c
            r2 = r2 ^ r4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r6 = com.appsflyer.internal.AFb1fSDK.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.appsflyer.internal.AFb1fSDK.AFInAppEventType     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.appsflyer.internal.AFb1fSDK.valueOf     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L7c
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r12[r3] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + 1
            com.appsflyer.internal.AFg1vSDK.values = r3     // Catch: java.lang.Throwable -> L7c
            goto L3b
        L7c:
            r8 = move-exception
            goto L87
        L7e:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r12)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            r13[r1] = r8
            return
        L87:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1fSDK.AFInAppEventType(java.lang.String, java.lang.String, int, java.lang.String, char, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String AFKeystoreWrapper() {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1fSDK.AFKeystoreWrapper():java.lang.String");
    }
}
