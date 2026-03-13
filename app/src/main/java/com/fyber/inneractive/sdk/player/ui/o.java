package com.fyber.inneractive.sdk.player.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.util.s0;
/* loaded from: classes.dex */
public class o implements s0.a {
    public final /* synthetic */ l a;

    public o(l lVar) {
        this.a = lVar;
    }

    @Override // com.fyber.inneractive.sdk.util.s0.a
    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.a.setLastFrameBitmap(bitmap);
            ImageView imageView = this.a.i;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }
}
