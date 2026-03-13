package com.huawei.hms.iap.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.iapfull.IIapFullAPIVer4;
import com.huawei.hms.iapfull.bean.WebProductPayRequest;
import com.huawei.hms.support.api.client.Status;
/* loaded from: classes2.dex */
public class CreatePurchaseTask extends BaseIapFullTask<PurchaseIntentResult, PurchaseIntentReq> {
    private Intent a;

    public CreatePurchaseTask(Context context, PurchaseIntentReq purchaseIntentReq) {
        super(context, purchaseIntentReq);
    }

    private WebProductPayRequest a(PurchaseIntentReq purchaseIntentReq) {
        if (purchaseIntentReq == null) {
            return new WebProductPayRequest();
        }
        WebProductPayRequest webProductPayRequest = new WebProductPayRequest();
        webProductPayRequest.setProductId(purchaseIntentReq.getProductId());
        webProductPayRequest.setPriceType(purchaseIntentReq.getPriceType());
        webProductPayRequest.setDeveloperPayload(purchaseIntentReq.getDeveloperPayload());
        webProductPayRequest.setReservedInfor(purchaseIntentReq.getReservedInfor());
        webProductPayRequest.setSignatureAlgorithm(purchaseIntentReq.getSignatureAlgorithm());
        webProductPayRequest.setWebPayPmsVer4(true);
        return webProductPayRequest;
    }

    @Override // com.huawei.hms.iap.task.BaseIapFullTask
    public void handleRequest(PurchaseIntentReq purchaseIntentReq, IIapFullAPIVer4 iIapFullAPIVer4) {
        Intent pmsPayIntent = iIapFullAPIVer4.getPmsPayIntent(a(purchaseIntentReq));
        this.a = pmsPayIntent;
        ((PurchaseIntentResult) this.mResult).setStatus(pmsPayIntent == null ? new Status(OrderStatusCode.ORDER_STATE_PARAM_ERROR, "param is error") : new Status(0, "success", this.a));
        this.mIsCompleted = true;
    }

    @Override // com.huawei.hms.iap.task.BaseIapFullTask
    public boolean isSuccessful() {
        return this.a != null;
    }

    @Override // com.huawei.hms.iap.task.BaseIapFullTask
    public void setResult() {
        this.mResult = new PurchaseIntentResult();
    }
}
