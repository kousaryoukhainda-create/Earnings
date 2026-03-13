package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes3.dex */
public class PreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            zzbf zzbfVar = zzdg.zzb;
            zzbfVar.zzb("Preview activity");
            Uri data = getIntent().getData();
            if (data == null) {
                Log.e("GoogleTagManager", "data is null in PreviewActivity.onCreate");
                return;
            }
            if (!TagManager.getInstance(this).zzd(data)) {
                String str = "Cannot preview the app with the uri: " + data.toString() + ". Launching current version instead.";
                Log.w("GoogleTagManager", str);
                AlertDialog create = new AlertDialog.Builder(this).create();
                create.setTitle("Preview failure");
                create.setMessage(str);
                create.setButton(-1, "Continue", new zzdy(this));
                create.show();
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                zzbfVar.zzb("Invoke the launch activity for package name: " + getPackageName());
                startActivity(launchIntentForPackage);
                return;
            }
            zzbfVar.zzb("No launch activity found for package name: " + getPackageName());
        } catch (Exception e) {
            Log.e("GoogleTagManager", "Calling preview threw an exception: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
