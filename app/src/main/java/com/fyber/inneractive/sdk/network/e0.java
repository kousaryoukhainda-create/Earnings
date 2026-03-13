package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import java.util.Map;
/* loaded from: classes.dex */
public class e0 {
    public final InneractiveAdRequest a;
    public final com.fyber.inneractive.sdk.serverapi.c b;
    public Map<String, String> c;

    public e0(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.serverapi.c cVar) {
        this.a = inneractiveAdRequest;
        this.b = cVar;
    }

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.c.put(str, str2);
        }
    }
}
