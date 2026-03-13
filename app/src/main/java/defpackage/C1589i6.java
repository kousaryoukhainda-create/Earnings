package defpackage;
/* renamed from: i6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1589i6 {
    public boolean a;
    public boolean b;
    public boolean c;

    public C1589i6(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public C1873j6 a() {
        if (!this.a && (this.b || this.c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new C1873j6(this);
    }
}
