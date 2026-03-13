package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class Purchase {
    public final String a;
    public final String b;
    public final JSONObject c;

    public Purchase(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.a, purchase.a) && TextUtils.equals(this.b, purchase.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
