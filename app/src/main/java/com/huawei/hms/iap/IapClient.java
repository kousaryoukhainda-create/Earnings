package com.huawei.hms.iap;

import android.content.Intent;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.IsEnvReadyReq;
import com.huawei.hms.iap.entity.IsSandboxActivatedReq;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentWithPriceReq;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.iap.entity.RedeemCodeResultInfo;
import com.huawei.hms.iap.entity.StartIapActivityReq;
/* loaded from: classes2.dex */
public interface IapClient {

    /* loaded from: classes2.dex */
    public interface PriceType {
        public static final int IN_APP_CONSUMABLE = 0;
        public static final int IN_APP_NONCONSUMABLE = 1;
        public static final int IN_APP_SUBSCRIPTION = 2;
    }

    L50 consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq);

    L50 createPurchaseIntent(PurchaseIntentReq purchaseIntentReq);

    @Deprecated
    L50 createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq);

    void enablePendingPurchase();

    L50 isEnvReady();

    L50 isEnvReady(IsEnvReadyReq isEnvReadyReq);

    L50 isEnvReady(boolean z);

    L50 isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq);

    L50 obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq);

    L50 obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq);

    L50 obtainProductInfo(ProductInfoReq productInfoReq);

    PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent);

    RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent);

    L50 scanRedeemCode();

    L50 startIapActivity(StartIapActivityReq startIapActivityReq);
}
