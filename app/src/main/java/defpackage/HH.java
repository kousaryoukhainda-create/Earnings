package defpackage;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
/* renamed from: HH  reason: default package */
/* loaded from: classes.dex */
public abstract class HH {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    private boolean mChangingActiveState;
    private volatile Object mData;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;
    final Object mDataLock = new Object();
    private C2507qY mObservers = new C2507qY();
    int mActiveCount = 0;

    public HH() {
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new DH(this, 0);
        this.mData = obj;
        this.mVersion = -1;
    }

    public static void assertMainThread(String str) {
        T4.a0().k.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(AbstractC2437ph.h("Cannot invoke ", str, " on a background thread"));
    }

    public final void a(GH gh) {
        if (!gh.c) {
            return;
        }
        if (!gh.d()) {
            gh.a(false);
            return;
        }
        int i = gh.d;
        int i2 = this.mVersion;
        if (i >= i2) {
            return;
        }
        gh.d = i2;
        gh.b.a(this.mData);
    }

    public void changeActiveCounter(int i) {
        boolean z;
        boolean z2;
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i3 = this.mActiveCount;
                if (i2 != i3) {
                    if (i2 == 0 && i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 > 0 && i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        onActive();
                    } else if (z2) {
                        onInactive();
                    }
                    i2 = i3;
                } else {
                    this.mChangingActiveState = false;
                    return;
                }
            } catch (Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(GH gh) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (gh != null) {
                a(gh);
                gh = null;
            } else {
                C2507qY c2507qY = this.mObservers;
                c2507qY.getClass();
                C2335oY c2335oY = new C2335oY(c2507qY);
                c2507qY.d.put(c2335oY, Boolean.FALSE);
                while (c2335oY.hasNext()) {
                    a((GH) ((Map.Entry) c2335oY.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    public boolean hasObservers() {
        if (this.mObservers.f > 0) {
            return true;
        }
        return false;
    }

    public boolean isInitialized() {
        if (this.mData != NOT_SET) {
            return true;
        }
        return false;
    }

    public void observe(@NonNull HG hg, @NonNull InterfaceC2583rP interfaceC2583rP) {
        assertMainThread("observe");
        if (((JG) hg.getLifecycle()).c == BG.b) {
            return;
        }
        FH fh = new FH(this, hg, interfaceC2583rP);
        GH gh = (GH) this.mObservers.c(interfaceC2583rP, fh);
        if (gh != null && !gh.c(hg)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (gh != null) {
            return;
        }
        hg.getLifecycle().a(fh);
    }

    public void observeForever(@NonNull InterfaceC2583rP interfaceC2583rP) {
        assertMainThread("observeForever");
        GH gh = new GH(this, interfaceC2583rP);
        GH gh2 = (GH) this.mObservers.c(interfaceC2583rP, gh);
        if (!(gh2 instanceof FH)) {
            if (gh2 != null) {
                return;
            }
            gh.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void postValue(Object obj) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = obj;
        }
        if (!z) {
            return;
        }
        T4.a0().b0(this.mPostValueRunnable);
    }

    public void removeObserver(@NonNull InterfaceC2583rP interfaceC2583rP) {
        assertMainThread("removeObserver");
        GH gh = (GH) this.mObservers.d(interfaceC2583rP);
        if (gh == null) {
            return;
        }
        gh.b();
        gh.a(false);
    }

    public void removeObservers(@NonNull HG hg) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (true) {
            C2163mY c2163mY = (C2163mY) it;
            if (c2163mY.hasNext()) {
                Map.Entry entry = (Map.Entry) c2163mY.next();
                if (((GH) entry.getValue()).c(hg)) {
                    removeObserver((InterfaceC2583rP) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void setValue(Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }

    public void onActive() {
    }

    public void onInactive() {
    }
}
