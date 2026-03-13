package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
/* renamed from: oa  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2337oa extends SQLiteOpenHelper {
    public SQLiteDatabase b;

    public final synchronized boolean a(String str) {
        C2741tB c2741tB = C2423pa.c;
        c2741tB.a("SQLiteHelper.delete key: " + str);
        if (!e(str)) {
            c2741tB.a("SQLiteHelper.delete key does not exist - returning false ");
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.b = writableDatabase;
            if (writableDatabase.delete("events", "eventKey =?", new String[]{str}) != 1) {
                c2741tB.a("SQLiteHelper.delete failed ");
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return false;
            }
            c2741tB.a("SQLiteHelper.delete - success ");
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
            return true;
        } catch (SQLException unused) {
            throw new IOException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #2 {all -> 0x0050, blocks: (B:3:0x0001, B:16:0x004c, B:19:0x0052, B:21:0x0056, B:29:0x0085, B:5:0x000e, B:7:0x001c, B:9:0x0022, B:10:0x0025), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #2 {all -> 0x0050, blocks: (B:3:0x0001, B:16:0x004c, B:19:0x0052, B:21:0x0056, B:29:0x0085, B:5:0x000e, B:7:0x001c, B:9:0x0022, B:10:0x0025), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.HashSet b() {
        /*
            r6 = this;
            monitor-enter(r6)
            tB r0 = defpackage.C2423pa.c     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "SQLiteHelper.getAll"
            r0.a(r1)     // Catch: java.lang.Throwable -> L50
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.getReadableDatabase()     // Catch: java.lang.Throwable -> L48
            r6.b = r2     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "SELECT * FROM events"
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L4a
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L48
        L25:
            java.lang.String r2 = "eventKey"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "value"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L48
            java.util.AbstractMap$SimpleEntry r4 = new java.util.AbstractMap$SimpleEntry     // Catch: java.lang.Throwable -> L48
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L48
            r0.add(r4)     // Catch: java.lang.Throwable -> L48
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L25
            goto L4a
        L48:
            r2 = move-exception
            goto L5a
        L4a:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r0 = move-exception
            goto Lb4
        L52:
            android.database.sqlite.SQLiteDatabase r1 = r6.b     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L85
        L56:
            r1.close()     // Catch: java.lang.Throwable -> L50
            goto L85
        L5a:
            tB r3 = defpackage.C2423pa.c     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r4.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = "SQLiteHelper.getAll exception: "
            r4.append(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = r2.getMessage()     // Catch: java.lang.Throwable -> La6
            r4.append(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La6
            r3.c(r4)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = defpackage.Ka0.c(r2)     // Catch: java.lang.Throwable -> La6
            r3.c(r2)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.lang.Throwable -> L50
        L80:
            android.database.sqlite.SQLiteDatabase r1 = r6.b     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L85
            goto L56
        L85:
            tB r1 = defpackage.C2423pa.c     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = "SQLiteHelper.getAll returning: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L50
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L50
            r2.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = " entries"
            r2.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L50
            r1.a(r2)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)
            return r0
        La6:
            r0 = move-exception
            if (r1 == 0) goto Lac
            r1.close()     // Catch: java.lang.Throwable -> L50
        Lac:
            android.database.sqlite.SQLiteDatabase r1 = r6.b     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto Lb3
            r1.close()     // Catch: java.lang.Throwable -> L50
        Lb3:
            throw r0     // Catch: java.lang.Throwable -> L50
        Lb4:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2337oa.b():java.util.HashSet");
    }

    public final synchronized boolean c(String str, String str2) {
        SQLiteDatabase writableDatabase;
        C2741tB c2741tB = C2423pa.c;
        c2741tB.a("SQLiteHelper.insert key: " + str + " value: " + str2);
        if (e(str)) {
            c2741tB.a("SQLiteHelper.insert key already exists - returning false ");
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
            } catch (SQLException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("eventKey", str);
            contentValues.put("value", str2);
            if (writableDatabase.insert("events", null, contentValues) != -1) {
                c2741tB.a("SQLiteHelper.insert success ");
                writableDatabase.close();
                return true;
            }
            c2741tB.a("SQLiteHelper.insert false ");
            writableDatabase.close();
            return false;
        } catch (SQLException e2) {
            e = e2;
            sQLiteDatabase = writableDatabase;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public final synchronized boolean e(String str) {
        C2741tB c2741tB = C2423pa.c;
        c2741tB.a("SQLiteHelper.keyExists: key: " + str);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.b = writableDatabase;
            Cursor rawQuery = writableDatabase.rawQuery("SELECT * FROM events WHERE eventKey= ?", new String[]{str});
            if (rawQuery != null && rawQuery.getCount() != 0) {
                c2741tB.a("SQLiteHelper.keyExists: returning true ");
                rawQuery.close();
                rawQuery.close();
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return true;
            }
            c2741tB.a("SQLiteHelper.keyExists: returning false ");
            if (rawQuery != null) {
                rawQuery.close();
            }
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
            return false;
        } catch (SQLException unused) {
            throw new IOException();
        }
    }

    public final synchronized boolean f(String str, String str2) {
        C2741tB c2741tB = C2423pa.c;
        c2741tB.a("SQLiteHelper.update key: " + str + " value: " + str2);
        if (!e(str)) {
            c2741tB.a("SQLiteHelper.update: key does not exist - returning false ");
            return false;
        }
        try {
            this.b = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("eventKey", str);
            contentValues.put("value", str2);
            if (this.b.replace("events", null, contentValues) != -1) {
                c2741tB.a("SQLiteHelper.update - success");
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return true;
            }
            c2741tB.a("SQLiteHelper.update - failed");
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
            return false;
        } catch (SQLException unused) {
            throw new IOException();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (eventKey  TEXT PRIMARY KEY NOT NULL,value TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
