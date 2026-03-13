package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.applovin.sdk.AppLovinSdkUtils;
import com.fyber.fairbid.internal.Constants;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class z3 {
    private static final Map a = new HashMap(2);

    /* loaded from: classes.dex */
    public static class a {
        int a;
        int b;
        int c;
        int d;

        /* renamed from: com.applovin.impl.z3$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0039a {
            private int a;
            private int b;
            private int c;
            private int d;

            public C0039a a(int i) {
                this.c = i;
                return this;
            }

            public C0039a b(int i) {
                this.d = i;
                return this;
            }

            public C0039a c(int i) {
                this.a = i;
                return this;
            }

            public C0039a d(int i) {
                this.b = i;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb.append(this.a);
                sb.append(", topRight=");
                sb.append(this.b);
                sb.append(", bottomLeft=");
                sb.append(this.c);
                sb.append(", bottomRight=");
                return AbstractC2437ph.k(sb, this.d, ")");
            }

            public a a() {
                return new a(this.a, this.b, this.c, this.d);
            }
        }

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a(this) && c() == aVar.c() && d() == aVar.d() && a() == aVar.a() && b() == aVar.b()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int d = d();
            int a = a();
            return b() + ((a + ((d + ((c() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.c;
        }
    }

    public static Point a(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        Point point = new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    public static Point b(Context context) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        boolean z = jVar == null || ((Boolean) jVar.a(sj.l6)).booleanValue();
        if (!c(context) || z) {
            Map map = a;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = Constants.BANNER_FALLBACK_AD_WIDTH;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
                bounds = maximumWindowMetrics.getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else if (d()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        a.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static boolean m() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    private static int a(int i, Display display) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            return radius;
        }
        return -1;
    }

    public static a a(Context context, com.applovin.impl.sdk.j jVar) {
        a aVar = null;
        if (((Boolean) jVar.a(sj.X3)).booleanValue() && m()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVar = new a.C0039a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return aVar;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }
}
