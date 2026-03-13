package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
/* renamed from: wz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3062wz implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ InterfaceC1416g50 a;

    public C3062wz(InterfaceC1416g50 interfaceC1416g50) {
        this.a = interfaceC1416g50;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.a.a(new C3148xz(sQLiteQuery, 2));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
