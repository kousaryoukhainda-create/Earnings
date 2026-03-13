package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class AFc1zSDK {
    @NotNull
    public static final AFa1xSDK AFInAppEventParameterName = new AFa1xSDK((byte) 0);
    @NotNull
    public final String AFInAppEventType;
    @NotNull
    public final String AFKeystoreWrapper;
    public int valueOf;
    @NotNull
    public final String values;

    @Metadata
    /* loaded from: classes.dex */
    public static final class AFa1xSDK {
        private AFa1xSDK() {
        }

        public static AFc1zSDK AFInAppEventParameterName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            List<String> F = kotlin.text.d.F(str, new String[]{"\n"});
            if (F.size() != 4) {
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            for (String str5 : F) {
                if (D40.o(str5, "label=")) {
                    str2 = values(str5, "label=");
                } else if (D40.o(str5, "hashName=")) {
                    str3 = values(str5, "hashName=");
                } else if (D40.o(str5, "stackTrace=")) {
                    str4 = values(str5, "stackTrace=");
                } else if (!D40.o(str5, "c=")) {
                    break;
                } else {
                    String substring = str5.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(kotlin.text.d.K(substring).toString()));
                }
            }
            if (AFKeystoreWrapper(num, str2, str3, str4)) {
                return null;
            }
            Intrinsics.b(str2);
            Intrinsics.b(str3);
            Intrinsics.b(str4);
            Intrinsics.b(num);
            return new AFc1zSDK(str2, str3, str4, num.intValue());
        }

        private static boolean AFKeystoreWrapper(Integer num, String... strArr) {
            boolean z;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (!z && str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return z;
        }

        private static String values(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = kotlin.text.d.K(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = AbstractC1543hd.a;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }

        public /* synthetic */ AFa1xSDK(byte b) {
            this();
        }
    }

    public /* synthetic */ AFc1zSDK(String str, String str2, String str3) {
        this(str, str2, str3, 1);
    }

    @NotNull
    public final JSONObject AFInAppEventParameterName() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFInAppEventType);
        jSONObject.put("hash_name", this.AFKeystoreWrapper);
        jSONObject.put("st", this.values);
        jSONObject.put("c", String.valueOf(this.valueOf));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AFc1zSDK) {
            AFc1zSDK aFc1zSDK = (AFc1zSDK) obj;
            return Intrinsics.a(this.AFInAppEventType, aFc1zSDK.AFInAppEventType) && Intrinsics.a(this.AFKeystoreWrapper, aFc1zSDK.AFKeystoreWrapper) && Intrinsics.a(this.values, aFc1zSDK.values) && this.valueOf == aFc1zSDK.valueOf;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.AFKeystoreWrapper.hashCode();
        return ((this.values.hashCode() + ((hashCode + (this.AFInAppEventType.hashCode() * 31)) * 31)) * 31) + this.valueOf;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExceptionInfo(label=");
        sb.append(this.AFInAppEventType);
        sb.append(", hashName=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", stackTrace=");
        sb.append(this.values);
        sb.append(", counter=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }

    public AFc1zSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AFInAppEventType = str;
        this.AFKeystoreWrapper = str2;
        this.values = str3;
        this.valueOf = i;
    }
}
