package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
/* loaded from: classes.dex */
public abstract class AFf1pSDK extends Observable {
    public final String AFKeystoreWrapper;
    long afInfoLog;
    public final String afRDLog;
    final Runnable values;
    public final Map<String, Object> AFInAppEventParameterName = new HashMap();
    public AFa1zSDK afDebugLog = AFa1zSDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFf1pSDK$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Observer {
        public AnonymousClass1() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFf1pSDK.this.values.run();
        }
    }

    /* loaded from: classes.dex */
    public enum AFa1zSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFf1pSDK(String str, String str2, Runnable runnable) {
        this.values = runnable;
        this.AFKeystoreWrapper = str2;
        this.afRDLog = str;
    }

    public abstract void valueOf(Context context);

    public final void values() {
        this.AFInAppEventParameterName.put("source", this.AFKeystoreWrapper);
        this.AFInAppEventParameterName.put("type", this.afRDLog);
        this.AFInAppEventParameterName.put("latency", Long.valueOf(System.currentTimeMillis() - this.afInfoLog));
        this.afDebugLog = AFa1zSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
