package defpackage;
/* renamed from: t00  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2721t00 extends AbstractC3040wi {
    public C2807u00 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C2807u00 d;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2721t00(C2807u00 c2807u00, AbstractC3040wi abstractC3040wi) {
        super(abstractC3040wi);
        this.d = c2807u00;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return C2807u00.a(this.d, this);
    }
}
