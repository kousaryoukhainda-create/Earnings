package com.fyber.fairbid;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public enum dk {
    API("API"),
    DEBUG_HEADERS("Debug headers"),
    ADB_SETPROP("ADB setprop"),
    POPUP("popup");
    
    @NotNull
    public final String a;

    dk(String str) {
        this.a = str;
    }
}
