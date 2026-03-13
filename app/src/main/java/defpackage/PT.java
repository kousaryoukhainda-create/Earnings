package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: PT  reason: default package */
/* loaded from: classes.dex */
public final class PT {
    public static final PT b;
    public static final /* synthetic */ PT[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, PT] */
    static {
        ?? r3 = new Enum("DEFAULT", 0);
        b = r3;
        c = new PT[]{r3, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static PT valueOf(String str) {
        return (PT) Enum.valueOf(PT.class, str);
    }

    public static PT[] values() {
        return (PT[]) c.clone();
    }
}
