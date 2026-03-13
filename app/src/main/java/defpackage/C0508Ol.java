package defpackage;
/* renamed from: Ol  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508Ol extends AbstractC3040wi {
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ C0628Tb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0508Ol(C0628Tb c0628Tb, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.d = c0628Tb;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
