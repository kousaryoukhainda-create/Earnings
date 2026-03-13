package defpackage;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: pN  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2410pN implements InterfaceC0608Sh, Consumer {
    public final Context a;
    public final ReentrantLock b;
    public Ud0 c;
    public final LinkedHashSet d;

    public C2410pN(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    @Override // defpackage.InterfaceC0608Sh
    /* renamed from: a */
    public final void accept(WindowLayoutInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.c = AbstractC3142xt.c(this.a, value);
            for (InterfaceC0608Sh interfaceC0608Sh : this.d) {
                interfaceC0608Sh.accept(this.c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0650Tx listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Ud0 ud0 = this.c;
            if (ud0 != null) {
                listener.accept(ud0);
            }
            this.d.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.d.isEmpty();
    }

    public final void d(C0650Tx listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }
}
