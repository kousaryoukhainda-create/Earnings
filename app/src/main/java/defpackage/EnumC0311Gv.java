package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Gv  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0311Gv implements Executor {
    public static final EnumC0311Gv b;
    public static final /* synthetic */ EnumC0311Gv[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Gv] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        b = r1;
        c = new EnumC0311Gv[]{r1};
    }

    public static EnumC0311Gv valueOf(String str) {
        return (EnumC0311Gv) Enum.valueOf(EnumC0311Gv.class, str);
    }

    public static EnumC0311Gv[] values() {
        return (EnumC0311Gv[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
