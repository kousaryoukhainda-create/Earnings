package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hms.framework.common.ContainerUtils;
/* loaded from: classes3.dex */
public final class zzava {
    private static final String[] zza = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zzb = "ad.doubleclick.net";
    private final String[] zzc = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzauv zzd;

    @Deprecated
    public zzava(zzauv zzauvVar) {
        this.zzd = zzauvVar;
    }

    private final Uri zzg(Uri uri, String str) throws zzavb {
        try {
            if (uri != null) {
                try {
                    if (uri.getHost().equals(this.zzb)) {
                        if (uri.getPath().contains(";")) {
                            if (!uri.toString().contains("dc_ms=")) {
                                String uri2 = uri.toString();
                                int indexOf = uri2.indexOf(";adurl");
                                if (indexOf != -1) {
                                    int i = indexOf + 1;
                                    return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                                }
                                String encodedPath = uri.getEncodedPath();
                                int indexOf2 = uri2.indexOf(encodedPath);
                                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                            }
                            throw new zzavb("Parameter already exists: dc_ms");
                        }
                    }
                } catch (NullPointerException unused) {
                }
                if (uri.getQueryParameter("ms") == null) {
                    String uri3 = uri.toString();
                    int indexOf3 = uri3.indexOf("&adurl");
                    if (indexOf3 == -1) {
                        indexOf3 = uri3.indexOf("?adurl");
                    }
                    if (indexOf3 != -1) {
                        int i2 = indexOf3 + 1;
                        return Uri.parse(uri3.substring(0, i2) + "ms=" + str + ContainerUtils.FIELD_DELIMITER + uri3.substring(i2));
                    }
                    return uri.buildUpon().appendQueryParameter("ms", str).build();
                }
                throw new zzavb("Query parameter already exists: ms");
            }
            throw null;
        } catch (UnsupportedOperationException unused2) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzavb {
        try {
            return zzg(uri, this.zzd.zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) throws zzavb {
        return zzg(uri, this.zzd.zzf(context));
    }

    @Deprecated
    public final zzauv zzc() {
        return this.zzd;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (zzf(uri)) {
            String[] strArr = zza;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.zzc;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
