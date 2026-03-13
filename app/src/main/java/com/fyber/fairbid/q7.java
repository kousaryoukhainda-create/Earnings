package com.fyber.fairbid;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public enum q7 {
    AUCTION("auction"),
    PMN("PMN"),
    EXCHANGE("exchange"),
    EXCHANGE_FALLBACK("exchange_fallback"),
    SHOW_FAILURE("show_failure"),
    UNAVAILABLE("unavailable");
    
    @NotNull
    public final String a;

    q7(String str) {
        this.a = str;
    }
}
