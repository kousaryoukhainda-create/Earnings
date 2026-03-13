package defpackage;
/* renamed from: hx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1573hx extends AbstractC3040wi {
    public C1229dx b;
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ C1229dx f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573hx(C1229dx c1229dx, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.f = c1229dx;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
