package com.google.android.gms.measurement.internal;

import java.util.Comparator;
/* loaded from: classes3.dex */
final /* synthetic */ class zzlc implements Comparator {
    static final /* synthetic */ zzlc zza = new zzlc();

    private /* synthetic */ zzlc() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
    }
}
