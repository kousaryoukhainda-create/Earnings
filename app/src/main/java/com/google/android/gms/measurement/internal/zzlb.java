package com.google.android.gms.measurement.internal;

import j$.util.function.Function;
/* loaded from: classes3.dex */
final /* synthetic */ class zzlb implements Function {
    static final /* synthetic */ zzlb zza = new zzlb();

    private /* synthetic */ zzlb() {
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return Long.valueOf(((zzog) obj).zzb);
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
