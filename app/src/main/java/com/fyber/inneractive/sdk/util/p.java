package com.fyber.inneractive.sdk.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class p {
    public static Application a;

    /* loaded from: classes.dex */
    public static class a {
        public static Map<String, String> a = new HashMap();
    }

    public static Application a() {
        return a;
    }

    public static boolean b(String str) {
        try {
            return a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static Drawable c(int i) {
        return IAConfigManager.M.v.a().getDrawable(i);
    }

    public static int d() {
        int i;
        String str;
        Application application = a;
        if (application != null && application.getResources() != null && application.getResources().getConfiguration() != null) {
            i = application.getResources().getConfiguration().orientation;
        } else {
            i = 1;
        }
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        if (i == 1) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        IAlog.a("The device orientation: %s", str);
        return i;
    }

    public static int e() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        if (a != null && (windowManager = (WindowManager) IAConfigManager.M.v.a().getSystemService("window")) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        } else {
            i = -1;
        }
        if (i == -1) {
            try {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.heightPixels;
                }
            } catch (Throwable unused) {
            }
            if (i == -1) {
                return 480;
            }
            return i;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f() {
        /*
            r0 = -1
            android.app.Application r1 = com.fyber.inneractive.sdk.util.p.a     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L29
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.M     // Catch: java.lang.Throwable -> L28
            com.fyber.inneractive.sdk.config.e r1 = r1.v     // Catch: java.lang.Throwable -> L28
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L28
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L29
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L29
            android.graphics.Point r2 = new android.graphics.Point     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r1.getSize(r2)     // Catch: java.lang.Throwable -> L28
            int r1 = r2.x     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
        L29:
            r1 = -1
        L2a:
            if (r1 != r0) goto L3e
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L39
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L3a
            int r1 = r2.widthPixels     // Catch: java.lang.Throwable -> L39
            goto L3a
        L39:
        L3a:
            if (r1 != r0) goto L3e
            r1 = 320(0x140, float:4.48E-43)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.p.f():int");
    }

    public static String g() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.M;
            if (iAConfigManager.y.c.compareAndSet(true, true) || i >= 25) {
                break;
            }
            IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        return iAConfigManager.y.a();
    }

    public static int a(int i) {
        return (int) ((b() * i) + 0.5f);
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static int b(int i) {
        try {
            return (int) ((i / b()) + 0.5f);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String c(String str) {
        String str2 = (String) ((HashMap) a.a).get(str);
        if (TextUtils.isEmpty(str2)) {
            IAlog.a("Assets cache: reading file: %s", str);
            try {
                InputStream open = a.getAssets().open(str, 3);
                StringBuffer stringBuffer = new StringBuffer();
                byte[] bArr = new byte[4096];
                for (int i = 0; i != -1; i = open.read(bArr)) {
                    stringBuffer.append(new String(bArr, 0, i));
                }
                open.close();
                str2 = stringBuffer.toString();
                IAlog.a("Assets cache: success - %s", str);
            } catch (IOException e) {
                IAlog.a("Assets cache: Could not read response from file", new Object[0]);
                IAlog.d(u.b(e), new Object[0]);
            }
            if (!TextUtils.isEmpty(str2)) {
                ((HashMap) a.a).put(str, str2);
            }
        } else {
            IAlog.a("Assets cache: returning cached assets for %s", str);
        }
        return str2;
    }

    public static boolean a(String... strArr) {
        for (String str : strArr) {
            try {
                Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
        return true;
    }

    public static float b() {
        return IAConfigManager.M.v.a().getResources().getConfiguration().densityDpi / 160.0f;
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static String b(String str, Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = collection.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) str);
                    }
                }
                return sb.toString();
            }
            throw new NullPointerException("delimiter");
        }
        return TextUtils.join(str, collection);
    }

    public static int a(float f) {
        return (int) (TypedValue.applyDimension(1, f, IAConfigManager.M.v.a().getResources().getDisplayMetrics()) + 0.5f);
    }

    public static String b(Context context) {
        if (context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(signature.toByteArray());
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(hexString);
                    }
                    return sb.toString();
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static String a(String str, Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : collection) {
            arrayList.add(String.valueOf(num));
        }
        return b(str, arrayList);
    }

    public static boolean a(String str, Context context, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
        } catch (Throwable unused) {
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            return true;
        } catch (Throwable unused2) {
            try {
                IAlog.a("writeFileWithContext failed writing %s", str);
                u.a(fileOutputStream);
                return false;
            } finally {
                u.a(fileOutputStream);
            }
        }
    }

    public static String c() {
        try {
            return Environment.getExternalStorageState();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(View view, int i, int i2) {
        if (view == null || view.getLayoutParams() == null) {
            return;
        }
        view.getLayoutParams().width = a(i);
        view.getLayoutParams().height = a(i2);
    }

    public static int a(Context context) {
        Window window;
        Rect rect = new Rect();
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        return rect.top;
    }

    public static int a(Context context, int i) {
        Window window;
        View findViewById = (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(16908290);
        if (findViewById != null) {
            return findViewById.getTop() - i;
        }
        return 0;
    }
}
