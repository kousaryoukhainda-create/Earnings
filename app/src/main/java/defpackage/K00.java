package defpackage;
/* renamed from: K00  reason: default package */
/* loaded from: classes.dex */
public final class K00 extends AbstractC3040wi {
    public L00 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ L00 d;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K00(L00 l00, AbstractC3040wi abstractC3040wi) {
        super(abstractC3040wi);
        this.d = l00;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
