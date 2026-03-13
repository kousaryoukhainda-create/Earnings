package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes3.dex */
final class zzbzr extends ScheduledThreadPoolExecutor {
    public zzbzr(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
