package com.fyber.fairbid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.PixelCopy;
import android.view.Window;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public class nh implements lh {
    @NotNull
    public final Handler a;

    public nh(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = handler;
    }

    public static final void a(CountDownLatch latch, int i) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }

    @Override // com.fyber.fairbid.lh
    @NotNull
    public Bitmap b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return c(activity);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.fyber.fairbid.C0] */
    @NotNull
    public final Bitmap c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Bitmap createBitmap = Bitmap.createBitmap(displayMetrics.widthPixels, displayMetrics.heightPixels, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(displayMetr… Bitmap.Config.ARGB_8888)");
        Window window = activity.getWindow();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                PixelCopy.request(window, createBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.fyber.fairbid.C0
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i) {
                        nh.a(countDownLatch, i);
                    }
                }, this.a);
            } catch (IllegalArgumentException e) {
                Intrinsics.checkNotNullParameter("PixelCopyPhotographer - Not proceeding with taking a screenshot due to 👇", "s");
                if (cj.a) {
                    Log.w("Snoopy", "PixelCopyPhotographer - Not proceeding with taking a screenshot due to 👇");
                }
                e.printStackTrace();
                countDownLatch.countDown();
            }
            countDownLatch.await();
        } else {
            Intrinsics.checkNotNullParameter("PixelCopyPhotographer - Unable to proceed with taking a screenshot, device's API level too low", "msg");
            if (cj.a) {
                Log.e("Snoopy", "PixelCopyPhotographer - Unable to proceed with taking a screenshot, device's API level too low");
            }
        }
        return createBitmap;
    }

    @Override // com.fyber.fairbid.lh
    @NotNull
    public Bitmap a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return c(activity);
    }
}
