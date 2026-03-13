package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
/* loaded from: classes3.dex */
public final class zzchk implements zzher {
    public zzchk(zzcha zzchaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
