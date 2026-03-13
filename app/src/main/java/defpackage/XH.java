package defpackage;
/* renamed from: XH  reason: default package */
/* loaded from: classes.dex */
public final class XH extends C3011wN implements QH {
    public final TH a;
    public Object b;
    public YH c;

    public XH(TH th) {
        this.a = th;
        th.registerListener(0, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, HG] */
    public final void b() {
        ?? r0 = this.b;
        YH yh = this.c;
        if (r0 != 0 && yh != null) {
            super.removeObserver(yh);
            observe(r0, yh);
        }
    }

    @Override // defpackage.HH
    public final void onActive() {
        this.a.startLoading();
    }

    @Override // defpackage.HH
    public final void onInactive() {
        this.a.stopLoading();
    }

    @Override // defpackage.HH
    public final void removeObserver(InterfaceC2583rP interfaceC2583rP) {
        super.removeObserver(interfaceC2583rP);
        this.b = null;
        this.c = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
