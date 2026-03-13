package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;
/* renamed from: wt  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3056wt {
    static {
        AbstractC3019wV.a(AbstractC3056wt.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
