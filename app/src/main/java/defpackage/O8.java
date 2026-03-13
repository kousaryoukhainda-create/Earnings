package defpackage;
/* renamed from: O8  reason: default package */
/* loaded from: classes.dex */
public final class O8 {
    public String a;
    public int b;
    public String c;
    public String d;
    public Long e;
    public Long f;
    public String g;

    public final P8 a() {
        String str;
        if (this.b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (this.e == null) {
            str = str.concat(" expiresInSecs");
        }
        if (this.f == null) {
            str = AbstractC0324Hi.f(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new P8(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
