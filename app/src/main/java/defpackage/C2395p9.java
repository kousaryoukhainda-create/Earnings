package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: p9  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2395p9 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C2395p9.class, "notCompletedCount");
    public final InterfaceC0356Io[] a;
    private volatile int notCompletedCount;

    public C2395p9(InterfaceC0356Io[] interfaceC0356IoArr) {
        this.a = interfaceC0356IoArr;
        this.notCompletedCount = interfaceC0356IoArr.length;
    }
}
