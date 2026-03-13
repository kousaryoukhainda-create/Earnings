package com.fyber.fairbid;

import com.fyber.fairbid.C1111n;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gf extends n5 {
    @NotNull
    public final C1111n c;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static gf a(JSONObject jSONObject, @NotNull C1111n c1111n) {
            Intrinsics.checkNotNullParameter(c1111n, "default");
            return new gf(jSONObject, c1111n);
        }
    }

    public gf(JSONObject jSONObject, C1111n c1111n) {
        Iterator<String> keys;
        this.c = c1111n;
        setDefaultValueProvider(new c6(c1111n));
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                put$fairbid_sdk_release(key, C1111n.a.a(jSONObject.getJSONObject(key), this.c));
            }
        }
    }
}
