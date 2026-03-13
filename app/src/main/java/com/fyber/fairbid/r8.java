package com.fyber.fairbid;

import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.google.android.gms.ads.AdError;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class r8<T> implements CachedAd {
    public abstract void a();

    public abstract void a(@NotNull AdError adError);

    public abstract void a(T t);

    public abstract void b();

    public abstract void b(@NotNull AdError adError);

    public abstract void c();

    public abstract void d();
}
