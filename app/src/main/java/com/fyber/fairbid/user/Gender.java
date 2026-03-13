package com.fyber.fairbid.user;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public enum Gender {
    UNKNOWN("u"),
    MALE(InneractiveMediationDefs.GENDER_MALE),
    FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
    OTHER("o");
    
    @NotNull
    public final String a;

    Gender(String str) {
        this.a = str;
    }

    @NotNull
    public final String getCode() {
        return this.a;
    }
}
