package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
/* loaded from: classes2.dex */
public abstract class a {
    private static z0 a;

    private static synchronized z0 a() {
        z0 z0Var;
        synchronized (a.class) {
            try {
                if (a == null) {
                    a = q.c().b();
                }
                z0Var = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z0Var;
    }

    public static void b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            a.b(i, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    public static void c() {
        if (a() == null || !q1.b().a()) {
            return;
        }
        a.a(-1);
    }

    public static void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            a.a(i, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    public static boolean b() {
        return q.c().a();
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            a.a(context, str, str2);
        }
    }
}
