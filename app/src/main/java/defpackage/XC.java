package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
/* renamed from: XC  reason: default package */
/* loaded from: classes.dex */
public final class XC {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final C0754Xx a;
    public final Context b;
    public final String c;
    public final InterfaceC0440Lv d;
    public final C2293o1 e;
    public E8 f;

    public XC(Context context, String str, InterfaceC0440Lv interfaceC0440Lv, C2293o1 c2293o1) {
        if (context != null) {
            if (str != null) {
                this.b = context;
                this.c = str;
                this.d = interfaceC0440Lv;
                this.e = c2293o1;
                this.a = new C0754Xx();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C0337Hv b(boolean r10) {
        /*
            r9 = this;
            Xj r2 = defpackage.C3244z4.k
            Wj r8 = new Wj
            java.lang.Class<Xj> r3 = defpackage.C0740Xj.class
            java.lang.String r4 = "isNotMainThread"
            r1 = 0
            java.lang.String r5 = "isNotMainThread()Z"
            r6 = 0
            r7 = 2
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r8.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Must not be called on a main thread, was called on "
            r0.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L45
            android.util.Log.d(r2, r0, r1)
        L45:
            r3 = 10000(0x2710, double:4.9407E-320)
            Lv r0 = r9.d
            if (r10 == 0) goto L63
            r10 = r0
            Kv r10 = (defpackage.C0415Kv) r10     // Catch: java.lang.Exception -> L5d
            com.google.android.gms.tasks.Task r10 = r10.e()     // Catch: java.lang.Exception -> L5d
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L5d
            java.lang.Object r10 = com.google.android.gms.tasks.Tasks.await(r10, r3, r5)     // Catch: java.lang.Exception -> L5d
            G8 r10 = (defpackage.G8) r10     // Catch: java.lang.Exception -> L5d
            java.lang.String r10 = r10.a     // Catch: java.lang.Exception -> L5d
            goto L64
        L5d:
            r10 = move-exception
            java.lang.String r5 = "Error getting Firebase authentication token."
            android.util.Log.w(r2, r5, r10)
        L63:
            r10 = r1
        L64:
            Kv r0 = (defpackage.C0415Kv) r0     // Catch: java.lang.Exception -> L74
            com.google.android.gms.tasks.Task r0 = r0.d()     // Catch: java.lang.Exception -> L74
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L74
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0, r3, r5)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L74
            r1 = r0
            goto L7a
        L74:
            r0 = move-exception
            java.lang.String r3 = "Error getting Firebase installation id."
            android.util.Log.w(r2, r3, r0)
        L7a:
            Hv r0 = new Hv
            r0.<init>(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XC.b(boolean):Hv");
    }

    public final synchronized E8 c() {
        String str;
        E8 e8 = this.f;
        if (e8 != null && (e8.b != null || !this.e.g())) {
            return this.f;
        }
        C2999wB c2999wB = C2999wB.j;
        c2999wB.z("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c2999wB.z("Cached Firebase Installation ID: " + string);
        if (this.e.g()) {
            C0337Hv b = b(false);
            c2999wB.z("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new C0337Hv(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new E8(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new E8(a(sharedPreferences, b.a), b.a, b.b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f = new E8(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f = new E8(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        }
        c2999wB.z("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        C0754Xx c0754Xx = this.a;
        Context context = this.b;
        synchronized (c0754Xx) {
            try {
                if (c0754Xx.c == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c0754Xx.c = installerPackageName;
                }
                if ("".equals(c0754Xx.c)) {
                    str = null;
                } else {
                    str = c0754Xx.c;
                }
            } finally {
            }
        }
        return str;
    }
}
