package com.huawei.hms.support.api.paytask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.iap.util.a;
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
import com.huawei.hms.support.api.paytask.fullsdk.FailureTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class PayClientEntryImpl implements PayClient {
    private WeakReference<Context> a;
    private PayClientImpl b;
    private PayClientFullImpl c;

    public PayClientEntryImpl(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    private PayClientImpl a() {
        if (this.b == null) {
            Context context = this.a.get();
            if (context == null) {
                HMSLog.e("PayClientImpl", "getPayClientImpl context is null.");
                return null;
            }
            this.b = context instanceof Activity ? new PayClientImpl((Activity) context) : new PayClientImpl(context);
        }
        return this.b;
    }

    private PayClientFullImpl b() {
        if (this.c == null) {
            Context context = this.a.get();
            if (context == null) {
                HMSLog.e("PayClientImpl", "getPayClientFullImpl context is null.");
                return null;
            }
            this.c = new PayClientFullImpl(context);
        }
        return this.c;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 addWithholdingPlan(WithholdRequest withholdRequest) {
        Checker.checkNonNull(withholdRequest);
        Context context = this.a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, withholdRequest.reservedInfor, withholdRequest.country, withholdRequest.currency, "Withhold")) {
            HMSLog.i("PayClientImpl", "withhold with Full SDK branch.");
            PayClientFullImpl b = b();
            if (b != null) {
                return b.addWithholdingPlan(withholdRequest);
            }
            return new FailureTask();
        }
        HMSLog.i("PayClientImpl", "withhold with IAP SDK branch.");
        PayClientImpl a = a();
        if (a != null) {
            return a.addWithholdingPlan(withholdRequest);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 getOrderDetail(OrderRequest orderRequest) {
        Checker.checkNonNull(orderRequest);
        Context context = this.a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, orderRequest.reservedInfor, "GetOrderDetail")) {
            HMSLog.i("PayClientImpl", "getOrderDetail with Full SDK branch.");
            PayClientFullImpl b = b();
            if (b != null) {
                return b.getOrderDetail(orderRequest);
            }
            return new FailureTask();
        }
        PayClientImpl a = a();
        if (a != null) {
            return a.getOrderDetail(orderRequest);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public PayResultInfo getPayResultInfoFromIntent(Intent intent) {
        Checker.checkNonNull(intent);
        PayClientImpl a = a();
        if (a != null) {
            return a.getPayResultInfoFromIntent(intent);
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 getProductDetails(ProductDetailRequest productDetailRequest) {
        Checker.checkNonNull(productDetailRequest);
        Context context = this.a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, productDetailRequest.reservedInfor, "Productdetail")) {
            HMSLog.i("PayClientImpl", "getProductDetails with Full SDK branch.");
            PayClientFullImpl b = b();
            if (b != null) {
                return b.getProductDetails(productDetailRequest);
            }
            return new FailureTask();
        }
        PayClientImpl a = a();
        if (a != null) {
            return a.getProductDetails(productDetailRequest);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public ProductPayResultInfo getProductPayResultFromIntent(Intent intent) {
        Checker.checkNonNull(intent);
        PayClientImpl a = a();
        if (a != null) {
            return a.getProductPayResultFromIntent(intent);
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest) {
        Checker.checkNonNull(purchaseInfoRequest);
        Context context = this.a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, purchaseInfoRequest.reservedInfor, "Purchaseinfo")) {
            HMSLog.i("PayClientImpl", "getProductDetails with Full SDK branch.");
            PayClientFullImpl b = b();
            if (b != null) {
                return b.getPurchaseInfo(purchaseInfoRequest);
            }
            return new FailureTask();
        }
        PayClientImpl a = a();
        if (a != null) {
            return a.getPurchaseInfo(purchaseInfoRequest);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 getWalletUiIntent(int i) {
        PayClientImpl a = a();
        if (a != null) {
            return a.getWalletUiIntent(i);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 internalPay(InternalPayRequest internalPayRequest) {
        Checker.checkNonNull(internalPayRequest);
        PayClientImpl a = a();
        if (a != null) {
            return a.internalPay(internalPayRequest);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 pay(PayReq payReq) {
        Checker.checkNonNull(payReq);
        Context context = this.a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, payReq.reservedInfor, payReq.country, payReq.currency, "Pay")) {
            HMSLog.i("PayClientImpl", "pay with Full SDK branch.");
            PayClientFullImpl b = b();
            if (b != null) {
                return b.pay(payReq);
            }
            return new FailureTask();
        }
        HMSLog.i("PayClientImpl", "pay with IAP SDK branch.");
        PayClientImpl a = a();
        if (a != null) {
            return a.pay(payReq);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 productPay(ProductPayRequest productPayRequest) {
        Checker.checkNonNull(productPayRequest);
        Context context = this.a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, productPayRequest.reservedInfor, "ProductPay")) {
            HMSLog.i("PayClientImpl", "productPay with Full SDK branch.");
            PayClientFullImpl b = b();
            if (b != null) {
                return b.productPay(productPayRequest);
            }
            return new FailureTask();
        }
        PayClientImpl a = a();
        if (a != null) {
            return a.productPay(productPayRequest);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public L50 queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest) {
        Checker.checkNonNull(hwWalletInfoRequest);
        PayClientImpl a = a();
        if (a != null) {
            return a.queryWalletInfo(hwWalletInfoRequest);
        }
        return new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public void setSubAppId(String str) {
        PayClientImpl a = a();
        if (a == null) {
            HMSLog.e("PayClientImpl", "setSubAppId payClient is null");
            return;
        }
        try {
            a.setSubAppId(str);
        } catch (ApiException unused) {
            HMSLog.d("PayClientImpl", "setSubAppId fail");
        }
    }

    public PayClientEntryImpl(Context context) {
        this.a = new WeakReference<>(context);
    }
}
