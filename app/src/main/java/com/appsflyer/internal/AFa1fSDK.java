package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1zSDK;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AFa1fSDK implements AFc1vSDK {
    @NotNull
    private final AFb1bSDK valueOf;

    public AFa1fSDK() {
    }

    private File AFInAppEventParameterName() {
        Context context = this.valueOf.AFInAppEventType;
        if (context != null) {
            File file = new File(context.getFilesDir(), "AFExceptionsCache");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r2.equals("c") != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> AFInAppEventType(android.content.Context r11, java.util.Map<java.lang.String, java.lang.String> r12, android.net.Uri r13) {
        /*
            java.lang.String r0 = "install_time"
            java.util.Set r1 = r13.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "media_source"
            r4 = 0
            java.lang.String r5 = "agency"
            if (r2 == 0) goto L69
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r13.getQueryParameter(r2)
            boolean r7 = r12.containsKey(r2)
            if (r7 != 0) goto L64
            int r7 = r2.hashCode()
            r8 = -1420799080(0xffffffffab505398, float:-7.4012454E-13)
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L4d
            r8 = 99
            if (r7 == r8) goto L44
            r4 = 110987(0x1b18b, float:1.55526E-40)
            if (r7 == r4) goto L3a
            goto L57
        L3a:
            java.lang.String r4 = "pid"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L57
            r4 = 1
            goto L58
        L44:
            java.lang.String r7 = "c"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L57
            goto L58
        L4d:
            java.lang.String r4 = "af_prt"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L57
            r4 = 2
            goto L58
        L57:
            r4 = -1
        L58:
            if (r4 == 0) goto L61
            if (r4 == r10) goto L65
            if (r4 == r9) goto L5f
            goto L64
        L5f:
            r3 = r5
            goto L65
        L61:
            java.lang.String r3 = "campaign"
            goto L65
        L64:
            r3 = r2
        L65:
            r12.put(r3, r6)
            goto La
        L69:
            boolean r1 = r12.containsKey(r0)     // Catch: java.lang.Exception -> L9c
            if (r1 != 0) goto La2
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L9c
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Exception -> L9c
            r2.<init>(r1, r6)     // Catch: java.lang.Exception -> L9c
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = r11.getPackageName()     // Catch: java.lang.Exception -> L9c
            android.content.pm.PackageInfo r11 = r1.getPackageInfo(r11, r4)     // Catch: java.lang.Exception -> L9c
            long r6 = r11.firstInstallTime     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = "UTC"
            java.util.TimeZone r11 = j$.util.DesugarTimeZone.getTimeZone(r11)     // Catch: java.lang.Exception -> L9c
            r2.setTimeZone(r11)     // Catch: java.lang.Exception -> L9c
            java.util.Date r11 = new java.util.Date     // Catch: java.lang.Exception -> L9c
            r11.<init>(r6)     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = r2.format(r11)     // Catch: java.lang.Exception -> L9c
            r12.put(r0, r11)     // Catch: java.lang.Exception -> L9c
            goto La2
        L9c:
            r11 = move-exception
            java.lang.String r0 = "Could not fetch install time. "
            com.appsflyer.AFLogger.afErrorLog(r0, r11)
        La2:
            java.lang.String r11 = "af_deeplink"
            boolean r11 = r12.containsKey(r11)
            if (r11 == 0) goto Lb7
            java.lang.String r11 = "af_status"
            boolean r0 = r12.containsKey(r11)
            if (r0 != 0) goto Lb7
            java.lang.String r0 = "Non-organic"
            r12.put(r11, r0)
        Lb7:
            boolean r11 = r12.containsKey(r5)
            if (r11 == 0) goto Lc0
            r12.remove(r3)
        Lc0:
            java.lang.String r11 = r13.getPath()
            if (r11 == 0) goto Lcb
            java.lang.String r0 = "path"
            r12.put(r0, r11)
        Lcb:
            java.lang.String r11 = r13.getScheme()
            if (r11 == 0) goto Ld6
            java.lang.String r0 = "scheme"
            r12.put(r0, r11)
        Ld6:
            java.lang.String r11 = r13.getHost()
            if (r11 == 0) goto Le1
            java.lang.String r13 = "host"
            r12.put(r13, r11)
        Le1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1fSDK.AFInAppEventType(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }

    public static String AFKeystoreWrapper(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }

    private File afDebugLog() {
        File AFInAppEventParameterName = AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            File file = new File(AFInAppEventParameterName, "6.12.2");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }

    public static boolean values(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public AFa1fSDK(AFb1bSDK aFb1bSDK) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        this.valueOf = aFb1bSDK;
    }

    public static boolean values(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(checkPermission);
        AFLogger.afRDLog(sb.toString());
        return checkPermission == 0;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static String values(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsflyer.internal.AFc1vSDK
    @NotNull
    public final List<AFc1zSDK> AFKeystoreWrapper() {
        C2968vr c2968vr;
        File[] listFiles;
        synchronized (this) {
            try {
                File afDebugLog = afDebugLog();
                c2968vr = null;
                if (afDebugLog != null && (listFiles = afDebugLog.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    ArrayList arrayList = new ArrayList();
                    for (File file : listFiles) {
                        AFc1zSDK.AFa1xSDK aFa1xSDK = AFc1zSDK.AFInAppEventParameterName;
                        Intrinsics.checkNotNullExpressionValue(file, "");
                        AFc1zSDK AFInAppEventParameterName = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(C0491Nu.b(file));
                        if (AFInAppEventParameterName != null) {
                            arrayList.add(AFInAppEventParameterName);
                        }
                    }
                    c2968vr = arrayList;
                }
                if (c2968vr == null) {
                    c2968vr = C2968vr.b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2968vr;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean AFInAppEventParameterName(String... strArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File AFInAppEventParameterName = AFInAppEventParameterName();
                z = true;
                if (AFInAppEventParameterName != null) {
                    if (strArr.length == 0) {
                        Intrinsics.checkNotNullParameter("delete all exceptions", "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat("delete all exceptions"));
                        z = C0595Ru.i(AFInAppEventParameterName);
                    } else {
                        StringBuilder sb = new StringBuilder("delete all exceptions except for: ");
                        sb.append(C2215n5.i(strArr, ", ", null, null, 62));
                        String obj = sb.toString();
                        Intrinsics.checkNotNullParameter(obj, "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(obj)));
                        File[] listFiles = AFInAppEventParameterName.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!C2215n5.f(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(C0372Je.f(arrayList));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(C0595Ru.i(file2)));
                            }
                            Set E = C0553Qe.E(arrayList2);
                            if (E.isEmpty()) {
                                E = R00.a(Boolean.TRUE);
                            }
                            if (E.size() != 1 || !((Boolean) C0553Qe.k(E)).booleanValue()) {
                                z = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final String values(Throwable th, String str) {
        String str2;
        AFc1zSDK AFInAppEventParameterName;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            try {
                File afDebugLog = afDebugLog();
                str2 = null;
                if (afDebugLog != null) {
                    try {
                        Intrinsics.checkNotNullParameter(th, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        StringBuilder sb = new StringBuilder();
                        Intrinsics.checkNotNullParameter(th, "");
                        String name = th.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        sb.append(name);
                        sb.append(": ");
                        sb.append(str);
                        String obj = sb.toString();
                        Intrinsics.checkNotNullParameter(th, "");
                        Intrinsics.checkNotNullParameter(th, "");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(th);
                        sb2.append('\n');
                        sb2.append(C0553Qe.p(AFc1nSDK.AFInAppEventParameterName(th), "\n", null, null, AFc1nSDK.AFa1wSDK.AFKeystoreWrapper, 30));
                        AFc1zSDK aFc1zSDK = new AFc1zSDK(obj, AFc1uSDK.AFa1wSDK.AFInAppEventParameterName(sb2.toString()), C2196ms.b(th));
                        String str3 = aFc1zSDK.AFKeystoreWrapper;
                        File file = new File(afDebugLog, str3);
                        if (file.exists() && (AFInAppEventParameterName = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(C0491Nu.b(file))) != null) {
                            AFInAppEventParameterName.valueOf++;
                            aFc1zSDK = AFInAppEventParameterName;
                        }
                        StringBuilder sb3 = new StringBuilder("label=");
                        sb3.append(AFc1uSDK.AFa1wSDK.valueOf(aFc1zSDK.AFInAppEventType));
                        sb3.append("\nhashName=");
                        sb3.append(AFc1uSDK.AFa1wSDK.valueOf(aFc1zSDK.AFKeystoreWrapper));
                        sb3.append("\nstackTrace=");
                        sb3.append(AFc1uSDK.AFa1wSDK.valueOf(aFc1zSDK.values));
                        sb3.append("\nc=");
                        sb3.append(aFc1zSDK.valueOf);
                        C0491Nu.c(file, sb3.toString());
                        str2 = str3;
                    } catch (Exception e) {
                        StringBuilder sb4 = new StringBuilder("Could not cache exception\n");
                        StringBuilder sb5 = new StringBuilder(" ");
                        sb5.append(e.getMessage());
                        String obj2 = sb5.toString();
                        Intrinsics.checkNotNullParameter(obj2, "");
                        sb4.append("[Exception Manager]: ".concat(String.valueOf(obj2)));
                        AFLogger.afRDLog(sb4.toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public static long AFInAppEventType(Context context, String str) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
                return longVersionCode;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final int AFInAppEventType() {
        int i = 0;
        for (AFc1zSDK aFc1zSDK : AFKeystoreWrapper()) {
            i += aFc1zSDK.valueOf;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean values() {
        return AFInAppEventParameterName(new String[0]);
    }
}
