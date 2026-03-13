package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class s0 {

    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);
    }

    public static Bitmap a(Context context, Bitmap bitmap) {
        if (bitmap != null) {
            g gVar = new g();
            gVar.c = 20;
            gVar.d = 1;
            gVar.a = bitmap.getWidth();
            gVar.b = bitmap.getHeight();
            return f.a(context, bitmap, gVar);
        }
        return null;
    }
}
