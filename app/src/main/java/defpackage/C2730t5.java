package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* renamed from: t5  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2730t5 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C2988w5 f;
        while (true) {
            try {
                reentrantLock = C2988w5.h;
                reentrantLock.lock();
                f = AbstractC1424g90.f();
            } catch (InterruptedException unused) {
            }
            if (f == C2988w5.l) {
                C2988w5.l = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (f != null) {
                f.j();
            }
        }
    }
}
