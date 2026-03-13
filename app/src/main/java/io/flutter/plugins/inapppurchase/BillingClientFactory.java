package io.flutter.plugins.inapppurchase;

import android.content.Context;
import androidx.annotation.NonNull;
import io.flutter.plugins.inapppurchase.Messages;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface BillingClientFactory {
    AbstractC0134Aa createBillingClient(@NonNull Context context, @NonNull Messages.InAppPurchaseCallbackApi inAppPurchaseCallbackApi, Messages.PlatformBillingChoiceMode platformBillingChoiceMode, Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams);
}
