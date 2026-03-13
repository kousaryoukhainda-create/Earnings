package com.google.android.gms.internal.measurement;

import android.net.Uri;
/* loaded from: classes3.dex */
public final class zzka {
    public static final /* synthetic */ int zza = 0;
    private static final C1243e5 zzb = new Z10();

    public static synchronized Uri zza(String str) {
        synchronized (zzka.class) {
            C1243e5 c1243e5 = zzb;
            Uri uri = (Uri) c1243e5.getOrDefault("com.google.android.gms.measurement", null);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                c1243e5.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
