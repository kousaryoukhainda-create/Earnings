package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    private ScheduledThreadPoolExecutor a;
    private final Object b = new Object();

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        ScheduledThreadPoolExecutor a = a();
        this.a = a;
        a.execute(new RunnableC1495h2(appLovinCommunicatorMessage, 24));
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    private ScheduledThreadPoolExecutor a() {
        synchronized (this.b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, (ThreadFactory) new Object());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
