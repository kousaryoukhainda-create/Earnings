package com.fyber.fairbid.internal.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class ScreenUtils {
    @NotNull
    public final Context a;
    @NotNull
    public final InterfaceC2059lG b;
    @NotNull
    public final InterfaceC2059lG c;
    public final float d;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC1431gG implements InterfaceC0263Ez {
        public a() {
            super(0);
        }

        @Override // defpackage.InterfaceC0263Ez
        public final Object invoke() {
            boolean z;
            int i = ScreenUtils.this.a.getResources().getDisplayMetrics().widthPixels;
            int i2 = ScreenUtils.this.a.getResources().getDisplayMetrics().heightPixels;
            if ((i == 300 && i2 == 250) || (i2 == 300 && i == 250)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends AbstractC1431gG implements InterfaceC0263Ez {
        public b() {
            super(0);
        }

        @Override // defpackage.InterfaceC0263Ez
        public final Object invoke() {
            boolean z;
            if ((ScreenUtils.this.a.getResources().getConfiguration().screenLayout & 15) >= 3) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public ScreenUtils(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = C2231nG.a(new b());
        this.c = C2231nG.a(new a());
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public final int dpToPx(int i) {
        return (int) ((i * this.d) + 0.5f);
    }

    public final int getInverseScaledSize(int i) {
        return (int) (i / this.d);
    }

    public final int getScaledSize(int i) {
        return (int) (this.d * i);
    }

    public final int getScaledSizeWithRelativeFlags(int i) {
        if (i <= 0) {
            return i;
        }
        return (int) (this.d * i);
    }

    public final float getScreenDensity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public final int getScreenHeight(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @NotNull
    public final String getScreenOrientation() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            return "landscape";
        }
        return "portrait";
    }

    public final int getScreenWidth(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final boolean isMrec() {
        return ((Boolean) ((C2474q50) this.c).a()).booleanValue();
    }

    public final boolean isTablet() {
        return ((Boolean) ((C2474q50) this.b).a()).booleanValue();
    }
}
