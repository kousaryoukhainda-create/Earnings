package com.applovin.impl;

import android.text.SpannedString;
import com.applovin.impl.cc;
/* loaded from: classes.dex */
public class fj extends cc {
    public fj(String str) {
        super(cc.c.SECTION);
        this.c = new SpannedString(str);
    }

    public String toString() {
        return "SectionListItemViewModel{text=" + ((Object) this.c) + "}";
    }
}
