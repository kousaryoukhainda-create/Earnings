package defpackage;

import java.util.concurrent.ThreadFactory;
/* renamed from: qW  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2505qW implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C2419pW(runnable);
    }
}
