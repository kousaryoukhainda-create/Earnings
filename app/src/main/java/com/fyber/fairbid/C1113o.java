package com.fyber.fairbid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.fyber.fairbid.mediation.Network;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1113o {
    @NotNull
    public final mh a;

    public C1113o(@NotNull mh photographerResolver) {
        Intrinsics.checkNotNullParameter(photographerResolver, "photographerResolver");
        this.a = photographerResolver;
    }

    public final Bitmap a(@NotNull String marketingName, @NotNull Activity activity, int i) {
        lh lhVar;
        Intrinsics.checkNotNullParameter(marketingName, "network");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 26) {
            Intrinsics.checkNotNullParameter("AdImageProcessor - Unable to take the pic; the OS is below Android O", "s");
            if (cj.a) {
                Log.d("Snoopy", "AdImageProcessor - Unable to take the pic; the OS is below Android O");
            }
            return null;
        } else if (i == 0) {
            Intrinsics.checkNotNullParameter("AdImageProcessor - ad format is null", "msg");
            if (cj.a) {
                Log.e("Snoopy", "AdImageProcessor - ad format is null");
            }
            return null;
        } else {
            Intrinsics.checkNotNullParameter("AdImageProcessor - Let's see what do we have in here", "s");
            if (cj.a) {
                Log.d("Snoopy", "AdImageProcessor - Let's see what do we have in here");
            }
            mh mhVar = this.a;
            mhVar.getClass();
            Intrinsics.checkNotNullParameter(marketingName, "marketingName");
            if (Intrinsics.a(marketingName, Network.MINTEGRAL.getMarketingName()) ? true : Intrinsics.a(marketingName, Network.APPLOVIN.getMarketingName()) ? true : Intrinsics.a(marketingName, Network.PANGLE.getMarketingName())) {
                lhVar = (ij) ((C2474q50) mhVar.c).a();
            } else {
                lhVar = (nh) ((C2474q50) mhVar.b).a();
            }
            if (i != 0) {
                int i2 = i - 1;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return lhVar.a(activity);
                    }
                    throw new RuntimeException();
                }
                return lhVar.b(activity);
            }
            throw null;
        }
    }

    public final Bitmap a(@NotNull String marketingName, @NotNull View view) {
        Object obj;
        Intrinsics.checkNotNullParameter(marketingName, "network");
        Intrinsics.checkNotNullParameter(view, "view");
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT < 26) {
            Intrinsics.checkNotNullParameter("AdImageProcessor - Unable to take the pic; the OS is below Android O", "s");
            if (cj.a) {
                Log.d("Snoopy", "AdImageProcessor - Unable to take the pic; the OS is below Android O");
            }
            return null;
        }
        Intrinsics.checkNotNullParameter("AdImageProcessor - Let's see what do we have in here", "s");
        if (cj.a) {
            Log.d("Snoopy", "AdImageProcessor - Let's see what do we have in here");
        }
        mh mhVar = this.a;
        mhVar.getClass();
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        if (Intrinsics.a(marketingName, Network.MINTEGRAL.getMarketingName()) ? true : Intrinsics.a(marketingName, Network.APPLOVIN.getMarketingName()) ? true : Intrinsics.a(marketingName, Network.PANGLE.getMarketingName())) {
            obj = (ij) ((C2474q50) mhVar.c).a();
        } else {
            obj = (nh) ((C2474q50) mhVar.b).a();
        }
        obj.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            view.setDrawingCacheEnabled(true);
            bitmap = Bitmap.createBitmap(view.getDrawingCache());
            view.setDrawingCacheEnabled(false);
            return bitmap;
        } catch (Exception e) {
            Intrinsics.checkNotNullParameter("ViewPhotographer - Not proceeding with taking a screenshot due to 👇", "s");
            if (cj.a) {
                Log.w("Snoopy", "ViewPhotographer - Not proceeding with taking a screenshot due to 👇");
            }
            e.printStackTrace();
            return bitmap;
        }
    }
}
