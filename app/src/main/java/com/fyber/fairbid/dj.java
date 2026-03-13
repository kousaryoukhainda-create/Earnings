package com.fyber.fairbid;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public enum dj {
    PNG("png", Bitmap.CompressFormat.PNG),
    JPEG("jpg", Bitmap.CompressFormat.JPEG);
    
    @NotNull
    public static final a c = new a();
    @NotNull
    public final String a;
    @NotNull
    public final Bitmap.CompressFormat b;

    /* loaded from: classes.dex */
    public static final class a {
        public static dj a(@NotNull String format) {
            Intrinsics.checkNotNullParameter(format, "format");
            if (Intrinsics.a(format, "png")) {
                return dj.PNG;
            }
            if (Intrinsics.a(format, "jpg")) {
                return dj.JPEG;
            }
            return null;
        }
    }

    dj(String str, Bitmap.CompressFormat compressFormat) {
        this.a = str;
        this.b = compressFormat;
    }
}
