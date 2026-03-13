package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: vt  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2970vt implements InterfaceC2859ud0 {
    public final WindowLayoutComponent a;
    public final ReentrantLock b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public C2970vt(WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.a = component;
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.InterfaceC2859ud0
    public final void a(Context context, S4 executor, C0650Tx callback) {
        B90 b90;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.c;
        try {
            C2410pN c2410pN = (C2410pN) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.d;
            if (c2410pN != null) {
                c2410pN.b(callback);
                linkedHashMap2.put(callback, context);
                b90 = B90.a;
            } else {
                b90 = null;
            }
            if (b90 == null) {
                C2410pN c2410pN2 = new C2410pN(context);
                linkedHashMap.put(context, c2410pN2);
                linkedHashMap2.put(callback, context);
                c2410pN2.b(callback);
                this.a.addWindowLayoutInfoListener(context, c2410pN2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC2859ud0
    public final void b(C0650Tx callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.d;
        try {
            Context context = (Context) linkedHashMap.get(callback);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.c;
            C2410pN c2410pN = (C2410pN) linkedHashMap2.get(context);
            if (c2410pN == null) {
                return;
            }
            c2410pN.d(callback);
            linkedHashMap.remove(callback);
            if (c2410pN.c()) {
                linkedHashMap2.remove(context);
                this.a.removeWindowLayoutInfoListener(c2410pN);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
