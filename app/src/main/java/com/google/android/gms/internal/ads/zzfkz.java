package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfkz implements Yc0 {
    final /* synthetic */ zzfla zza;

    public zzfkz(zzfla zzflaVar) {
        this.zza = zzflaVar;
    }

    @Override // defpackage.Yc0
    public final void onPostMessage(WebView webView, Nc0 nc0, Uri uri, boolean z, SE se) {
        try {
            JSONObject jSONObject = new JSONObject(nc0.a());
            String string = jSONObject.getString(Constants.METHOD);
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    zzfkm.zza.getClass();
                    return;
                } else {
                    zzfla.zzc(this.zza, string2);
                    return;
                }
            }
            zzfla.zze(this.zza, string2);
        } catch (JSONException e) {
            zzfmh.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
