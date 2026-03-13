package com.fyber.fairbid;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
/* loaded from: classes.dex */
public final class ka extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ la a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(la laVar) {
        super(0);
        this.a = laVar;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        String str;
        String str2 = Build.PRODUCT;
        Context context = this.a.d;
        if (context != null) {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } else {
            str = null;
        }
        if (str2 != null && str != null) {
            return str2 + '_' + str;
        }
        return "unknown";
    }
}
