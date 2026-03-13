package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t90  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2739t90 implements Executor {
    public static final EnumC2739t90 b;
    public static final Handler c;
    public static final /* synthetic */ EnumC2739t90[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, t90] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        b = r1;
        d = new EnumC2739t90[]{r1};
        c = new Handler(Looper.getMainLooper());
    }

    public static EnumC2739t90 valueOf(String str) {
        return (EnumC2739t90) Enum.valueOf(EnumC2739t90.class, str);
    }

    public static EnumC2739t90[] values() {
        return (EnumC2739t90[]) d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c.post(runnable);
    }
}
