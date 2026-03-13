package com.google.android.gms.internal.ads;

import com.fyber.fairbid.http.connection.HttpConnection;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.util.Map;
/* loaded from: classes3.dex */
public class zzaqr extends zzapm {
    private final Object zza;
    private final zzapr zzb;

    public zzaqr(int i, String str, zzapr zzaprVar, zzapq zzapqVar) {
        super(i, str, zzapqVar);
        this.zza = new Object();
        this.zzb = zzaprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final zzaps zzh(zzapi zzapiVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapiVar.zzb;
            Map map = zzapiVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(HttpConnection.CONTENT_TYPE_HEADER)) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split(ContainerUtils.KEY_VALUE_DELIMITER, 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapiVar.zzb);
        }
        return zzaps.zzb(str, zzaqj.zzb(zzapiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    /* renamed from: zzz */
    public void zzo(String str) {
        zzapr zzaprVar;
        synchronized (this.zza) {
            zzaprVar = this.zzb;
        }
        zzaprVar.zza(str);
    }
}
