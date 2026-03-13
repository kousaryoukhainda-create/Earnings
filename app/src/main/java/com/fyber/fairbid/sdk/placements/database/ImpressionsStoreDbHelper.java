package com.fyber.fairbid.sdk.placements.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes.dex */
public class ImpressionsStoreDbHelper extends SQLiteOpenHelper {
    public ImpressionsStoreDbHelper(Context context) {
        super(context, "impressions_history", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS past_impressions (_id INTEGER PRIMARY KEY,placement_id INTEGER not NULL,ad_unit_id INTEGER not NULL,network_id INTEGER not NULL,timestamp INTEGER not NULL)");
        sQLiteDatabase.execSQL("CREATE TRIGGER IF NOT EXISTS trim_database AFTER INSERT ON past_impressions WHEN (SELECT COUNT(*) FROM past_impressions) > 1000 BEGIN DELETE FROM past_impressions WHERE _id IN (SELECT _id FROM past_impressions ORDER BY _id ASC LIMIT 1); END;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 1) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS past_impressions");
            onCreate(sQLiteDatabase);
        }
    }
}
