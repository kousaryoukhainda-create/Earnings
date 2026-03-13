package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdv implements zzcc {
    private static final String zza = "CREATE TABLE IF NOT EXISTS gtm_hits ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL,'hit_first_send_time' INTEGER NOT NULL);";
    private final zzdu zzb;
    private volatile zzbj zzc;
    private final Context zzd;
    private final String zze;
    private long zzf;
    private final Clock zzg;
    private final int zzh;
    private final zzey zzi;

    public zzdv(zzey zzeyVar, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zze = "gtm_urls.db";
        this.zzi = zzeyVar;
        this.zzg = DefaultClock.getInstance();
        this.zzb = new zzdu(this, applicationContext, "gtm_urls.db");
        this.zzc = new zzfi(applicationContext, new zzdt(this));
        this.zzf = 0L;
        this.zzh = 2000;
    }

    public static /* synthetic */ void zzi(zzdv zzdvVar, long j, long j2) {
        SQLiteDatabase zzk = zzdvVar.zzk("Error opening database for getNumStoredHits.");
        if (zzk == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j2));
        try {
            zzk.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + j);
            zzdvVar.zzl(j);
        }
    }

    private final SQLiteDatabase zzk(String str) {
        try {
            return this.zzb.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(long j) {
        zzj(new String[]{String.valueOf(j)});
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:24:0x00b0, B:27:0x00b7, B:29:0x00c4, B:35:0x00f3, B:30:0x00d5, B:32:0x00e8, B:34:0x00f0, B:59:0x012a, B:60:0x014c, B:62:0x0152, B:67:0x0166), top: B:124:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    @Override // com.google.android.gms.tagmanager.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdv.zza():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if (r2 == 0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.database.Cursor] */
    @Override // com.google.android.gms.tagmanager.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(long r18, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdv.zzb(long, java.lang.String):void");
    }

    public final int zzc() {
        SQLiteDatabase zzk = zzk("Error opening database for getNumStoredHits.");
        int i = 0;
        if (zzk == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = zzk.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                cursor.close();
                return i;
            } catch (SQLiteException unused) {
                Log.w("GoogleTagManager", "Error getting numStoredHits");
                if (cursor == null) {
                    return 0;
                }
                cursor.close();
                return 0;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzj(String[] strArr) {
        int length;
        SQLiteDatabase zzk;
        boolean z;
        if (strArr == null || (length = strArr.length) == 0 || (zzk = zzk("Error opening database for deleteHits.")) == null) {
            return;
        }
        try {
            zzk.delete("gtm_hits", AbstractC2437ph.h("HIT_ID in (", TextUtils.join(",", Collections.nCopies(length, "?")), ")"), strArr);
            zzey zzeyVar = this.zzi;
            if (zzc() == 0) {
                z = true;
            } else {
                z = false;
            }
            zzeyVar.zza(z);
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting hits");
        }
    }
}
