package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class zzazj extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzaza zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzazj() {
        zzaza zzazaVar = new zzaza();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazaVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbec.zzd.zze()).intValue();
        this.zzg = ((Long) zzbec.zza.zze()).intValue();
        this.zzh = ((Long) zzbec.zze.zze()).intValue();
        this.zzi = ((Long) zzbec.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzae)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaf)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzag)).intValue();
        this.zze = ((Long) zzbec.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzai);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaj)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzak)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzal)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:3)(2:31|(2:36|(3:39|(3:41|42|(6:50|(1:52)(5:53|54|55|(1:59)|(1:61))|6|7|dd|20))|37)))|4|5|6|7|dd) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00de->B:71:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazj.run():void");
    }

    public final zzazi zza(View view, zzayz zzayzVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzayzVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazi(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcex)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    zzayzVar.zzf();
                    webView.post(new zzazh(this, zzayzVar, webView, globalVisibleRect));
                    return new zzazi(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzazi zza = zza(viewGroup.getChildAt(i3), zzayzVar);
                    i += zza.zza;
                    i2 += zza.zzb;
                }
                return new zzazi(this, i, i2);
            }
        }
        return new zzazi(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        if (r11 == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzayz r9 = new com.google.android.gms.internal.ads.zzayz     // Catch: java.lang.Exception -> L53
            int r1 = r10.zzf     // Catch: java.lang.Exception -> L53
            int r2 = r10.zzg     // Catch: java.lang.Exception -> L53
            int r3 = r10.zzh     // Catch: java.lang.Exception -> L53
            int r4 = r10.zzi     // Catch: java.lang.Exception -> L53
            int r5 = r10.zzj     // Catch: java.lang.Exception -> L53
            int r6 = r10.zzk     // Catch: java.lang.Exception -> L53
            int r7 = r10.zzl     // Catch: java.lang.Exception -> L53
            boolean r8 = r10.zzo     // Catch: java.lang.Exception -> L53
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzaze r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Exception -> L53
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L55
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L53
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto L55
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzah     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L53
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L53
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L55
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L53
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L7a
            goto L55
        L53:
            r11 = move-exception
            goto L81
        L55:
            com.google.android.gms.internal.ads.zzazi r11 = r10.zza(r11, r9)     // Catch: java.lang.Exception -> L53
            r9.zzj()     // Catch: java.lang.Exception -> L53
            int r0 = r11.zza     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L64
            int r0 = r11.zzb     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L7a
        L64:
            int r11 = r11.zzb     // Catch: java.lang.Exception -> L53
            if (r11 != 0) goto L6f
            int r11 = r9.zzb()     // Catch: java.lang.Exception -> L53
            if (r11 == 0) goto L7a
            goto L71
        L6f:
            if (r11 != 0) goto L7b
        L71:
            com.google.android.gms.internal.ads.zzaza r11 = r10.zzd     // Catch: java.lang.Exception -> L53
            boolean r11 = r11.zzc(r9)     // Catch: java.lang.Exception -> L53
            if (r11 != 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            com.google.android.gms.internal.ads.zzaza r11 = r10.zzd     // Catch: java.lang.Exception -> L53
            r11.zza(r9)     // Catch: java.lang.Exception -> L53
            return
        L81:
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r11)
            java.lang.String r0 = "ContentFetchTask.fetchContent"
            com.google.android.gms.internal.ads.zzbzm r1 = com.google.android.gms.ads.internal.zzv.zzp()
            r1.zzw(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazj.zzb(android.view.View):void");
    }

    public final void zzc(zzayz zzayzVar, WebView webView, String str, boolean z) {
        zzayzVar.zze();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.zzn && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    zzayzVar.zzi(title + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzayzVar.zzi(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzayzVar.zzl()) {
                this.zzd.zzb(zzayzVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Json string may be malformed.");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Content hash thread already started, quitting...");
                    return;
                }
                this.zza = true;
                start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: paused, pause = true");
        }
    }
}
