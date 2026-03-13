package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public class y extends u {
    public final int a;
    public final int b;

    public y(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.fyber.inneractive.sdk.mraid.u
    public String a() {
        StringBuilder sb = new StringBuilder("screenSize: { width: ");
        sb.append(this.a);
        sb.append(", height: ");
        return AbstractC2437ph.k(sb, this.b, " }");
    }
}
