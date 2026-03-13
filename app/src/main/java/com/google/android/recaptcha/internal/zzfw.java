package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzfw {
    @NotNull
    private final WebView zza;
    @NotNull
    private final InterfaceC0635Ti zzb;

    public zzfw(@NotNull WebView webView, @NotNull InterfaceC0635Ti interfaceC0635Ti) {
        this.zza = webView;
        this.zzb = interfaceC0635Ti;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        AbstractC1281eb.B(this.zzb, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
