package defpackage;
/* renamed from: Vn  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0692Vn implements X40 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0692Vn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.X40
    public final Object get() {
        switch (this.b) {
            case 0:
                try {
                    return (InterfaceC1608iL) ((Class) this.c).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (InterfaceC1608iL) this.c;
            default:
                return Boolean.valueOf(((C0979bt) this.c).B);
        }
    }
}
