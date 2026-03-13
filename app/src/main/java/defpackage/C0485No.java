package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fyber.fairbid.b3;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.sdk.placements.WaterfallAuditResult;
import com.fyber.fairbid.th;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: No  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0485No implements InterfaceC0641To, InterfaceC2302o50, SettableFuture.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ C0485No(C1624ia0 c1624ia0, Iterable iterable, C1166d9 c1166d9, long j) {
        this.b = 2;
        this.c = c1624ia0;
        this.g = iterable;
        this.f = c1166d9;
        this.d = j;
    }

    @Override // defpackage.InterfaceC0641To
    public ScheduledFuture a(final WC wc) {
        switch (this.b) {
            case 0:
                ScheduledExecutorServiceC0615So scheduledExecutorServiceC0615So = (ScheduledExecutorServiceC0615So) this.c;
                scheduledExecutorServiceC0615So.getClass();
                return scheduledExecutorServiceC0615So.c.schedule(new RunnableC0563Qo(scheduledExecutorServiceC0615So, (Runnable) this.g, wc, 1), this.d, (TimeUnit) this.f);
            default:
                final ScheduledExecutorServiceC0615So scheduledExecutorServiceC0615So2 = (ScheduledExecutorServiceC0615So) this.c;
                scheduledExecutorServiceC0615So2.getClass();
                final Callable callable = (Callable) this.g;
                return scheduledExecutorServiceC0615So2.c.schedule(new Callable() { // from class: Ro
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ScheduledExecutorServiceC0615So scheduledExecutorServiceC0615So3 = ScheduledExecutorServiceC0615So.this;
                        scheduledExecutorServiceC0615So3.getClass();
                        return scheduledExecutorServiceC0615So3.b.submit(new W1(22, callable, wc));
                    }
                }, this.d, (TimeUnit) this.f);
        }
    }

    @Override // defpackage.InterfaceC2302o50
    public Object f() {
        Iterable iterable;
        C1624ia0 c1624ia0 = (C1624ia0) this.c;
        C1192dY c1192dY = (C1192dY) c1624ia0.c;
        c1192dY.getClass();
        if (((Iterable) this.g).iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C1192dY.i(iterable);
            SQLiteDatabase a = c1192dY.a();
            a.beginTransaction();
            try {
                a.compileStatement(str).execute();
                Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    c1192dY.f(rawQuery.getInt(0), EnumC3092xI.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a.setTransactionSuccessful();
            } finally {
                a.endTransaction();
            }
        }
        c1192dY.c(new C0854aY(c1624ia0.g.g() + this.d, (C1166d9) this.f));
        return null;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public void onComplete(Object obj, Throwable th) {
        th thVar = (th) this.c;
        WaterfallAuditResult waterfallAuditResult = (WaterfallAuditResult) this.g;
        long j = this.d;
        th.a(thVar, waterfallAuditResult, j, (SettableFuture) this.f, (b3) obj, th);
    }

    public /* synthetic */ C0485No(Object obj, Object obj2, long j, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.g = obj2;
        this.d = j;
        this.f = obj3;
    }
}
