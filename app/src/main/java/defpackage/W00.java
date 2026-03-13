package defpackage;
/* renamed from: W00  reason: default package */
/* loaded from: classes.dex */
public final class W00 extends AbstractC3040wi {
    public /* synthetic */ Object b;
    public final /* synthetic */ Y00 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W00(Y00 y00, AbstractC3040wi abstractC3040wi) {
        super(abstractC3040wi);
        this.c = y00;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
