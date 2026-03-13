package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public abstract class PendingResultImpl<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {
    private CountDownLatch a;
    private WeakReference<ApiClient> c;
    protected DatagramTransport transport = null;
    private R b = null;
    private String d = null;
    private String e = null;
    private boolean f = true;

    /* loaded from: classes2.dex */
    public class a implements DatagramTransport.a {
        public a() {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.a(i, iMessageEntity);
            PendingResultImpl.this.a.countDown();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements DatagramTransport.a {
        final /* synthetic */ AtomicBoolean a;

        public b(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i, IMessageEntity iMessageEntity) {
            if (!this.a.get()) {
                PendingResultImpl.this.a(i, iMessageEntity);
            }
            PendingResultImpl.this.a.countDown();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements DatagramTransport.a {
        final /* synthetic */ d a;
        final /* synthetic */ ResultCallback b;

        public c(d dVar, ResultCallback resultCallback) {
            this.a = dVar;
            this.b = resultCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.a(i, iMessageEntity);
            this.a.a(this.b, PendingResultImpl.this.b);
        }
    }

    /* loaded from: classes2.dex */
    public static class d<R extends Result> extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void b(ResultCallback<? super R> resultCallback, R r) {
            resultCallback.onResult(r);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                Pair pair = (Pair) message.obj;
                b((ResultCallback) pair.first, (Result) pair.second);
            }
        }
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        a(apiClient, str, iMessageEntity, getResponseType(), 0);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        HMSLog.i("PendingResultImpl", "await");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread();
        }
        HMSLog.e("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() {
        HMSLog.i("PendingResultImpl", "awaitOnAnyThread");
        WeakReference<ApiClient> weakReference = this.c;
        if (weakReference == null) {
            HMSLog.e("PendingResultImpl", "api is null");
            a((int) CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.b;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e("PendingResultImpl", "client invalid");
            a((int) CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.b;
        }
        if (this.f) {
            a(0, 1);
        }
        this.transport.send(apiClient, new a());
        try {
            this.a.await();
        } catch (InterruptedException unused) {
            HMSLog.e("PendingResultImpl", "await in anythread InterruptedException");
            a((int) CommonCode.ErrorCode.INTERNAL_ERROR, (IMessageEntity) null);
        }
        return this.b;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    public boolean checkApiClient(ApiClient apiClient) {
        return true;
    }

    public Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass != null && (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) != null) {
            return (Class) type;
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    public abstract R onComplete(T t);

    public R onError(int i) {
        Type type;
        Class<?> cls;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        } else {
            type = null;
        }
        if (type != null) {
            cls = GenericTypeReflector.getType(type);
        } else {
            cls = null;
        }
        if (cls != null) {
            try {
                R r = (R) cls.newInstance();
                this.b = r;
                r.setStatus(new Status(i));
            } catch (Exception e) {
                HMSLog.e("PendingResultImpl", "on Error:" + e.getMessage());
                return null;
            }
        }
        return this.b;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
        this.f = !(resultCallback instanceof BaseAdapter.BaseRequestResultCallback);
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    private void a(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls, int i) {
        HMSLog.i("PendingResultImpl", "init uri:" + str);
        this.d = str;
        if (apiClient == null) {
            HMSLog.e("PendingResultImpl", "client is null");
            return;
        }
        this.c = new WeakReference<>(apiClient);
        this.a = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, IMessageEntity.class, Class.class, Integer.TYPE).newInstance(str, iMessageEntity, cls, Integer.valueOf(i));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.e("PendingResultImpl", "gen transport error:" + e.getMessage());
            throw new IllegalStateException("Instancing transport exception, " + e.getMessage(), e);
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        HMSLog.i("PendingResultImpl", "setResultCallback");
        if (looper == null) {
            looper = Looper.myLooper();
        }
        d dVar = new d(looper);
        WeakReference<ApiClient> weakReference = this.c;
        if (weakReference == null) {
            HMSLog.e("PendingResultImpl", "api is null");
            a((int) CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e("PendingResultImpl", "client is invalid");
            a((int) CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            dVar.a(resultCallback, this.b);
            return;
        }
        if (this.f) {
            a(0, 1);
        }
        this.transport.post(apiClient, new c(dVar, resultCallback));
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        StringBuilder k = AbstractC0324Hi.k(j, "await timeout:", " unit:");
        k.append(timeUnit.toString());
        HMSLog.i("PendingResultImpl", k.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread(j, timeUnit);
        }
        HMSLog.i("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        a(apiClient, str, iMessageEntity, cls, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(int i, IMessageEntity iMessageEntity) {
        Status status;
        AbstractC0324Hi.s(i, "setResult:", "PendingResultImpl");
        Status commonStatus = iMessageEntity instanceof AbstractMessageEntity ? ((AbstractMessageEntity) iMessageEntity).getCommonStatus() : null;
        if (i == 0) {
            this.b = onComplete(iMessageEntity);
        } else {
            this.b = onError(i);
        }
        if (this.f) {
            a(i, 2);
        }
        R r = this.b;
        if (r == null || (status = r.getStatus()) == null || commonStatus == null) {
            return;
        }
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage();
        int statusCode2 = commonStatus.getStatusCode();
        String statusMessage2 = commonStatus.getStatusMessage();
        if (statusCode != statusCode2) {
            HMSLog.e("PendingResultImpl", AbstractC2437ph.e("rstStatus code (", statusCode, ") is not equal commonStatus code (", statusCode2, ")"));
            HMSLog.e("PendingResultImpl", "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
        } else if (!TextUtils.isEmpty(statusMessage) || TextUtils.isEmpty(statusMessage2)) {
        } else {
            HMSLog.i("PendingResultImpl", AbstractC2437ph.j("rstStatus msg (", statusMessage, ") is not equal commonStatus msg (", statusMessage2, ")"));
            this.b.setStatus(new Status(statusCode, statusMessage2, status.getResolution()));
        }
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, int i) {
        a(apiClient, str, iMessageEntity, getResponseType(), i);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j, TimeUnit timeUnit) {
        StringBuilder k = AbstractC0324Hi.k(j, "awaitOnAnyThread timeout:", " unit:");
        k.append(timeUnit.toString());
        HMSLog.i("PendingResultImpl", k.toString());
        WeakReference<ApiClient> weakReference = this.c;
        if (weakReference == null) {
            HMSLog.e("PendingResultImpl", "api is null");
            a((int) CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.b;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e("PendingResultImpl", "client invalid");
            a((int) CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.b;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (this.f) {
            a(0, 1);
        }
        this.transport.post(apiClient, new b(atomicBoolean));
        try {
            if (!this.a.await(j, timeUnit)) {
                atomicBoolean.set(true);
                a((int) CommonCode.ErrorCode.EXECUTE_TIMEOUT, (IMessageEntity) null);
            }
        } catch (InterruptedException unused) {
            HMSLog.e("PendingResultImpl", "awaitOnAnyThread InterruptedException");
            a((int) CommonCode.ErrorCode.INTERNAL_ERROR, (IMessageEntity) null);
        }
        return this.b;
    }

    private void a(int i, int i2) {
        SubAppInfo subAppInfo;
        HMSLog.i("PendingResultImpl", "biReportEvent ====== ");
        ApiClient apiClient = this.c.get();
        if (apiClient != null && this.d != null && !HiAnalyticsUtil.getInstance().hasError(apiClient.getContext())) {
            HashMap hashMap = new HashMap();
            hashMap.put("package", apiClient.getPackageName());
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.11.0.302");
            if (i2 == 1) {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
            } else {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
                hashMap.put("result", String.valueOf(i));
                R r = this.b;
                if (r != null && r.getStatus() != null) {
                    hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(this.b.getStatus().getStatusCode()));
                }
            }
            hashMap.put("version", "0");
            String appId = Util.getAppId(apiClient.getContext());
            if (TextUtils.isEmpty(appId) && (subAppInfo = apiClient.getSubAppInfo()) != null) {
                appId = subAppInfo.getSubAppID();
            }
            hashMap.put("appid", appId);
            if (TextUtils.isEmpty(this.e)) {
                String id = TransactionIdCreater.getId(appId, this.d);
                this.e = id;
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, id);
            } else {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, this.e);
                this.e = null;
            }
            String[] split = this.d.split("\\.");
            if (split.length >= 2) {
                hashMap.put("service", split[0]);
                hashMap.put("apiName", split[1]);
            }
            hashMap.put("callTime", String.valueOf(System.currentTimeMillis()));
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
            HiAnalyticsUtil.getInstance().onEvent(apiClient.getContext(), HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, hashMap);
            return;
        }
        HMSLog.e("PendingResultImpl", "<biReportEvent> has some error.");
    }
}
