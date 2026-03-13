package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
/* renamed from: xz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3148xz implements Closeable {
    public static final String[] d = new String[0];
    public final /* synthetic */ int b;
    public Closeable c;

    public /* synthetic */ C3148xz(SQLiteClosable sQLiteClosable, int i) {
        this.b = i;
        this.c = sQLiteClosable;
    }

    public void a() {
        ((SQLiteDatabase) this.c).beginTransaction();
    }

    public void b(int i, byte[] bArr) {
        ((SQLiteProgram) this.c).bindBlob(i, bArr);
    }

    public void c(int i, long j) {
        ((SQLiteProgram) this.c).bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                ((SQLiteDatabase) this.c).close();
                return;
            case 1:
                if (((C1995kb) this.c) != null) {
                    this.c = null;
                    return;
                }
                throw new IllegalStateException("not attached to a buffer");
            default:
                ((SQLiteProgram) this.c).close();
                return;
        }
    }

    public void e(int i) {
        ((SQLiteProgram) this.c).bindNull(i);
    }

    public void f(int i, String str) {
        ((SQLiteProgram) this.c).bindString(i, str);
    }

    public void h() {
        ((SQLiteDatabase) this.c).endTransaction();
    }

    public void i(String str) {
        ((SQLiteDatabase) this.c).execSQL(str);
    }

    public Cursor j(InterfaceC1416g50 interfaceC1416g50) {
        return ((SQLiteDatabase) this.c).rawQueryWithFactory(new C3062wz(interfaceC1416g50), interfaceC1416g50.b(), d, null);
    }

    public Cursor k(String str) {
        return j(new C0754Xx(str, 6));
    }

    public void l() {
        ((SQLiteDatabase) this.c).setTransactionSuccessful();
    }

    public C3148xz() {
        this.b = 1;
    }
}
