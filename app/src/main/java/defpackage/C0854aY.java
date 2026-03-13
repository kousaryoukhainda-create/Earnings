package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.impl.gc;
import com.applovin.impl.s0;
/* renamed from: aY  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0854aY implements InterfaceC0945bY, gc.a {
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0854aY(long j, C1166d9 c1166d9) {
        this.b = j;
        this.c = c1166d9;
    }

    @Override // com.applovin.impl.gc.a
    public void a(Object obj) {
        ((s0) obj).a((s0.a) this.c, this.b);
    }

    @Override // defpackage.InterfaceC0945bY
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        C1166d9 c1166d9 = (C1166d9) this.c;
        String str = c1166d9.a;
        EnumC0849aT enumC0849aT = c1166d9.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC1025cT.a(enumC0849aT))}) < 1) {
            contentValues.put("backend_name", c1166d9.a);
            contentValues.put("priority", Integer.valueOf(AbstractC1025cT.a(enumC0849aT)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public /* synthetic */ C0854aY(s0.a aVar, long j) {
        this.c = aVar;
        this.b = j;
    }
}
