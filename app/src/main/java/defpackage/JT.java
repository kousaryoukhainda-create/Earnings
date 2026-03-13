package defpackage;
/* renamed from: JT  reason: default package */
/* loaded from: classes2.dex */
public abstract class JT extends LT implements VF {
    @Override // defpackage.AbstractC0524Pb
    public NF computeReflected() {
        AbstractC3019wV.a.getClass();
        return this;
    }

    @Override // defpackage.VF
    public Object getDelegate(Object obj) {
        return ((VF) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ TF getGetter() {
        mo1getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.VF
    /* renamed from: getGetter  reason: collision with other method in class */
    public UF mo1getGetter() {
        ((VF) getReflected()).mo1getGetter();
        return null;
    }
}
