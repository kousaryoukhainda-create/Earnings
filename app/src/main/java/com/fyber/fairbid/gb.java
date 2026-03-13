package com.fyber.fairbid;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class gb implements hb {
    public final int a;

    public gb(int i) {
        this.a = i;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        return C2062lJ.b(new JQ("ad_unit_id", Integer.valueOf(this.a)));
    }
}
