package com.google.android.recaptcha.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzew {
    @NotNull
    private final HttpURLConnection zza;

    public zzew(@NotNull HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e3.getMessage());
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e3.getMessage());
        }
    }

    @NotNull
    public final zzoi zza(@NotNull zzoi zzoiVar) {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode != 400) {
                    if (responseCode != 503 && responseCode != 403) {
                        if (responseCode != 404) {
                            throw new zzbd(zzbb.zzc, zzba.zzK, null);
                        }
                        throw new zzbd(zzbb.zzc, zzba.zzi, null);
                    }
                    throw new zzbd(zzbb.zzi, zzba.zzJ, null);
                }
                throw new zzbd(zzbb.zzc, zzba.zzau, null);
            }
            InputStream zzf = zzf();
            Intrinsics.checkNotNullParameter(zzf, "<this>");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, zzf.available()));
            B10.y(zzf, byteArrayOutputStream, 8192);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            if (byteArray.length != 0) {
                try {
                    Object zzb = zzoiVar.zzD().zzb(byteArray);
                    Intrinsics.c(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                    return (zzoi) zzb;
                } catch (Exception e) {
                    throw new zzbd(zzbb.zzc, zzba.zzG, e.getMessage());
                }
            }
            throw new zzbd(zzbb.zzc, zzba.zzat, null);
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e2.getMessage());
        }
    }

    @NotNull
    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e3.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(@NotNull byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzbd e) {
            throw e;
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e3.getMessage());
        }
    }
}
