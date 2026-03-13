package defpackage;

import android.webkit.WebView;
import com.applovin.impl.tr;
/* renamed from: bl0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0970bl0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ String d;

    public /* synthetic */ RunnableC0970bl0(WebView webView, String str, int i) {
        this.b = i;
        this.c = webView;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                tr.d(this.c, this.d);
                return;
            default:
                tr.f(this.c, this.d);
                return;
        }
    }
}
