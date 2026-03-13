package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: BG  reason: default package */
/* loaded from: classes.dex */
public final class BG {
    public static final BG b;
    public static final BG c;
    public static final BG d;
    public static final BG f;
    public static final BG g;
    public static final /* synthetic */ BG[] h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, BG] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, BG] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, BG] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, BG] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, BG] */
    static {
        ?? r5 = new Enum("DESTROYED", 0);
        b = r5;
        ?? r6 = new Enum("INITIALIZED", 1);
        c = r6;
        ?? r7 = new Enum("CREATED", 2);
        d = r7;
        ?? r8 = new Enum("STARTED", 3);
        f = r8;
        ?? r9 = new Enum("RESUMED", 4);
        g = r9;
        h = new BG[]{r5, r6, r7, r8, r9};
    }

    public static BG valueOf(String str) {
        return (BG) Enum.valueOf(BG.class, str);
    }

    public static BG[] values() {
        return (BG[]) h.clone();
    }

    public final boolean a(BG state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (compareTo(state) >= 0) {
            return true;
        }
        return false;
    }
}
