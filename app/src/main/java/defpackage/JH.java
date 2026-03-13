package defpackage;
/* renamed from: JH  reason: default package */
/* loaded from: classes.dex */
public final class JH {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public JH(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean a(int i) {
        if (i == 1) {
            if (this.a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
