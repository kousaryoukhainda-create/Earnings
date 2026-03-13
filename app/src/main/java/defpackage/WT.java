package defpackage;
/* renamed from: WT  reason: default package */
/* loaded from: classes.dex */
public final class WT implements Pa0 {
    public boolean a = false;
    public boolean b = false;
    public C0980bu c;
    public final VT d;

    public WT(VT vt) {
        this.d = vt;
    }

    @Override // defpackage.Pa0
    public final Pa0 b(String str) {
        if (!this.a) {
            this.a = true;
            this.d.h(this.c, str, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // defpackage.Pa0
    public final Pa0 c(boolean z) {
        if (!this.a) {
            this.a = true;
            this.d.c(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
