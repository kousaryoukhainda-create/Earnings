package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1412g30 {
    public static final EnumC1412g30 b;
    public static final EnumC1412g30 c;
    public static final EnumC1412g30 d;
    public static final /* synthetic */ EnumC1412g30[] f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, g30] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, g30] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, g30] */
    static {
        ?? r3 = new Enum("NONE", 0);
        b = r3;
        ?? r4 = new Enum("ADDING", 1);
        c = r4;
        ?? r5 = new Enum("REMOVING", 2);
        d = r5;
        f = new EnumC1412g30[]{r3, r4, r5};
    }

    public static EnumC1412g30 valueOf(String str) {
        return (EnumC1412g30) Enum.valueOf(EnumC1412g30.class, str);
    }

    public static EnumC1412g30[] values() {
        return (EnumC1412g30[]) f.clone();
    }
}
