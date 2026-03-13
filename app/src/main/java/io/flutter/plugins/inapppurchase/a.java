package io.flutter.plugins.inapppurchase;

import io.flutter.plugins.inapppurchase.Messages;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC1994ka0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public void a(C0316Ha c0316Ha, ArrayList arrayList) {
        ((MethodCallHandlerImpl) this.a).lambda$queryProductDetailsAsync$4((Messages.Result) this.b, c0316Ha, arrayList);
    }

    public void b(C0316Ha c0316Ha, List list) {
        MethodCallHandlerImpl.lambda$queryPurchasesAsync$6((AtomicBoolean) this.a, (Messages.Result) this.b, c0316Ha, list);
    }

    public void c(C2166ma0 c2166ma0) {
        BillingClientFactoryImpl.a((BillingClientFactoryImpl) this.a, (Messages.InAppPurchaseCallbackApi) this.b, c2166ma0);
    }
}
