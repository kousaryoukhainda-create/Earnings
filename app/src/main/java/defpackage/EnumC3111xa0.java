package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xa0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3111xa0 {
    public static final EnumC3111xa0 b;
    public static final EnumC3111xa0 c;
    public static final EnumC3111xa0 d;
    public static final EnumC3111xa0 f;
    public static final /* synthetic */ EnumC3111xa0[] g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, xa0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, xa0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, xa0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, xa0] */
    static {
        ?? r4 = new Enum("straight", 0);
        b = r4;
        ?? r5 = new Enum("bisexual", 1);
        c = r5;
        ?? r6 = new Enum("gay", 2);
        d = r6;
        ?? r7 = new Enum("unknown", 3);
        f = r7;
        g = new EnumC3111xa0[]{r4, r5, r6, r7};
    }

    public static EnumC3111xa0 valueOf(String str) {
        return (EnumC3111xa0) Enum.valueOf(EnumC3111xa0.class, str);
    }

    public static EnumC3111xa0[] values() {
        return (EnumC3111xa0[]) g.clone();
    }
}
