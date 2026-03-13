package defpackage;

import com.applovin.impl.communicator.MessagingServiceImpl;
import java.util.concurrent.ThreadFactory;
/* renamed from: CM  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class CM implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a;
        a = MessagingServiceImpl.a(runnable);
        return a;
    }
}
