package j$.time.format;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class F {
    public static final F LENIENT;
    public static final F SMART;
    public static final F STRICT;
    private static final /* synthetic */ F[] a;

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.format.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j$.time.format.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.time.format.F, java.lang.Enum] */
    static {
        ?? r3 = new Enum("STRICT", 0);
        STRICT = r3;
        ?? r4 = new Enum("SMART", 1);
        SMART = r4;
        ?? r5 = new Enum("LENIENT", 2);
        LENIENT = r5;
        a = new F[]{r3, r4, r5};
    }
}
