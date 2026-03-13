package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
/* loaded from: classes3.dex */
public final class zzaw {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r2 == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zza(com.google.android.gms.measurement.internal.zzgt r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) throws android.database.sqlite.SQLiteException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaw.zza(com.google.android.gms.measurement.internal.zzgt, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void zzb(zzgt zzgtVar, SQLiteDatabase sQLiteDatabase) {
        if (zzgtVar != null) {
            com.google.android.gms.internal.measurement.zzbv.zza();
            String path = sQLiteDatabase.getPath();
            int i = com.google.android.gms.internal.measurement.zzca.zzb;
            File file = new File(path);
            if (!file.setReadable(false, false)) {
                zzgtVar.zze().zza("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzgtVar.zze().zza("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzgtVar.zze().zza("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                zzgtVar.zze().zza("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
