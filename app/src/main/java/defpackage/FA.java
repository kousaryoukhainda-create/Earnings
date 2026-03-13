package defpackage;
/* renamed from: FA  reason: default package */
/* loaded from: classes.dex */
public final class FA implements InterfaceC1523hM {
    public static final FA b = new FA(0);
    public final /* synthetic */ int a;

    public /* synthetic */ FA(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1523hM
    public final HU a(Class cls) {
        switch (this.a) {
            case 0:
                if (LA.class.isAssignableFrom(cls)) {
                    try {
                        return (HU) LA.n(cls.asSubclass(LA.class)).m(3);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.InterfaceC1523hM
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return LA.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
