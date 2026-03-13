package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class e implements w<String> {
    public final /* synthetic */ String a;
    public final /* synthetic */ JSONArray b;
    public final /* synthetic */ long c;

    public e(c cVar, String str, JSONArray jSONArray, long j) {
        this.a = str;
        this.b = jSONArray;
        this.c = j;
    }

    @Override // com.fyber.inneractive.sdk.network.w
    public void a(String str, Exception exc, boolean z) {
        String str2 = str;
        IAlog.a("Event Request: Hitting URL finished: %s, body: %s", this.a, this.b);
        if (exc == null) {
            IAlog.a("Event Request: Hitting URL response code: %s", str2);
        } else {
            IAlog.a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.c));
    }
}
