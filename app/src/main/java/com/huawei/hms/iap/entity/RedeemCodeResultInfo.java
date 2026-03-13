package com.huawei.hms.iap.entity;
/* loaded from: classes2.dex */
public class RedeemCodeResultInfo {
    private String a;
    private int b = 1;

    public String getRedeemCode() {
        return this.a;
    }

    public int getReturnCode() {
        return this.b;
    }

    public void setRedeemCode(String str) {
        this.a = str;
    }

    public void setReturnCode(int i) {
        this.b = i;
    }
}
