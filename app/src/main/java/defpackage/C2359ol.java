package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* renamed from: ol  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2359ol {
    public final Context a;
    public final SharedPreferences b;
    public final InterfaceC1026cU c;
    public boolean d;

    public C2359ol(Context context, String str, InterfaceC1026cU interfaceC1026cU) {
        boolean a;
        context = Build.VERSION.SDK_INT >= 24 ? AbstractC2525qi.createDeviceProtectedStorageContext(context) : context;
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.b = sharedPreferences;
        this.c = interfaceC1026cU;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            a = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            a = a();
        }
        this.d = a;
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.c.a(new C0566Qr(new C2445pl(z)));
        }
    }
}
