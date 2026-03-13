package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdu extends SQLiteOpenHelper {
    final /* synthetic */ zzdv zza;
    private boolean zzb;
    private long zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzdv zzdvVar, Context context, String str) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzdvVar;
        this.zzc = 0L;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        Clock clock;
        Context context;
        String str;
        SQLiteDatabase sQLiteDatabase;
        Clock clock2;
        if (this.zzb) {
            clock2 = this.zza.zzg;
            if (this.zzc + 3600000 > clock2.currentTimeMillis()) {
                throw new SQLiteException("Database creation failed");
            }
        }
        this.zzb = true;
        clock = this.zza.zzg;
        this.zzc = clock.currentTimeMillis();
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdv zzdvVar = this.zza;
            context = zzdvVar.zzd;
            str = zzdvVar.zze;
            context.getDatabasePath(str).delete();
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            sQLiteDatabase = super.getWritableDatabase();
        }
        this.zzb = false;
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbu.zza(sQLiteDatabase.getPath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        Cursor query;
        Cursor cursor = null;
        try {
            try {
                query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{"gtm_hits"}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException unused) {
        }
        try {
            boolean moveToFirst = query.moveToFirst();
            query.close();
            if (moveToFirst) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
                HashSet hashSet = new HashSet();
                try {
                    for (String str2 : rawQuery.getColumnNames()) {
                        hashSet.add(str2);
                    }
                    rawQuery.close();
                    if (hashSet.remove("hit_id") && hashSet.remove("hit_url") && hashSet.remove("hit_time") && hashSet.remove("hit_first_send_time")) {
                        if (hashSet.isEmpty()) {
                            return;
                        }
                        throw new SQLiteException("Database has extra columns");
                    }
                    throw new SQLiteException("Database column missing");
                } catch (Throwable th2) {
                    rawQuery.close();
                    throw th2;
                }
            }
        } catch (SQLiteException unused2) {
            cursor = query;
            Log.w("GoogleTagManager", "Error querying for table gtm_hits");
            if (cursor != null) {
                cursor.close();
            }
            str = zzdv.zza;
            sQLiteDatabase.execSQL(str);
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        str = zzdv.zza;
        sQLiteDatabase.execSQL(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
