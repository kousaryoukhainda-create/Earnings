package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.fyber.fairbid.http.connection.HttpConnection;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class zzbuh implements zzbuj {
    public static zzbuj zza;
    static zzbuj zzb;
    static zzbuj zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbuh(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzfqv.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzn = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.zzg = r3
            r2.zzj = r4
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzhG
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L64
        L52:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            goto L64
        L62:
            goto L50
        L64:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzhE
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L83
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L84
        L83:
            r4 = r1
        L84:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb3
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9d
            goto Lb4
        L9d:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            if (r3 != 0) goto Lac
            goto Lb4
        Lac:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            goto Lb4
        Lb3:
            r0 = r1
        Lb4:
            r2.zzm = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuh.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbuj zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzl(context)) {
                        zza = new zzbuh(context, VersionInfoParcel.forPackage());
                    } else {
                        zza = new zzbui();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzbuj zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z = false;
                    if (((Boolean) zzbed.zzc.zze()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue() || ((Boolean) zzbed.zza.zze()).booleanValue()) {
                            z = true;
                        }
                    }
                    if (zzl(context)) {
                        zzbuh zzbuhVar = new zzbuh(context, versionInfoParcel);
                        zzbuhVar.zzk();
                        zzbuhVar.zzj();
                        zzc = zzbuhVar;
                    } else if (z && context != null) {
                        zzbuh zzbuhVar2 = new zzbuh(context, versionInfoParcel, true);
                        zzbuhVar2.zzk();
                        zzbuhVar2.zzj();
                        zzc = zzbuhVar2;
                    } else {
                        zzc = new zzbui();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    public static zzbuj zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhA)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue()) {
                            zzb = new zzbuh(context, VersionInfoParcel.forPackage());
                        }
                    }
                    zzb = new zzbui();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static zzbuj zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhA)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue()) {
                            zzb = new zzbuh(context, versionInfoParcel);
                        }
                    }
                    zzb = new zzbui();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzfve.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th)));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbuf(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbug(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmE)).booleanValue()) {
            if (((Boolean) zzbeu.zze.zze()).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    if (com.google.android.gms.ads.internal.client.zzbc.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmB)).intValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzd = Boolean.valueOf(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhz)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void zzg(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName());
                    z2 |= zzbuh.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                if (!this.zzo) {
                    zzh(th, "");
                }
                if (!this.zzn.getAndSet(true) && ((Boolean) zzbed.zzc.zze()).booleanValue()) {
                    zzbbv.zzc(this.zzg);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzi(Throwable th, String str, float f) {
        Throwable th2;
        boolean z;
        Throwable th3;
        String str2;
        int i;
        String str3;
        String str4;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo zzc2;
        if (!this.zzo) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            boolean z2 = false;
            if (((Boolean) zzbeu.zzf.zze()).booleanValue()) {
                th2 = th;
            } else {
                LinkedList linkedList = new LinkedList();
                for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                    linkedList.push(th4);
                }
                th2 = null;
                while (!linkedList.isEmpty()) {
                    Throwable th5 = (Throwable) linkedList.pop();
                    StackTraceElement[] stackTrace = th5.getStackTrace();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcs)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzo(th5.getClass().getName())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName())) {
                            arrayList.add(stackTraceElement);
                            z = true;
                        } else {
                            String className = stackTraceElement.getClassName();
                            if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                                arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                            } else {
                                arrayList.add(stackTraceElement);
                            }
                        }
                    }
                    if (z) {
                        if (th2 == null) {
                            th3 = new Throwable(th5.getMessage());
                        } else {
                            th3 = new Throwable(th5.getMessage(), th2);
                        }
                        th2 = th3;
                        th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    }
                }
            }
            if (th2 != null) {
                String name = th.getClass().getName();
                String zze2 = zze(th);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziI)).booleanValue()) {
                    str2 = zzf(th);
                } else {
                    str2 = "";
                }
                double d = f;
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                double random = Math.random();
                if (i2 > 0) {
                    i = (int) (1.0f / f);
                } else {
                    i = 1;
                }
                if (random < d) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        z2 = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                    } catch (Throwable th6) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching instant app info", th6);
                    }
                    try {
                        str3 = this.zzg.getPackageName();
                    } catch (Throwable unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot obtain package name, proceeding.");
                        str3 = "unknown";
                    }
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpConnection.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z2)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                    int i3 = Build.VERSION.SDK_INT;
                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i3));
                    String str5 = Build.MANUFACTURER;
                    String str6 = Build.MODEL;
                    if (!str6.startsWith(str5)) {
                        str6 = AbstractC0324Hi.g(str5, " ", str6);
                    }
                    Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzj.afmaVersion).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbeu.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzg)));
                    String str7 = "1";
                    if (true == this.zzj.isLiteSdk) {
                        str4 = "1";
                    } else {
                        str4 = "0";
                    }
                    Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("lite", str4);
                    if (!TextUtils.isEmpty(str2)) {
                        appendQueryParameter4.appendQueryParameter("hash", str2);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhF)).booleanValue() && (zzc2 = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzg)) != null) {
                        appendQueryParameter4.appendQueryParameter("available_memory", Long.toString(zzc2.availMem));
                        appendQueryParameter4.appendQueryParameter("total_memory", Long.toString(zzc2.totalMem));
                        if (true != zzc2.lowMemory) {
                            str7 = "0";
                        }
                        appendQueryParameter4.appendQueryParameter("is_low_memory", str7);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhE)).booleanValue()) {
                        if (!TextUtils.isEmpty(this.zzl)) {
                            appendQueryParameter4.appendQueryParameter("countrycode", this.zzl);
                        }
                        if (!TextUtils.isEmpty(this.zzm)) {
                            appendQueryParameter4.appendQueryParameter("psv", this.zzm);
                        }
                        Context context = this.zzg;
                        if (i3 >= 26) {
                            packageInfo = WebView.getCurrentWebViewPackage();
                        } else {
                            if (context != null) {
                                try {
                                    packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", UserVerificationMethods.USER_VERIFY_PATTERN);
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                            }
                            packageInfo = null;
                        }
                        if (packageInfo != null) {
                            appendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                            appendQueryParameter4.appendQueryParameter("wvvn", packageInfo.versionName);
                            appendQueryParameter4.appendQueryParameter("wvpn", packageInfo.packageName);
                        }
                    }
                    PackageInfo packageInfo2 = this.zzk;
                    if (packageInfo2 != null) {
                        appendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                        appendQueryParameter4.appendQueryParameter("appvn", this.zzk.versionName);
                    }
                    arrayList2.add(appendQueryParameter4.toString());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        final String str8 = (String) it.next();
                        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(null);
                        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbue
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.gms.ads.internal.util.client.zzu.this.zza(str8);
                            }
                        });
                    }
                }
            }
        }
    }

    public zzbuh(Context context, VersionInfoParcel versionInfoParcel, boolean z) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
