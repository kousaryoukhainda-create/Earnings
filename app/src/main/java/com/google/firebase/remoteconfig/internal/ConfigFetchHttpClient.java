package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        String str4;
        this.a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.d = str4;
        this.e = str3;
        this.f = j;
        this.g = j2;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l, Map map2) {
        long j;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.b);
            Context context = this.a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i >= 28) {
                        j = AbstractC3272zQ.b(packageInfo);
                    } else {
                        j = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "22.1.2");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (!map2.isEmpty()) {
                hashMap.put("customSignals", new JSONObject(map2));
                Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
            }
            if (l != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(l));
            }
            return new JSONObject(hashMap);
        }
        throw new C0285Fv("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            String str = this.d;
            String str2 = this.e;
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + str + "/namespaces/" + str2 + ":fetch").openConnection();
        } catch (IOException e) {
            throw new C0285Fv(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3 A[LOOP:0: B:13:0x009d->B:15:0x00a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[Catch: all -> 0x0194, JSONException -> 0x0196, IOException | JSONException -> 0x0198, TRY_LEAVE, TryCatch #11 {all -> 0x0194, blocks: (B:17:0x00c2, B:19:0x00de, B:69:0x019a, B:70:0x01a3, B:71:0x01a4, B:72:0x01ab), top: B:101:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019a A[Catch: all -> 0x0194, JSONException -> 0x0196, IOException | JSONException -> 0x0198, TRY_ENTER, TryCatch #11 {all -> 0x0194, blocks: (B:17:0x00c2, B:19:0x00de, B:69:0x019a, B:70:0x01a3, B:71:0x01a4, B:72:0x01ab), top: B:101:0x00c2 }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C2864ug fetch(java.net.HttpURLConnection r13, java.lang.String r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, java.lang.String r17, java.util.Map<java.lang.String, java.lang.String> r18, java.lang.Long r19, java.util.Date r20, java.util.Map<java.lang.String, java.lang.String> r21) throws defpackage.C2028kw {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):ug");
    }
}
