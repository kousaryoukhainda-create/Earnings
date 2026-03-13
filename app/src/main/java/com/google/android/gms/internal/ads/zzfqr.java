package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes3.dex */
public final class zzfqr extends zzfqf {
    private zzfvf<Integer> zza;
    private zzfvf<Integer> zzb;
    private zzfqq zzc;
    private HttpURLConnection zzd;

    public zzfqr(zzfvf<Integer> zzfvfVar, zzfvf<Integer> zzfvfVar2, zzfqq zzfqqVar) {
        this.zza = zzfvfVar;
        this.zzb = zzfvfVar2;
        this.zzc = zzfqqVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfqg.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfqg.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfqq zzfqqVar = this.zzc;
        zzfqqVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfqqVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfqq zzfqqVar, final int i, final int i2) throws IOException {
        this.zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqj
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqk
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzfqqVar;
        return zzm();
    }

    public HttpURLConnection zzo(@NonNull final Network network, @NonNull final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfql
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqm
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzfqq() { // from class: com.google.android.gms.internal.ads.zzfqn
            @Override // com.google.android.gms.internal.ads.zzfqq
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(@NonNull final URL url, final int i) throws IOException {
        this.zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqo
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzfqq() { // from class: com.google.android.gms.internal.ads.zzfqp
            @Override // com.google.android.gms.internal.ads.zzfqq
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }

    public zzfqr() {
        this(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqh
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzf();
            }
        }, new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqi
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqr.zzg();
            }
        }, null);
    }
}
