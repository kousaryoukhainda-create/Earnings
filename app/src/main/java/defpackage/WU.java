package defpackage;

import android.database.Observable;
/* renamed from: WU  reason: default package */
/* loaded from: classes.dex */
public final class WU extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((XU) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((XU) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
        }
    }

    public final void d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((XU) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((XU) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
        }
    }

    public final void f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((XU) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
        }
    }
}
