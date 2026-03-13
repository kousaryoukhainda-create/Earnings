package com.huawei.hms.iap.entity;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class InAppPurchaseData {
    public static final int NOT_PRESENT = Integer.MIN_VALUE;
    private int A;
    private long B;
    private int C;
    private String D;
    private int E;
    private int F;
    private int G;
    private long H;
    private boolean I;
    private int J;
    private int K;
    private String L;
    private int M;
    private String N;
    private String O;
    private int P;
    private String Q;
    private int R;
    private long S;
    private long T;
    private int U;
    private long V;
    private String a;
    private boolean b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private int h;
    private String i;
    private String j;
    private int k;
    private String l;
    private long m;
    private String n;
    private String o;
    private String p;
    private long q;
    private String r;
    private int s;
    private long t;
    private long u;
    private long v;
    private long w;
    private int x;
    private int y;
    private int z;

    /* loaded from: classes2.dex */
    public interface PurchaseState {
        public static final int CANCELED = 1;
        public static final int INITIALIZED = Integer.MIN_VALUE;
        public static final int PENDING = 3;
        public static final int PURCHASED = 0;
        public static final int REFUNDED = 2;
    }

    public InAppPurchaseData(String str) throws JSONException {
        JSONObject jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        this.a = jSONObject.optString("applicationId");
        this.b = jSONObject.optBoolean("autoRenewing");
        this.c = jSONObject.optString("orderId");
        this.d = jSONObject.optString("packageName", null);
        this.e = jSONObject.optString("productId");
        this.f = jSONObject.optString(HwPayConstant.KEY_PRODUCTNAME, null);
        this.g = jSONObject.optLong("purchaseTime", -2147483648L);
        this.h = jSONObject.optInt("purchaseState");
        this.i = jSONObject.optString("developerPayload", null);
        this.j = jSONObject.optString("purchaseToken");
        this.k = jSONObject.optInt("purchaseType", Integer.MIN_VALUE);
        this.l = jSONObject.optString("currency");
        this.m = jSONObject.optLong("price");
        this.n = jSONObject.optString(HwPayConstant.KEY_COUNTRY);
        this.o = jSONObject.optString("lastOrderId", null);
        this.p = jSONObject.optString("productGroup", null);
        this.q = jSONObject.optLong("oriPurchaseTime", -2147483648L);
        this.r = jSONObject.optString("subscriptionId", null);
        this.s = jSONObject.optInt("quantity", Integer.MIN_VALUE);
        this.t = jSONObject.optLong("daysLasted", -2147483648L);
        this.u = jSONObject.optLong("numOfPeriods", -2147483648L);
        this.v = jSONObject.optLong("numOfDiscount", -2147483648L);
        this.w = jSONObject.optLong("expirationDate", -2147483648L);
        this.x = jSONObject.optInt("expirationIntent", Integer.MIN_VALUE);
        this.y = jSONObject.optInt("retryFlag", Integer.MIN_VALUE);
        this.z = jSONObject.optInt("introductoryFlag", Integer.MIN_VALUE);
        this.A = jSONObject.optInt("trialFlag", Integer.MIN_VALUE);
        this.B = jSONObject.optLong("cancelTime", -2147483648L);
        this.C = jSONObject.optInt("cancelReason", Integer.MIN_VALUE);
        this.D = jSONObject.optString("appInfo", null);
        this.E = jSONObject.optInt("notifyClosed", Integer.MIN_VALUE);
        this.F = jSONObject.optInt("renewStatus", Integer.MIN_VALUE);
        this.G = jSONObject.optInt("priceConsentStatus", Integer.MIN_VALUE);
        this.H = jSONObject.optLong("renewPrice", -2147483648L);
        this.I = jSONObject.optBoolean("subIsvalid", false);
        this.J = jSONObject.optInt("cancelledSubKeepDays", Integer.MIN_VALUE);
        this.K = jSONObject.optInt("kind", Integer.MIN_VALUE);
        this.L = jSONObject.optString("developerChallenge", null);
        this.M = jSONObject.optInt("consumptionState", Integer.MIN_VALUE);
        this.N = jSONObject.optString("payOrderId", null);
        this.O = jSONObject.optString("payType", null);
        this.P = jSONObject.optInt("deferFlag", Integer.MIN_VALUE);
        this.Q = jSONObject.optString("oriSubscriptionId", null);
        this.R = jSONObject.optInt("cancelWay", Integer.MIN_VALUE);
        this.S = jSONObject.optLong("cancellationTime", -2147483648L);
        this.T = jSONObject.optLong("resumeTime", -2147483648L);
        this.V = jSONObject.optLong("graceExpirationTime", -2147483648L);
        this.U = jSONObject.optInt("accountFlag", Integer.MIN_VALUE);
    }

    public int getAccountFlag() {
        return this.U;
    }

    public String getAppInfo() {
        return this.D;
    }

    public String getApplicationId() {
        return this.a;
    }

    public int getCancelReason() {
        return this.C;
    }

    public long getCancelTime() {
        return this.B;
    }

    public int getCancelWay() {
        return this.R;
    }

    public long getCancellationTime() {
        return this.S;
    }

    public int getCancelledSubKeepDays() {
        return this.J;
    }

    public int getConsumptionState() {
        return this.M;
    }

    public String getCountry() {
        return this.n;
    }

    public String getCurrency() {
        return this.l;
    }

    public long getDaysLasted() {
        return this.t;
    }

    public int getDeferFlag() {
        return this.P;
    }

    public String getDeveloperChallenge() {
        return this.L;
    }

    public String getDeveloperPayload() {
        return this.i;
    }

    public long getExpirationDate() {
        return this.w;
    }

    public int getExpirationIntent() {
        return this.x;
    }

    public long getGraceExpirationTime() {
        return this.V;
    }

    public int getIntroductoryFlag() {
        return this.z;
    }

    public int getKind() {
        return this.K;
    }

    public String getLastOrderId() {
        return this.o;
    }

    public int getNotifyClosed() {
        return this.E;
    }

    public long getNumOfDiscount() {
        return this.v;
    }

    public long getNumOfPeriods() {
        return this.u;
    }

    public String getOrderID() {
        return this.c;
    }

    public long getOriPurchaseTime() {
        return this.q;
    }

    public String getOriSubscriptionId() {
        return this.Q;
    }

    public String getPackageName() {
        return this.d;
    }

    public String getPayOrderId() {
        return this.N;
    }

    public String getPayType() {
        return this.O;
    }

    public long getPrice() {
        return this.m;
    }

    public int getPriceConsentStatus() {
        return this.G;
    }

    public String getProductGroup() {
        return this.p;
    }

    public String getProductId() {
        return this.e;
    }

    public String getProductName() {
        return this.f;
    }

    public int getPurchaseState() {
        return this.h;
    }

    public long getPurchaseTime() {
        return this.g;
    }

    public String getPurchaseToken() {
        return this.j;
    }

    public int getPurchaseType() {
        return this.k;
    }

    public int getQuantity() {
        return this.s;
    }

    public long getRenewPrice() {
        return this.H;
    }

    public int getRenewStatus() {
        return this.F;
    }

    public long getResumeTime() {
        return this.T;
    }

    public int getRetryFlag() {
        return this.y;
    }

    public String getSubscriptionId() {
        return this.r;
    }

    public int getTrialFlag() {
        return this.A;
    }

    public boolean isAutoRenewing() {
        return this.b;
    }

    public boolean isSubValid() {
        return this.I;
    }
}
