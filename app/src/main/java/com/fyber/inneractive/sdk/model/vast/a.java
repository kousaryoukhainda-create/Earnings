package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
/* loaded from: classes.dex */
public class a {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public a(String str, String str2, String str3) {
        String str4;
        String str5;
        boolean z;
        if (str != null) {
            str4 = str.trim();
        } else {
            str4 = null;
        }
        this.a = str4;
        if (str2 != null) {
            str5 = str2.trim();
        } else {
            str5 = null;
        }
        this.b = str5;
        String trim = str3 != null ? str3.trim() : null;
        this.c = trim;
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(trim) && trim.contains("[TIME]")) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }
}
