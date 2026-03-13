package com.fyber.fairbid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ij extends nh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(@NotNull Handler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    public static void a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            Intrinsics.checkNotNullParameter("SecurePhotographer - The viewGroup was null. Nothing to proceed.", "msg");
            if (cj.a) {
                Log.e("Snoopy", "SecurePhotographer - The viewGroup was null. Nothing to proceed.");
                return;
            }
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
            if (childAt instanceof SurfaceView) {
                Intrinsics.checkNotNullParameter("SecurePhotographer - Found a surface view!", "s");
                if (cj.a) {
                    Log.d("Snoopy", "SecurePhotographer - Found a surface view!");
                }
                StringBuilder sb = new StringBuilder("SecurePhotographer - Is it secure? ");
                SurfaceView surfaceView = (SurfaceView) childAt;
                sb.append((surfaceView.getDisplay().getFlags() & 2) > 0);
                String s = sb.toString();
                Intrinsics.checkNotNullParameter(s, "s");
                if (cj.a) {
                    Log.d("Snoopy", s);
                }
                surfaceView.setSecure(false);
            }
        }
    }

    public static void d(Activity activity) {
        boolean z;
        ViewGroup viewGroup;
        StringBuilder sb = new StringBuilder("SecurePhotographer - Is Activity view secure? ");
        if ((activity.getWindow().getDecorView().getDisplay().getFlags() & 2) > 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        String s = sb.toString();
        Intrinsics.checkNotNullParameter(s, "s");
        if (cj.a) {
            Log.d("Snoopy", s);
        }
        View rootView = activity.getWindow().getDecorView().getRootView();
        if (rootView instanceof ViewGroup) {
            viewGroup = (ViewGroup) rootView;
        } else {
            viewGroup = null;
        }
        a(viewGroup);
    }

    @Override // com.fyber.fairbid.nh, com.fyber.fairbid.lh
    @NotNull
    public final Bitmap b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        return c(activity);
    }

    @Override // com.fyber.fairbid.nh, com.fyber.fairbid.lh
    @NotNull
    public final Bitmap a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        return c(activity);
    }
}
