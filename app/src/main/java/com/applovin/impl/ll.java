package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class ll {
    private final Set a = new HashSet(32);
    private final Object b = new Object();

    public boolean a(String str) {
        synchronized (this.b) {
            try {
                for (ml mlVar : this.a) {
                    if (str.equals(mlVar.b())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        ml a;
        if (!StringUtils.isValidString(str)) {
            return;
        }
        synchronized (this.b) {
            a = a(str, appLovinCommunicatorSubscriber);
        }
        if (a != null) {
            a.a(false);
            AppLovinBroadcastManager.unregisterReceiver(a);
        }
    }

    private ml a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (ml mlVar : this.a) {
            if (str.equals(mlVar.b()) && appLovinCommunicatorSubscriber.equals(mlVar.a())) {
                return mlVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.b) {
                try {
                    ml a = a(str, appLovinCommunicatorSubscriber);
                    if (a != null) {
                        com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!a.c()) {
                            a.a(true);
                            AppLovinBroadcastManager.registerReceiver(a, new IntentFilter(str));
                        }
                        return true;
                    }
                    ml mlVar = new ml(str, appLovinCommunicatorSubscriber);
                    this.a.add(mlVar);
                    AppLovinBroadcastManager.registerReceiver(mlVar, new IntentFilter(str));
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }
}
