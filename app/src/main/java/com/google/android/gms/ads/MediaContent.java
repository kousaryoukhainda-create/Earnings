package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbgq;
/* loaded from: classes3.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    Drawable getMainImage();

    @NonNull
    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(Drawable drawable);

    zzbgq zza();

    boolean zzb();
}
