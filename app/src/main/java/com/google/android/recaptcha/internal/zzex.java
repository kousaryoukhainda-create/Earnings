package com.google.android.recaptcha.internal;

import com.fyber.fairbid.http.connection.HttpConnection;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzex {
    @NotNull
    private final zzfm zza;

    public zzex() {
        this(null, 1, null);
    }

    @NotNull
    public final zzew zza(@NotNull String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod("POST");
            zza.setDoOutput(true);
            zza.setRequestProperty(HttpConnection.CONTENT_TYPE_HEADER, "application/x-protobuffer");
            return new zzew(zza);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e2.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = new zzfm();
    }
}
