package defpackage;
/* renamed from: YH  reason: default package */
/* loaded from: classes.dex */
public final class YH implements InterfaceC2583rP {
    public final TH a;
    public final VH b;
    public boolean c = false;

    public YH(TH th, VH vh) {
        this.a = th;
        this.b = vh;
    }

    @Override // defpackage.InterfaceC2583rP
    public final void a(Object obj) {
        this.c = true;
        this.b.onLoadFinished(this.a, obj);
    }

    public final String toString() {
        return this.b.toString();
    }
}
