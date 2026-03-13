package com.huawei.hms.support.api.paytask;

import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.entity.pay.HwWalletInfoRequest;
import com.huawei.hms.support.api.entity.pay.InternalPayRequest;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductPayRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoRequest;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.api.pay.ProductPayResultInfo;
/* loaded from: classes2.dex */
public interface PayClient {
    L50 addWithholdingPlan(WithholdRequest withholdRequest);

    L50 getOrderDetail(OrderRequest orderRequest);

    PayResultInfo getPayResultInfoFromIntent(Intent intent);

    L50 getProductDetails(ProductDetailRequest productDetailRequest);

    ProductPayResultInfo getProductPayResultFromIntent(Intent intent);

    L50 getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest);

    L50 getWalletUiIntent(int i);

    L50 internalPay(InternalPayRequest internalPayRequest);

    L50 pay(PayReq payReq);

    L50 productPay(ProductPayRequest productPayRequest);

    L50 queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest);

    void setSubAppId(String str) throws ApiException;
}
