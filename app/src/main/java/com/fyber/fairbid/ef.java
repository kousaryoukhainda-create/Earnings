package com.fyber.fairbid;

import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.n5;
import com.fyber.fairbid.we;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ef extends n5 {
    @NotNull
    public final we c;

    public ef(aj ajVar) {
        we a = we.a.a(new JSONObject());
        this.c = a;
        try {
            a.a(ajVar);
        } catch (n5.a unused) {
            Logger.debug("There's not gonna be a default fallback value for the non configured Network Instance");
        }
    }
}
