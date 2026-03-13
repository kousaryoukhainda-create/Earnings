package com.huawei.hms.common.internal;
/* loaded from: classes2.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {
    private final TaskApiCall<? extends AnyClient, TResult> a;
    private final M50 b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, M50 m50) {
        super(1);
        this.a = taskApiCall;
        this.b = m50;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.a;
    }

    public M50 getTaskCompletionSource() {
        return this.b;
    }
}
