package com.fyber.fairbid;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.UUID;
/* loaded from: classes.dex */
public final class fl {
    public static synchronized String a(Context context) {
        String string;
        synchronized (fl.class) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("FyberPreferences", 0);
                string = sharedPreferences.getString("STATE_GENERATED_USERID_KEY", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    String str = "nosha1";
                    try {
                        byte[] digest = MessageDigest.getInstance("SHA1").digest(string.getBytes());
                        Formatter formatter = new Formatter();
                        int length = digest.length;
                        for (int i = 0; i < length; i++) {
                            formatter.format("%02x", Byte.valueOf(digest[i]));
                        }
                        String formatter2 = formatter.toString();
                        formatter.close();
                        str = formatter2;
                    } catch (NoSuchAlgorithmException e) {
                        C2053lA.c(e, "UrlBuilder", "SHA1 algorithm not available.");
                    }
                    if (str != null && !str.equals("nosha1")) {
                        string = str;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("STATE_GENERATED_USERID_KEY", string);
                    edit.commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}
