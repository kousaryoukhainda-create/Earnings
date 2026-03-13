package androidx.media3.common;
/* loaded from: classes.dex */
public final class c {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Boolean k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public Integer w;

    public final void a(int i, byte[] bArr) {
        if (this.f != null) {
            Integer valueOf = Integer.valueOf(i);
            int i2 = Ha0.a;
            if (!valueOf.equals(3) && Ha0.a(this.g, 3)) {
                return;
            }
        }
        this.f = (byte[]) bArr.clone();
        this.g = Integer.valueOf(i);
    }

    public final void b(CharSequence charSequence) {
        this.u = charSequence;
    }

    public final void c(Integer num) {
        this.n = num;
    }

    public final void d(Integer num) {
        this.m = num;
    }

    public final void e(Integer num) {
        this.l = num;
    }
}
