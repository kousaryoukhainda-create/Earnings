package com.fyber.fairbid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.sdk.placements.database.ImpressionsStoreDbHelper;
/* loaded from: classes.dex */
public final class pa {
    public final ImpressionsStoreDbHelper a;

    public pa(Context context) {
        this.a = new ImpressionsStoreDbHelper(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.database.sqlite.SQLiteClosable, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final synchronized int a(String str, long j, int i) {
        SQLiteDatabase sQLiteDatabase;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            sQLiteDatabase = this.a.getReadableDatabase();
            try {
                r1 = sQLiteDatabase.query("past_impressions", new String[]{"_id"}, str, new String[]{String.valueOf(j / 1000), String.valueOf(i)}, null, null, null);
                int count = r1.getCount();
                r1.close();
                sQLiteDatabase.close();
                return count;
            } catch (SQLiteException e) {
                e = e;
                Logger.error("SQLiteException when getting impressions from the database", e);
                if (r1 != 0) {
                    r1.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return -1;
            } catch (RuntimeException e2) {
                e = e2;
                Logger.error("RuntimeException when getting impressions from the database", e);
                if (r1 != 0) {
                    r1.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return -1;
            }
        } catch (SQLiteException e3) {
            e = e3;
            sQLiteDatabase = null;
        } catch (RuntimeException e4) {
            e = e4;
            sQLiteDatabase = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                r1.close();
            }
            if (0 != 0) {
                r1.close();
            }
            throw th;
        }
    }
}
