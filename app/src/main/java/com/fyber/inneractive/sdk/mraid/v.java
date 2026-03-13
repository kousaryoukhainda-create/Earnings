package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public class v extends u {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public v(int i, int i2, int i3, int i4) {
        this.a = i3;
        this.b = i4;
        this.d = i2;
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.mraid.u
    public String a() {
        StringBuilder sb = new StringBuilder("currentPosition: { x: ");
        sb.append(this.c);
        sb.append(", y: ");
        sb.append(this.d);
        sb.append(", width: ");
        sb.append(this.a);
        sb.append(", height: ");
        return AbstractC2437ph.k(sb, this.b, " }");
    }
}
