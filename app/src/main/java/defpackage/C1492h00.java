package defpackage;
/* renamed from: h00  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492h00 extends AbstractC3040wi {
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ C1229dx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1492h00(C1229dx c1229dx, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.d = c1229dx;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
