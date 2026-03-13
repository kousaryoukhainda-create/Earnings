package com.appsflyer.internal;

import android.util.Base64;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
@Metadata
/* loaded from: classes.dex */
public interface AFc1uSDK {

    @Metadata
    /* loaded from: classes.dex */
    public static final class AFa1wSDK {
        public final Boolean AFInAppEventType;
        public final String valueOf;
        public Boolean values;

        public AFa1wSDK() {
        }

        @NotNull
        public static String AFInAppEventParameterName(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(AbstractC1543hd.a);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "");
            String str2 = "";
            for (byte b : digest) {
                StringBuilder l = AbstractC0324Hi.l(str2);
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "");
                l.append(format);
                str2 = l.toString();
            }
            return str2;
        }

        public static int AFKeystoreWrapper(String str) {
            int i;
            int i2;
            String str2;
            Integer e;
            String str3;
            Integer e2;
            String str4;
            Integer e3;
            Intrinsics.checkNotNullParameter(str, "");
            EJ a = new Regex("(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?").a(str);
            if (a != null) {
                DJ dj = a.c;
                BJ f = dj.f(1);
                int i3 = 0;
                if (f != null && (str4 = f.a) != null && (e3 = kotlin.text.c.e(str4)) != null) {
                    i = e3.intValue();
                } else {
                    i = 0;
                }
                int i4 = i * 1000000;
                BJ f2 = dj.f(2);
                if (f2 != null && (str3 = f2.a) != null && (e2 = kotlin.text.c.e(str3)) != null) {
                    i2 = e2.intValue();
                } else {
                    i2 = 0;
                }
                int i5 = (i2 * 1000) + i4;
                BJ f3 = dj.f(3);
                if (f3 != null && (str2 = f3.a) != null && (e = kotlin.text.c.e(str2)) != null) {
                    i3 = e.intValue();
                }
                return i5 + i3;
            }
            return -1;
        }

        @NotNull
        public static String valueOf(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bytes = str.getBytes(AbstractC1543hd.a);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String encodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            return encodeToString;
        }

        public static double values(String str) throws ParseException {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                Number parse = NumberFormat.getInstance(Locale.getDefault()).parse(str);
                if (parse != null) {
                    return parse.doubleValue();
                }
                throw new ParseException("Failed parse String into number", 0);
            }
        }

        public AFa1wSDK(String str, Boolean bool) {
            this.valueOf = str;
            this.AFInAppEventType = bool;
        }

        @NotNull
        public static JSONArray values(List<AFc1zSDK> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C0372Je.f(list));
            for (AFc1zSDK aFc1zSDK : list) {
                arrayList.add(aFc1zSDK.AFInAppEventParameterName());
            }
            return new JSONArray((Collection) arrayList);
        }

        public static boolean values(HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "");
            return httpURLConnection.getResponseCode() / 100 == 2;
        }
    }

    void valueOf(@NotNull byte[] bArr, Map<String, String> map, int i);
}
