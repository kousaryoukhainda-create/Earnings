package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzfu {
    public static long zza(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static zzay zzb(zzfd zzfdVar, String str) {
        Preconditions.checkNotNull(zzfdVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            Map<String, String> parse = HttpUtils.parse(new URI("?" + str), "UTF-8");
            zzay zzayVar = new zzay();
            zzayVar.zzp(parse.get("utm_content"));
            zzayVar.zzu(parse.get("utm_medium"));
            zzayVar.zzv(parse.get("utm_campaign"));
            zzayVar.zzw(parse.get("utm_source"));
            zzayVar.zzt(parse.get("utm_term"));
            zzayVar.zzs(parse.get("utm_id"));
            zzayVar.zzo(parse.get("anid"));
            zzayVar.zzr(parse.get("gclid"));
            zzayVar.zzq(parse.get("dclid"));
            zzayVar.zzn(parse.get("aclid"));
            return zzayVar;
        } catch (URISyntaxException e) {
            zzfdVar.zzR("No valid campaign data found", e);
            return null;
        }
    }

    public static String zzc(boolean z) {
        return true != z ? "0" : "1";
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    public static MessageDigest zze(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static Map zzf(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (String str3 : str.split(ContainerUtils.FIELD_DELIMITER)) {
            String[] split = str3.split(ContainerUtils.KEY_VALUE_DELIMITER, 3);
            int length = split.length;
            String str4 = null;
            if (length > 1) {
                String str5 = split[0];
                if (TextUtils.isEmpty(split[1])) {
                    str2 = null;
                } else {
                    str2 = split[1];
                }
                hashMap.put(str5, str2);
                if (length == 3 && !TextUtils.isEmpty(split[1]) && !hashMap.containsKey(split[1])) {
                    String str6 = split[1];
                    if (!TextUtils.isEmpty(split[2])) {
                        str4 = split[2];
                    }
                    hashMap.put(str6, str4);
                }
            } else if (length == 1 && split[0].length() != 0) {
                hashMap.put(split[0], null);
            }
        }
        return hashMap;
    }

    public static void zzg(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void zzh(Map map, String str, Map map2) {
        zzg(map, str, (String) map2.get(str));
    }

    public static boolean zzi(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (z) {
                    if (receiverInfo.exported) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzj(double d, String str) {
        int i;
        if (d > 0.0d && d < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i = ((i << 6) & 268435455) + charAt + (charAt << 14);
                    int i2 = 266338304 & i;
                    if (i2 != 0) {
                        i ^= i2 >> 21;
                    }
                }
            } else {
                i = 1;
            }
            if (i % HwBuildEx.VersionCodes.CUR_DEVELOPMENT >= d * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
