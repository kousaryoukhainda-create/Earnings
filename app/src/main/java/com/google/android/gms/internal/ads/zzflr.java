package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class zzflr {
    private static final zzflr zza = new zzflr();

    private zzflr() {
    }

    public static final zzflr zza() {
        return zza;
    }

    public static final boolean zzk(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                webView.evaluateJavascript(str, null);
                return true;
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: ".concat(String.valueOf(str)));
                return true;
            }
        }
        return false;
    }

    public final void zzb(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder((int) UserVerificationMethods.USER_VERIFY_PATTERN);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb.append(obj2);
                    } else {
                        sb.append('\"');
                        sb.append(obj2);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new zzflq(this, webView, sb2));
                return;
            } else {
                zzk(webView, sb2);
                return;
            }
        }
        zzfkm.zza.getClass();
    }

    public final void zzc(WebView webView, String str) {
        zzb(webView, "finishSession", str);
    }

    public final void zzd(WebView webView, String str, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject, str);
    }

    public final void zze(WebView webView, String str, float f) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    public final void zzf(WebView webView, @NonNull JSONObject jSONObject) {
        zzb(webView, "setLastActivity", jSONObject);
    }

    public final void zzg(WebView webView, String str, String str2) {
        zzb(webView, "setDeviceLockState", str2);
    }

    public final void zzh(WebView webView, String str, String str2) {
        zzb(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void zzi(WebView webView, String str, String str2) {
        zzb(webView, "setState", str2, str);
    }

    public final void zzj(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
