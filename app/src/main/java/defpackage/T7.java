package defpackage;

import java.util.List;
/* renamed from: T7  reason: default package */
/* loaded from: classes.dex */
public final class T7 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public V7 g;
    public C2822u8 h;
    public C2736t8 i;
    public Y7 j;
    public List k;
    public int l;
    public byte m;

    public final U7 a() {
        String str;
        String str2;
        V7 v7;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (v7 = this.g) != null) {
            return new U7(str, str2, this.c, this.d, this.e, this.f, v7, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(AbstractC2437ph.l(sb, "Missing required properties:"));
    }
}
