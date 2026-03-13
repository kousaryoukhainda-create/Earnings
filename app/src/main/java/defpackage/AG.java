package defpackage;

import org.jetbrains.annotations.NotNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: AG  reason: default package */
/* loaded from: classes.dex */
public final class AG {
    private static final /* synthetic */ AG[] $VALUES;
    @NotNull
    public static final C3176yG Companion;
    public static final AG ON_ANY;
    public static final AG ON_CREATE;
    public static final AG ON_DESTROY;
    public static final AG ON_PAUSE;
    public static final AG ON_RESUME;
    public static final AG ON_START;
    public static final AG ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yG] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, AG] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, AG] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, AG] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, AG] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, AG] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, AG] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, AG] */
    static {
        ?? r7 = new Enum("ON_CREATE", 0);
        ON_CREATE = r7;
        ?? r8 = new Enum("ON_START", 1);
        ON_START = r8;
        ?? r9 = new Enum("ON_RESUME", 2);
        ON_RESUME = r9;
        ?? r10 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r10;
        ?? r11 = new Enum("ON_STOP", 4);
        ON_STOP = r11;
        ?? r12 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r12;
        ?? r13 = new Enum("ON_ANY", 6);
        ON_ANY = r13;
        $VALUES = new AG[]{r7, r8, r9, r10, r11, r12, r13};
        Companion = new Object();
    }

    public static AG valueOf(String str) {
        return (AG) Enum.valueOf(AG.class, str);
    }

    public static AG[] values() {
        return (AG[]) $VALUES.clone();
    }

    public final BG e() {
        switch (AbstractC3262zG.a[ordinal()]) {
            case 1:
            case 2:
                return BG.d;
            case 3:
            case 4:
                return BG.f;
            case 5:
                return BG.g;
            case 6:
                return BG.b;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
