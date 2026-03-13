package defpackage;
/* renamed from: r60  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2561r60 {
    public static final ThreadLocal a = new ThreadLocal();

    public static AbstractC0978bs a() {
        ThreadLocal threadLocal = a;
        AbstractC0978bs abstractC0978bs = (AbstractC0978bs) threadLocal.get();
        if (abstractC0978bs == null) {
            C0653Ua c0653Ua = new C0653Ua(Thread.currentThread());
            threadLocal.set(c0653Ua);
            return c0653Ua;
        }
        return abstractC0978bs;
    }
}
