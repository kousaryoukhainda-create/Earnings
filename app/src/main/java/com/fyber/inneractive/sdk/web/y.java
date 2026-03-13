package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class y {
    public static final Pattern g = Pattern.compile("max-age=(\\d+)");
    public static final SimpleDateFormat h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);
    public final byte[] a;
    public final Map<String, String> b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public y(byte[] bArr, Map<String, String> map, String str, String str2, int i, String str3) {
        this.a = bArr;
        this.b = map;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    public boolean a() {
        boolean z;
        String str;
        int i;
        if (TextUtils.isEmpty(this.f)) {
            return false;
        }
        loop0: while (true) {
            z = true;
            for (String str2 : this.b.keySet()) {
                if (!z) {
                    break loop0;
                } else if (str2 != null && str2.equalsIgnoreCase("Cache-Control")) {
                    String str3 = this.b.get(str2);
                    if (str3 != null) {
                        Pattern pattern = g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str3.toLowerCase(locale));
                        if (matcher.find() && matcher.groupCount() == 1) {
                            i = com.fyber.inneractive.sdk.util.u.a(matcher.group(1), 0);
                        } else {
                            i = 0;
                        }
                        if ((str3.toLowerCase(locale).contains("public") || str3.toLowerCase(locale).contains("private") || i > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str3.toLowerCase(locale).contains("no-") && !str3.toLowerCase(locale).contains("must-")) {
                            break;
                        }
                        z = false;
                    } else {
                        continue;
                    }
                } else {
                    if (str2 == null || !str2.equalsIgnoreCase("Vary")) {
                        if (str2 != null && str2.equalsIgnoreCase("Pragma")) {
                            String str4 = this.b.get(str2);
                            if (str4 != null) {
                                z = !str4.equalsIgnoreCase("no-cache");
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = this.b.get(str2)) != null) {
                            try {
                                Date parse = h.parse(str);
                                if (parse != null && parse.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (ParseException unused) {
                            }
                        }
                    }
                    z = false;
                }
            }
        }
        return z;
    }

    public WebResourceResponse b() {
        return new WebResourceResponse(this.c, this.d, this.e, this.f, this.b, new ByteArrayInputStream(this.a));
    }
}
