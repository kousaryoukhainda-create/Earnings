package defpackage;

import io.flutter.plugins.inapppurchase.a;
import io.flutter.plugins.inapppurchase.b;
import j$.util.function.Consumer;
import java.util.ArrayList;
/* renamed from: mm0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2190mm0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2190mm0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ((a) this.b).a((C0316Ha) obj, arrayList);
                return;
            default:
                ((b) this.b).a((C0316Ha) obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
