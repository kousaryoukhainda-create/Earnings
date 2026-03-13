package defpackage;
/* renamed from: pi0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2440pi0 implements InterfaceC0846aQ, WP {
    public final /* synthetic */ C2869ui0 a;

    public /* synthetic */ C2440pi0(C2869ui0 c2869ui0) {
        this.a = c2869ui0;
    }

    @Override // defpackage.WP
    public void a(C2869ui0 c2869ui0) {
        boolean z = c2869ui0.h;
        C2869ui0 c2869ui02 = this.a;
        if (z) {
            c2869ui02.b();
            return;
        }
        try {
            throw null;
        } catch (Exception e) {
            c2869ui02.d(e);
        }
    }

    @Override // defpackage.InterfaceC0846aQ
    public void onFailure(Exception exc) {
        this.a.d(exc);
    }
}
