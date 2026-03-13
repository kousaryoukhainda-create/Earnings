package com.fyber.fairbid;

import android.os.Build;
/* loaded from: classes.dex */
public final class nf {
    public final int a;

    public nf(int i) {
        this.a = i;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= this.a) {
            return true;
        }
        return false;
    }
}
