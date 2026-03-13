package com.google.android.gms.internal.ads;

import android.webkit.WebView;
/* loaded from: classes3.dex */
final class zzflq implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzflq(zzflr zzflrVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflr.zzk(this.zza, this.zzb);
    }
}
