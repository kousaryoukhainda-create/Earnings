package com.huawei.hms.support.api.pay;

import com.huawei.hms.support.api.client.Result;
/* loaded from: classes2.dex */
public class HwWalletInfoResult extends Result {
    private String result;

    private static <T> T get(T t) {
        return t;
    }

    public String getResult() {
        return (String) get(this.result);
    }

    public void setResult(String str) {
        this.result = str;
    }
}
