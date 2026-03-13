package com.huawei.hms.iap.entity;
/* loaded from: classes2.dex */
public class PurchaseResultInfo {
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getErrMsg() {
        return this.d;
    }

    public String getInAppDataSignature() {
        return this.c;
    }

    public String getInAppPurchaseData() {
        return this.b;
    }

    public int getReturnCode() {
        return this.a;
    }

    public String getSignatureAlgorithm() {
        return this.e;
    }

    public void setErrMsg(String str) {
        this.d = str;
    }

    public void setInAppDataSignature(String str) {
        this.c = str;
    }

    public void setInAppPurchaseData(String str) {
        this.b = str;
    }

    public void setReturnCode(int i) {
        this.a = i;
    }

    public void setSignatureAlgorithm(String str) {
        this.e = str;
    }
}
