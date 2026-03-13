package com.huawei.hms.support.api.pay;
/* loaded from: classes2.dex */
public class ProductPayResultInfo {
    private int a;
    private String b;
    private String c;
    private String d;
    private long e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;

    public String getCountry() {
        return this.g;
    }

    public String getCurrency() {
        return this.f;
    }

    public String getErrMsg() {
        return this.b;
    }

    public String getMerchantId() {
        return this.c;
    }

    public long getMicrosAmount() {
        return this.e;
    }

    public String getNewSign() {
        return this.l;
    }

    public String getOrderID() {
        return this.d;
    }

    public String getProductNo() {
        return this.j;
    }

    public String getRequestId() {
        return this.i;
    }

    public int getReturnCode() {
        return this.a;
    }

    public String getSign() {
        return this.k;
    }

    public String getSignatureAlgorithm() {
        return this.m;
    }

    public String getTime() {
        return this.h;
    }

    public void setCountry(String str) {
        this.g = str;
    }

    public void setCurrency(String str) {
        this.f = str;
    }

    public void setErrMsg(String str) {
        this.b = str;
    }

    public void setMerchantId(String str) {
        this.c = str;
    }

    public void setMicrosAmount(long j) {
        this.e = j;
    }

    public void setNewSign(String str) {
        this.l = str;
    }

    public void setOrderID(String str) {
        this.d = str;
    }

    public void setProductNo(String str) {
        this.j = str;
    }

    public void setRequestId(String str) {
        this.i = str;
    }

    public void setReturnCode(int i) {
        this.a = i;
    }

    public void setSign(String str) {
        this.k = str;
    }

    public void setSignatureAlgorithm(String str) {
        this.m = str;
    }

    public void setTime(String str) {
        this.h = str;
    }
}
