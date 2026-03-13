package com.fyber.fairbid;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class qf implements x9 {
    public final String a;
    public final String b;

    public qf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        return C2148mJ.e(new JQ("ad_request_id", this.a), new JQ("placement_id", this.b), new JQ("placement_type", "OFW"));
    }
}
