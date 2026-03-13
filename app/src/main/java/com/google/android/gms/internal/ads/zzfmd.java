package com.google.android.gms.internal.ads;

import android.webkit.WebView;
/* loaded from: classes3.dex */
final class zzfmd implements Runnable {
    final /* synthetic */ zzfme zza;
    private final WebView zzb;

    public zzfmd(zzfme zzfmeVar) {
        WebView webView;
        this.zza = zzfmeVar;
        webView = zzfmeVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
