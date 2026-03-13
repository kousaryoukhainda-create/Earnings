package com.huawei.hms.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
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
import com.huawei.hms.iap.task.IapFailureTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class d implements IapClient {
    private WeakReference<Context> a;
    private String b;
    private boolean c;
    private String d;
    private f e;
    private e f;

    public d(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    private f a() {
        f fVar;
        f fVar2 = this.e;
        if (fVar2 != null) {
            return fVar2;
        }
        Context context = this.a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "getIapClientImpl context is null.");
            return null;
        }
        String b = b();
        b.getClass();
        char c = 65535;
        switch (b.hashCode()) {
            case -1528914616:
                if (b.equals("MCP_MODE")) {
                    c = 0;
                    break;
                }
                break;
            case -463465798:
                if (b.equals("GENERAL_MODE")) {
                    c = 1;
                    break;
                }
                break;
            case 545923237:
                if (b.equals("CONSIGNMENT_MODE")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String str = TextUtils.isEmpty(this.b) ? this.d : this.b;
                this.e = context instanceof Activity ? new f((Activity) context, str) : new f(context, str);
                break;
            case 1:
                fVar = context instanceof Activity ? new f((Activity) context) : new f(context);
                this.e = fVar;
                break;
            case 2:
                fVar = context instanceof Activity ? new f((Activity) context, this.d, this.c) : new f(context, this.d, this.c);
                this.e = fVar;
                break;
        }
        return this.e;
    }

    private String b() {
        return this.c ? !TextUtils.isEmpty(this.d) ? "CONSIGNMENT_MODE" : "GENERAL_MODE" : (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.d)) ? "GENERAL_MODE" : "MCP_MODE";
    }

    private e c() {
        e eVar;
        e eVar2 = this.f;
        if (eVar2 != null) {
            return eVar2;
        }
        Context context = this.a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "getIapClientFullImpl context is null.");
            return null;
        }
        String b = b();
        b.getClass();
        char c = 65535;
        switch (b.hashCode()) {
            case -1528914616:
                if (b.equals("MCP_MODE")) {
                    c = 0;
                    break;
                }
                break;
            case -463465798:
                if (b.equals("GENERAL_MODE")) {
                    c = 1;
                    break;
                }
                break;
            case 545923237:
                if (b.equals("CONSIGNMENT_MODE")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f = new e(context, TextUtils.isEmpty(this.b) ? this.d : this.b);
                break;
            case 1:
                eVar = new e(context);
                this.f = eVar;
                break;
            case 2:
                eVar = new e(context, this.d);
                this.f = eVar;
                break;
        }
        return this.f;
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq) {
        Checker.checkNonNull(consumeOwnedPurchaseReq);
        Context context = this.a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "consumeOwnedPurchase context is null.");
            return new IapFailureTask();
        } else if (com.huawei.hms.iap.util.a.a(context, consumeOwnedPurchaseReq.getReservedInfor())) {
            HMSLog.i("IapClientEntryImpl", "consumeOwnedPurchase with Full SDK branch.");
            e c = c();
            if (c != null) {
                return c.consumeOwnedPurchase(consumeOwnedPurchaseReq);
            }
            return new IapFailureTask();
        } else {
            f a = a();
            if (a != null) {
                return a.consumeOwnedPurchase(consumeOwnedPurchaseReq);
            }
            return new IapFailureTask();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 createPurchaseIntent(PurchaseIntentReq purchaseIntentReq) {
        Checker.checkNonNull(purchaseIntentReq);
        Context context = this.a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "createPurchaseIntent context is null.");
            return new IapFailureTask();
        } else if (com.huawei.hms.iap.util.a.a(context, purchaseIntentReq.getReservedInfor())) {
            HMSLog.i("IapClientEntryImpl", "createPurchaseIntent with Full SDK branch.");
            e c = c();
            if (c != null) {
                return c.createPurchaseIntent(purchaseIntentReq);
            }
            return new IapFailureTask();
        } else {
            f a = a();
            if (a != null) {
                return a.createPurchaseIntent(purchaseIntentReq);
            }
            return new IapFailureTask();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq) {
        f a = a();
        if (a != null) {
            return a.createPurchaseIntentWithPrice(purchaseIntentWithPriceReq);
        }
        return new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public void enablePendingPurchase() {
        f a = a();
        if (a != null) {
            a.enablePendingPurchase();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 isEnvReady() {
        return isEnvReady(false);
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq) {
        Checker.checkNonNull(isSandboxActivatedReq);
        f a = a();
        if (a != null) {
            return a.isSandboxActivated(isSandboxActivatedReq);
        }
        return new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        Context context = this.a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainOwnedPurchaseRecord context is null.");
            return new IapFailureTask();
        } else if (com.huawei.hms.iap.util.a.a(context, ownedPurchasesReq.getReservedInfor())) {
            HMSLog.i("IapClientEntryImpl", "obtainOwnedPurchaseRecord with Full SDK branch.");
            e c = c();
            if (c != null) {
                return c.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            }
            return new IapFailureTask();
        } else {
            f a = a();
            if (a != null) {
                return a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            }
            return new IapFailureTask();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        Context context = this.a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainOwnedPurchases context is null.");
            return new IapFailureTask();
        } else if (com.huawei.hms.iap.util.a.a(context, ownedPurchasesReq.getReservedInfor())) {
            HMSLog.i("IapClientEntryImpl", "obtainOwnedPurchases with Full SDK branch.");
            e c = c();
            if (c != null) {
                return c.obtainOwnedPurchases(ownedPurchasesReq);
            }
            return new IapFailureTask();
        } else {
            f a = a();
            if (a != null) {
                return a.obtainOwnedPurchases(ownedPurchasesReq);
            }
            return new IapFailureTask();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 obtainProductInfo(ProductInfoReq productInfoReq) {
        Checker.checkNonNull(productInfoReq);
        Context context = this.a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainProductInfo context is null.");
            return new IapFailureTask();
        } else if (com.huawei.hms.iap.util.a.a(context, productInfoReq.getReservedInfor())) {
            HMSLog.i("IapClientEntryImpl", "obtainProductInfo with Full SDK branch.");
            e c = c();
            if (c != null) {
                return c.obtainProductInfo(productInfoReq);
            }
            return new IapFailureTask();
        } else {
            f a = a();
            if (a != null) {
                return a.obtainProductInfo(productInfoReq);
            }
            return new IapFailureTask();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        if (!com.huawei.hms.iap.util.c.a(intent, "isFullSdk", false)) {
            f a = a();
            return a != null ? a.parsePurchaseResultInfoFromIntent(intent) : new PurchaseResultInfo();
        }
        HMSLog.i("IapClientEntryImpl", "parsePurchaseResultInfoFromIntent with Full SDK branch.");
        e c = c();
        return c != null ? c.parsePurchaseResultInfoFromIntent(intent) : new PurchaseResultInfo();
    }

    @Override // com.huawei.hms.iap.IapClient
    public RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        f a = a();
        return a != null ? a.parseRedeemCodeResultInfoFromIntent(intent) : new RedeemCodeResultInfo();
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 scanRedeemCode() {
        f a = a();
        if (a != null) {
            return a.scanRedeemCode();
        }
        return new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 startIapActivity(StartIapActivityReq startIapActivityReq) {
        Checker.checkNonNull(startIapActivityReq);
        f a = a();
        if (a != null) {
            return a.startIapActivity(startIapActivityReq);
        }
        return new IapFailureTask();
    }

    public d(Activity activity, String str) {
        this.a = new WeakReference<>(activity);
        this.b = str;
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 isEnvReady(IsEnvReadyReq isEnvReadyReq) {
        Checker.checkNonNull(isEnvReadyReq);
        Context context = this.a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "isEnvReady context is null.");
            return new IapFailureTask();
        } else if (com.huawei.hms.iap.util.a.a(context, isEnvReadyReq.getReservedInfor())) {
            HMSLog.i("IapClientEntryImpl", "isEnvReady with Full SDK branch.");
            e c = c();
            return c != null ? c.isEnvReady(isEnvReadyReq) : new IapFailureTask();
        } else {
            return new IapFailureTask();
        }
    }

    public d(Activity activity, String str, boolean z) {
        this.a = new WeakReference<>(activity);
        this.d = str;
        this.c = z;
    }

    @Override // com.huawei.hms.iap.IapClient
    public L50 isEnvReady(boolean z) {
        f a = a();
        return a != null ? a.isEnvReady(z) : new IapFailureTask();
    }

    public d(Context context) {
        this.a = new WeakReference<>(context);
    }

    public d(Context context, String str) {
        this.a = new WeakReference<>(context);
        this.b = str;
    }

    public d(Context context, String str, boolean z) {
        this.a = new WeakReference<>(context);
        this.d = str;
        this.c = z;
    }
}
