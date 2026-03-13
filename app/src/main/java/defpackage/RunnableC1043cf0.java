package defpackage;

import android.webkit.WebView;
import com.applovin.impl.tr;
/* renamed from: cf0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1043cf0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ WebView c;

    public /* synthetic */ RunnableC1043cf0(WebView webView, int i) {
        this.b = i;
        this.c = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.setVisibility(0);
                return;
            case 1:
                this.c.destroy();
                return;
            case 2:
                tr.b(this.c);
                return;
            default:
                tr.c(this.c);
                return;
        }
    }
}
