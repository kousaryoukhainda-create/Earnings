package defpackage;
/* renamed from: ex  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1315ex extends AbstractC3040wi {
    public C1401fx b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C1401fx f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315ex(C1401fx c1401fx, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.f = c1401fx;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
