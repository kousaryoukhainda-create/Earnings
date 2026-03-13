package defpackage;

import android.database.sqlite.SQLiteStatement;
/* renamed from: Bz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185Bz extends C3148xz {
    public final SQLiteStatement f;

    public C0185Bz(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 2);
        this.f = sQLiteStatement;
    }

    public final void m() {
        this.f.executeUpdateDelete();
    }
}
