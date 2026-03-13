package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
/* loaded from: classes.dex */
public class ng {
    private final View a;
    private final FriendlyObstructionPurpose b;
    private final String c;

    public ng(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.a = view;
        this.b = friendlyObstructionPurpose;
        this.c = str;
    }

    public String a() {
        return this.c;
    }

    public FriendlyObstructionPurpose b() {
        return this.b;
    }

    public View c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ng ngVar = (ng) obj;
        View view = this.a;
        if (view == null ? ngVar.a != null : !view.equals(ngVar.a)) {
            return false;
        }
        if (this.b != ngVar.b) {
            return false;
        }
        String str = this.c;
        String str2 = ngVar.c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        View view = this.a;
        int i3 = 0;
        if (view != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.b;
        if (friendlyObstructionPurpose != null) {
            i2 = friendlyObstructionPurpose.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.c;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }
}
