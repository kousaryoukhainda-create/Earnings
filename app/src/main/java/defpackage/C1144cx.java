package defpackage;
/* renamed from: cx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1144cx extends AbstractC3040wi {
    public C1229dx b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1229dx d;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144cx(C1229dx c1229dx, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.d = c1229dx;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
