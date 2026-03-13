package defpackage;
/* renamed from: r70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2563r70 extends AbstractC3040wi {
    public AbstractC2649s70 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractC2649s70 d;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2563r70(AbstractC2649s70 abstractC2649s70, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.d = abstractC2649s70;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return AbstractC2649s70.d(this.d, null, this);
    }
}
