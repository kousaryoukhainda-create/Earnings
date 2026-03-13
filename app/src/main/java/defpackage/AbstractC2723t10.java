package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: t10  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2723t10 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final YW b;
    public volatile C0185Bz c;

    public AbstractC2723t10(YW yw) {
        this.b = yw;
    }

    public final C0185Bz a() {
        this.b.a();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                String b = b();
                YW yw = this.b;
                yw.a();
                yw.b();
                this.c = new C0185Bz(((SQLiteDatabase) yw.c.o().c).compileStatement(b));
            }
            return this.c;
        }
        String b2 = b();
        YW yw2 = this.b;
        yw2.a();
        yw2.b();
        return new C0185Bz(((SQLiteDatabase) yw2.c.o().c).compileStatement(b2));
    }

    public abstract String b();

    public final void c(C0185Bz c0185Bz) {
        if (c0185Bz == this.c) {
            this.a.set(false);
        }
    }
}
