package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;
/* loaded from: classes.dex */
public class we {
    private a a;
    private String b;

    /* loaded from: classes.dex */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    private we(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public static we a(fe feVar) {
        String R = feVar.R();
        if (TextUtils.isEmpty(R)) {
            return null;
        }
        return new we(a.AD, R);
    }

    public static we a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new we(a.AD_FORMAT, label);
    }

    public static we a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new we(a.AD_UNIT_ID, str);
    }
}
