package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzgda {
    public static void zza(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
