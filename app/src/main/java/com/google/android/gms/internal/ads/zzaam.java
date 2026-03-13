package com.google.android.gms.internal.ads;

import android.view.Surface;
/* loaded from: classes3.dex */
final class zzaam {
    public static void zza(Surface surface, float f) {
        int i;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            zzdo.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
