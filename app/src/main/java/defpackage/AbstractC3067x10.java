package defpackage;

import android.content.pm.ShortcutInfo;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.adview.b;
/* renamed from: x10  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3067x10 {
    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ void l(ShortcutInfo.Builder builder) {
        builder.setLongLived(false);
    }

    public static /* bridge */ /* synthetic */ void u(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static /* bridge */ /* synthetic */ void y(b bVar, WebViewRenderProcessClient webViewRenderProcessClient) {
        bVar.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }
}
