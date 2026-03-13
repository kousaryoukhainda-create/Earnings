package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
/* renamed from: CQ  reason: default package */
/* loaded from: classes.dex */
public abstract class CQ {
    public static final String a = EI.e("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        int i;
        String str;
        String str2 = "disabled";
        String str3 = a;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            EI c = EI.c();
            String name = cls.getName();
            if (!z) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            c.a(str3, name + " " + str, new Throwable[0]);
        } catch (Exception e) {
            EI c2 = EI.c();
            String name2 = cls.getName();
            if (z) {
                str2 = "enabled";
            }
            c2.a(str3, AbstractC0324Hi.g(name2, " could not be ", str2), e);
        }
    }
}
