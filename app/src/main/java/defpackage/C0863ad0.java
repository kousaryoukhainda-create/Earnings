package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: ad0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863ad0 extends G3 {
    public final Pattern d;

    public C0863ad0() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // defpackage.G3
    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    @Override // defpackage.G3
    public final boolean b() {
        int i;
        PackageInfo packageInfo;
        boolean b = super.b();
        if (b && (i = Build.VERSION.SDK_INT) < 29) {
            int i2 = Zc0.a;
            if (i >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                try {
                    packageInfo = Zc0.b();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfo = null;
                }
            }
            if (packageInfo == null) {
                return false;
            }
            Matcher matcher = this.d.matcher(packageInfo.versionName);
            if (!matcher.find() || Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
        return b;
    }
}
