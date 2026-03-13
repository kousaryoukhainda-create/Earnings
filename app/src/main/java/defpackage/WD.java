package defpackage;
/* renamed from: WD  reason: default package */
/* loaded from: classes.dex */
public final class WD implements InterfaceC0413Kt, InterfaceC1973kG {
    public final Object b;

    public WD(Object obj) {
        this.b = obj;
    }

    public static WD a(Object obj) {
        if (obj != null) {
            return new WD(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // defpackage.XT
    public final Object get() {
        return this.b;
    }
}
