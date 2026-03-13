package defpackage;
/* renamed from: PW  reason: default package */
/* loaded from: classes2.dex */
public final class PW extends G {
    public int d;
    public int f;
    public final /* synthetic */ QW g;

    public PW(QW qw) {
        this.g = qw;
        this.d = qw.e();
        this.f = qw.d;
    }

    @Override // defpackage.G
    public final void b() {
        int i = this.d;
        if (i == 0) {
            this.b = 2;
            return;
        }
        QW qw = this.g;
        Object[] objArr = qw.b;
        int i2 = this.f;
        this.c = objArr[i2];
        this.b = 1;
        this.f = (i2 + 1) % qw.c;
        this.d = i - 1;
    }
}
