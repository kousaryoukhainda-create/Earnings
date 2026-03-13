package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public enum AFc1aSDK {
    API("api"),
    RC("rc"),
    DEFAULT("");
    
    @NotNull
    public final String valueOf;

    AFc1aSDK(String str) {
        this.valueOf = str;
    }
}
