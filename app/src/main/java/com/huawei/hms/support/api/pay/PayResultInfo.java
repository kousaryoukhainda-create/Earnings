package com.huawei.hms.support.api.pay;
/* loaded from: classes2.dex */
public class PayResultInfo {
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;

    public String getAmount() {
        return this.d;
    }

    public String getCountry() {
        return this.f;
    }

    public String getCurrency() {
        return this.e;
    }

    public String getErrMsg() {
        return this.b;
    }

    public String getNewSign() {
        return this.l;
    }

    public String getOrderID() {
        return this.c;
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
        return this.g;
    }

    public String getUserName() {
        return this.j;
    }

    public String getWithholdID() {
        return this.h;
    }

    public void setAmount(String str) {
        this.d = str;
    }

    public void setCountry(String str) {
        this.f = str;
    }

    public void setCurrency(String str) {
        this.e = str;
    }

    public void setErrMsg(String str) {
        this.b = str;
    }

    public void setNewSign(String str) {
        this.l = str;
    }

    public void setOrderID(String str) {
        this.c = str;
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
        this.g = str;
    }

    public void setUserName(String str) {
        this.j = str;
    }

    public void setWithholdID(String str) {
        this.h = str;
    }
}
