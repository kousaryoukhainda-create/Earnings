package com.fyber.fairbid.sdk.configs.adtransparency;

import com.fyber.fairbid.c6;
import com.fyber.fairbid.n5;
import com.fyber.fairbid.sdk.configs.adtransparency.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b extends n5 {

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static b a(JSONObject jSONObject, @NotNull c6 c6Var) {
            Intrinsics.checkNotNullParameter(c6Var, "default");
            return new b(jSONObject, c6Var);
        }
    }

    public b(JSONObject jSONObject, c6 c6Var) {
        Iterator<String> keys;
        setDefaultValueProvider(c6Var);
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                put$fairbid_sdk_release(key, a.C0054a.a(jSONObject.getJSONObject(key)));
            }
        }
    }
}
