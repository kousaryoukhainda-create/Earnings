package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: zp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3310zp implements Executor {
    public static final EnumC3310zp b;
    public static final /* synthetic */ EnumC3310zp[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, zp] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        b = r1;
        c = new EnumC3310zp[]{r1};
    }

    public static EnumC3310zp valueOf(String str) {
        return (EnumC3310zp) Enum.valueOf(EnumC3310zp.class, str);
    }

    public static EnumC3310zp[] values() {
        return (EnumC3310zp[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
