package defpackage;
/* renamed from: D80  reason: default package */
/* loaded from: classes.dex */
public final class D80 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public D80(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public final void a() {
        int i;
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE) {
            i = this.b;
        } else {
            i = i2 + this.c;
        }
        this.d = i;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public D80(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
