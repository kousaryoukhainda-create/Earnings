package defpackage;
/* renamed from: Xw  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0753Xw extends AbstractC3040wi {
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ C0779Yw d;
    public Object f;
    public InterfaceC0675Uw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753Xw(C0779Yw c0779Yw, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.d = c0779Yw;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.collect(null, this);
    }
}
