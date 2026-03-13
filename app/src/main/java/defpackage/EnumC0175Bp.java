package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0175Bp implements Executor {
    public static final EnumC0175Bp b;
    public static final /* synthetic */ EnumC0175Bp[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Bp] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        b = r1;
        c = new EnumC0175Bp[]{r1};
    }

    public static EnumC0175Bp valueOf(String str) {
        return (EnumC0175Bp) Enum.valueOf(EnumC0175Bp.class, str);
    }

    public static EnumC0175Bp[] values() {
        return (EnumC0175Bp[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
