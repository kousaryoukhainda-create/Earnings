package com.fyber.fairbid.ads.offerwall;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class ShowOptions {
    @NotNull
    public static final a Companion = new a();
    public final boolean a;
    public final Map<String, String> b;

    /* loaded from: classes.dex */
    public static final class a {
    }

    public ShowOptions() {
        this(false, null, 3, null);
    }

    public final boolean getCloseOnRedirect$fairbid_sdk_release() {
        return this.a;
    }

    public final Map<String, String> getCustomParams$fairbid_sdk_release() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return b.d("ShowOptions(\n            |closeOnRedirect = " + this.a + "\n            |customParams = " + this.b + "\n            |)\n        ");
    }

    public ShowOptions(boolean z) {
        this(z, null, 2, null);
    }

    public ShowOptions(boolean z, Map<String, String> map) {
        this.a = z;
        this.b = map;
    }

    public /* synthetic */ ShowOptions(boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : map);
    }
}
