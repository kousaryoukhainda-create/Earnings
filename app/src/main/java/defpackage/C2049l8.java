package defpackage;

import com.applovin.exoplayer2.common.base.Ascii;
/* renamed from: l8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2049l8 {
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;

    public final C2135m8 a() {
        if (this.g != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.g & Ascii.DLE) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException(AbstractC2437ph.l(sb, "Missing required properties:"));
        }
        return new C2135m8(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
