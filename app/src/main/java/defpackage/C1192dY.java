package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: dY  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1192dY implements InterfaceC1482gs, InterfaceC2388p50, InterfaceC0734Xd {
    public static final C0281Fr h = new C0281Fr("proto");
    public final XY b;
    public final InterfaceC1459ge c;
    public final InterfaceC1459ge d;
    public final C3252z8 f;
    public final XT g;

    public C1192dY(InterfaceC1459ge interfaceC1459ge, InterfaceC1459ge interfaceC1459ge2, C3252z8 c3252z8, XY xy, XT xt) {
        this.b = xy;
        this.c = interfaceC1459ge;
        this.d = interfaceC1459ge2;
        this.f = c3252z8;
        this.g = xt;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, C1166d9 c1166d9) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c1166d9.a, String.valueOf(AbstractC1025cT.a(c1166d9.c))));
        byte[] bArr = c1166d9.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String i(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((N8) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object j(Cursor cursor, InterfaceC0945bY interfaceC0945bY) {
        try {
            return interfaceC0945bY.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        XY xy = this.b;
        Objects.requireNonNull(xy);
        InterfaceC1459ge interfaceC1459ge = this.d;
        long g = interfaceC1459ge.g();
        while (true) {
            try {
                return xy.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC1459ge.g() < this.f.c + g) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object c(InterfaceC0945bY interfaceC0945bY) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = interfaceC0945bY.apply(a);
            a.setTransactionSuccessful();
            return apply;
        } finally {
            a.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, C1166d9 c1166d9, int i) {
        ArrayList arrayList = new ArrayList();
        Long b = b(sQLiteDatabase, c1166d9);
        if (b == null) {
            return arrayList;
        }
        j(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(i)), new C0140Ag(14, this, arrayList, c1166d9));
        return arrayList;
    }

    public final void f(long j, EnumC3092xI enumC3092xI, String str) {
        c(new C2692sg(str, enumC3092xI, j));
    }

    public final Object h(InterfaceC2302o50 interfaceC2302o50) {
        SQLiteDatabase a = a();
        InterfaceC1459ge interfaceC1459ge = this.d;
        long g = interfaceC1459ge.g();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object f = interfaceC2302o50.f();
                    a.setTransactionSuccessful();
                    return f;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC1459ge.g() < this.f.c + g) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }
}
