package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.bean.PayRequest;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.PayResult;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public abstract class BaseFullSdkTask<T extends BaseReq> extends L50 {
    private boolean b;
    protected Context mContext;
    protected T mRequest;
    protected Intent mIntent = getFullSdkIntent();
    private PayResult a = new PayResult();

    public BaseFullSdkTask(Context context, T t) {
        Status status;
        this.mContext = context;
        this.mRequest = t;
        if (this.mIntent == null) {
            status = new Status(PayStatusCodes.PAY_STATE_PARAM_ERROR, "param is error");
        } else {
            status = new Status(0, "success", this.mIntent);
        }
        this.a.setStatus(status);
        this.b = true;
    }

    @Override // defpackage.L50
    public L50 addOnFailureListener(InterfaceC0846aQ interfaceC0846aQ) {
        if (interfaceC0846aQ != null && !isSuccessful()) {
            interfaceC0846aQ.onFailure(new IapApiException(this.a.getStatus()));
        }
        return this;
    }

    @Override // defpackage.L50
    public L50 addOnSuccessListener(InterfaceC1613iQ interfaceC1613iQ) {
        if (interfaceC1613iQ != null && isSuccessful()) {
            interfaceC1613iQ.onSuccess(this.a);
        }
        return this;
    }

    public boolean checkFieldExist(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.getName().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract PayRequest createRequestParams();

    public Exception getException() {
        return null;
    }

    public abstract Intent getFullSdkIntent();

    /* renamed from: getResult */
    public PayResult m20getResult() {
        return this.a;
    }

    /* renamed from: getResultThrowException */
    public <E extends Throwable> PayResult m21getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return this.b;
    }

    public boolean isSuccessful() {
        return this.mIntent != null;
    }

    public L50 addOnFailureListener(Activity activity, InterfaceC0846aQ interfaceC0846aQ) {
        addOnFailureListener(interfaceC0846aQ);
        return this;
    }

    public L50 addOnSuccessListener(Activity activity, InterfaceC1613iQ interfaceC1613iQ) {
        addOnSuccessListener(interfaceC1613iQ);
        return this;
    }

    public L50 addOnFailureListener(Executor executor, InterfaceC0846aQ interfaceC0846aQ) {
        addOnFailureListener(interfaceC0846aQ);
        return this;
    }

    public L50 addOnSuccessListener(Executor executor, InterfaceC1613iQ interfaceC1613iQ) {
        addOnSuccessListener(interfaceC1613iQ);
        return this;
    }
}
