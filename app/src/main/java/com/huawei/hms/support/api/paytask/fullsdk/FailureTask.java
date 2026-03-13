package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class FailureTask<T extends Result> extends L50 {
    private int a;
    private String b;

    public FailureTask() {
        this(-1, "context weak ref is recycled");
    }

    @Override // defpackage.L50
    public L50 addOnFailureListener(InterfaceC0846aQ interfaceC0846aQ) {
        if (interfaceC0846aQ == null) {
            return this;
        }
        interfaceC0846aQ.onFailure(new ApiException(new Status(this.a, this.b)));
        return this;
    }

    @Override // defpackage.L50
    public L50 addOnSuccessListener(InterfaceC1613iQ interfaceC1613iQ) {
        return this;
    }

    public Exception getException() {
        return null;
    }

    /* renamed from: getResult */
    public T m22getResult() {
        return null;
    }

    /* renamed from: getResultThrowException */
    public <E extends Throwable> T m23getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return true;
    }

    public boolean isSuccessful() {
        return false;
    }

    public FailureTask(int i, String str) {
        this.a = i;
        this.b = str;
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
