package defpackage;
/* renamed from: Vb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680Vb {
    public Object a;
    public C0732Xb b;
    public C2848uW c;
    public boolean d;

    public final void finalize() {
        C2848uW c2848uW;
        C0732Xb c0732Xb = this.b;
        if (c0732Xb != null) {
            C0706Wb c0706Wb = c0732Xb.c;
            if (!c0706Wb.isDone()) {
                c0706Wb.m(new C3063x("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (!this.d && (c2848uW = this.c) != null) {
            c2848uW.l(null);
        }
    }
}
