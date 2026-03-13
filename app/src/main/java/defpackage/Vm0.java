package defpackage;

import sun.misc.Unsafe;
/* renamed from: Vm0  reason: default package */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class Vm0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
