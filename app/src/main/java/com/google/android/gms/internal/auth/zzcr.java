package com.google.android.gms.internal.auth;

import android.net.Uri;
/* loaded from: classes3.dex */
public final class zzcr {
    private static final C1243e5 zza = new Z10();

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            C1243e5 c1243e5 = zza;
            Uri uri = (Uri) c1243e5.getOrDefault("com.google.android.gms.auth_account", null);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                c1243e5.put("com.google.android.gms.auth_account", parse);
                return parse;
            }
            return uri;
        }
    }
}
