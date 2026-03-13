package defpackage;
/* renamed from: Rb  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0576Rb extends AbstractC3040wi {
    public InterfaceC2072lT b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0602Sb d;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0576Rb(C0602Sb c0602Sb, AbstractC3040wi abstractC3040wi) {
        super(abstractC3040wi);
        this.d = c0602Sb;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
