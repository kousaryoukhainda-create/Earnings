package defpackage;
/* renamed from: qw  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2544qw implements InterfaceC2458pw {
    public final String a;
    public final int b;

    public C2544qw(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean a() {
        if (this.b == 0) {
            return false;
        }
        String trim = d().trim();
        if (C3036wg.f.matcher(trim).matches()) {
            return true;
        }
        if (C3036wg.g.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC2437ph.h("[Value: ", trim, "] cannot be converted to a boolean."));
    }

    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String trim = d().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AbstractC2437ph.h("[Value: ", trim, "] cannot be converted to a double."), e);
        }
    }

    public final long c() {
        if (this.b == 0) {
            return 0L;
        }
        String trim = d().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AbstractC2437ph.h("[Value: ", trim, "] cannot be converted to a long."), e);
        }
    }

    public final String d() {
        if (this.b == 0) {
            return "";
        }
        return this.a;
    }
}
