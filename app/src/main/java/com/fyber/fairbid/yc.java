package com.fyber.fairbid;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class yc implements u6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public yc(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, String> a() {
        return C2148mJ.e(new JQ("X-IA-AdNetwork", this.a), new JQ("X-IA-Adomain", this.b), new JQ("X-IA-Campaign-ID", this.c), new JQ("X-IA-Creative-ID", this.d), new JQ("X-IA-Session", this.e));
    }
}
