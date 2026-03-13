package com.huawei.hms.iap.task;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.huawei.hms.iapfull.IIapFullAPIVer4;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public abstract class BaseIapFullTask<V extends Result, E> extends L50 {
    protected boolean mIsCompleted;
    protected boolean mIsSuccessful;
    protected InterfaceC0846aQ mOnFailureListener;
    protected InterfaceC1613iQ mOnSuccessListener;
    protected V mResult;

    public BaseIapFullTask(Context context, E e) {
        setResult();
        if (context != null) {
            handleRequest(e, IapFullAPIFactory.createIapFullAPIVer4(context));
            return;
        }
        HMSLog.e("BaseIapFullTask", "context is null.");
        this.mResult.setStatus(new Status(OrderStatusCode.ORDER_STATE_PARAM_ERROR, "param is error"));
        this.mIsSuccessful = false;
        this.mIsCompleted = true;
    }

    @Override // defpackage.L50
    public L50 addOnFailureListener(InterfaceC0846aQ interfaceC0846aQ) {
        if (interfaceC0846aQ != null) {
            if (!isComplete() || isSuccessful()) {
                this.mOnFailureListener = interfaceC0846aQ;
            } else {
                interfaceC0846aQ.onFailure(new IapApiException(this.mResult.getStatus()));
            }
        }
        return this;
    }

    @Override // defpackage.L50
    public L50 addOnSuccessListener(InterfaceC1613iQ interfaceC1613iQ) {
        if (interfaceC1613iQ != null) {
            if (isComplete() && isSuccessful()) {
                interfaceC1613iQ.onSuccess(this.mResult);
            } else {
                this.mOnSuccessListener = interfaceC1613iQ;
            }
        }
        return this;
    }

    public Exception getException() {
        return null;
    }

    /* renamed from: getResult */
    public V m16getResult() {
        return this.mResult;
    }

    /* renamed from: getResultThrowException */
    public <E extends Throwable> V m17getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    public abstract void handleRequest(E e, @NonNull IIapFullAPIVer4 iIapFullAPIVer4);

    public void handleRequestFailed(int i, String str) {
        this.mIsSuccessful = false;
        this.mIsCompleted = true;
        InterfaceC0846aQ interfaceC0846aQ = this.mOnFailureListener;
        if (interfaceC0846aQ != null) {
            interfaceC0846aQ.onFailure(new IapApiException(new Status(i, str)));
        }
    }

    public void handleRequestSuccess() {
        this.mIsSuccessful = true;
        this.mIsCompleted = true;
        InterfaceC1613iQ interfaceC1613iQ = this.mOnSuccessListener;
        if (interfaceC1613iQ != null) {
            interfaceC1613iQ.onSuccess(this.mResult);
        }
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return this.mIsCompleted;
    }

    public boolean isSuccessful() {
        return this.mIsSuccessful;
    }

    public abstract void setResult();

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
