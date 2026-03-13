package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
/* loaded from: classes3.dex */
public final class zzbsc extends zzbsi {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcex zzj;
    private final Activity zzk;
    private zzcgr zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsj zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbsc(zzcex zzcexVar, zzbsj zzbsjVar) {
        super(zzcexVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcexVar;
        this.zzk = zzcexVar.zzi();
        this.zzo = zzbsjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm */
    public final void zzc(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkI)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkJ)).booleanValue()) {
            ViewParent parent = ((View) this.zzj).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.zzj);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkK)).booleanValue()) {
                try {
                    this.zzr.addView((View) this.zzj);
                    this.zzj.zzaj(this.zzl);
                } catch (IllegalStateException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                this.zzr.addView((View) this.zzj);
                this.zzj.zzaj(this.zzl);
            }
        }
        if (z) {
            zzl("default");
            zzbsj zzbsjVar = this.zzo;
            if (zzbsjVar != null) {
                zzbsjVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zza(final boolean z) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkH)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        zzbzw.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsa
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzbsc.this.zzc(z);
                            }
                        });
                    } else {
                        zzc(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0264, code lost:
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x026a, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028b A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0032, B:19:0x0037, B:21:0x0039, B:23:0x0041, B:24:0x0046, B:26:0x0048, B:28:0x0056, B:29:0x0067, B:31:0x0075, B:32:0x0086, B:34:0x0094, B:35:0x00a5, B:37:0x00b3, B:38:0x00c4, B:40:0x00d2, B:41:0x00e0, B:43:0x00ee, B:44:0x00f0, B:46:0x00f4, B:48:0x00f8, B:50:0x0100, B:53:0x0108, B:57:0x0130, B:63:0x013c, B:130:0x0264, B:131:0x0269, B:133:0x026b, B:135:0x028b, B:137:0x028f, B:139:0x029c, B:141:0x02d9, B:173:0x0394, B:180:0x03c3, B:181:0x03db, B:182:0x03fc, B:184:0x0404, B:185:0x040b, B:186:0x0431, B:189:0x0434, B:191:0x0454, B:192:0x0469, B:174:0x039b, B:175:0x03a2, B:176:0x03a9, B:177:0x03b0, B:178:0x03b6, B:179:0x03bd, B:140:0x02d6, B:194:0x046b, B:195:0x0470, B:64:0x0143, B:66:0x0147, B:94:0x019a, B:95:0x01a4, B:104:0x01f7, B:106:0x01fa, B:108:0x01ff, B:111:0x0205, B:96:0x01a8, B:97:0x01b2, B:98:0x01b9, B:99:0x01c5, B:100:0x01cd, B:101:0x01e1, B:102:0x01ed, B:112:0x0214, B:120:0x0242, B:126:0x0252, B:123:0x0248, B:125:0x0250, B:116:0x0238, B:118:0x023e, B:127:0x0257, B:128:0x025d, B:197:0x0472, B:198:0x0477, B:200:0x0479, B:201:0x047e), top: B:205:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsc.zzb(java.util.Map):void");
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzi) {
            if (this.zzp != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
