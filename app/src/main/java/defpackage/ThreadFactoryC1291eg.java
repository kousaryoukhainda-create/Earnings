package defpackage;

import com.applovin.impl.xp;
import java.util.concurrent.ThreadFactory;
/* renamed from: eg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1291eg implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ThreadFactoryC1291eg(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, this.b);
                thread.setPriority(10);
                return thread;
            case 1:
                return new Thread(runnable, this.b);
            default:
                return xp.b(this.b, runnable);
        }
    }
}
