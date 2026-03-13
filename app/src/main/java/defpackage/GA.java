package defpackage;
/* renamed from: GA  reason: default package */
/* loaded from: classes.dex */
public final class GA implements InterfaceC1609iM {
    public static final GA b = new GA(0);
    public final /* synthetic */ int a;

    public /* synthetic */ GA(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1609iM
    public final IU a(Class cls) {
        switch (this.a) {
            case 0:
                if (MA.class.isAssignableFrom(cls)) {
                    try {
                        return (IU) MA.f(cls.asSubclass(MA.class)).e(3);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.InterfaceC1609iM
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return MA.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
