package defpackage;
/* renamed from: GH  reason: default package */
/* loaded from: classes.dex */
public abstract class GH {
    public final InterfaceC2583rP b;
    public boolean c;
    public int d = -1;
    public final /* synthetic */ HH f;

    public GH(HH hh, InterfaceC2583rP interfaceC2583rP) {
        this.f = hh;
        this.b = interfaceC2583rP;
    }

    public final void a(boolean z) {
        int i;
        if (z == this.c) {
            return;
        }
        this.c = z;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        HH hh = this.f;
        hh.changeActiveCounter(i);
        if (this.c) {
            hh.dispatchingValue(this);
        }
    }

    public boolean c(HG hg) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
