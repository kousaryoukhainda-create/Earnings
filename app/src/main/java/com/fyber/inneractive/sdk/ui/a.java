package com.fyber.inneractive.sdk.ui;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.network.w;
/* loaded from: classes.dex */
public class a implements w<Bitmap> {
    public final /* synthetic */ FyberAdIdentifier a;

    public a(FyberAdIdentifier fyberAdIdentifier) {
        this.a = fyberAdIdentifier;
    }

    @Override // com.fyber.inneractive.sdk.network.w
    public void a(Bitmap bitmap, Exception exc, boolean z) {
        Bitmap bitmap2 = bitmap;
        if (exc == null && bitmap2 != null) {
            this.a.h = bitmap2;
        }
    }
}
