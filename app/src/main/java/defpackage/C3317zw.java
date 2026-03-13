package defpackage;

import java.util.Iterator;
import java.util.Map;
/* renamed from: zw  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3317zw extends AbstractC3040wi {
    public Map b;
    public Iterator c;
    public H00 d;
    public AN f;
    public Map g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0156Aw j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3317zw(C0156Aw c0156Aw, AbstractC3040wi abstractC3040wi) {
        super(abstractC3040wi);
        this.j = c0156Aw;
    }

    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
