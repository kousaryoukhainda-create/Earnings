package com.huawei.hms.iap.entity;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class f extends AbstractMessageEntity {
    @Packed
    private String errMsg;
    @Packed
    private int returnCode;
    @Packed
    private List<e> skuList;

    public String getErrMsg() {
        return this.errMsg;
    }

    public List<ProductInfo> getProductInfoList() {
        ArrayList arrayList = new ArrayList();
        List<e> list = this.skuList;
        if (list == null) {
            return arrayList;
        }
        for (e eVar : list) {
            arrayList.add(eVar.toProductInfo());
        }
        return arrayList;
    }

    public int getReturnCode() {
        return this.returnCode;
    }
}
