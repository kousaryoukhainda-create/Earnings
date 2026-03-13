package defpackage;

import j$.util.function.Consumer;
/* renamed from: Dm0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Dm0 implements Consumer {
    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (((C0212Da) obj) != null) {
            return;
        }
        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
