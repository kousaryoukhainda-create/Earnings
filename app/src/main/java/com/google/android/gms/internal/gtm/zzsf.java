package com.google.android.gms.internal.gtm;

import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes3.dex */
final class zzsf implements zzsg {
    private HttpURLConnection zza;
    private InputStream zzb = null;

    @Override // com.google.android.gms.internal.gtm.zzsg
    public final InputStream zza(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        this.zza = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            this.zzb = inputStream;
            return inputStream;
        }
        String e = AbstractC0324Hi.e(responseCode, "Bad response: ");
        if (responseCode != 404) {
            if (responseCode == 503) {
                throw new zzsi(e);
            }
            throw new IOException(e);
        }
        throw new FileNotFoundException(e);
    }

    @Override // com.google.android.gms.internal.gtm.zzsg
    public final void zzb() {
        HttpURLConnection httpURLConnection = this.zza;
        try {
            InputStream inputStream = this.zzb;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            Log.e("GoogleTagManager", "HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(String.valueOf(e.getMessage())), e);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
