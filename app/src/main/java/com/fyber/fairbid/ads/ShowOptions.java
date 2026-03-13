package com.fyber.fairbid.ads;

import com.fyber.fairbid.internal.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public class ShowOptions {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public Map<String, String> a = C3054wr.b;

    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public final Map<String, String> getCustomParameters() {
        return this.a;
    }

    public final void setCustomParameters(@NotNull Map<String, String> customParameters) {
        Intrinsics.checkNotNullParameter(customParameters, "customParameters");
        ArrayList arrayList = new ArrayList(customParameters.size());
        for (Map.Entry<String, String> entry : customParameters.entrySet()) {
            arrayList.add(Integer.valueOf(entry.getKey().length() + entry.getKey().length()));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        if (i > 4096) {
            String format = String.format(Locale.US, "Custom parameters keys and values combined exceeded the limit of %d characters.", Arrays.copyOf(new Object[]{4096}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            Logger.warn(format);
            this.a = C3054wr.b;
            return;
        }
        this.a = C2148mJ.j(customParameters);
    }
}
