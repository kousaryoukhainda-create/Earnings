package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: cG  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012cG {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public C1012cG(int i) {
        this.c = i;
    }

    public static String b(int i, String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i) {
                return trim.substring(0, i);
            }
            return trim;
        }
        return str;
    }

    public final synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean equals;
        if (str != null) {
            String b = b(this.c, str);
            if (this.a.size() >= this.b && !this.a.containsKey(b)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b, null);
                return false;
            }
            String b2 = b(this.c, str2);
            String str3 = (String) this.a.get(b);
            if (str3 == null) {
                if (b2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = str3.equals(b2);
            }
            if (equals) {
                return false;
            }
            HashMap hashMap = this.a;
            if (str2 == null) {
                b2 = "";
            }
            hashMap.put(b, b2);
            return true;
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public final synchronized void d(Map map) {
        String b;
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String b2 = b(this.c, str);
                    if (this.a.size() >= this.b && !this.a.containsKey(b2)) {
                        i++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.a;
                    if (str2 == null) {
                        b = "";
                    } else {
                        b = b(this.c, str2);
                    }
                    hashMap.put(b2, b);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
