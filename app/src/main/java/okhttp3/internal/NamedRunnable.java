package okhttp3.internal;

import java.util.Locale;
/* loaded from: classes2.dex */
public abstract class NamedRunnable implements Runnable {
    public final String b;

    public NamedRunnable(String str, Object... objArr) {
        byte[] bArr = Util.a;
        this.b = String.format(Locale.US, str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
