package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ok0  reason: default package */
/* loaded from: classes2.dex */
public final class Ok0 implements Bg0 {
    public final C3302zk a;
    public final Qj0 b;

    public Ok0(Bg0 ctx, C3302zk loggerFields) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(loggerFields, "loggerFields");
        Intrinsics.checkNotNullParameter(loggerFields, "loggerFields");
        C3302zk c3302zk = new C3302zk(1);
        c3302zk.b.putAll(loggerFields.b);
        this.a = c3302zk;
        this.b = ctx.a();
    }

    @Override // defpackage.Bg0
    public final void a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        this.b.d(tag, message, null, Lg0.c, this.a.b);
    }

    @Override // defpackage.Bg0
    public final void b(String tag, String message, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(t, "t");
        this.b.d(tag, message, t, Lg0.c, this.a.b);
    }

    @Override // defpackage.Bg0
    public final Qj0 a() {
        return this.b;
    }

    @Override // defpackage.Bg0
    public final Ok0 a(C3302zk loggerFields) {
        Intrinsics.checkNotNullParameter(loggerFields, "loggerFields");
        C3302zk c3302zk = new C3302zk(1);
        c3302zk.a(this.a);
        c3302zk.a(loggerFields);
        return new Ok0(this.b, c3302zk);
    }
}
