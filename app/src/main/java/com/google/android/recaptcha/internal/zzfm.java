package com.google.android.recaptcha.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzfm {
    @NotNull
    private final InterfaceC2059lG zza;

    public zzfm() {
        int i = zzav.zza;
        this.zza = C2231nG.a(zzfl.zza);
    }

    @NotNull
    public final HttpURLConnection zza(@NotNull String str) throws zzbd, MalformedURLException, IOException {
        if (((zzfk) ((C2474q50) this.zza).a()).zzb(str)) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            Intrinsics.c(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) uRLConnection;
        }
        throw new zzbd(zzbb.zzc, zzba.zzQ, null);
    }
}
