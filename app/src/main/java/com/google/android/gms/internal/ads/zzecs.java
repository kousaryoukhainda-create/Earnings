package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzecs {
    private AbstractC1349fK zza;
    private final Context zzb;

    public zzecs(Context context) {
        this.zzb = context;
    }

    public final InterfaceFutureC2490qH zza() {
        try {
            C1263eK a = AbstractC1349fK.a(this.zzb);
            this.zza = a;
            if (a == null) {
                return zzgch.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
            }
            return a.b();
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }

    public final InterfaceFutureC2490qH zzb(Uri uri, InputEvent inputEvent) {
        try {
            AbstractC1349fK abstractC1349fK = this.zza;
            Objects.requireNonNull(abstractC1349fK);
            return abstractC1349fK.c(uri, inputEvent);
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }
}
