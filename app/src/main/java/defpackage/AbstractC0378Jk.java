package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Jk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0378Jk {
    public final InterfaceC2914vC a;
    public final ComponentName b;

    public AbstractC0378Jk(InterfaceC2914vC interfaceC2914vC, ComponentName componentName) {
        this.a = interfaceC2914vC;
        this.b = componentName;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC0559Qk abstractServiceConnectionC0559Qk) {
        abstractServiceConnectionC0559Qk.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC0559Qk, 33);
    }

    public static String b(Context context, List list, boolean z) {
        List<String> list2;
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList = new ArrayList(list2.size() + 1);
            arrayList.add(str);
            if (list != null) {
                arrayList.addAll(list);
            }
            list2 = arrayList;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : list2) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    public final C0585Rk c(AbstractC0196Ck abstractC0196Ck) {
        BinderC0352Ik binderC0352Ik = new BinderC0352Ik(abstractC0196Ck);
        InterfaceC2914vC interfaceC2914vC = this.a;
        try {
            if (!((C2742tC) interfaceC2914vC).f(binderC0352Ik)) {
                return null;
            }
            return new C0585Rk(interfaceC2914vC, binderC0352Ik, this.b);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
