package com.fyber.fairbid.ads;

import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.internal.Utils;
import com.fyber.fairbid.r5;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public abstract class AdHandler {
    public static void a(@NotNull String id, @NotNull r5 body) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(body, "body");
        int parseId = Utils.parseId(id);
        if (parseId != -1) {
            body.accept(Integer.valueOf(parseId));
            return;
        }
        String format = String.format(Locale.US, "Invalid placement ID: %s", Arrays.copyOf(new Object[]{id}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        Logger.error(format);
    }
}
