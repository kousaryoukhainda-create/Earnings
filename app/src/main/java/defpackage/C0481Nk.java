package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
/* renamed from: Nk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481Nk {
    public final Intent a;
    public final BI b;
    public ActivityOptions c;
    public SparseArray d;
    public Bundle e;
    public int f;
    public boolean g;

    public C0481Nk() {
        this.a = new Intent("android.intent.action.VIEW");
        this.b = new BI(24);
        this.f = 0;
        this.g = true;
    }

    public final C0507Ok a() {
        Bundle bundle;
        Intent intent = this.a;
        Bundle bundle2 = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.g);
        this.b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle4 = this.e;
        if (bundle4 != null) {
            intent.putExtras(bundle4);
        }
        if (this.d != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.d);
            intent.putExtras(bundle5);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            String a = AbstractC0430Lk.a();
            if (!TextUtils.isEmpty(a)) {
                if (intent.hasExtra("com.android.browser.headers")) {
                    bundle = intent.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey("Accept-Language")) {
                    bundle.putString("Accept-Language", a);
                    intent.putExtra("com.android.browser.headers", bundle);
                }
            }
        }
        if (i >= 34) {
            if (this.c == null) {
                this.c = AbstractC0404Kk.a();
            }
            AbstractC0455Mk.a(this.c, false);
        }
        ActivityOptions activityOptions = this.c;
        if (activityOptions != null) {
            bundle2 = activityOptions.toBundle();
        }
        return new C0507Ok(intent, bundle2);
    }

    public C0481Nk(C0585Rk c0585Rk) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.a = intent;
        this.b = new BI(24);
        this.f = 0;
        this.g = true;
        if (c0585Rk != null) {
            intent.setPackage(c0585Rk.d.getPackageName());
            BinderC0352Ik binderC0352Ik = c0585Rk.c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC0352Ik);
            intent.putExtras(bundle);
        }
    }
}
