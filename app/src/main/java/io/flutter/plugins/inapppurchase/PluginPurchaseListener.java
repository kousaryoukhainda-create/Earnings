package io.flutter.plugins.inapppurchase;

import androidx.annotation.NonNull;
import com.android.billingclient.api.Purchase;
import io.flutter.Log;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.List;
/* loaded from: classes2.dex */
class PluginPurchaseListener implements InterfaceC1273eU {
    private final Messages.InAppPurchaseCallbackApi callbackApi;

    public PluginPurchaseListener(Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    @Override // defpackage.InterfaceC1273eU
    public void onPurchasesUpdated(@NonNull C0316Ha c0316Ha, List<Purchase> list) {
        this.callbackApi.onPurchasesUpdated(new Messages.PlatformPurchasesResponse.Builder().setBillingResult(Translator.fromBillingResult(c0316Ha)).setPurchases(Translator.fromPurchasesList(list)).build(), new Messages.VoidResult() { // from class: io.flutter.plugins.inapppurchase.PluginPurchaseListener.1
            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void error(@NonNull Throwable th) {
                Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + th);
            }

            @Override // io.flutter.plugins.inapppurchase.Messages.VoidResult
            public void success() {
            }
        });
    }
}
