package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.fyber.inneractive.sdk.util.s0;
/* loaded from: classes.dex */
public class r0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ s0.a c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Bitmap a;

        public a(Bitmap bitmap) {
            this.a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.a aVar = r0.this.c;
            if (aVar != null) {
                aVar.a(this.a);
            }
        }
    }

    public r0(View view, Context context, s0.a aVar) {
        this.a = view;
        this.b = context;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            android.view.View r0 = r4.a
            if (r0 == 0) goto L34
            int r1 = r0.getWidth()     // Catch: java.lang.Throwable -> L24
            int r1 = r1 / 4
            int r2 = r0.getHeight()     // Catch: java.lang.Throwable -> L24
            int r2 = r2 / 4
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> L24
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)     // Catch: java.lang.Throwable -> L24
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L24
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L24
            r3 = 1048576000(0x3e800000, float:0.25)
            r2.scale(r3, r3)     // Catch: java.lang.Throwable -> L24
            r0.draw(r2)     // Catch: java.lang.Throwable -> L24
            goto L35
        L24:
            r0 = move-exception
            java.lang.String r0 = r0.getLocalizedMessage()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "Failed creating a bitmap with exception %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r1)
        L34:
            r1 = 0
        L35:
            if (r1 == 0) goto L4a
            android.content.Context r0 = r4.b
            android.graphics.Bitmap r0 = com.fyber.inneractive.sdk.util.s0.a(r0, r1)
            r1.recycle()
            android.os.Handler r1 = com.fyber.inneractive.sdk.util.q.b
            com.fyber.inneractive.sdk.util.r0$a r2 = new com.fyber.inneractive.sdk.util.r0$a
            r2.<init>(r0)
            r1.post(r2)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.r0.run():void");
    }
}
