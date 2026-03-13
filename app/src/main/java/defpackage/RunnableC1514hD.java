package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
/* renamed from: hD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1514hD implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ ImageView c;
    public final /* synthetic */ Uri d;

    public /* synthetic */ RunnableC1514hD(Uri uri, ImageView imageView) {
        this.b = 0;
        this.d = uri;
        this.c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ImageViewUtils.g(this.d, this.c);
                return;
            case 1:
                ImageViewUtils.c(this.d, this.c);
                return;
            default:
                ImageViewUtils.e(this.d, this.c);
                return;
        }
    }

    public /* synthetic */ RunnableC1514hD(ImageView imageView, Uri uri, int i) {
        this.b = i;
        this.c = imageView;
        this.d = uri;
    }
}
