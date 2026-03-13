package com.applovin.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppLovinSdkUtils {
    private static final Handler a = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class Size {
        public static final Size ZERO = new Size(0, 0);
        private int a;
        private int b;

        public Size(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            if (this.a == size.getWidth() && this.b == size.getHeight()) {
                return true;
            }
            return false;
        }

        public int getHeight() {
            return this.b;
        }

        public int getWidth() {
            return this.a;
        }

        public int hashCode() {
            int i = this.b;
            int i2 = this.a;
            return i ^ ((i2 >>> 16) | (i2 << 16));
        }

        public String toString() {
            return this.a + "x" + this.b;
        }
    }

    private static boolean a(String str, String str2) {
        return StringUtils.startsWithAtLeastOnePrefix(str, CollectionUtils.explode(str2));
    }

    public static int dpToPx(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            return configuration.orientation;
        }
        return 0;
    }

    public static boolean isEmulator() {
        if (!a(Build.DEVICE, "goldfish,vbox") && !a(Build.HARDWARE, "ranchu,generic,vbox") && !a(Build.MANUFACTURER, "Genymotion") && !a(Build.MODEL, "Android SDK built for x86")) {
            return false;
        }
        return true;
    }

    public static boolean isFireOS(Context context) {
        if (!"amazon".equalsIgnoreCase(Build.MANUFACTURER) && !isFireTv(context)) {
            return false;
        }
        return true;
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isInclusiveVersion(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int f = yp.f(str);
        if (str2 != null && f < yp.f(str2)) {
            return false;
        }
        if (str3 == null || f <= yp.f(str3)) {
            return true;
        }
        return false;
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        if (AppLovinSdk.VERSION_CODE >= yp.f(str)) {
            return true;
        }
        return false;
    }

    public static boolean isTablet(Context context) {
        Point b = z3.b(context);
        if (Math.min(b.x, b.y) >= dpToPx(context, 600)) {
            return true;
        }
        return false;
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (z3.f()) {
            return packageManager.hasSystemFeature("android.software.leanback");
        }
        return packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i) {
        return (int) Math.ceil(i / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        runOnUiThreadDelayed(runnable, j, a);
    }

    public static void setImageUrl(String str, ImageView imageView, AppLovinSdk appLovinSdk) {
        ImageViewUtils.setImageUri(imageView, Uri.parse(str), appLovinSdk.a());
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }

    public static void runOnUiThread(boolean z, Runnable runnable) {
        if (!z && yp.h()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j, Handler handler) {
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (yp.h()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
