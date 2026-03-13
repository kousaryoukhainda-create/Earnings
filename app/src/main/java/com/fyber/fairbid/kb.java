package com.fyber.fairbid;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class kb implements hb {
    public final int a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;

    public kb(int i, String str, String str2, Integer num, Integer num2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = str3;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        return C2148mJ.e(new JQ("instance_id", this.c), new JQ("network_name", this.b), new JQ("ad_unit_id", Integer.valueOf(this.a)), new JQ("waterfall_instance_id", this.e), new JQ("rank", this.d), new JQ("network_version", this.f));
    }
}
